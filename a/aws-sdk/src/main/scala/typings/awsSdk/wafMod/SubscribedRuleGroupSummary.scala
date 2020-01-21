package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribedRuleGroupSummary extends js.Object {
  /**
    * A friendly name or description for the metrics for this RuleGroup. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change the name of the metric after you create the RuleGroup.
    */
  var MetricName: typings.awsSdk.wafMod.MetricName = js.native
  /**
    * A friendly name or description of the RuleGroup. You can't change the name of a RuleGroup after you create it.
    */
  var Name: ResourceName = js.native
  /**
    * A unique identifier for a RuleGroup.
    */
  var RuleGroupId: ResourceId = js.native
}

object SubscribedRuleGroupSummary {
  @scala.inline
  def apply(MetricName: MetricName, Name: ResourceName, RuleGroupId: ResourceId): SubscribedRuleGroupSummary = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RuleGroupId = RuleGroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscribedRuleGroupSummary]
  }
}

