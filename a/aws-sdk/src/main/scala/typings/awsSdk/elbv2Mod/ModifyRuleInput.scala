package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyRuleInput extends StObject {
  
  /**
    * The actions.
    */
  var Actions: js.UndefOr[typings.awsSdk.elbv2Mod.Actions] = js.undefined
  
  /**
    * The conditions.
    */
  var Conditions: js.UndefOr[RuleConditionList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: typings.awsSdk.elbv2Mod.RuleArn
}
object ModifyRuleInput {
  
  @scala.inline
  def apply(RuleArn: RuleArn): ModifyRuleInput = {
    val __obj = js.Dynamic.literal(RuleArn = RuleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyRuleInput]
  }
  
  @scala.inline
  implicit class ModifyRuleInputMutableBuilder[Self <: ModifyRuleInput] (val x: Self) extends AnyVal {
    
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
    def setRuleArn(value: RuleArn): Self = StObject.set(x, "RuleArn", value.asInstanceOf[js.Any])
  }
}
