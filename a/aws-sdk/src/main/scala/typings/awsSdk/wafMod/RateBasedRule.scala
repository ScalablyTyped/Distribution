package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateBasedRule extends StObject {
  
  /**
    * The Predicates object contains one Predicate element for each ByteMatchSet, IPSet, or SqlInjectionMatchSet object that you want to include in a RateBasedRule.
    */
  var MatchPredicates: Predicates
  
  /**
    * A friendly name or description for the metrics for a RateBasedRule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change the name of the metric after you create the RateBasedRule.
    */
  var MetricName: js.UndefOr[typings.awsSdk.wafMod.MetricName] = js.undefined
  
  /**
    * A friendly name or description for a RateBasedRule. You can't change the name of a RateBasedRule after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The field that AWS WAF uses to determine if requests are likely arriving from single source and thus subject to rate monitoring. The only valid value for RateKey is IP. IP indicates that requests arriving from the same IP address are subject to the RateLimit that is specified in the RateBasedRule.
    */
  var RateKey: typings.awsSdk.wafMod.RateKey
  
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. If the number of requests exceeds the RateLimit and the other predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
    */
  var RateLimit: typings.awsSdk.wafMod.RateLimit
  
  /**
    * A unique identifier for a RateBasedRule. You use RuleId to get more information about a RateBasedRule (see GetRateBasedRule), update a RateBasedRule (see UpdateRateBasedRule), insert a RateBasedRule into a WebACL or delete one from a WebACL (see UpdateWebACL), or delete a RateBasedRule from AWS WAF (see DeleteRateBasedRule).
    */
  var RuleId: ResourceId
}
object RateBasedRule {
  
  inline def apply(MatchPredicates: Predicates, RateKey: RateKey, RateLimit: RateLimit, RuleId: ResourceId): RateBasedRule = {
    val __obj = js.Dynamic.literal(MatchPredicates = MatchPredicates.asInstanceOf[js.Any], RateKey = RateKey.asInstanceOf[js.Any], RateLimit = RateLimit.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateBasedRule]
  }
  
  extension [Self <: RateBasedRule](x: Self) {
    
    inline def setMatchPredicates(value: Predicates): Self = StObject.set(x, "MatchPredicates", value.asInstanceOf[js.Any])
    
    inline def setMatchPredicatesVarargs(value: Predicate*): Self = StObject.set(x, "MatchPredicates", js.Array(value :_*))
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRateKey(value: RateKey): Self = StObject.set(x, "RateKey", value.asInstanceOf[js.Any])
    
    inline def setRateLimit(value: RateLimit): Self = StObject.set(x, "RateLimit", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: ResourceId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
