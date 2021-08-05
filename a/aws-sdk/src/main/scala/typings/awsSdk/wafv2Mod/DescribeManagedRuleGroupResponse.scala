package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeManagedRuleGroupResponse extends StObject {
  
  /**
    * The web ACL capacity units (WCUs) required for this rule group. AWS WAF uses web ACL capacity units (WCU) to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group capacity is fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is 1,500. 
    */
  var Capacity: js.UndefOr[CapacityUnit] = js.undefined
  
  /**
    * 
    */
  var Rules: js.UndefOr[RuleSummaries] = js.undefined
}
object DescribeManagedRuleGroupResponse {
  
  inline def apply(): DescribeManagedRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeManagedRuleGroupResponse]
  }
  
  extension [Self <: DescribeManagedRuleGroupResponse](x: Self) {
    
    inline def setCapacity(value: CapacityUnit): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    inline def setRules(value: RuleSummaries): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: RuleSummary*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
