package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafRuleGroupDetails extends StObject {
  
  /**
    * The name of the metrics for this rule group. 
    */
  var MetricName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the rule group. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the rule group. 
    */
  var RuleGroupId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Provides information about the rules attached to the rule group. These rules identify the web requests that you want to allow, block, or count. 
    */
  var Rules: js.UndefOr[AwsWafRuleGroupRulesList] = js.undefined
}
object AwsWafRuleGroupDetails {
  
  inline def apply(): AwsWafRuleGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafRuleGroupDetails]
  }
  
  extension [Self <: AwsWafRuleGroupDetails](x: Self) {
    
    inline def setMetricName(value: NonEmptyString): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRuleGroupId(value: NonEmptyString): Self = StObject.set(x, "RuleGroupId", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupIdUndefined: Self = StObject.set(x, "RuleGroupId", js.undefined)
    
    inline def setRules(value: AwsWafRuleGroupRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: AwsWafRuleGroupRulesDetails*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
