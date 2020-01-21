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
    estimatedMinutesRemaining: Int | scala.Double = null,
    isReservedMinutesCustomer: js.UndefOr[scala.Boolean] = js.undefined,
    totalReservedMinuteAllocation: Int | scala.Double = null,
    totalScheduledMinutes: Int | scala.Double = null,
    upcomingMinutesScheduled: Int | scala.Double = null
  ): GetMinuteUsageResponse = {
    val __obj = js.Dynamic.literal()
    if (estimatedMinutesRemaining != null) __obj.updateDynamic("estimatedMinutesRemaining")(estimatedMinutesRemaining.asInstanceOf[js.Any])
    if (!js.isUndefined(isReservedMinutesCustomer)) __obj.updateDynamic("isReservedMinutesCustomer")(isReservedMinutesCustomer.asInstanceOf[js.Any])
    if (totalReservedMinuteAllocation != null) __obj.updateDynamic("totalReservedMinuteAllocation")(totalReservedMinuteAllocation.asInstanceOf[js.Any])
    if (totalScheduledMinutes != null) __obj.updateDynamic("totalScheduledMinutes")(totalScheduledMinutes.asInstanceOf[js.Any])
    if (upcomingMinutesScheduled != null) __obj.updateDynamic("upcomingMinutesScheduled")(upcomingMinutesScheduled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMinuteUsageResponse]
  }
}

