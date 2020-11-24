package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservationRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the reservation.
    */
  var ReservationArn: string = js.native
}
object DescribeReservationRequest {
  
  @scala.inline
  def apply(ReservationArn: string): DescribeReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationArn = ReservationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservationRequest]
  }
  
  @scala.inline
  implicit class DescribeReservationRequestOps[Self <: DescribeReservationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReservationArn(value: string): Self = this.set("ReservationArn", value.asInstanceOf[js.Any])
  }
}
