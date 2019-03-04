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
    ansi16: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.ANSI16],
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    hcg: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.HCG],
    hsl: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.HSL],
    labels: colorDashConvertLib.colorDashConvertLibStrings.hsv,
    rgb: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.RGB]
  ): Anon_3Ansi16 = {
    val __obj = js.Dynamic.literal(ansi16 = ansi16, channels = channels, hcg = hcg, hsl = hsl, labels = labels, rgb = rgb)
  
    __obj.asInstanceOf[Anon_3Ansi16]
  }
}

