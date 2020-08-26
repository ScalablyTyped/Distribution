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
  def apply(): GetCapacityReservationUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCapacityReservationUsageResult]
  }
  @scala.inline
  implicit class GetCapacityReservationUsageResultOps[Self <: GetCapacityReservationUsageResult] (val x: Self) extends AnyVal {
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
    def setAvailableInstanceCount(value: Integer): Self = this.set("AvailableInstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableInstanceCount: Self = this.set("AvailableInstanceCount", js.undefined)
    @scala.inline
    def setCapacityReservationId(value: String): Self = this.set("CapacityReservationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityReservationId: Self = this.set("CapacityReservationId", js.undefined)
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setInstanceUsagesVarargs(value: InstanceUsage*): Self = this.set("InstanceUsages", js.Array(value :_*))
    @scala.inline
    def setInstanceUsages(value: InstanceUsageSet): Self = this.set("InstanceUsages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceUsages: Self = this.set("InstanceUsages", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setState(value: CapacityReservationState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTotalInstanceCount(value: Integer): Self = this.set("TotalInstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalInstanceCount: Self = this.set("TotalInstanceCount", js.undefined)
  }
  
}

