package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulRuleGroup extends StObject {
  
  /**
    * The resource ID of the rule group.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.fmsMod.ResourceId] = js.undefined
  
  /**
    * The name of the rule group.
    */
  var RuleGroupName: js.UndefOr[NetworkFirewallResourceName] = js.undefined
}
object StatefulRuleGroup {
  
  @scala.inline
  def apply(): StatefulRuleGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulRuleGroup]
  }
  
  @scala.inline
  implicit class StatefulRuleGroupMutableBuilder[Self <: StatefulRuleGroup] (val x: Self) extends AnyVal {
    
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
