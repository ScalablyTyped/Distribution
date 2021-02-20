package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMinuteUsageResponse extends StObject {
  
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
  implicit class GetMinuteUsageResponseMutableBuilder[Self <: GetMinuteUsageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimatedMinutesRemaining(value: Integer): Self = StObject.set(x, "estimatedMinutesRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedMinutesRemainingUndefined: Self = StObject.set(x, "estimatedMinutesRemaining", js.undefined)
    
    @scala.inline
    def setIsReservedMinutesCustomer(value: Boolean): Self = StObject.set(x, "isReservedMinutesCustomer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReservedMinutesCustomerUndefined: Self = StObject.set(x, "isReservedMinutesCustomer", js.undefined)
    
    @scala.inline
    def setTotalReservedMinuteAllocation(value: Integer): Self = StObject.set(x, "totalReservedMinuteAllocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalReservedMinuteAllocationUndefined: Self = StObject.set(x, "totalReservedMinuteAllocation", js.undefined)
    
    @scala.inline
    def setTotalScheduledMinutes(value: Integer): Self = StObject.set(x, "totalScheduledMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalScheduledMinutesUndefined: Self = StObject.set(x, "totalScheduledMinutes", js.undefined)
    
    @scala.inline
    def setUpcomingMinutesScheduled(value: Integer): Self = StObject.set(x, "upcomingMinutesScheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpcomingMinutesScheduledUndefined: Self = StObject.set(x, "upcomingMinutesScheduled", js.undefined)
  }
}
