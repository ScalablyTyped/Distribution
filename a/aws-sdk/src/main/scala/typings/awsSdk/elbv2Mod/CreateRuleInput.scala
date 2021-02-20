package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRuleInput extends StObject {
  
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
  implicit class CreateRuleInputMutableBuilder[Self <: CreateRuleInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: Actions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: RuleConditionList): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: RuleCondition*): Self = StObject.set(x, "Conditions", js.Array(value :_*))
    
    @scala.inline
    def setListenerArn(value: ListenerArn): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: RulePriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
