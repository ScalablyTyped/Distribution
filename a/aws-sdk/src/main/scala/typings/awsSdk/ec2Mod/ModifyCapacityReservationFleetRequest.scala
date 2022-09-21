package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCapacityReservationFleetRequest extends StObject {
  
  /**
    * The ID of the Capacity Reservation Fleet to modify.
    */
  var CapacityReservationFleetId: typings.awsSdk.ec2Mod.CapacityReservationFleetId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet expires, its state changes to expired and all of the Capacity Reservations in the Fleet expire. The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation Fleet is guaranteed to expire between 13:30:55 and 14:30:55 on 5/31/2019. You can't specify EndDate and  RemoveEndDate in the same request.
    */
  var EndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether to remove the end date from the Capacity Reservation Fleet. If you remove the end date, the Capacity Reservation Fleet does not expire and it remains active until you explicitly cancel it using the CancelCapacityReservationFleet action. You can't specify RemoveEndDate and  EndDate in the same request.
    */
  var RemoveEndDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together with the instance type weights that you assign to each instance type used by the Fleet determine the number of instances for which the Fleet reserves capacity. Both values are based on units that make sense for your workload. For more information, see Total target capacity in the Amazon EC2 User Guide.
    */
  var TotalTargetCapacity: js.UndefOr[Integer] = js.undefined
}
object ModifyCapacityReservationFleetRequest {
  
  inline def apply(CapacityReservationFleetId: CapacityReservationFleetId): ModifyCapacityReservationFleetRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationFleetId = CapacityReservationFleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCapacityReservationFleetRequest]
  }
  
  extension [Self <: ModifyCapacityReservationFleetRequest](x: Self) {
    
    inline def setCapacityReservationFleetId(value: CapacityReservationFleetId): Self = StObject.set(x, "CapacityReservationFleetId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setRemoveEndDate(value: Boolean): Self = StObject.set(x, "RemoveEndDate", value.asInstanceOf[js.Any])
    
    inline def setRemoveEndDateUndefined: Self = StObject.set(x, "RemoveEndDate", js.undefined)
    
    inline def setTotalTargetCapacity(value: Integer): Self = StObject.set(x, "TotalTargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setTotalTargetCapacityUndefined: Self = StObject.set(x, "TotalTargetCapacity", js.undefined)
  }
}
