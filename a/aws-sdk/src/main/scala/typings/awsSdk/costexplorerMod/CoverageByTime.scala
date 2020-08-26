package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageByTime extends js.Object {
  /**
    * The groups of instances that the reservation covered.
    */
  var Groups: js.UndefOr[ReservationCoverageGroups] = js.native
  /**
    * The period that this coverage was used over.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
  /**
    * The total reservation coverage, in hours.
    */
  var Total: js.UndefOr[Coverage] = js.native
}

object CoverageByTime {
  @scala.inline
  def apply(): CoverageByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageByTime]
  }
  @scala.inline
  implicit class CoverageByTimeOps[Self <: CoverageByTime] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: ReservationCoverageGroup*): Self = this.set("Groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: ReservationCoverageGroups): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = this.set("TimePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePeriod: Self = this.set("TimePeriod", js.undefined)
    @scala.inline
    def setTotal(value: Coverage): Self = this.set("Total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
  
}

