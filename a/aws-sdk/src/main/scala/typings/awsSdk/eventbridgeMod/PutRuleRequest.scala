package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRuleRequest extends js.Object {
  /**
    * A description of the rule.
    */
  var Description: js.UndefOr[RuleDescription] = js.native
  /**
    * The event bus to associate with this rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typings.awsSdk.eventbridgeMod.EventBusName] = js.native
  /**
    * The event pattern. For more information, see Events and Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.eventbridgeMod.EventPattern] = js.native
  /**
    * The name of the rule that you are creating or updating.
    */
  var Name: RuleName = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.eventbridgeMod.RoleArn] = js.native
  /**
    * The scheduling expression. For example, "cron(0 20 * * ? *)" or "rate(5 minutes)".
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.eventbridgeMod.ScheduleExpression] = js.native
  /**
    * Indicates whether the rule is enabled or disabled.
    */
  var State: js.UndefOr[RuleState] = js.native
  /**
    * The list of key-value pairs to associate with the rule.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object PutRuleRequest {
  @scala.inline
  def apply(Name: RuleName): PutRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRuleRequest]
  }
  @scala.inline
  implicit class PutRuleRequestOps[Self <: PutRuleRequest] (val x: Self) extends AnyVal {
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
    def setName(value: RuleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: RuleDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEventBusName(value: EventBusName): Self = this.set("EventBusName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventBusName: Self = this.set("EventBusName", js.undefined)
    @scala.inline
    def setEventPattern(value: EventPattern): Self = this.set("EventPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventPattern: Self = this.set("EventPattern", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    @scala.inline
    def setScheduleExpression(value: ScheduleExpression): Self = this.set("ScheduleExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleExpression: Self = this.set("ScheduleExpression", js.undefined)
    @scala.inline
    def setState(value: RuleState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

