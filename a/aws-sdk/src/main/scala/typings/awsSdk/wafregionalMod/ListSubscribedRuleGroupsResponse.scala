package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSubscribedRuleGroupsResponse extends js.Object {
  /**
    * If you have more objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more objects, submit another ListSubscribedRuleGroups request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.native
  /**
    * An array of RuleGroup objects.
    */
  var RuleGroups: js.UndefOr[SubscribedRuleGroupSummaries] = js.native
}

object ListSubscribedRuleGroupsResponse {
  @scala.inline
  def apply(): ListSubscribedRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscribedRuleGroupsResponse]
  }
  @scala.inline
  implicit class ListSubscribedRuleGroupsResponseOps[Self <: ListSubscribedRuleGroupsResponse] (val x: Self) extends AnyVal {
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
    def setRuleGroupsVarargs(value: SubscribedRuleGroupSummary*): Self = this.set("RuleGroups", js.Array(value :_*))
    @scala.inline
    def setRuleGroups(value: SubscribedRuleGroupSummaries): Self = this.set("RuleGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleGroups: Self = this.set("RuleGroups", js.undefined)
  }
  
}

