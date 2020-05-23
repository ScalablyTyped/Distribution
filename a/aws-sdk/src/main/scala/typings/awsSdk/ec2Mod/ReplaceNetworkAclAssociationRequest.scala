package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceNetworkAclAssociationRequest extends js.Object {
  /**
    * The ID of the current association between the original network ACL and the subnet.
    */
  var AssociationId: NetworkAclAssociationId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the new network ACL to associate with the subnet.
    */
  var NetworkAclId: typings.awsSdk.ec2Mod.NetworkAclId = js.native
}

object ReplaceNetworkAclAssociationRequest {
  @scala.inline
  def apply(
    AssociationId: NetworkAclAssociationId,
    NetworkAclId: NetworkAclId,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ReplaceNetworkAclAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], NetworkAclId = NetworkAclId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceNetworkAclAssociationRequest]
  }
}

