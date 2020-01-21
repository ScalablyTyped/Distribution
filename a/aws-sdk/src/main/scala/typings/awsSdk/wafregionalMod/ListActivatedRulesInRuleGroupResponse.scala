package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActivatedRulesInRuleGroupResponse extends js.Object {
  /**
    * An array of ActivatedRules objects.
    */
  var ActivatedRules: js.UndefOr[typings.awsSdk.wafregionalMod.ActivatedRules] = js.native
  /**
    * If you have more ActivatedRules than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more ActivatedRules, submit another ListActivatedRulesInRuleGroup request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.native
}

object ListActivatedRulesInRuleGroupResponse {
  @scala.inline
  def apply(ActivatedRules: ActivatedRules = null, NextMarker: NextMarker = null): ListActivatedRulesInRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (ActivatedRules != null) __obj.updateDynamic("ActivatedRules")(ActivatedRules.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActivatedRulesInRuleGroupResponse]
  }
}

