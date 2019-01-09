package typings
package colorLib.colorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  def a(): scala.Double = js.native
  def a(`val`: scala.Double): Color = js.native
  def alpha(): scala.Double = js.native
  def alpha(`val`: scala.Double): Color = js.native
  def ansi16(args: scala.Double*): Color = js.native
  def ansi256(args: scala.Double*): Color = js.native
  def apple(args: scala.Double*): Color = js.native
  def array(): js.Array[scala.Double] = js.native
  def b(): scala.Double = js.native
  def b(`val`: scala.Double): Color = js.native
  def black(): scala.Double = js.native
  def black(`val`: scala.Double): Color = js.native
  def blacken(ratio: scala.Double): Color = js.native
  def blue(): scala.Double = js.native
  def blue(`val`: scala.Double): Color = js.native
  def chroma(): scala.Double = js.native
  def chroma(`val`: scala.Double): Color = js.native
  def cmyk(args: scala.Double*): Color = js.native
  def contrast(color2: Color): scala.Double = js.native
  def cyan(): scala.Double = js.native
  def cyan(`val`: scala.Double): Color = js.native
  def darken(ratio: scala.Double): Color = js.native
  def desaturate(ratio: scala.Double): Color = js.native
  def fade(ratio: scala.Double): Color = js.native
  def gray(): scala.Double = js.native
  def gray(`val`: scala.Double): Color = js.native
  def grayscale(): Color = js.native
  def green(): scala.Double = js.native
  def green(`val`: scala.Double): Color = js.native
  def hcg(args: scala.Double*): Color = js.native
  def hex(): java.lang.String = js.native
  def hex(`val`: java.lang.String): Color = js.native
  def hsl(args: scala.Double*): Color = js.native
  def hsv(args: scala.Double*): Color = js.native
  def hue(): scala.Double = js.native
  def hue(`val`: scala.Double): Color = js.native
  def hwb(args: scala.Double*): Color = js.native
  def isDark(): scala.Boolean = js.native
  def isLight(): scala.Boolean = js.native
  def keyword(): java.lang.String = js.native
  def keyword(`val`: java.lang.String): Color = js.native
  def l(): scala.Double = js.native
  def l(`val`: scala.Double): Color = js.native
  def lab(args: scala.Double*): Color = js.native
  def lch(args: scala.Double*): Color = js.native
  def level(color2: Color): colorLib.colorLibStrings.AAA | colorLib.colorLibStrings.AA | colorLib.colorLibStrings.Empty = js.native
  def lighten(ratio: scala.Double): Color = js.native
  def lightness(): scala.Double = js.native
  def lightness(`val`: scala.Double): Color = js.native
  def luminosity(): scala.Double = js.native
  def magenta(): scala.Double = js.native
  def magenta(`val`: scala.Double): Color = js.native
  def mix(mixinColor: Color): Color = js.native
  def mix(mixinColor: Color, weight: scala.Double): Color = js.native
  def negate(): Color = js.native
  def `object`(): colorLib.Anon_Alpha = js.native
  def opaquer(ratio: scala.Double): Color = js.native
  def percentString(): java.lang.String = js.native
  def percentString(places: scala.Double): java.lang.String = js.native
  def red(): scala.Double = js.native
  def red(`val`: scala.Double): Color = js.native
  def rgb(args: scala.Double*): Color = js.native
  def rgbNumber(): scala.Double = js.native
  def rotate(degrees: scala.Double): Color = js.native
  def round(): Color = js.native
  def round(places: scala.Double): Color = js.native
  def saturate(ratio: scala.Double): Color = js.native
  def saturationl(): scala.Double = js.native
  def saturationl(`val`: scala.Double): Color = js.native
  def saturationv(): scala.Double = js.native
  def saturationv(`val`: scala.Double): Color = js.native
  def string(): java.lang.String = js.native
  def string(places: scala.Double): java.lang.String = js.native
  def toJSON(): Color = js.native
  def unitArray(): js.Array[scala.Double] = js.native
  def unitObject(): colorLib.Anon_AlphaB = js.native
  def value(): scala.Double = js.native
  def value(`val`: scala.Double): Color = js.native
  def wblack(): scala.Double = js.native
  def wblack(`val`: scala.Double): Color = js.native
  def white(): scala.Double = js.native
  def white(`val`: scala.Double): Color = js.native
  def whiten(ratio: scala.Double): Color = js.native
  def x(): scala.Double = js.native
  def x(`val`: scala.Double): Color = js.native
  def xyz(args: scala.Double*): Color = js.native
  def y(): scala.Double = js.native
  def y(`val`: scala.Double): Color = js.native
  def yellow(): scala.Double = js.native
  def yellow(`val`: scala.Double): Color = js.native
  def z(): scala.Double = js.native
  def z(`val`: scala.Double): Color = js.native
}

