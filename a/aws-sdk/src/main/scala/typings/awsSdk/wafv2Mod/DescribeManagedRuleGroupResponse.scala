package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeManagedRuleGroupResponse extends StObject {
  
  /**
    * The web ACL capacity units (WCUs) required for this rule group. AWS WAF uses web ACL capacity units (WCU) to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group capacity is fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is 1,500. 
    */
  var Capacity: js.UndefOr[CapacityUnit] = js.native
  
  /**
    * 
    */
  var Rules: js.UndefOr[RuleSummaries] = js.native
}
object DescribeManagedRuleGroupResponse {
  
  @scala.inline
  def apply(): DescribeManagedRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeManagedRuleGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeManagedRuleGroupResponseMutableBuilder[Self <: DescribeManagedRuleGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacity(value: CapacityUnit): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    @scala.inline
    def setRules(value: RuleSummaries): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: RuleSummary*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
