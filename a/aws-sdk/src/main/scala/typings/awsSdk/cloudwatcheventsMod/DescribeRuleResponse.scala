package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRuleResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var Arn: js.UndefOr[RuleArn] = js.native
  /**
    * The description of the rule.
    */
  var Description: js.UndefOr[RuleDescription] = js.native
  /**
    * The event bus associated with the rule.
    */
  var EventBusName: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EventBusName] = js.native
  /**
    * The event pattern. For more information, see Events and Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EventPattern] = js.native
  /**
    * If this is a managed rule, created by an AWS service on your behalf, this field displays the principal name of the AWS service that created the rule.
    */
  var ManagedBy: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ManagedBy] = js.native
  /**
    * The name of the rule.
    */
  var Name: js.UndefOr[RuleName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.RoleArn] = js.native
  /**
    * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ScheduleExpression] = js.native
  /**
    * Specifies whether the rule is enabled or disabled.
    */
  var State: js.UndefOr[RuleState] = js.native
}

object DescribeRuleResponse {
  @scala.inline
  def apply(): DescribeRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRuleResponse]
  }
  @scala.inline
  implicit class DescribeRuleResponseOps[Self <: DescribeRuleResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: RuleArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
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
    def setManagedBy(value: ManagedBy): Self = this.set("ManagedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedBy: Self = this.set("ManagedBy", js.undefined)
    @scala.inline
    def setName(value: RuleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
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
  }
  
}

