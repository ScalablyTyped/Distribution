package typings.awsSdk.cloudwatcheventsMod

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
  var EventBusName: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EventBusName] = js.native
  /**
    * The event pattern. For more information, see Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EventPattern] = js.native
  /**
    * The name of the rule that you're creating or updating.
    */
  var Name: RuleName = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.RoleArn] = js.native
  /**
    * The scheduling expression: for example, "cron(0 20 * * ? *)" or "rate(5 minutes)".
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ScheduleExpression] = js.native
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
  def apply(
    Name: RuleName,
    Description: RuleDescription = null,
    EventBusName: EventBusName = null,
    EventPattern: EventPattern = null,
    RoleArn: RoleArn = null,
    ScheduleExpression: ScheduleExpression = null,
    State: RuleState = null,
    Tags: TagList = null
  ): PutRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName.asInstanceOf[js.Any])
    if (EventPattern != null) __obj.updateDynamic("EventPattern")(EventPattern.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRuleRequest]
  }
}

