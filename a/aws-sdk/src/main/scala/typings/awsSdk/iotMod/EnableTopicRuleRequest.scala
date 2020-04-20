package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableTopicRuleRequest extends js.Object {
  /**
    * The name of the topic rule to enable.
    */
  var ruleName: RuleName = js.native
}

object EnableTopicRuleRequest {
  @scala.inline
  def apply(ruleName: RuleName): EnableTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableTopicRuleRequest]
  }
}

