package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampledHTTPRequest extends StObject {
  
  /**
    * The action that WAF applied to the request.
    */
  var Action: js.UndefOr[typings.awsSdk.clientsWafv2Mod.Action] = js.undefined
  
  /**
    * The CAPTCHA response for the request.
    */
  var CaptchaResponse: js.UndefOr[typings.awsSdk.clientsWafv2Mod.CaptchaResponse] = js.undefined
  
  /**
    * The Challenge response for the request.
    */
  var ChallengeResponse: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ChallengeResponse] = js.undefined
  
  /**
    * Labels applied to the web request by matching rules. WAF applies fully qualified labels to matching web requests. A fully qualified label is the concatenation of a label namespace and a rule label. The rule's rule group or web ACL defines the label namespace.  For example, awswaf:111122223333:myRuleGroup:testRules:testNS1:testNS2:labelNameA or awswaf:managed:aws:managed-rule-set:header:encoding:utf8. 
    */
  var Labels: js.UndefOr[typings.awsSdk.clientsWafv2Mod.Labels] = js.undefined
  
  /**
    * Used only for rule group rules that have a rule action override in place in the web ACL. This is the action that the rule group rule is configured for, and not the action that was applied to the request. The action that WAF applied is the Action value. 
    */
  var OverriddenAction: js.UndefOr[Action] = js.undefined
  
  /**
    * A complex type that contains detailed information about the request.
    */
  var Request: HTTPRequest
  
  /**
    * Custom request headers inserted by WAF into the request, according to the custom request configuration for the matching rule action.
    */
  var RequestHeadersInserted: js.UndefOr[HTTPHeaders] = js.undefined
  
  /**
    * The response code that was sent for the request.
    */
  var ResponseCodeSent: js.UndefOr[ResponseStatusCode] = js.undefined
  
  /**
    * The name of the Rule that the request matched. For managed rule groups, the format for this name is &lt;vendor name&gt;#&lt;managed rule group name&gt;#&lt;rule name&gt;. For your own rule groups, the format for this name is &lt;rule group name&gt;#&lt;rule name&gt;. If the rule is not in a rule group, this field is absent. 
    */
  var RuleNameWithinRuleGroup: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The time at which WAF received the request from your Amazon Web Services resource, in Unix time format (in seconds).
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A value that indicates how one result in the response relates proportionally to other results in the response. For example, a result that has a weight of 2 represents roughly twice as many web requests as a result that has a weight of 1.
    */
  var Weight: SampleWeight
}
object SampledHTTPRequest {
  
  inline def apply(Request: HTTPRequest, Weight: SampleWeight): SampledHTTPRequest = {
    val __obj = js.Dynamic.literal(Request = Request.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampledHTTPRequest]
  }
  
  extension [Self <: SampledHTTPRequest](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setCaptchaResponse(value: CaptchaResponse): Self = StObject.set(x, "CaptchaResponse", value.asInstanceOf[js.Any])
    
    inline def setCaptchaResponseUndefined: Self = StObject.set(x, "CaptchaResponse", js.undefined)
    
    inline def setChallengeResponse(value: ChallengeResponse): Self = StObject.set(x, "ChallengeResponse", value.asInstanceOf[js.Any])
    
    inline def setChallengeResponseUndefined: Self = StObject.set(x, "ChallengeResponse", js.undefined)
    
    inline def setLabels(value: Labels): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setLabelsVarargs(value: Label*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setOverriddenAction(value: Action): Self = StObject.set(x, "OverriddenAction", value.asInstanceOf[js.Any])
    
    inline def setOverriddenActionUndefined: Self = StObject.set(x, "OverriddenAction", js.undefined)
    
    inline def setRequest(value: HTTPRequest): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersInserted(value: HTTPHeaders): Self = StObject.set(x, "RequestHeadersInserted", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersInsertedUndefined: Self = StObject.set(x, "RequestHeadersInserted", js.undefined)
    
    inline def setRequestHeadersInsertedVarargs(value: HTTPHeader*): Self = StObject.set(x, "RequestHeadersInserted", js.Array(value*))
    
    inline def setResponseCodeSent(value: ResponseStatusCode): Self = StObject.set(x, "ResponseCodeSent", value.asInstanceOf[js.Any])
    
    inline def setResponseCodeSentUndefined: Self = StObject.set(x, "ResponseCodeSent", js.undefined)
    
    inline def setRuleNameWithinRuleGroup(value: EntityName): Self = StObject.set(x, "RuleNameWithinRuleGroup", value.asInstanceOf[js.Any])
    
    inline def setRuleNameWithinRuleGroupUndefined: Self = StObject.set(x, "RuleNameWithinRuleGroup", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    inline def setWeight(value: SampleWeight): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
  }
}
