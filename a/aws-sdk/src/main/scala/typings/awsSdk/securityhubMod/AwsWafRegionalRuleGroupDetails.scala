package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafRegionalRuleGroupDetails extends StObject {
  
  /**
    * A name for the metrics for this rule group. 
    */
  var MetricName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The descriptive name of the rule group. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the rule group. 
    */
  var RuleGroupId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Provides information about the rule statements used to identify the web requests that you want to allow, block, or count. 
    */
  var Rules: js.UndefOr[AwsWafRegionalRuleGroupRulesList] = js.undefined
}
object AwsWafRegionalRuleGroupDetails {
  
  inline def apply(): AwsWafRegionalRuleGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafRegionalRuleGroupDetails]
  }
  
  extension [Self <: AwsWafRegionalRuleGroupDetails](x: Self) {
    
    inline def setMetricName(value: NonEmptyString): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRuleGroupId(value: NonEmptyString): Self = StObject.set(x, "RuleGroupId", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupIdUndefined: Self = StObject.set(x, "RuleGroupId", js.undefined)
    
    inline def setRules(value: AwsWafRegionalRuleGroupRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: AwsWafRegionalRuleGroupRulesDetails*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
