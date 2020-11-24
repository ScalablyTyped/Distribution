package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupResponse extends js.Object {
  
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
  implicit class RuleGroupResponseOps[Self <: RuleGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setRuleGroupArn(value: ResourceArn): Self = this.set("RuleGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupId(value: ResourceId): Self = this.set("RuleGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupName(value: ResourceName): Self = this.set("RuleGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacity(value: RuleCapacity): Self = this.set("Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacity: Self = this.set("Capacity", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setRuleGroupStatus(value: ResourceStatus): Self = this.set("RuleGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleGroupStatus: Self = this.set("RuleGroupStatus", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setType(value: RuleGroupType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
