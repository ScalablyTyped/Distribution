package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRateBasedRuleRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken = js.native
  /**
    * The RuleId of the RateBasedRule that you want to delete. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
    */
  var RuleId: ResourceId = js.native
}

object DeleteRateBasedRuleRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RuleId: ResourceId): DeleteRateBasedRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRateBasedRuleRequest]
  }
  @scala.inline
  implicit class DeleteRateBasedRuleRequestOps[Self <: DeleteRateBasedRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = this.set("ChangeToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleId(value: ResourceId): Self = this.set("RuleId", value.asInstanceOf[js.Any])
  }
  
}

