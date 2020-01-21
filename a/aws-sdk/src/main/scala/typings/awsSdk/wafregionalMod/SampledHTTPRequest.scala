package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SampledHTTPRequest extends js.Object {
  /**
    * The action for the Rule that the request matched: ALLOW, BLOCK, or COUNT.
    */
  var Action: js.UndefOr[typings.awsSdk.wafregionalMod.Action] = js.native
  /**
    * A complex type that contains detailed information about the request.
    */
  var Request: HTTPRequest = js.native
  /**
    * This value is returned if the GetSampledRequests request specifies the ID of a RuleGroup rather than the ID of an individual rule. RuleWithinRuleGroup is the rule within the specified RuleGroup that matched the request listed in the response.
    */
  var RuleWithinRuleGroup: js.UndefOr[ResourceId] = js.native
  /**
    * The time at which AWS WAF received the request from your AWS resource, in Unix time format (in seconds).
    */
  var Timestamp: js.UndefOr[typings.awsSdk.wafregionalMod.Timestamp] = js.native
  /**
    * A value that indicates how one result in the response relates proportionally to other results in the response. A result that has a weight of 2 represents roughly twice as many CloudFront web requests as a result that has a weight of 1.
    */
  var Weight: SampleWeight = js.native
}

object SampledHTTPRequest {
  @scala.inline
  def apply(
    Request: HTTPRequest,
    Weight: SampleWeight,
    Action: Action = null,
    RuleWithinRuleGroup: ResourceId = null,
    Timestamp: Timestamp = null
  ): SampledHTTPRequest = {
    val __obj = js.Dynamic.literal(Request = Request.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (RuleWithinRuleGroup != null) __obj.updateDynamic("RuleWithinRuleGroup")(RuleWithinRuleGroup.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampledHTTPRequest]
  }
}

