package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTopicRuleRequest extends js.Object {
  /**
    * The name of the rule.
    */
  var ruleName: RuleName = js.native
}

object DeleteTopicRuleRequest {
  @scala.inline
  def apply(ruleName: RuleName): DeleteTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTopicRuleRequest]
  }
  @scala.inline
  implicit class DeleteTopicRuleRequestOps[Self <: DeleteTopicRuleRequest] (val x: Self) extends AnyVal {
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
    def setRuleName(value: RuleName): Self = this.set("ruleName", value.asInstanceOf[js.Any])
  }
  
}

