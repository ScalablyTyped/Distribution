package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReservationsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * List of reservations
    */
  var Reservations: js.UndefOr[listOfReservation] = js.undefined
}
object ListReservationsResponse {
  
  inline def apply(): ListReservationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReservationsResponse]
  }
  
  extension [Self <: ListReservationsResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservations(value: listOfReservation): Self = StObject.set(x, "Reservations", value.asInstanceOf[js.Any])
    
    inline def setReservationsUndefined: Self = StObject.set(x, "Reservations", js.undefined)
    
    inline def setReservationsVarargs(value: Reservation*): Self = StObject.set(x, "Reservations", js.Array(value :_*))
  }
}
