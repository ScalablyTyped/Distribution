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
    lch: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.LCH,
    xyz: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.XYZ
  ): Anon_3ChannelsLabLabels = {
    val __obj = js.Dynamic.literal(channels = channels, labels = labels, lch = js.Any.fromFunction1(lch), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[Anon_3ChannelsLabLabels]
  }
}

