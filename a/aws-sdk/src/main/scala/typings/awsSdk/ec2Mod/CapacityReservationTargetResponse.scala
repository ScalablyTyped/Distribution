package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityReservationTargetResponse extends js.Object {
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[String] = js.native
}

object CapacityReservationTargetResponse {
  @scala.inline
  def apply(CapacityReservationId: String = null): CapacityReservationTargetResponse = {
    val __obj = js.Dynamic.literal()
    if (CapacityReservationId != null) __obj.updateDynamic("CapacityReservationId")(CapacityReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityReservationTargetResponse]
  }
}

