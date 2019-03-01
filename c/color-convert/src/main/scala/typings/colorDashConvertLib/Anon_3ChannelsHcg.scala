package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3ChannelsHcg extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: colorDashConvertLib.colorDashConvertLibStrings.hwb
  def hcg(hwb: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.HCG
  def rgb(hwb: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.RGB
}

object Anon_3ChannelsHcg {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    hcg: js.Function1[colorDashConvertLib.conversionsMod.HWB, colorDashConvertLib.conversionsMod.HCG],
    labels: colorDashConvertLib.colorDashConvertLibStrings.hwb,
    rgb: js.Function1[colorDashConvertLib.conversionsMod.HWB, colorDashConvertLib.conversionsMod.RGB]
  ): Anon_3ChannelsHcg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("hcg")(hcg)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("rgb")(rgb)
    __obj.asInstanceOf[Anon_3ChannelsHcg]
  }
}

