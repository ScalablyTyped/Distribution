package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCapacityReservationUsageResult extends js.Object {
  /**
    * The remaining capacity. Indicates the number of instances that can be launched in the Capacity Reservation.
    */
  var AvailableInstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[String] = js.native
  /**
    * The type of instance for which the Capacity Reservation reserves capacity.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * Information about the Capacity Reservation usage.
    */
  var InstanceUsages: js.UndefOr[InstanceUsageSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:    active - The Capacity Reservation is active and the capacity is available for your use.    expired - The Capacity Reservation expired automatically at the date and time specified in your request. The reserved capacity is no longer available for your use.    cancelled - The Capacity Reservation was manually cancelled. The reserved capacity is no longer available for your use.    pending - The Capacity Reservation request was successful but the capacity provisioning is still pending.    failed - The Capacity Reservation request has failed. A request might fail due to invalid request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.  
    */
  var State: js.UndefOr[CapacityReservationState] = js.native
  /**
    * The number of instances for which the Capacity Reservation reserves capacity.
    */
  var TotalInstanceCount: js.UndefOr[Integer] = js.native
}

object GetCapacityReservationUsageResult {
  @scala.inline
  def apply(
    AvailableInstanceCount: js.UndefOr[Integer] = js.undefined,
    CapacityReservationId: String = null,
    InstanceType: String = null,
    InstanceUsages: InstanceUsageSet = null,
    NextToken: String = null,
    State: CapacityReservationState = null,
    TotalInstanceCount: js.UndefOr[Integer] = js.undefined
  ): GetCapacityReservationUsageResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AvailableInstanceCount)) __obj.updateDynamic("AvailableInstanceCount")(AvailableInstanceCount.get.asInstanceOf[js.Any])
    if (CapacityReservationId != null) __obj.updateDynamic("CapacityReservationId")(CapacityReservationId.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (InstanceUsages != null) __obj.updateDynamic("InstanceUsages")(InstanceUsages.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalInstanceCount)) __obj.updateDynamic("TotalInstanceCount")(TotalInstanceCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCapacityReservationUsageResult]
  }
}

