package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SampledHTTPRequest extends js.Object {
  /**
    * The action for the Rule that the request matched: ALLOW, BLOCK, or COUNT.
    */
  var Action: js.UndefOr[typings.awsSdk.wafv2Mod.Action] = js.native
  /**
    * A complex type that contains detailed information about the request.
    */
  var Request: HTTPRequest = js.native
  /**
    * The name of the Rule that the request matched. For managed rule groups, the format for this name is &lt;vendor name&gt;#&lt;managed rule group name&gt;#&lt;rule name&gt;. For your own rule groups, the format for this name is &lt;rule group name&gt;#&lt;rule name&gt;. If the rule is not in a rule group, the format is &lt;rule name&gt;. 
    */
  var RuleNameWithinRuleGroup: js.UndefOr[EntityName] = js.native
  /**
    * The time at which AWS WAF received the request from your AWS resource, in Unix time format (in seconds).
    */
  var Timestamp: js.UndefOr[typings.awsSdk.wafv2Mod.Timestamp] = js.native
  /**
    * A value that indicates how one result in the response relates proportionally to other results in the response. For example, a result that has a weight of 2 represents roughly twice as many web requests as a result that has a weight of 1.
    */
  var Weight: SampleWeight = js.native
}

object SampledHTTPRequest {
  @scala.inline
  def apply(
    Request: HTTPRequest,
    Weight: SampleWeight,
    Action: Action = null,
    RuleNameWithinRuleGroup: EntityName = null,
    Timestamp: Timestamp = null
  ): SampledHTTPRequest = {
    val __obj = js.Dynamic.literal(Request = Request.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (RuleNameWithinRuleGroup != null) __obj.updateDynamic("RuleNameWithinRuleGroup")(RuleNameWithinRuleGroup.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampledHTTPRequest]
  }
}

