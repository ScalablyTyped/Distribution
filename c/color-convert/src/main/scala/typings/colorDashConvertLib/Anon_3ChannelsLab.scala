package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3ChannelsLab extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: colorDashConvertLib.colorDashConvertLibStrings.xyz
  def lab(xyz: colorDashConvertLib.conversionsMod.XYZ): colorDashConvertLib.conversionsMod.LAB
  def rgb(xyz: colorDashConvertLib.conversionsMod.XYZ): colorDashConvertLib.conversionsMod.RGB
}

object Anon_3ChannelsLab {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    lab: js.Function1[colorDashConvertLib.conversionsMod.XYZ, colorDashConvertLib.conversionsMod.LAB],
    labels: colorDashConvertLib.colorDashConvertLibStrings.xyz,
    rgb: js.Function1[colorDashConvertLib.conversionsMod.XYZ, colorDashConvertLib.conversionsMod.RGB]
  ): Anon_3ChannelsLab = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("lab")(lab)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("rgb")(rgb)
    __obj.asInstanceOf[Anon_3ChannelsLab]
  }
}

