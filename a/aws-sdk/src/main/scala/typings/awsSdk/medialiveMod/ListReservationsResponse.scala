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
  
  @scala.inline
  def apply(): ListReservationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReservationsResponse]
  }
  
  @scala.inline
  implicit class ListReservationsResponseMutableBuilder[Self <: ListReservationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setReservations(value: listOfReservation): Self = StObject.set(x, "Reservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationsUndefined: Self = StObject.set(x, "Reservations", js.undefined)
    
    @scala.inline
    def setReservationsVarargs(value: Reservation*): Self = StObject.set(x, "Reservations", js.Array(value :_*))
  }
}
