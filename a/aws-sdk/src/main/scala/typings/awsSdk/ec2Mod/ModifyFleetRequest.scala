package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyFleetRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.native
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: typings.awsSdk.ec2Mod.FleetId = js.native
  /**
    * The size of the EC2 Fleet.
    */
  var TargetCapacitySpecification: TargetCapacitySpecificationRequest = js.native
}

object ModifyFleetRequest {
  @scala.inline
  def apply(
    FleetId: FleetId,
    TargetCapacitySpecification: TargetCapacitySpecificationRequest,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    ExcessCapacityTerminationPolicy: FleetExcessCapacityTerminationPolicy = null
  ): ModifyFleetRequest = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], TargetCapacitySpecification = TargetCapacitySpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (ExcessCapacityTerminationPolicy != null) __obj.updateDynamic("ExcessCapacityTerminationPolicy")(ExcessCapacityTerminationPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyFleetRequest]
  }
}

