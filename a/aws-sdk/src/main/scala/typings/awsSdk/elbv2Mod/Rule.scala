package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /**
    * The actions. Each rule must include exactly one of the following types of actions: forward, redirect, or fixed-response, and it must be the last action to be performed.
    */
  var Actions: js.UndefOr[typings.awsSdk.elbv2Mod.Actions] = js.undefined
  
  /**
    * The conditions. Each rule can include zero or one of the following conditions: http-request-method, host-header, path-pattern, and source-ip, and zero or more of the following conditions: http-header and query-string.
    */
  var Conditions: js.UndefOr[RuleConditionList] = js.undefined
  
  /**
    * Indicates whether this is the default rule.
    */
  var IsDefault: js.UndefOr[typings.awsSdk.elbv2Mod.IsDefault] = js.undefined
  
  /**
    * The priority.
    */
  var Priority: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: js.UndefOr[typings.awsSdk.elbv2Mod.RuleArn] = js.undefined
}
object Rule {
  
  inline def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setActions(value: Actions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setConditions(value: RuleConditionList): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "Conditions", js.undefined)
    
    inline def setConditionsVarargs(value: RuleCondition*): Self = StObject.set(x, "Conditions", js.Array(value*))
    
    inline def setIsDefault(value: IsDefault): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    inline def setPriority(value: String): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setRuleArn(value: RuleArn): Self = StObject.set(x, "RuleArn", value.asInstanceOf[js.Any])
    
    inline def setRuleArnUndefined: Self = StObject.set(x, "RuleArn", js.undefined)
  }
}
