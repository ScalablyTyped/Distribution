package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachClassicLinkVpcRequest extends StObject {
  
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
  implicit class AttachClassicLinkVpcRequestMutableBuilder[Self <: AttachClassicLinkVpcRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setGroups(value: GroupIdStringList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
