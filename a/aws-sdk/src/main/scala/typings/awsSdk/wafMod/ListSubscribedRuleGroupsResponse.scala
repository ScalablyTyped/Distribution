package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSubscribedRuleGroupsResponse extends js.Object {
  /**
    * If you have more objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more objects, submit another ListSubscribedRuleGroups request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
  /**
    * An array of RuleGroup objects.
    */
  var RuleGroups: js.UndefOr[SubscribedRuleGroupSummaries] = js.native
}

object ListSubscribedRuleGroupsResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, RuleGroups: SubscribedRuleGroupSummaries = null): ListSubscribedRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (RuleGroups != null) __obj.updateDynamic("RuleGroups")(RuleGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubscribedRuleGroupsResponse]
  }
}

