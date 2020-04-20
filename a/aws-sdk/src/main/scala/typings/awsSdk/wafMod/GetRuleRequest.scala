package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRuleRequest extends js.Object {
  /**
    * The RuleId of the Rule that you want to get. RuleId is returned by CreateRule and by ListRules.
    */
  var RuleId: ResourceId = js.native
}

object GetRuleRequest {
  @scala.inline
  def apply(RuleId: ResourceId): GetRuleRequest = {
    val __obj = js.Dynamic.literal(RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuleRequest]
  }
}

