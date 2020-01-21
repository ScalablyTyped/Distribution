package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeManagedRuleGroupResponse extends js.Object {
  /**
    * The web ACL capacity units (WCUs) required for this rule group. AWS WAF uses web ACL capacity units (WCU) to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group capacity is fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is 1,500. 
    */
  var Capacity: js.UndefOr[CapacityUnit] = js.native
  /**
    * 
    */
  var Rules: js.UndefOr[RuleSummaries] = js.native
}

object DescribeManagedRuleGroupResponse {
  @scala.inline
  def apply(Capacity: Int | Double = null, Rules: RuleSummaries = null): DescribeManagedRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (Capacity != null) __obj.updateDynamic("Capacity")(Capacity.asInstanceOf[js.Any])
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeManagedRuleGroupResponse]
  }
}

