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
  def apply(
    estimatedMinutesRemaining: js.UndefOr[Integer] = js.undefined,
    isReservedMinutesCustomer: js.UndefOr[Boolean] = js.undefined,
    totalReservedMinuteAllocation: js.UndefOr[Integer] = js.undefined,
    totalScheduledMinutes: js.UndefOr[Integer] = js.undefined,
    upcomingMinutesScheduled: js.UndefOr[Integer] = js.undefined
  ): GetMinuteUsageResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(estimatedMinutesRemaining)) __obj.updateDynamic("estimatedMinutesRemaining")(estimatedMinutesRemaining.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isReservedMinutesCustomer)) __obj.updateDynamic("isReservedMinutesCustomer")(isReservedMinutesCustomer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalReservedMinuteAllocation)) __obj.updateDynamic("totalReservedMinuteAllocation")(totalReservedMinuteAllocation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalScheduledMinutes)) __obj.updateDynamic("totalScheduledMinutes")(totalScheduledMinutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upcomingMinutesScheduled)) __obj.updateDynamic("upcomingMinutesScheduled")(upcomingMinutesScheduled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMinuteUsageResponse]
  }
}

