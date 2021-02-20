package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateReservationRequest extends StObject {
  
  /**
    * Name of the reservation
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: string = js.native
}
object UpdateReservationRequest {
  
  @scala.inline
  def apply(ReservationId: string): UpdateReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationId = ReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReservationRequest]
  }
  
  @scala.inline
  implicit class UpdateReservationRequestMutableBuilder[Self <: UpdateReservationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setReservationId(value: string): Self = StObject.set(x, "ReservationId", value.asInstanceOf[js.Any])
  }
}
