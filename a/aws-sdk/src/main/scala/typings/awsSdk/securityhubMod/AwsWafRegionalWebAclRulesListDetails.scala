package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafRegionalWebAclRulesListDetails extends StObject {
  
  /**
    * The action that WAF takes when a web request matches all conditions in the rule, such as allow, block, or count the request. 
    */
  var Action: js.UndefOr[AwsWafRegionalWebAclRulesListActionDetails] = js.undefined
  
  /**
    * Overrides the rule evaluation result in the rule group. 
    */
  var OverrideAction: js.UndefOr[AwsWafRegionalWebAclRulesListOverrideActionDetails] = js.undefined
  
  /**
    * The order in which WAF evaluates the rules in a web ACL. 
    */
  var Priority: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of an WAF Regional rule to associate with a web ACL. 
    */
  var RuleId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * For actions that are associated with a rule, the action that WAF takes when a web request matches all conditions in a rule. 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafRegionalWebAclRulesListDetails {
  
  inline def apply(): AwsWafRegionalWebAclRulesListDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafRegionalWebAclRulesListDetails]
  }
  
  extension [Self <: AwsWafRegionalWebAclRulesListDetails](x: Self) {
    
    inline def setAction(value: AwsWafRegionalWebAclRulesListActionDetails): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setOverrideAction(value: AwsWafRegionalWebAclRulesListOverrideActionDetails): Self = StObject.set(x, "OverrideAction", value.asInstanceOf[js.Any])
    
    inline def setOverrideActionUndefined: Self = StObject.set(x, "OverrideAction", js.undefined)
    
    inline def setPriority(value: Integer): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setRuleId(value: NonEmptyString): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "RuleId", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
