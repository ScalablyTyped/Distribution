package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3Ansi16 extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: colorDashConvertLib.colorDashConvertLibStrings.hsv
  def ansi16(hsv: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.ANSI16
  def hcg(hsv: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.HCG
  def hsl(hsv: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.HSL
  def rgb(hsv: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.RGB
}

