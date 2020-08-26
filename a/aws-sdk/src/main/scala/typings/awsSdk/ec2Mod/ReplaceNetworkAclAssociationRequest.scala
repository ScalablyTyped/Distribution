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
  def apply(AssociationId: NetworkAclAssociationId, NetworkAclId: NetworkAclId): ReplaceNetworkAclAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], NetworkAclId = NetworkAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceNetworkAclAssociationRequest]
  }
  @scala.inline
  implicit class ReplaceNetworkAclAssociationRequestOps[Self <: ReplaceNetworkAclAssociationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssociationId(value: NetworkAclAssociationId): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkAclId(value: NetworkAclId): Self = this.set("NetworkAclId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

