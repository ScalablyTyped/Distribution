package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3Channels extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: colorDashConvertLib.colorDashConvertLibStrings.hsl
  def hcg(hsl: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.HCG
  def hsv(hsl: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.HSV
  def rgb(hsl: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.RGB
}

object Anon_3Channels {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    hcg: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.HCG],
    hsv: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.HSV],
    labels: colorDashConvertLib.colorDashConvertLibStrings.hsl,
    rgb: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.RGB]
  ): Anon_3Channels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("hcg")(hcg)
    __obj.updateDynamic("hsv")(hsv)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("rgb")(rgb)
    __obj.asInstanceOf[Anon_3Channels]
  }
}

