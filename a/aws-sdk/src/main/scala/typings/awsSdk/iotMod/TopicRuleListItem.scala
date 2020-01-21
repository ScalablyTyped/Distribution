package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleListItem extends js.Object {
  /**
    * The date and time the rule was created.
    */
  var createdAt: js.UndefOr[CreatedAtDate] = js.native
  /**
    * The rule ARN.
    */
  var ruleArn: js.UndefOr[RuleArn] = js.native
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.native
  /**
    * The name of the rule.
    */
  var ruleName: js.UndefOr[RuleName] = js.native
  /**
    * The pattern for the topic names that apply.
    */
  var topicPattern: js.UndefOr[TopicPattern] = js.native
}

object TopicRuleListItem {
  @scala.inline
  def apply(
    createdAt: CreatedAtDate = null,
    ruleArn: RuleArn = null,
    ruleDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    ruleName: RuleName = null,
    topicPattern: TopicPattern = null
  ): TopicRuleListItem = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (ruleArn != null) __obj.updateDynamic("ruleArn")(ruleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(ruleDisabled)) __obj.updateDynamic("ruleDisabled")(ruleDisabled.asInstanceOf[js.Any])
    if (ruleName != null) __obj.updateDynamic("ruleName")(ruleName.asInstanceOf[js.Any])
    if (topicPattern != null) __obj.updateDynamic("topicPattern")(topicPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleListItem]
  }
}

