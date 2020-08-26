package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateReservationResponse extends js.Object {
  var Reservation: js.UndefOr[typings.awsSdk.medialiveMod.Reservation] = js.native
}

object UpdateReservationResponse {
  @scala.inline
  def apply(): UpdateReservationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateReservationResponse]
  }
  @scala.inline
  implicit class UpdateReservationResponseOps[Self <: UpdateReservationResponse] (val x: Self) extends AnyVal {
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
    def setReservation(value: Reservation): Self = this.set("Reservation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservation: Self = this.set("Reservation", js.undefined)
  }
  
}

