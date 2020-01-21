package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRateBasedRuleRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken = js.native
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. If the number of requests exceeds the RateLimit and the other predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
    */
  var RateLimit: typings.awsSdk.wafregionalMod.RateLimit = js.native
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
}

