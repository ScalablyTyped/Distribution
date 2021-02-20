package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends StObject {
  
  /**
    * The actions. Each rule must include exactly one of the following types of actions: forward, redirect, or fixed-response, and it must be the last action to be performed.
    */
  var Actions: js.UndefOr[typings.awsSdk.elbv2Mod.Actions] = js.native
  
  /**
    * The conditions. Each rule can include zero or one of the following conditions: http-request-method, host-header, path-pattern, and source-ip, and zero or more of the following conditions: http-header and query-string.
    */
  var Conditions: js.UndefOr[RuleConditionList] = js.native
  
  /**
    * Indicates whether this is the default rule.
    */
  var IsDefault: js.UndefOr[typings.awsSdk.elbv2Mod.IsDefault] = js.native
  
  /**
    * The priority.
    */
  var Priority: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: js.UndefOr[typings.awsSdk.elbv2Mod.RuleArn] = js.native
}
object Rule {
  
  @scala.inline
  def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: Actions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: RuleConditionList): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "Conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: RuleCondition*): Self = StObject.set(x, "Conditions", js.Array(value :_*))
    
    @scala.inline
    def setIsDefault(value: IsDefault): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setRuleArn(value: RuleArn): Self = StObject.set(x, "RuleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleArnUndefined: Self = StObject.set(x, "RuleArn", js.undefined)
  }
}
