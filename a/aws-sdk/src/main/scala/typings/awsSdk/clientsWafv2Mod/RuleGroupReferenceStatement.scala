package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: ResourceArn
  
  /**
    * The rules in the referenced rule group whose actions are set to Count. When you exclude a rule, WAF evaluates it exactly as it would if the rule action setting were Count. This is a useful option for testing the rules in a rule group without modifying how they handle your web traffic.
    */
  var ExcludedRules: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ExcludedRules] = js.undefined
}
object RuleGroupReferenceStatement {
  
  inline def apply(ARN: ResourceArn): RuleGroupReferenceStatement = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupReferenceStatement]
  }
  
  extension [Self <: RuleGroupReferenceStatement](x: Self) {
    
    inline def setARN(value: ResourceArn): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setExcludedRules(value: ExcludedRules): Self = StObject.set(x, "ExcludedRules", value.asInstanceOf[js.Any])
    
    inline def setExcludedRulesUndefined: Self = StObject.set(x, "ExcludedRules", js.undefined)
    
    inline def setExcludedRulesVarargs(value: ExcludedRule*): Self = StObject.set(x, "ExcludedRules", js.Array(value*))
  }
}
