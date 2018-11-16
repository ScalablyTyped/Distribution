package typings
package colorDashConvertLib.conversionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-convert/conversions", "hsv")
@js.native
object hsvNs extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3` = js.native
  val labels: colorDashConvertLib.colorDashConvertLibStrings.hsv = js.native
  def ansi16(hsv: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.ANSI16 = js.native
  def hcg(hsv: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.HCG = js.native
  def hsl(hsv: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.HSL = js.native
  def rgb(hsv: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.RGB = js.native
}

