package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceTopicRuleRequest extends js.Object {
  /**
    * The name of the rule.
    */
  var ruleName: RuleName = js.native
  /**
    * The rule payload.
    */
  var topicRulePayload: TopicRulePayload = js.native
}

object ReplaceTopicRuleRequest {
  @scala.inline
  def apply(ruleName: RuleName, topicRulePayload: TopicRulePayload): ReplaceTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any], topicRulePayload = topicRulePayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceTopicRuleRequest]
  }
}

