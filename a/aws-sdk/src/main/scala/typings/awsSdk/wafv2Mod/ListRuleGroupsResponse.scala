package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRuleGroupsResponse extends js.Object {
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafv2Mod.NextMarker] = js.native
  /**
    * 
    */
  var RuleGroups: js.UndefOr[RuleGroupSummaries] = js.native
}

object ListRuleGroupsResponse {
  @scala.inline
  def apply(): ListRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleGroupsResponse]
  }
  @scala.inline
  implicit class ListRuleGroupsResponseOps[Self <: ListRuleGroupsResponse] (val x: Self) extends AnyVal {
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
    def setNextMarker(value: NextMarker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
    @scala.inline
    def setRuleGroupsVarargs(value: RuleGroupSummary*): Self = this.set("RuleGroups", js.Array(value :_*))
    @scala.inline
    def setRuleGroups(value: RuleGroupSummaries): Self = this.set("RuleGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleGroups: Self = this.set("RuleGroups", js.undefined)
  }
  
}

