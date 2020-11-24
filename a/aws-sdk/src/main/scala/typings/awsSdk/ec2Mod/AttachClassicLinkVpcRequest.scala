package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachClassicLinkVpcRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of one or more of the VPC's security groups. You cannot specify security groups from a different VPC.
    */
  var Groups: GroupIdStringList = js.native
  
  /**
    * The ID of an EC2-Classic instance to link to the ClassicLink-enabled VPC.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
  
  /**
    * The ID of a ClassicLink-enabled VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}
object AttachClassicLinkVpcRequest {
  
  @scala.inline
  def apply(Groups: GroupIdStringList, InstanceId: InstanceId, VpcId: VpcId): AttachClassicLinkVpcRequest = {
    val __obj = js.Dynamic.literal(Groups = Groups.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachClassicLinkVpcRequest]
  }
  
  @scala.inline
  implicit class AttachClassicLinkVpcRequestOps[Self <: AttachClassicLinkVpcRequest] (val x: Self) extends AnyVal {
    
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
    def setGroupsVarargs(value: String*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: GroupIdStringList): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
}
