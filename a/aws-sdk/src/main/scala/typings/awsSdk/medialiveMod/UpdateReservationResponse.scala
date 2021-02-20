package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateReservationResponse extends StObject {
  
  var Reservation: js.UndefOr[typings.awsSdk.medialiveMod.Reservation] = js.native
}
object UpdateReservationResponse {
  
  @scala.inline
  def apply(): UpdateReservationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateReservationResponse]
  }
  
  @scala.inline
  implicit class UpdateReservationResponseMutableBuilder[Self <: UpdateReservationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservation(value: Reservation): Self = StObject.set(x, "Reservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationUndefined: Self = StObject.set(x, "Reservation", js.undefined)
  }
}
