package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservationRequest extends StObject {
  
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: string = js.native
}
object DescribeReservationRequest {
  
  @scala.inline
  def apply(ReservationId: string): DescribeReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationId = ReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservationRequest]
  }
  
  @scala.inline
  implicit class DescribeReservationRequestMutableBuilder[Self <: DescribeReservationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservationId(value: string): Self = StObject.set(x, "ReservationId", value.asInstanceOf[js.Any])
  }
}
