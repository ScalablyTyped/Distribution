package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRateBasedRuleRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken = js.native
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. If the number of requests exceeds the RateLimit and the other predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
    */
  var RateLimit: typings.awsSdk.wafMod.RateLimit = js.native
  /**
    * The RuleId of the RateBasedRule that you want to update. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
    */
  var RuleId: ResourceId = js.native
  /**
    * An array of RuleUpdate objects that you want to insert into or delete from a RateBasedRule. 
    */
  var Updates: RuleUpdates = js.native
}

object UpdateRateBasedRuleRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RateLimit: RateLimit, RuleId: ResourceId, Updates: RuleUpdates): UpdateRateBasedRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RateLimit = RateLimit.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRateBasedRuleRequest]
  }
  @scala.inline
  implicit class UpdateRateBasedRuleRequestOps[Self <: UpdateRateBasedRuleRequest] (val x: Self) extends AnyVal {
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
    def setRateLimit(value: RateLimit): Self = this.set("RateLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleId(value: ResourceId): Self = this.set("RuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatesVarargs(value: RuleUpdate*): Self = this.set("Updates", js.Array(value :_*))
    @scala.inline
    def setUpdates(value: RuleUpdates): Self = this.set("Updates", value.asInstanceOf[js.Any])
  }
  
}

