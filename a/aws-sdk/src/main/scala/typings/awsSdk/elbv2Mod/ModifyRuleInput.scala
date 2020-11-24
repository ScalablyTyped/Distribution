package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyRuleInput extends js.Object {
  
  /**
    * The actions.
    */
  var Actions: js.UndefOr[typings.awsSdk.elbv2Mod.Actions] = js.native
  
  /**
    * The conditions.
    */
  var Conditions: js.UndefOr[RuleConditionList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: typings.awsSdk.elbv2Mod.RuleArn = js.native
}
object ModifyRuleInput {
  
  @scala.inline
  def apply(RuleArn: RuleArn): ModifyRuleInput = {
    val __obj = js.Dynamic.literal(RuleArn = RuleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyRuleInput]
  }
  
  @scala.inline
  implicit class ModifyRuleInputOps[Self <: ModifyRuleInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRuleArn(value: RuleArn): Self = this.set("RuleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = this.set("Actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: Actions): Self = this.set("Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("Actions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: RuleCondition*): Self = this.set("Conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: RuleConditionList): Self = this.set("Conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("Conditions", js.undefined)
  }
}
