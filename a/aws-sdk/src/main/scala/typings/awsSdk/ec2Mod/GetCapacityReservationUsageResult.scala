package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCapacityReservationUsageResult extends StObject {
  
  /**
    * The remaining capacity. Indicates the number of instances that can be launched in the Capacity Reservation.
    */
  var AvailableInstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of instance for which the Capacity Reservation reserves capacity.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the Capacity Reservation usage.
    */
  var InstanceUsages: js.UndefOr[InstanceUsageSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:    active - The Capacity Reservation is active and the capacity is available for your use.    expired - The Capacity Reservation expired automatically at the date and time specified in your request. The reserved capacity is no longer available for your use.    cancelled - The Capacity Reservation was manually cancelled. The reserved capacity is no longer available for your use.    pending - The Capacity Reservation request was successful but the capacity provisioning is still pending.    failed - The Capacity Reservation request has failed. A request might fail due to invalid request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.  
    */
  var State: js.UndefOr[CapacityReservationState] = js.undefined
  
  /**
    * The number of instances for which the Capacity Reservation reserves capacity.
    */
  var TotalInstanceCount: js.UndefOr[Integer] = js.undefined
}
object GetCapacityReservationUsageResult {
  
  @scala.inline
  def apply(): GetCapacityReservationUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCapacityReservationUsageResult]
  }
  
  @scala.inline
  implicit class GetCapacityReservationUsageResultMutableBuilder[Self <: GetCapacityReservationUsageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableInstanceCount(value: Integer): Self = StObject.set(x, "AvailableInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableInstanceCountUndefined: Self = StObject.set(x, "AvailableInstanceCount", js.undefined)
    
    @scala.inline
    def setCapacityReservationId(value: String): Self = StObject.set(x, "CapacityReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationIdUndefined: Self = StObject.set(x, "CapacityReservationId", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setInstanceUsages(value: InstanceUsageSet): Self = StObject.set(x, "InstanceUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUsagesUndefined: Self = StObject.set(x, "InstanceUsages", js.undefined)
    
    @scala.inline
    def setInstanceUsagesVarargs(value: InstanceUsage*): Self = StObject.set(x, "InstanceUsages", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setState(value: CapacityReservationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTotalInstanceCount(value: Integer): Self = StObject.set(x, "TotalInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalInstanceCountUndefined: Self = StObject.set(x, "TotalInstanceCount", js.undefined)
  }
}
