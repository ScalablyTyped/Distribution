package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupDetails extends StObject {
  
  /**
    * Additional settings to use in the specified rules.
    */
  var RuleVariables: js.UndefOr[RuleGroupVariables] = js.undefined
  
  /**
    * The rules and actions for the rule group. For stateful rule groups, can contain RulesString, RulesSourceList, or StatefulRules. For stateless rule groups, contains StatelessRulesAndCustomActions.
    */
  var RulesSource: js.UndefOr[RuleGroupSource] = js.undefined
}
object RuleGroupDetails {
  
  inline def apply(): RuleGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupDetails]
  }
  
  extension [Self <: RuleGroupDetails](x: Self) {
    
    inline def setRuleVariables(value: RuleGroupVariables): Self = StObject.set(x, "RuleVariables", value.asInstanceOf[js.Any])
    
    inline def setRuleVariablesUndefined: Self = StObject.set(x, "RuleVariables", js.undefined)
    
    inline def setRulesSource(value: RuleGroupSource): Self = StObject.set(x, "RulesSource", value.asInstanceOf[js.Any])
    
    inline def setRulesSourceUndefined: Self = StObject.set(x, "RulesSource", js.undefined)
  }
}
