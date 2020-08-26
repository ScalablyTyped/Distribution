package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DailyVolume extends js.Object {
  /**
    * An object that contains inbox placement metrics for a specified day in the analysis period, broken out by the recipient's email provider.
    */
  var DomainIspPlacements: js.UndefOr[typings.awsSdk.sesv2Mod.DomainIspPlacements] = js.native
  /**
    * The date that the DailyVolume metrics apply to, in Unix time.
    */
  var StartDate: js.UndefOr[Timestamp] = js.native
  /**
    * An object that contains inbox placement metrics for a specific day in the analysis period.
    */
  var VolumeStatistics: js.UndefOr[typings.awsSdk.sesv2Mod.VolumeStatistics] = js.native
}

object DailyVolume {
  @scala.inline
  def apply(): DailyVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DailyVolume]
  }
  @scala.inline
  implicit class DailyVolumeOps[Self <: DailyVolume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomainIspPlacementsVarargs(value: DomainIspPlacement*): Self = this.set("DomainIspPlacements", js.Array(value :_*))
    @scala.inline
    def setDomainIspPlacements(value: DomainIspPlacements): Self = this.set("DomainIspPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainIspPlacements: Self = this.set("DomainIspPlacements", js.undefined)
    @scala.inline
    def setStartDate(value: Timestamp): Self = this.set("StartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("StartDate", js.undefined)
    @scala.inline
    def setVolumeStatistics(value: VolumeStatistics): Self = this.set("VolumeStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeStatistics: Self = this.set("VolumeStatistics", js.undefined)
  }
  
}

