package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSourceStatelessRulesAndCustomActionsDetails extends StObject {
  
  /**
    * Custom actions for the rule group.
    */
  var CustomActions: js.UndefOr[RuleGroupSourceCustomActionsList] = js.undefined
  
  /**
    * Stateless rules for the rule group.
    */
  var StatelessRules: js.UndefOr[RuleGroupSourceStatelessRulesList] = js.undefined
}
object RuleGroupSourceStatelessRulesAndCustomActionsDetails {
  
  inline def apply(): RuleGroupSourceStatelessRulesAndCustomActionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSourceStatelessRulesAndCustomActionsDetails]
  }
  
  extension [Self <: RuleGroupSourceStatelessRulesAndCustomActionsDetails](x: Self) {
    
    inline def setCustomActions(value: RuleGroupSourceCustomActionsList): Self = StObject.set(x, "CustomActions", value.asInstanceOf[js.Any])
    
    inline def setCustomActionsUndefined: Self = StObject.set(x, "CustomActions", js.undefined)
    
    inline def setCustomActionsVarargs(value: RuleGroupSourceCustomActionsDetails*): Self = StObject.set(x, "CustomActions", js.Array(value*))
    
    inline def setStatelessRules(value: RuleGroupSourceStatelessRulesList): Self = StObject.set(x, "StatelessRules", value.asInstanceOf[js.Any])
    
    inline def setStatelessRulesUndefined: Self = StObject.set(x, "StatelessRules", js.undefined)
    
    inline def setStatelessRulesVarargs(value: RuleGroupSourceStatelessRulesDetails*): Self = StObject.set(x, "StatelessRules", js.Array(value*))
  }
}
