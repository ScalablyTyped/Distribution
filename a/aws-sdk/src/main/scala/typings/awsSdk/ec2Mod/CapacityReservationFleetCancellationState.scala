package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityReservationFleetCancellationState extends StObject {
  
  /**
    * The ID of the Capacity Reservation Fleet that was successfully cancelled.
    */
  var CapacityReservationFleetId: js.UndefOr[typings.awsSdk.ec2Mod.CapacityReservationFleetId] = js.undefined
  
  /**
    * The current state of the Capacity Reservation Fleet.
    */
  var CurrentFleetState: js.UndefOr[CapacityReservationFleetState] = js.undefined
  
  /**
    * The previous state of the Capacity Reservation Fleet.
    */
  var PreviousFleetState: js.UndefOr[CapacityReservationFleetState] = js.undefined
}
object CapacityReservationFleetCancellationState {
  
  inline def apply(): CapacityReservationFleetCancellationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationFleetCancellationState]
  }
  
  extension [Self <: CapacityReservationFleetCancellationState](x: Self) {
    
    inline def setCapacityReservationFleetId(value: CapacityReservationFleetId): Self = StObject.set(x, "CapacityReservationFleetId", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationFleetIdUndefined: Self = StObject.set(x, "CapacityReservationFleetId", js.undefined)
    
    inline def setCurrentFleetState(value: CapacityReservationFleetState): Self = StObject.set(x, "CurrentFleetState", value.asInstanceOf[js.Any])
    
    inline def setCurrentFleetStateUndefined: Self = StObject.set(x, "CurrentFleetState", js.undefined)
    
    inline def setPreviousFleetState(value: CapacityReservationFleetState): Self = StObject.set(x, "PreviousFleetState", value.asInstanceOf[js.Any])
    
    inline def setPreviousFleetStateUndefined: Self = StObject.set(x, "PreviousFleetState", js.undefined)
  }
}
