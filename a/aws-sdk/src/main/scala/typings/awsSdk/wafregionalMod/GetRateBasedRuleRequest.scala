package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRateBasedRuleRequest extends js.Object {
  /**
    * The RuleId of the RateBasedRule that you want to get. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
    */
  var RuleId: ResourceId = js.native
}

object GetRateBasedRuleRequest {
  @scala.inline
  def apply(RuleId: ResourceId): GetRateBasedRuleRequest = {
    val __obj = js.Dynamic.literal(RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRateBasedRuleRequest]
  }
}

