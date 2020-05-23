package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverallVolume extends js.Object {
  /**
    * An object that contains inbox and junk mail placement metrics for individual email providers.
    */
  var DomainIspPlacements: js.UndefOr[typings.awsSdk.sesv2Mod.DomainIspPlacements] = js.native
  /**
    * The percentage of emails that were sent from the domain that were read by their recipients.
    */
  var ReadRatePercent: js.UndefOr[Percentage] = js.native
  /**
    * An object that contains information about the numbers of messages that arrived in recipients' inboxes and junk mail folders.
    */
  var VolumeStatistics: js.UndefOr[typings.awsSdk.sesv2Mod.VolumeStatistics] = js.native
}

object OverallVolume {
  @scala.inline
  def apply(
    DomainIspPlacements: DomainIspPlacements = null,
    ReadRatePercent: js.UndefOr[Percentage] = js.undefined,
    VolumeStatistics: VolumeStatistics = null
  ): OverallVolume = {
    val __obj = js.Dynamic.literal()
    if (DomainIspPlacements != null) __obj.updateDynamic("DomainIspPlacements")(DomainIspPlacements.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadRatePercent)) __obj.updateDynamic("ReadRatePercent")(ReadRatePercent.get.asInstanceOf[js.Any])
    if (VolumeStatistics != null) __obj.updateDynamic("VolumeStatistics")(VolumeStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverallVolume]
  }
}

