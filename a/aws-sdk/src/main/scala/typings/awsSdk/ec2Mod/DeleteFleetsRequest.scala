package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFleetsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the EC2 Fleets.
    */
  var FleetIds: FleetIdSet = js.native
  /**
    * Indicates whether to terminate instances for an EC2 Fleet if it is deleted successfully.
    */
  var TerminateInstances: Boolean = js.native
}

object DeleteFleetsRequest {
  @scala.inline
  def apply(
    FleetIds: FleetIdSet,
    TerminateInstances: Boolean,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteFleetsRequest = {
    val __obj = js.Dynamic.literal(FleetIds = FleetIds.asInstanceOf[js.Any], TerminateInstances = TerminateInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetsRequest]
  }
}

