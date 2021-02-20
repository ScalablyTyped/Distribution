package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservationResponse extends StObject {
  
  var Reservation: js.UndefOr[typings.awsSdk.mediaconnectMod.Reservation] = js.native
}
object DescribeReservationResponse {
  
  @scala.inline
  def apply(): DescribeReservationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservationResponse]
  }
  
  @scala.inline
  implicit class DescribeReservationResponseMutableBuilder[Self <: DescribeReservationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservation(value: Reservation): Self = StObject.set(x, "Reservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationUndefined: Self = StObject.set(x, "Reservation", js.undefined)
  }
}
