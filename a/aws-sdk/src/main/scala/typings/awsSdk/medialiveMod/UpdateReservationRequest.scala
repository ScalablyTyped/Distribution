package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateReservationRequest extends js.Object {
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
  implicit class UpdateReservationRequestOps[Self <: UpdateReservationRequest] (val x: Self) extends AnyVal {
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
    def setReservationId(value: string): Self = this.set("ReservationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

