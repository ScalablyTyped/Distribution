package typings.color.mod

import typings.color.AnonAlpha
import typings.color.AnonAlphaB
import typings.color.colorStrings.AA
import typings.color.colorStrings.AAA
import typings.color.colorStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color[T /* <: ColorParam */] extends js.Object {
  def a(): Double = js.native
  def a(`val`: Double): Color[ColorParam] = js.native
  def alpha(): Double = js.native
  def alpha(`val`: Double): Color[ColorParam] = js.native
  def ansi16(args: Double*): Color[ColorParam] = js.native
  def ansi256(args: Double*): Color[ColorParam] = js.native
  def apple(args: Double*): Color[ColorParam] = js.native
  def array(): js.Array[Double] = js.native
  def b(): Double = js.native
  def b(`val`: Double): Color[ColorParam] = js.native
  def black(): Double = js.native
  def black(`val`: Double): Color[ColorParam] = js.native
  def blacken(ratio: Double): Color[ColorParam] = js.native
  def blue(): Double = js.native
  def blue(`val`: Double): Color[ColorParam] = js.native
  def chroma(): Double = js.native
  def chroma(`val`: Double): Color[ColorParam] = js.native
  def cmyk(args: Double*): Color[ColorParam] = js.native
  def contrast(color2: Color[ColorParam]): Double = js.native
  def cyan(): Double = js.native
  def cyan(`val`: Double): Color[ColorParam] = js.native
  def darken(ratio: Double): Color[ColorParam] = js.native
  def desaturate(ratio: Double): Color[ColorParam] = js.native
  def fade(ratio: Double): Color[ColorParam] = js.native
  def gray(): Double = js.native
  def gray(`val`: Double): Color[ColorParam] = js.native
  def grayscale(): Color[ColorParam] = js.native
  def green(): Double = js.native
  def green(`val`: Double): Color[ColorParam] = js.native
  def hcg(args: Double*): Color[ColorParam] = js.native
  def hex(): String = js.native
  def hex[V /* <: String */](`val`: V): Color[V] = js.native
  def hsl(args: Double*): Color[ColorParam] = js.native
  def hsv(args: Double*): Color[ColorParam] = js.native
  def hue(): Double = js.native
  def hue(`val`: Double): Color[ColorParam] = js.native
  def hwb(args: Double*): Color[ColorParam] = js.native
  def isDark(): Boolean = js.native
  def isLight(): Boolean = js.native
  def keyword(): String = js.native
  def keyword[V /* <: String */](`val`: V): Color[V] = js.native
  def l(): Double = js.native
  def l(`val`: Double): Color[ColorParam] = js.native
  def lab(args: Double*): Color[ColorParam] = js.native
  def lch(args: Double*): Color[ColorParam] = js.native
  def level(color2: Color[ColorParam]): AAA | AA | _empty = js.native
  def lighten(ratio: Double): Color[ColorParam] = js.native
  def lightness(): Double = js.native
  def lightness(`val`: Double): Color[ColorParam] = js.native
  def luminosity(): Double = js.native
  def magenta(): Double = js.native
  def magenta(`val`: Double): Color[ColorParam] = js.native
  def mix(mixinColor: Color[ColorParam]): Color[ColorParam] = js.native
  def mix(mixinColor: Color[ColorParam], weight: Double): Color[ColorParam] = js.native
  def negate(): Color[ColorParam] = js.native
  def `object`(): AnonAlpha = js.native
  def opaquer(ratio: Double): Color[ColorParam] = js.native
  def percentString(): String = js.native
  def percentString(places: Double): String = js.native
  def red(): Double = js.native
  def red(`val`: Double): Color[ColorParam] = js.native
  def rgb(args: Double*): Color[ColorParam] = js.native
  def rgbNumber(): Double = js.native
  def rotate(degrees: Double): Color[ColorParam] = js.native
  def round(): Color[ColorParam] = js.native
  def round(places: Double): Color[ColorParam] = js.native
  def saturate(ratio: Double): Color[ColorParam] = js.native
  def saturationl(): Double = js.native
  def saturationl(`val`: Double): Color[ColorParam] = js.native
  def saturationv(): Double = js.native
  def saturationv(`val`: Double): Color[ColorParam] = js.native
  def string(): String = js.native
  def string(places: Double): String = js.native
  def toJSON(): Color[T] = js.native
  def unitArray(): js.Array[Double] = js.native
  def unitObject(): AnonAlphaB = js.native
  def value(): Double = js.native
  def value(`val`: Double): Color[ColorParam] = js.native
  def wblack(): Double = js.native
  def wblack(`val`: Double): Color[ColorParam] = js.native
  def white(): Double = js.native
  def white(`val`: Double): Color[ColorParam] = js.native
  def whiten(ratio: Double): Color[ColorParam] = js.native
  def x(): Double = js.native
  def x(`val`: Double): Color[ColorParam] = js.native
  def xyz(args: Double*): Color[ColorParam] = js.native
  def y(): Double = js.native
  def y(`val`: Double): Color[ColorParam] = js.native
  def yellow(): Double = js.native
  def yellow(`val`: Double): Color[ColorParam] = js.native
  def z(): Double = js.native
  def z(`val`: Double): Color[ColorParam] = js.native
}

