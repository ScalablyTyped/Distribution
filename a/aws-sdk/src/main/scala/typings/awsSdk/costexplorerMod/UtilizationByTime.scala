package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilizationByTime extends js.Object {
  /**
    * The groups that this utilization result uses.
    */
  var Groups: js.UndefOr[ReservationUtilizationGroups] = js.native
  /**
    * The period of time that this utilization was used for.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
  /**
    * The total number of reservation hours that were used.
    */
  var Total: js.UndefOr[ReservationAggregates] = js.native
}

object UtilizationByTime {
  @scala.inline
  def apply(): UtilizationByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilizationByTime]
  }
  @scala.inline
  implicit class UtilizationByTimeOps[Self <: UtilizationByTime] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: ReservationUtilizationGroup*): Self = this.set("Groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: ReservationUtilizationGroups): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = this.set("TimePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePeriod: Self = this.set("TimePeriod", js.undefined)
    @scala.inline
    def setTotal(value: ReservationAggregates): Self = this.set("Total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
  
}

