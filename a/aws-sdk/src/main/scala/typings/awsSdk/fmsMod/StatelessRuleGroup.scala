package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatelessRuleGroup extends StObject {
  
  /**
    * The priority of the rule group. AWS Network Firewall evaluates the stateless rule groups in a firewall policy starting from the lowest priority setting. 
    */
  var Priority: js.UndefOr[StatelessRuleGroupPriority] = js.undefined
  
  /**
    * The resource ID of the rule group.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.fmsMod.ResourceId] = js.undefined
  
  /**
    * The name of the rule group.
    */
  var RuleGroupName: js.UndefOr[NetworkFirewallResourceName] = js.undefined
}
object StatelessRuleGroup {
  
  @scala.inline
  def apply(): StatelessRuleGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatelessRuleGroup]
  }
  
  @scala.inline
  implicit class StatelessRuleGroupMutableBuilder[Self <: StatelessRuleGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: StatelessRuleGroupPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setRuleGroupName(value: NetworkFirewallResourceName): Self = StObject.set(x, "RuleGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupNameUndefined: Self = StObject.set(x, "RuleGroupName", js.undefined)
  }
}
