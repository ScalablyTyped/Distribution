package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSourceStatefulRulesDetails extends StObject {
  
  /**
    * Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the stateful rule criteria.
    */
  var Action: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The stateful inspection criteria for the rule.
    */
  var Header: js.UndefOr[RuleGroupSourceStatefulRulesHeaderDetails] = js.undefined
  
  /**
    * Additional options for the rule.
    */
  var RuleOptions: js.UndefOr[RuleGroupSourceStatefulRulesOptionsList] = js.undefined
}
object RuleGroupSourceStatefulRulesDetails {
  
  inline def apply(): RuleGroupSourceStatefulRulesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSourceStatefulRulesDetails]
  }
  
  extension [Self <: RuleGroupSourceStatefulRulesDetails](x: Self) {
    
    inline def setAction(value: NonEmptyString): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setHeader(value: RuleGroupSourceStatefulRulesHeaderDetails): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    inline def setRuleOptions(value: RuleGroupSourceStatefulRulesOptionsList): Self = StObject.set(x, "RuleOptions", value.asInstanceOf[js.Any])
    
    inline def setRuleOptionsUndefined: Self = StObject.set(x, "RuleOptions", js.undefined)
    
    inline def setRuleOptionsVarargs(value: RuleGroupSourceStatefulRulesOptionsDetails*): Self = StObject.set(x, "RuleOptions", js.Array(value*))
  }
}
