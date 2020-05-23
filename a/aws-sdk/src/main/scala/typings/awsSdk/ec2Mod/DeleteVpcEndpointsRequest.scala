package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVpcEndpointsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more VPC endpoint IDs.
    */
  var VpcEndpointIds: VpcEndpointIdList = js.native
}

object DeleteVpcEndpointsRequest {
  @scala.inline
  def apply(VpcEndpointIds: VpcEndpointIdList, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteVpcEndpointsRequest = {
    val __obj = js.Dynamic.literal(VpcEndpointIds = VpcEndpointIds.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcEndpointsRequest]
  }
}

