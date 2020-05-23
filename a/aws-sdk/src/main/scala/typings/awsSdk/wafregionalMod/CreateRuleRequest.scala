package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRuleRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken = js.native
  /**
    * A friendly name or description for the metrics for this Rule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change the name of the metric after you create the Rule.
    */
  var MetricName: typings.awsSdk.wafregionalMod.MetricName = js.native
  /**
    * A friendly name or description of the Rule. You can't change the name of a Rule after you create it.
    */
  var Name: ResourceName = js.native
  /**
    * 
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateRuleRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, MetricName: MetricName, Name: ResourceName, Tags: TagList = null): CreateRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleRequest]
  }
}

