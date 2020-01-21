package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectVpcPeeringConnectionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: typings.awsSdk.ec2Mod.VpcPeeringConnectionId = js.native
}

object RejectVpcPeeringConnectionRequest {
  @scala.inline
  def apply(VpcPeeringConnectionId: VpcPeeringConnectionId, DryRun: js.UndefOr[scala.Boolean] = js.undefined): RejectVpcPeeringConnectionRequest = {
    val __obj = js.Dynamic.literal(VpcPeeringConnectionId = VpcPeeringConnectionId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectVpcPeeringConnectionRequest]
  }
}

