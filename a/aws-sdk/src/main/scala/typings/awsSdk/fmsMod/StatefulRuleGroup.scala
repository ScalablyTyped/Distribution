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
  
  inline def apply(): StatefulRuleGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulRuleGroup]
  }
  
  extension [Self <: StatefulRuleGroup](x: Self) {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setRuleGroupName(value: NetworkFirewallResourceName): Self = StObject.set(x, "RuleGroupName", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupNameUndefined: Self = StObject.set(x, "RuleGroupName", js.undefined)
  }
}
