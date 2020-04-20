package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableTopicRuleRequest extends js.Object {
  /**
    * The name of the rule to disable.
    */
  var ruleName: RuleName = js.native
}

object DisableTopicRuleRequest {
  @scala.inline
  def apply(ruleName: RuleName): DisableTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableTopicRuleRequest]
  }
}

