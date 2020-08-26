package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateBasedRule extends js.Object {
  /**
    * The Predicates object contains one Predicate element for each ByteMatchSet, IPSet, or SqlInjectionMatchSet object that you want to include in a RateBasedRule.
    */
  var MatchPredicates: Predicates = js.native
  /**
    * A friendly name or description for the metrics for a RateBasedRule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change the name of the metric after you create the RateBasedRule.
    */
  var MetricName: js.UndefOr[typings.awsSdk.wafregionalMod.MetricName] = js.native
  /**
    * A friendly name or description for a RateBasedRule. You can't change the name of a RateBasedRule after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The field that AWS WAF uses to determine if requests are likely arriving from single source and thus subject to rate monitoring. The only valid value for RateKey is IP. IP indicates that requests arriving from the same IP address are subject to the RateLimit that is specified in the RateBasedRule.
    */
  var RateKey: typings.awsSdk.wafregionalMod.RateKey = js.native
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. If the number of requests exceeds the RateLimit and the other predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
    */
  var RateLimit: typings.awsSdk.wafregionalMod.RateLimit = js.native
  /**
    * A unique identifier for a RateBasedRule. You use RuleId to get more information about a RateBasedRule (see GetRateBasedRule), update a RateBasedRule (see UpdateRateBasedRule), insert a RateBasedRule into a WebACL or delete one from a WebACL (see UpdateWebACL), or delete a RateBasedRule from AWS WAF (see DeleteRateBasedRule).
    */
  var RuleId: ResourceId = js.native
}

object RateBasedRule {
  @scala.inline
  def apply(MatchPredicates: Predicates, RateKey: RateKey, RateLimit: RateLimit, RuleId: ResourceId): RateBasedRule = {
    val __obj = js.Dynamic.literal(MatchPredicates = MatchPredicates.asInstanceOf[js.Any], RateKey = RateKey.asInstanceOf[js.Any], RateLimit = RateLimit.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateBasedRule]
  }
  @scala.inline
  implicit class RateBasedRuleOps[Self <: RateBasedRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMatchPredicatesVarargs(value: Predicate*): Self = this.set("MatchPredicates", js.Array(value :_*))
    @scala.inline
    def setMatchPredicates(value: Predicates): Self = this.set("MatchPredicates", value.asInstanceOf[js.Any])
    @scala.inline
    def setRateKey(value: RateKey): Self = this.set("RateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRateLimit(value: RateLimit): Self = this.set("RateLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleId(value: ResourceId): Self = this.set("RuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricName(value: MetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricName: Self = this.set("MetricName", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

