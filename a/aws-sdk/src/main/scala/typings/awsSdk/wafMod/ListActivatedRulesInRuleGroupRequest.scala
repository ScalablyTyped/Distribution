package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActivatedRulesInRuleGroupRequest extends js.Object {
  /**
    * Specifies the number of ActivatedRules that you want AWS WAF to return for this request. If you have more ActivatedRules than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of ActivatedRules.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.native
  /**
    * If you specify a value for Limit and you have more ActivatedRules than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of ActivatedRules. For the second and subsequent ListActivatedRulesInRuleGroup requests, specify the value of NextMarker from the previous response to get information about another batch of ActivatedRules.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
  /**
    * The RuleGroupId of the RuleGroup for which you want to get a list of ActivatedRule objects.
    */
  var RuleGroupId: js.UndefOr[ResourceId] = js.native
}

object ListActivatedRulesInRuleGroupRequest {
  @scala.inline
  def apply(Limit: Int | Double = null, NextMarker: NextMarker = null, RuleGroupId: ResourceId = null): ListActivatedRulesInRuleGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (RuleGroupId != null) __obj.updateDynamic("RuleGroupId")(RuleGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActivatedRulesInRuleGroupRequest]
  }
}

