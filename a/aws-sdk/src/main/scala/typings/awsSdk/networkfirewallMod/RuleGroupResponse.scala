package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupResponse extends StObject {
  
  /**
    * The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation. When you update a rule group, you are limited to this capacity. When you reference a rule group from a firewall policy, Network Firewall reserves this capacity for the rule group.  You can retrieve the capacity that would be required for a rule group before you create the rule group by calling CreateRuleGroup with DryRun set to TRUE. 
    */
  var Capacity: js.UndefOr[RuleCapacity] = js.native
  
  /**
    * A description of the rule group. 
    */
  var Description: js.UndefOr[typings.awsSdk.networkfirewallMod.Description] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the rule group.  If this response is for a create request that had DryRun set to TRUE, then this ARN is a placeholder that isn't attached to a valid resource. 
    */
  var RuleGroupArn: ResourceArn = js.native
  
  /**
    * The unique identifier for the rule group. 
    */
  var RuleGroupId: ResourceId = js.native
  
  /**
    * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
    */
  var RuleGroupName: ResourceName = js.native
  
  /**
    * Detailed information about the current status of a rule group. 
    */
  var RuleGroupStatus: js.UndefOr[ResourceStatus] = js.native
  
  /**
    * The key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless rules. If it is stateful, it contains stateful rules. 
    */
  var Type: js.UndefOr[RuleGroupType] = js.native
}
object RuleGroupResponse {
  
  @scala.inline
  def apply(RuleGroupArn: ResourceArn, RuleGroupId: ResourceId, RuleGroupName: ResourceName): RuleGroupResponse = {
    val __obj = js.Dynamic.literal(RuleGroupArn = RuleGroupArn.asInstanceOf[js.Any], RuleGroupId = RuleGroupId.asInstanceOf[js.Any], RuleGroupName = RuleGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupResponse]
  }
  
  @scala.inline
  implicit class RuleGroupResponseMutableBuilder[Self <: RuleGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacity(value: RuleCapacity): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setRuleGroupArn(value: ResourceArn): Self = StObject.set(x, "RuleGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupId(value: ResourceId): Self = StObject.set(x, "RuleGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupName(value: ResourceName): Self = StObject.set(x, "RuleGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupStatus(value: ResourceStatus): Self = StObject.set(x, "RuleGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupStatusUndefined: Self = StObject.set(x, "RuleGroupStatus", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: RuleGroupType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
