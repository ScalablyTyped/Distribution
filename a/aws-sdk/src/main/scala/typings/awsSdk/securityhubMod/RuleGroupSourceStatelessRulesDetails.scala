package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSourceStatelessRulesDetails extends StObject {
  
  /**
    * Indicates the order in which to run this rule relative to all of the rules in the stateless rule group.
    */
  var Priority: js.UndefOr[Integer] = js.undefined
  
  /**
    * Provides the definition of the stateless rule.
    */
  var RuleDefinition: js.UndefOr[RuleGroupSourceStatelessRuleDefinition] = js.undefined
}
object RuleGroupSourceStatelessRulesDetails {
  
  inline def apply(): RuleGroupSourceStatelessRulesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSourceStatelessRulesDetails]
  }
  
  extension [Self <: RuleGroupSourceStatelessRulesDetails](x: Self) {
    
    inline def setPriority(value: Integer): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setRuleDefinition(value: RuleGroupSourceStatelessRuleDefinition): Self = StObject.set(x, "RuleDefinition", value.asInstanceOf[js.Any])
    
    inline def setRuleDefinitionUndefined: Self = StObject.set(x, "RuleDefinition", js.undefined)
  }
}
