package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityReservationTarget extends js.Object {
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[typings.awsSdk.ec2Mod.CapacityReservationId] = js.native
}

object CapacityReservationTarget {
  @scala.inline
  def apply(CapacityReservationId: CapacityReservationId = null): CapacityReservationTarget = {
    val __obj = js.Dynamic.literal()
    if (CapacityReservationId != null) __obj.updateDynamic("CapacityReservationId")(CapacityReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityReservationTarget]
  }
}

