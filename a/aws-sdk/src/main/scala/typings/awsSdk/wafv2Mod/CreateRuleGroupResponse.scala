package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRuleGroupResponse extends js.Object {
  /**
    * High-level information about a RuleGroup, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage a RuleGroup, and the ARN, that you provide to the RuleGroupReferenceStatement to use the rule group in a Rule.
    */
  var Summary: js.UndefOr[RuleGroupSummary] = js.native
}

object CreateRuleGroupResponse {
  @scala.inline
  def apply(Summary: RuleGroupSummary = null): CreateRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (Summary != null) __obj.updateDynamic("Summary")(Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleGroupResponse]
  }
}

