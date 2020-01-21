package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRuleRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken = js.native
  /**
    * The RuleId of the Rule that you want to delete. RuleId is returned by CreateRule and by ListRules.
    */
  var RuleId: ResourceId = js.native
}

object DeleteRuleRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RuleId: ResourceId): DeleteRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRuleRequest]
  }
}

