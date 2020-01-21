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
  def apply(ReservationId: string, Name: string = null): UpdateReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationId = ReservationId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReservationRequest]
  }
}

