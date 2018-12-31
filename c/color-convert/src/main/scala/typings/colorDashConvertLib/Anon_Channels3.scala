package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channels3 extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: js.Tuple3[
    colorDashConvertLib.colorDashConvertLibStrings.h, 
    colorDashConvertLib.colorDashConvertLibStrings.c, 
    colorDashConvertLib.colorDashConvertLibStrings.g
  ]
  def hsl(hcg: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.HSL
  def hsv(hcg: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.HSV
  def hwb(hcg: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.HWB
  def rgb(hcg: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.RGB
}

