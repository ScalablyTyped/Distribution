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
  def apply(): TopicRuleListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRuleListItem]
  }
  @scala.inline
  implicit class TopicRuleListItemOps[Self <: TopicRuleListItem] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: CreatedAtDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setRuleArn(value: RuleArn): Self = this.set("ruleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleArn: Self = this.set("ruleArn", js.undefined)
    @scala.inline
    def setRuleDisabled(value: IsDisabled): Self = this.set("ruleDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleDisabled: Self = this.set("ruleDisabled", js.undefined)
    @scala.inline
    def setRuleName(value: RuleName): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleName: Self = this.set("ruleName", js.undefined)
    @scala.inline
    def setTopicPattern(value: TopicPattern): Self = this.set("topicPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicPattern: Self = this.set("topicPattern", js.undefined)
  }
  
}

