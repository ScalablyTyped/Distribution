package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3ChannelsLabLabels extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: colorDashConvertLib.colorDashConvertLibStrings.lab
  def lch(lab: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.LCH
  def xyz(lab: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.XYZ
}

object Anon_3ChannelsLabLabels {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    labels: colorDashConvertLib.colorDashConvertLibStrings.lab,
    lch: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.LCH],
    xyz: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.XYZ]
  ): Anon_3ChannelsLabLabels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("lch")(lch)
    __obj.updateDynamic("xyz")(xyz)
    __obj.asInstanceOf[Anon_3ChannelsLabLabels]
  }
}

