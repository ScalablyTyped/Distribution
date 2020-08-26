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
  def apply(): CreateRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleGroupResponse]
  }
  @scala.inline
  implicit class CreateRuleGroupResponseOps[Self <: CreateRuleGroupResponse] (val x: Self) extends AnyVal {
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
    def setSummary(value: RuleGroupSummary): Self = this.set("Summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("Summary", js.undefined)
  }
  
}

