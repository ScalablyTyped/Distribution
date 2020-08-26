package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSamplingRuleRequest extends js.Object {
  /**
    * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleARN: js.UndefOr[String] = js.native
  /**
    * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleName: js.UndefOr[String] = js.native
}

object DeleteSamplingRuleRequest {
  @scala.inline
  def apply(): DeleteSamplingRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSamplingRuleRequest]
  }
  @scala.inline
  implicit class DeleteSamplingRuleRequestOps[Self <: DeleteSamplingRuleRequest] (val x: Self) extends AnyVal {
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
    def setRuleARN(value: String): Self = this.set("RuleARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleARN: Self = this.set("RuleARN", js.undefined)
    @scala.inline
    def setRuleName(value: String): Self = this.set("RuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleName: Self = this.set("RuleName", js.undefined)
  }
  
}

