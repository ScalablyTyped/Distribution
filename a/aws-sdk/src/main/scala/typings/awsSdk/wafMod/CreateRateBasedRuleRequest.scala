package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRateBasedRuleRequest extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRateBasedRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken = js.native
  /**
    * A friendly name or description for the metrics for this RateBasedRule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change the name of the metric after you create the RateBasedRule.
    */
  var MetricName: typings.awsSdk.wafMod.MetricName = js.native
  /**
    * A friendly name or description of the RateBasedRule. You can't change the name of a RateBasedRule after you create it.
    */
  var Name: ResourceName = js.native
  /**
    * The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus subject to rate monitoring. The only valid value for RateKey is IP. IP indicates that requests that arrive from the same IP address are subject to the RateLimit that is specified in the RateBasedRule.
    */
  var RateKey: typings.awsSdk.wafMod.RateKey = js.native
  /**
    * The maximum number of requests, which have an identical value in the field that is specified by RateKey, allowed in a five-minute period. If the number of requests exceeds the RateLimit and the other predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
    */
  var RateLimit: typings.awsSdk.wafMod.RateLimit = js.native
  /**
    * 
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateRateBasedRuleRequest {
  @scala.inline
  def apply(
    ChangeToken: ChangeToken,
    MetricName: MetricName,
    Name: ResourceName,
    RateKey: RateKey,
    RateLimit: RateLimit,
    Tags: TagList = null
  ): CreateRateBasedRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RateKey = RateKey.asInstanceOf[js.Any], RateLimit = RateLimit.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRateBasedRuleRequest]
  }
}

