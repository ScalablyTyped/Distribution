package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachClassicLinkVpcRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the instance to unlink from the VPC.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * The ID of the VPC to which the instance is linked.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}

object DetachClassicLinkVpcRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, VpcId: VpcId, DryRun: js.UndefOr[Boolean] = js.undefined): DetachClassicLinkVpcRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachClassicLinkVpcRequest]
  }
}

