package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSpotFleetRequestsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the Spot Fleet requests.
    */
  var SpotFleetRequestIds: SpotFleetRequestIdList = js.native
  /**
    * Indicates whether to terminate instances for a Spot Fleet request if it is canceled successfully.
    */
  var TerminateInstances: Boolean = js.native
}

object CancelSpotFleetRequestsRequest {
  @scala.inline
  def apply(
    SpotFleetRequestIds: SpotFleetRequestIdList,
    TerminateInstances: Boolean,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): CancelSpotFleetRequestsRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestIds = SpotFleetRequestIds.asInstanceOf[js.Any], TerminateInstances = TerminateInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSpotFleetRequestsRequest]
  }
}

