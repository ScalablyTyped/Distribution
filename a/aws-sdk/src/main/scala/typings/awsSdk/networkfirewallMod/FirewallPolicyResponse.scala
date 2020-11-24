package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicyResponse extends js.Object {
  
  /**
    * A description of the firewall policy.
    */
  var Description: js.UndefOr[typings.awsSdk.networkfirewallMod.Description] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the firewall policy.  If this response is for a create request that had DryRun set to TRUE, then this ARN is a placeholder that isn't attached to a valid resource. 
    */
  var FirewallPolicyArn: ResourceArn = js.native
  
  /**
    * The unique identifier for the firewall policy. 
    */
  var FirewallPolicyId: ResourceId = js.native
  
  /**
    * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
    */
  var FirewallPolicyName: ResourceName = js.native
  
  /**
    * The current status of the firewall policy. You can retrieve this for a firewall policy by calling DescribeFirewallPolicy and providing the firewall policy's name or ARN.
    */
  var FirewallPolicyStatus: js.UndefOr[ResourceStatus] = js.native
  
  /**
    * The key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object FirewallPolicyResponse {
  
  @scala.inline
  def apply(FirewallPolicyArn: ResourceArn, FirewallPolicyId: ResourceId, FirewallPolicyName: ResourceName): FirewallPolicyResponse = {
    val __obj = js.Dynamic.literal(FirewallPolicyArn = FirewallPolicyArn.asInstanceOf[js.Any], FirewallPolicyId = FirewallPolicyId.asInstanceOf[js.Any], FirewallPolicyName = FirewallPolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyResponse]
  }
  
  @scala.inline
  implicit class FirewallPolicyResponseOps[Self <: FirewallPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirewallPolicyArn(value: ResourceArn): Self = this.set("FirewallPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyId(value: ResourceId): Self = this.set("FirewallPolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyName(value: ResourceName): Self = this.set("FirewallPolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setFirewallPolicyStatus(value: ResourceStatus): Self = this.set("FirewallPolicyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewallPolicyStatus: Self = this.set("FirewallPolicyStatus", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
