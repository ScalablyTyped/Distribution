package typings.color.colorMod

import typings.color.Anon_Alpha
import typings.color.Anon_AlphaB
import typings.color.colorStrings.AA
import typings.color.colorStrings.AAA
import typings.color.colorStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  def a(): Double = js.native
  def a(`val`: Double): Color = js.native
  def alpha(): Double = js.native
  def alpha(`val`: Double): Color = js.native
  def ansi16(args: Double*): Color = js.native
  def ansi256(args: Double*): Color = js.native
  def apple(args: Double*): Color = js.native
  def array(): js.Array[Double] = js.native
  def b(): Double = js.native
  def b(`val`: Double): Color = js.native
  def black(): Double = js.native
  def black(`val`: Double): Color = js.native
  def blacken(ratio: Double): Color = js.native
  def blue(): Double = js.native
  def blue(`val`: Double): Color = js.native
  def chroma(): Double = js.native
  def chroma(`val`: Double): Color = js.native
  def cmyk(args: Double*): Color = js.native
  def contrast(color2: Color): Double = js.native
  def cyan(): Double = js.native
  def cyan(`val`: Double): Color = js.native
  def darken(ratio: Double): Color = js.native
  def desaturate(ratio: Double): Color = js.native
  def fade(ratio: Double): Color = js.native
  def gray(): Double = js.native
  def gray(`val`: Double): Color = js.native
  def grayscale(): Color = js.native
  def green(): Double = js.native
  def green(`val`: Double): Color = js.native
  def hcg(args: Double*): Color = js.native
  def hex(): String = js.native
  def hex(`val`: String): Color = js.native
  def hsl(args: Double*): Color = js.native
  def hsv(args: Double*): Color = js.native
  def hue(): Double = js.native
  def hue(`val`: Double): Color = js.native
  def hwb(args: Double*): Color = js.native
  def isDark(): Boolean = js.native
  def isLight(): Boolean = js.native
  def keyword(): String = js.native
  def keyword(`val`: String): Color = js.native
  def l(): Double = js.native
  def l(`val`: Double): Color = js.native
  def lab(args: Double*): Color = js.native
  def lch(args: Double*): Color = js.native
  def level(color2: Color): AAA | AA | _empty = js.native
  def lighten(ratio: Double): Color = js.native
  def lightness(): Double = js.native
  def lightness(`val`: Double): Color = js.native
  def luminosity(): Double = js.native
  def magenta(): Double = js.native
  def magenta(`val`: Double): Color = js.native
  def mix(mixinColor: Color): Color = js.native
  def mix(mixinColor: Color, weight: Double): Color = js.native
  def negate(): Color = js.native
  def `object`(): Anon_Alpha = js.native
  def opaquer(ratio: Double): Color = js.native
  def percentString(): String = js.native
  def percentString(places: Double): String = js.native
  def red(): Double = js.native
  def red(`val`: Double): Color = js.native
  def rgb(args: Double*): Color = js.native
  def rgbNumber(): Double = js.native
  def rotate(degrees: Double): Color = js.native
  def round(): Color = js.native
  def round(places: Double): Color = js.native
  def saturate(ratio: Double): Color = js.native
  def saturationl(): Double = js.native
  def saturationl(`val`: Double): Color = js.native
  def saturationv(): Double = js.native
  def saturationv(`val`: Double): Color = js.native
  def string(): String = js.native
  def string(places: Double): String = js.native
  def toJSON(): Color = js.native
  def unitArray(): js.Array[Double] = js.native
  def unitObject(): Anon_AlphaB = js.native
  def value(): Double = js.native
  def value(`val`: Double): Color = js.native
  def wblack(): Double = js.native
  def wblack(`val`: Double): Color = js.native
  def white(): Double = js.native
  def white(`val`: Double): Color = js.native
  def whiten(ratio: Double): Color = js.native
  def x(): Double = js.native
  def x(`val`: Double): Color = js.native
  def xyz(args: Double*): Color = js.native
  def y(): Double = js.native
  def y(`val`: Double): Color = js.native
  def yellow(): Double = js.native
  def yellow(`val`: Double): Color = js.native
  def z(): Double = js.native
  def z(`val`: Double): Color = js.native
}

