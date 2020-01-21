package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DailyVolume extends js.Object {
  /**
    * An object that contains inbox placement metrics for a specified day in the analysis period, broken out by the recipient's email provider.
    */
  var DomainIspPlacements: js.UndefOr[typings.awsSdk.pinpointemailMod.DomainIspPlacements] = js.native
  /**
    * The date that the DailyVolume metrics apply to, in Unix time.
    */
  var StartDate: js.UndefOr[Timestamp] = js.native
  /**
    * An object that contains inbox placement metrics for a specific day in the analysis period.
    */
  var VolumeStatistics: js.UndefOr[typings.awsSdk.pinpointemailMod.VolumeStatistics] = js.native
}

object DailyVolume {
  @scala.inline
  def apply(
    DomainIspPlacements: DomainIspPlacements = null,
    StartDate: Timestamp = null,
    VolumeStatistics: VolumeStatistics = null
  ): DailyVolume = {
    val __obj = js.Dynamic.literal()
    if (DomainIspPlacements != null) __obj.updateDynamic("DomainIspPlacements")(DomainIspPlacements.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    if (VolumeStatistics != null) __obj.updateDynamic("VolumeStatistics")(VolumeStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[DailyVolume]
  }
}

