package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptVpcPeeringConnectionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the VPC peering connection. You must specify this parameter in the request.
    */
  var VpcPeeringConnectionId: js.UndefOr[typings.awsSdk.ec2Mod.VpcPeeringConnectionId] = js.native
}

object AcceptVpcPeeringConnectionRequest {
  @scala.inline
  def apply(DryRun: js.UndefOr[Boolean] = js.undefined, VpcPeeringConnectionId: VpcPeeringConnectionId = null): AcceptVpcPeeringConnectionRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (VpcPeeringConnectionId != null) __obj.updateDynamic("VpcPeeringConnectionId")(VpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptVpcPeeringConnectionRequest]
  }
}

