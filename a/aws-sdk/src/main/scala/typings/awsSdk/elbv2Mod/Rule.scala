package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
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
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
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
    def deleteActions: Self = this.set("Actions", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: RuleCondition*): Self = this.set("Conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: RuleConditionList): Self = this.set("Conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("Conditions", js.undefined)
    @scala.inline
    def setIsDefault(value: IsDefault): Self = this.set("IsDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefault: Self = this.set("IsDefault", js.undefined)
    @scala.inline
    def setPriority(value: String): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    @scala.inline
    def setRuleArn(value: RuleArn): Self = this.set("RuleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleArn: Self = this.set("RuleArn", js.undefined)
  }
  
}

