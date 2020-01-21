package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceCapacityReservationAttributesRequest extends js.Object {
  /**
    * Information about the Capacity Reservation targeting option.
    */
  var CapacityReservationSpecification: typings.awsSdk.ec2Mod.CapacityReservationSpecification = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the instance to be modified.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
}

object ModifyInstanceCapacityReservationAttributesRequest {
  @scala.inline
  def apply(
    CapacityReservationSpecification: CapacityReservationSpecification,
    InstanceId: InstanceId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): ModifyInstanceCapacityReservationAttributesRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationSpecification = CapacityReservationSpecification.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceCapacityReservationAttributesRequest]
  }
}

