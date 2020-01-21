package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNetworkAclRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: typings.awsSdk.ec2Mod.NetworkAclId = js.native
}

object DeleteNetworkAclRequest {
  @scala.inline
  def apply(NetworkAclId: NetworkAclId, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DeleteNetworkAclRequest = {
    val __obj = js.Dynamic.literal(NetworkAclId = NetworkAclId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkAclRequest]
  }
}

