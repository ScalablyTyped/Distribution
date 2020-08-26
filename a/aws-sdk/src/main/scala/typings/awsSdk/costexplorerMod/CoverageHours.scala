package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageHours extends js.Object {
  /**
    * The percentage of instance hours that a reservation covered.
    */
  var CoverageHoursPercentage: js.UndefOr[typings.awsSdk.costexplorerMod.CoverageHoursPercentage] = js.native
  /**
    * The number of instance running hours that On-Demand Instances covered.
    */
  var OnDemandHours: js.UndefOr[typings.awsSdk.costexplorerMod.OnDemandHours] = js.native
  /**
    * The number of instance running hours that reservations covered.
    */
  var ReservedHours: js.UndefOr[typings.awsSdk.costexplorerMod.ReservedHours] = js.native
  /**
    * The total instance usage, in hours.
    */
  var TotalRunningHours: js.UndefOr[typings.awsSdk.costexplorerMod.TotalRunningHours] = js.native
}

object CoverageHours {
  @scala.inline
  def apply(): CoverageHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageHours]
  }
  @scala.inline
  implicit class CoverageHoursOps[Self <: CoverageHours] (val x: Self) extends AnyVal {
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
    def setCoverageHoursPercentage(value: CoverageHoursPercentage): Self = this.set("CoverageHoursPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverageHoursPercentage: Self = this.set("CoverageHoursPercentage", js.undefined)
    @scala.inline
    def setOnDemandHours(value: OnDemandHours): Self = this.set("OnDemandHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDemandHours: Self = this.set("OnDemandHours", js.undefined)
    @scala.inline
    def setReservedHours(value: ReservedHours): Self = this.set("ReservedHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedHours: Self = this.set("ReservedHours", js.undefined)
    @scala.inline
    def setTotalRunningHours(value: TotalRunningHours): Self = this.set("TotalRunningHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRunningHours: Self = this.set("TotalRunningHours", js.undefined)
  }
  
}

