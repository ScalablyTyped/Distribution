package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelCapacityReservationRequest extends js.Object {
  /**
    * The ID of the Capacity Reservation to be cancelled.
    */
  var CapacityReservationId: typings.awsSdk.ec2Mod.CapacityReservationId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object CancelCapacityReservationRequest {
  @scala.inline
  def apply(CapacityReservationId: CapacityReservationId, DryRun: js.UndefOr[scala.Boolean] = js.undefined): CancelCapacityReservationRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationId = CapacityReservationId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelCapacityReservationRequest]
  }
}

