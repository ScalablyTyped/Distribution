package typings
package colorDashConvertLib.conversionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-convert/conversions", "hcg")
@js.native
object hcgNs extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3` = js.native
  val labels: js.Tuple3[
    colorDashConvertLib.colorDashConvertLibStrings.h, 
    colorDashConvertLib.colorDashConvertLibStrings.c, 
    colorDashConvertLib.colorDashConvertLibStrings.g
  ] = js.native
  def hsl(hcg: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.HSL = js.native
  def hsv(hcg: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.HSV = js.native
  def hwb(hcg: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.HWB = js.native
  def rgb(hcg: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.RGB = js.native
}

