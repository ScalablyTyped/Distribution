package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3ChannelsLabLabelsLch extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: colorDashConvertLib.colorDashConvertLibStrings.lch
  def lab(lch: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.LAB
}

object Anon_3ChannelsLabLabelsLch {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    lab: js.Function1[colorDashConvertLib.conversionsMod.LCH, colorDashConvertLib.conversionsMod.LAB],
    labels: colorDashConvertLib.colorDashConvertLibStrings.lch
  ): Anon_3ChannelsLabLabelsLch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("lab")(lab)
    __obj.updateDynamic("labels")(labels)
    __obj.asInstanceOf[Anon_3ChannelsLabLabelsLch]
  }
}

