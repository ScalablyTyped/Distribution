package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMinuteUsageResponse extends js.Object {
  /**
    * Estimated number of minutes remaining for an account, specific to the month being requested.
    */
  var estimatedMinutesRemaining: js.UndefOr[Integer] = js.native
  /**
    * Returns whether or not an account has signed up for the reserved minutes pricing plan, specific to the month being requested.
    */
  var isReservedMinutesCustomer: js.UndefOr[Boolean] = js.native
  /**
    * Total number of reserved minutes allocated, specific to the month being requested.
    */
  var totalReservedMinuteAllocation: js.UndefOr[Integer] = js.native
  /**
    * Total scheduled minutes for an account, specific to the month being requested.
    */
  var totalScheduledMinutes: js.UndefOr[Integer] = js.native
  /**
    * Upcoming minutes scheduled for an account, specific to the month being requested.
    */
  var upcomingMinutesScheduled: js.UndefOr[Integer] = js.native
}

object GetMinuteUsageResponse {
  @scala.inline
  def apply(): GetMinuteUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMinuteUsageResponse]
  }
  @scala.inline
  implicit class GetMinuteUsageResponseOps[Self <: GetMinuteUsageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEstimatedMinutesRemaining(value: Integer): Self = this.set("estimatedMinutesRemaining", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedMinutesRemaining: Self = this.set("estimatedMinutesRemaining", js.undefined)
    @scala.inline
    def setIsReservedMinutesCustomer(value: Boolean): Self = this.set("isReservedMinutesCustomer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsReservedMinutesCustomer: Self = this.set("isReservedMinutesCustomer", js.undefined)
    @scala.inline
    def setTotalReservedMinuteAllocation(value: Integer): Self = this.set("totalReservedMinuteAllocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalReservedMinuteAllocation: Self = this.set("totalReservedMinuteAllocation", js.undefined)
    @scala.inline
    def setTotalScheduledMinutes(value: Integer): Self = this.set("totalScheduledMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalScheduledMinutes: Self = this.set("totalScheduledMinutes", js.undefined)
    @scala.inline
    def setUpcomingMinutesScheduled(value: Integer): Self = this.set("upcomingMinutesScheduled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpcomingMinutesScheduled: Self = this.set("upcomingMinutesScheduled", js.undefined)
  }
  
}

