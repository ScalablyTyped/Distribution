package typings.colorDashCheck.colorDashCheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-check", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val brightnessThreshold: Double = js.native
  val colorContrastThreshold: Double = js.native
  def aa(foreground: Color, background: Color): Boolean = js.native
  def aa_18(foreground: Color, background: Color): Boolean = js.native
  def aaa(foreground: Color, background: Color): Boolean = js.native
  def aaa_18(foreground: Color, background: Color): Boolean = js.native
  def colorBrightnessDifference(foreground: Color, background: Color): Boolean = js.native
  def colorCompliance(foreground: Color, background: Color): Boolean = js.native
  def colorContrast(foreground: Color, background: Color): Double = js.native
  def colorDifference(foreground: Color, background: Color): Boolean = js.native
  def colorGetLuminance(rgb: js.Tuple3[Double, Double, Double]): Double = js.native
  def hexToRgb(colorValue: Color): RGB = js.native
}

