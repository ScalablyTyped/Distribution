package typings
package colorDashCheckLib.colorDashCheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-check", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val brightnessThreshold: scala.Double = js.native
  val colorContrastThreshold: scala.Double = js.native
  def aa(foreground: Color, background: Color): scala.Boolean = js.native
  def aa_18(foreground: Color, background: Color): scala.Boolean = js.native
  def aaa(foreground: Color, background: Color): scala.Boolean = js.native
  def aaa_18(foreground: Color, background: Color): scala.Boolean = js.native
  def colorBrightnessDifference(foreground: Color, background: Color): scala.Boolean = js.native
  def colorCompliance(foreground: Color, background: Color): scala.Boolean = js.native
  def colorContrast(foreground: Color, background: Color): scala.Double = js.native
  def colorDifference(foreground: Color, background: Color): scala.Boolean = js.native
  def colorGetLuminance(rgb: js.Tuple3[scala.Double, scala.Double, scala.Double]): scala.Double = js.native
  def hexToRgb(colorValue: Color): RGB = js.native
}

