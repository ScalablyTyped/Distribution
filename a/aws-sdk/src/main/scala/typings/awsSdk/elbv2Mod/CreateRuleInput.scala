package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRuleInput extends js.Object {
  
  /**
    * The actions.
    */
  var Actions: typings.awsSdk.elbv2Mod.Actions = js.native
  
  /**
    * The conditions.
    */
  var Conditions: RuleConditionList = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: typings.awsSdk.elbv2Mod.ListenerArn = js.native
  
  /**
    * The rule priority. A listener can't have multiple rules with the same priority.
    */
  var Priority: RulePriority = js.native
  
  /**
    * The tags to assign to the rule.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateRuleInput {
  
  @scala.inline
  def apply(Actions: Actions, Conditions: RuleConditionList, ListenerArn: ListenerArn, Priority: RulePriority): CreateRuleInput = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Conditions = Conditions.asInstanceOf[js.Any], ListenerArn = ListenerArn.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleInput]
  }
  
  @scala.inline
  implicit class CreateRuleInputOps[Self <: CreateRuleInput] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: Action*): Self = this.set("Actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: Actions): Self = this.set("Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: RuleCondition*): Self = this.set("Conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: RuleConditionList): Self = this.set("Conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerArn(value: ListenerArn): Self = this.set("ListenerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: RulePriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
