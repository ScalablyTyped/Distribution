package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhsl extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: colorDashConvertLib.colorDashConvertLibStrings.hsl
  def hcg(hsl: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.HCG
  def hsv(hsl: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.HSV
  def rgb(hsl: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.RGB
}

object Typeofhsl {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    hcg: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.HCG,
    hsv: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.HSV,
    labels: colorDashConvertLib.colorDashConvertLibStrings.hsl,
    rgb: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.RGB
  ): Typeofhsl = {
    val __obj = js.Dynamic.literal(channels = channels, hcg = js.Any.fromFunction1(hcg), hsv = js.Any.fromFunction1(hsv), labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhsl]
  }
}

