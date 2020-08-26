package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultByTime extends js.Object {
  /**
    * Whether the result is estimated.
    */
  var Estimated: js.UndefOr[typings.awsSdk.costexplorerMod.Estimated] = js.native
  /**
    * The groups that this time period includes.
    */
  var Groups: js.UndefOr[typings.awsSdk.costexplorerMod.Groups] = js.native
  /**
    * The time period that the result covers.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
  /**
    * The total amount of cost or usage accrued during the time period.
    */
  var Total: js.UndefOr[Metrics] = js.native
}

object ResultByTime {
  @scala.inline
  def apply(): ResultByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultByTime]
  }
  @scala.inline
  implicit class ResultByTimeOps[Self <: ResultByTime] (val x: Self) extends AnyVal {
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
    def setEstimated(value: Estimated): Self = this.set("Estimated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimated: Self = this.set("Estimated", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: Group*): Self = this.set("Groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: Groups): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = this.set("TimePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePeriod: Self = this.set("TimePeriod", js.undefined)
    @scala.inline
    def setTotal(value: Metrics): Self = this.set("Total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
  
}

