package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyNetworkInterfaceAttributeRequest extends js.Object {
  /**
    * Information about the interface attachment. If modifying the 'delete on termination' attribute, you must specify the ID of the interface attachment.
    */
  var Attachment: js.UndefOr[NetworkInterfaceAttachmentChanges] = js.native
  /**
    * A description for the network interface.
    */
  var Description: js.UndefOr[AttributeValue] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Changes the security groups for the network interface. The new set of groups you specify replaces the current set. You must specify at least one group, even if it's just the default security group in the VPC. You must specify the ID of the security group, not the name.
    */
  var Groups: js.UndefOr[SecurityGroupIdStringList] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId = js.native
  /**
    * Indicates whether source/destination checking is enabled. A value of true means checking is enabled, and false means checking is disabled. This value must be false for a NAT instance to perform NAT. For more information, see NAT Instances in the Amazon Virtual Private Cloud User Guide.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.native
}

object ModifyNetworkInterfaceAttributeRequest {
  @scala.inline
  def apply(NetworkInterfaceId: NetworkInterfaceId): ModifyNetworkInterfaceAttributeRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyNetworkInterfaceAttributeRequest]
  }
  @scala.inline
  implicit class ModifyNetworkInterfaceAttributeRequestOps[Self <: ModifyNetworkInterfaceAttributeRequest] (val x: Self) extends AnyVal {
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
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachment(value: NetworkInterfaceAttachmentChanges): Self = this.set("Attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachment: Self = this.set("Attachment", js.undefined)
    @scala.inline
    def setDescription(value: AttributeValue): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: SecurityGroupId*): Self = this.set("Groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: SecurityGroupIdStringList): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    @scala.inline
    def setSourceDestCheck(value: AttributeBooleanValue): Self = this.set("SourceDestCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDestCheck: Self = this.set("SourceDestCheck", js.undefined)
  }
  
}

