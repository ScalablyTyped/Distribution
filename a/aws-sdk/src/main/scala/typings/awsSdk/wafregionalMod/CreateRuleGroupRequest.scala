package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRuleGroupRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken = js.native
  /**
    * A friendly name or description for the metrics for this RuleGroup. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change the name of the metric after you create the RuleGroup.
    */
  var MetricName: typings.awsSdk.wafregionalMod.MetricName = js.native
  /**
    * A friendly name or description of the RuleGroup. You can't change Name after you create a RuleGroup.
    */
  var Name: ResourceName = js.native
  /**
    * 
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateRuleGroupRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, MetricName: MetricName, Name: ResourceName, Tags: TagList = null): CreateRuleGroupRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleGroupRequest]
  }
}

