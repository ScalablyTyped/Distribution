package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedCapacityReservationFleetCancellationResult extends StObject {
  
  /**
    * Information about the Capacity Reservation Fleet cancellation error.
    */
  var CancelCapacityReservationFleetError: js.UndefOr[typings.awsSdk.ec2Mod.CancelCapacityReservationFleetError] = js.undefined
  
  /**
    * The ID of the Capacity Reservation Fleet that could not be cancelled.
    */
  var CapacityReservationFleetId: js.UndefOr[typings.awsSdk.ec2Mod.CapacityReservationFleetId] = js.undefined
}
object FailedCapacityReservationFleetCancellationResult {
  
  inline def apply(): FailedCapacityReservationFleetCancellationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedCapacityReservationFleetCancellationResult]
  }
  
  extension [Self <: FailedCapacityReservationFleetCancellationResult](x: Self) {
    
    inline def setCancelCapacityReservationFleetError(value: CancelCapacityReservationFleetError): Self = StObject.set(x, "CancelCapacityReservationFleetError", value.asInstanceOf[js.Any])
    
    inline def setCancelCapacityReservationFleetErrorUndefined: Self = StObject.set(x, "CancelCapacityReservationFleetError", js.undefined)
    
    inline def setCapacityReservationFleetId(value: CapacityReservationFleetId): Self = StObject.set(x, "CapacityReservationFleetId", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationFleetIdUndefined: Self = StObject.set(x, "CapacityReservationFleetId", js.undefined)
  }
}
