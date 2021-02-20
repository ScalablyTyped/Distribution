package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteReservationRequest extends StObject {
  
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: string = js.native
}
object DeleteReservationRequest {
  
  @scala.inline
  def apply(ReservationId: string): DeleteReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationId = ReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReservationRequest]
  }
  
  @scala.inline
  implicit class DeleteReservationRequestMutableBuilder[Self <: DeleteReservationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservationId(value: string): Self = StObject.set(x, "ReservationId", value.asInstanceOf[js.Any])
  }
}
