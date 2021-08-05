package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReservationRequest extends StObject {
  
  /**
    * Name of the reservation
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: string
}
object UpdateReservationRequest {
  
  inline def apply(ReservationId: string): UpdateReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationId = ReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReservationRequest]
  }
  
  extension [Self <: UpdateReservationRequest](x: Self) {
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setReservationId(value: string): Self = StObject.set(x, "ReservationId", value.asInstanceOf[js.Any])
  }
}
