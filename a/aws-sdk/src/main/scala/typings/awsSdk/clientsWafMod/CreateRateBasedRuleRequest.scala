package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRateBasedRuleRequest extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateRateBasedRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: typings.awsSdk.clientsWafMod.ChangeToken
  
  /**
    * A friendly name or description for the metrics for this RateBasedRule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change the name of the metric after you create the RateBasedRule.
    */
  var MetricName: typings.awsSdk.clientsWafMod.MetricName
  
  /**
    * A friendly name or description of the RateBasedRule. You can't change the name of a RateBasedRule after you create it.
    */
  var Name: ResourceName
  
  /**
    * The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus subject to rate monitoring. The only valid value for RateKey is IP. IP indicates that requests that arrive from the same IP address are subject to the RateLimit that is specified in the RateBasedRule.
    */
  var RateKey: typings.awsSdk.clientsWafMod.RateKey
  
  /**
    * The maximum number of requests, which have an identical value in the field that is specified by RateKey, allowed in a five-minute period. If the number of requests exceeds the RateLimit and the other predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
    */
  var RateLimit: typings.awsSdk.clientsWafMod.RateLimit
  
  /**
    * 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateRateBasedRuleRequest {
  
  inline def apply(
    ChangeToken: ChangeToken,
    MetricName: MetricName,
    Name: ResourceName,
    RateKey: RateKey,
    RateLimit: RateLimit
  ): CreateRateBasedRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RateKey = RateKey.asInstanceOf[js.Any], RateLimit = RateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRateBasedRuleRequest]
  }
  
  extension [Self <: CreateRateBasedRuleRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRateKey(value: RateKey): Self = StObject.set(x, "RateKey", value.asInstanceOf[js.Any])
    
    inline def setRateLimit(value: RateLimit): Self = StObject.set(x, "RateLimit", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
