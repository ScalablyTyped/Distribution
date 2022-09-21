package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafRuleGroupRulesDetails extends StObject {
  
  /**
    * Provides information about what action WAF should take on a web request when it matches the criteria defined in the rule. 
    */
  var Action: js.UndefOr[AwsWafRuleGroupRulesActionDetails] = js.undefined
  
  /**
    * If you define more than one rule in a web ACL, WAF evaluates each request against the rules in order based on the value of Priority.
    */
  var Priority: js.UndefOr[Integer] = js.undefined
  
  /**
    * The rule ID for a rule. 
    */
  var RuleId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of rule. 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafRuleGroupRulesDetails {
  
  inline def apply(): AwsWafRuleGroupRulesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafRuleGroupRulesDetails]
  }
  
  extension [Self <: AwsWafRuleGroupRulesDetails](x: Self) {
    
    inline def setAction(value: AwsWafRuleGroupRulesActionDetails): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setPriority(value: Integer): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setRuleId(value: NonEmptyString): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "RuleId", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
