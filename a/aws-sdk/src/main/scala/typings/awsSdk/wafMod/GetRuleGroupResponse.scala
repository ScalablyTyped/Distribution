package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRuleGroupResponse extends js.Object {
  /**
    * Information about the RuleGroup that you specified in the GetRuleGroup request. 
    */
  var RuleGroup: js.UndefOr[typings.awsSdk.wafMod.RuleGroup] = js.native
}

object GetRuleGroupResponse {
  @scala.inline
  def apply(RuleGroup: RuleGroup = null): GetRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (RuleGroup != null) __obj.updateDynamic("RuleGroup")(RuleGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuleGroupResponse]
  }
}

