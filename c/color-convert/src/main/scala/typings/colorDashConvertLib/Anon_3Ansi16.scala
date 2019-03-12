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

object Anon_3Ansi16 {
  @scala.inline
  def apply(
    ansi16: colorDashConvertLib.conversionsMod.HSV => colorDashConvertLib.conversionsMod.ANSI16,
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    hcg: colorDashConvertLib.conversionsMod.HSV => colorDashConvertLib.conversionsMod.HCG,
    hsl: colorDashConvertLib.conversionsMod.HSV => colorDashConvertLib.conversionsMod.HSL,
    labels: colorDashConvertLib.colorDashConvertLibStrings.hsv,
    rgb: colorDashConvertLib.conversionsMod.HSV => colorDashConvertLib.conversionsMod.RGB
  ): Anon_3Ansi16 = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), channels = channels, hcg = js.Any.fromFunction1(hcg), hsl = js.Any.fromFunction1(hsl), labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Anon_3Ansi16]
  }
}

