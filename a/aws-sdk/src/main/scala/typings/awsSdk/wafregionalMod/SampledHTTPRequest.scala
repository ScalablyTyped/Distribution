package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SampledHTTPRequest extends StObject {
  
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
  def apply(Request: HTTPRequest, Weight: SampleWeight): SampledHTTPRequest = {
    val __obj = js.Dynamic.literal(Request = Request.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampledHTTPRequest]
  }
  
  @scala.inline
  implicit class SampledHTTPRequestMutableBuilder[Self <: SampledHTTPRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setRequest(value: HTTPRequest): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleWithinRuleGroup(value: ResourceId): Self = StObject.set(x, "RuleWithinRuleGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleWithinRuleGroupUndefined: Self = StObject.set(x, "RuleWithinRuleGroup", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    @scala.inline
    def setWeight(value: SampleWeight): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
  }
}
