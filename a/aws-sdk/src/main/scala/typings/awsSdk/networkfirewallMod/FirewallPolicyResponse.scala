package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicyResponse extends StObject {
  
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
  implicit class FirewallPolicyResponseMutableBuilder[Self <: FirewallPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFirewallPolicyArn(value: ResourceArn): Self = StObject.set(x, "FirewallPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyId(value: ResourceId): Self = StObject.set(x, "FirewallPolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyName(value: ResourceName): Self = StObject.set(x, "FirewallPolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyStatus(value: ResourceStatus): Self = StObject.set(x, "FirewallPolicyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyStatusUndefined: Self = StObject.set(x, "FirewallPolicyStatus", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
