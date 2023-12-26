package com.example.gameapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gameapp.ui.theme.GameAppTheme

val lightColor = Color(0xFFE7E7E7)
val darkColor = Color(0xFF020202)
val fadedDarkColor = Color(0xFF030303)
val grayColor = Color(0xFF333333)
val redColor = Color(0xFFD50404)
val redColor02 = Color(0xFFE82E2E)
val fontFamily = FontFamily(
    Font(R.font.nunito_sans_regular, FontWeight(400)),
    Font(R.font.nunito_sans_bold, FontWeight(700))
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GameAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = darkColor
                ) {
                    Column (
                        modifier = Modifier.verticalScroll(rememberScrollState())
                    ) {
                        Navbar(
                            "ALL GAMES",
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(fadedDarkColor)
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        Column {
                            Row (
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                ImageContainer (
                                    painter = painterResource(id = R.drawable.mortal_kombat),
                                    contentDescription = "Mortal Kombat",
                                    modifier = Modifier.weight(0.5F)
                                )

                                ImageContainer (
                                    painter = painterResource(id = R.drawable.red_dead),
                                    contentDescription = "Red Dead Redemption 2",
                                    modifier = Modifier.weight(0.5F)
                                )
                            }

                            Row (
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                ImageContainer (
                                    painter = painterResource(id = R.drawable.spider),
                                    contentDescription = "Marvel Spider Man",
                                    modifier = Modifier.weight(0.5F)
                                )

                                ImageContainer (
                                    painter = painterResource(id = R.drawable.gta),
                                    contentDescription = "GTA 5",
                                    modifier = Modifier.weight(0.5F)
                                )
                            }
                        }


                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .padding(20.dp)
                                .background(redColor)
                                .fillMaxWidth()
                                .padding(8.dp)
                        ) {
                            Text(
                                text = "See more",
                                color = Color.White,
                                fontWeight = FontWeight(500)
                            )
                        }


                        Box (
                            modifier = Modifier
                                .padding(20.dp)
                                .background(fadedDarkColor)
                                .border(
                                    width = 1.dp,
                                    color = grayColor,
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .padding(12.dp)
                        ) {
                            Column (
                                modifier = Modifier
                                    .padding(12.dp)
                                    .fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "MARVEL INSIDER",
                                    color = redColor02,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight(700)
                                )

                                Spacer(modifier = Modifier.height(12.dp))

                                Text(
                                    text = "Reward Your Marvel Fandom!",
                                    color = lightColor,
                                    fontSize = 20.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight(700)
                                )

                                Text(
                                    text = "Earn points to redeem for rewards",
                                    color = Color.Gray,
                                    fontFamily = fontFamily,
                                )

                                Spacer(modifier = Modifier.height(12.dp))

                                Row (
                                    horizontalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Box (
                                        modifier = Modifier
                                            .padding(20.dp)
                                            .background(redColor)
                                            .padding(vertical = 8.dp, horizontal = 16.dp)
                                    ) {
                                        Text(
                                            text = "Join now",
                                            color = Color.White,
                                            fontWeight = FontWeight(500),
                                            fontFamily = fontFamily,
                                        )
                                    }
                                }

                                Spacer(modifier = Modifier.height(12.dp))

                                Text(
                                    text = "All rights reserved @GS5",
                                    fontSize = 14.sp,
                                    color = Color.Gray,
                                    fontFamily = fontFamily,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun ImageContainer (
    painter: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.padding(8.dp)) {
        Image(
            painter = painter,
            contentDescription = contentDescription,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
    }
}

@Composable
fun Navbar (title: String, modifier: Modifier = Modifier) {
    Row (
        modifier = modifier.padding(horizontal = 24.dp, vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            fontSize = 20.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight(700),
            color = lightColor
        )

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier.height(50.dp)
        )
    }
}

