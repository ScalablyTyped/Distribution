package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SampledHTTPRequest extends StObject {
  
  /**
    * The action for the Rule that the request matched: ALLOW, BLOCK, or COUNT.
    */
  var Action: js.UndefOr[typings.awsSdk.wafv2Mod.Action] = js.native
  
  /**
    * A complex type that contains detailed information about the request.
    */
  var Request: HTTPRequest = js.native
  
  /**
    * The name of the Rule that the request matched. For managed rule groups, the format for this name is &lt;vendor name&gt;#&lt;managed rule group name&gt;#&lt;rule name&gt;. For your own rule groups, the format for this name is &lt;rule group name&gt;#&lt;rule name&gt;. If the rule is not in a rule group, this field is absent. 
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
    def setRuleNameWithinRuleGroup(value: EntityName): Self = StObject.set(x, "RuleNameWithinRuleGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNameWithinRuleGroupUndefined: Self = StObject.set(x, "RuleNameWithinRuleGroup", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    @scala.inline
    def setWeight(value: SampleWeight): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
  }
}
