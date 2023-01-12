package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSampledRequestsRequest extends StObject {
  
  /**
    * The number of requests that you want AWS WAF to return from among the first 5,000 requests that your AWS resource received during the time range. If your resource received fewer requests than the value of MaxItems, GetSampledRequests returns information about all of them. 
    */
  var MaxItems: GetSampledRequestsMaxItems
  
  /**
    *  RuleId is one of three values:   The RuleId of the Rule or the RuleGroupId of the RuleGroup for which you want GetSampledRequests to return a sample of requests.    Default_Action, which causes GetSampledRequests to return a sample of the requests that didn't match any of the rules in the specified WebACL.  
    */
  var RuleId: ResourceId
  
  /**
    * The start date and time and the end date and time of the range for which you want GetSampledRequests to return a sample of requests. You must specify the times in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example, "2016-09-27T14:50Z". You can specify any time range in the previous three hours.
    */
  var TimeWindow: typings.awsSdk.clientsWafMod.TimeWindow
  
  /**
    * The WebACLId of the WebACL for which you want GetSampledRequests to return a sample of requests.
    */
  var WebAclId: ResourceId
}
object GetSampledRequestsRequest {
  
  inline def apply(
    MaxItems: GetSampledRequestsMaxItems,
    RuleId: ResourceId,
    TimeWindow: TimeWindow,
    WebAclId: ResourceId
  ): GetSampledRequestsRequest = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any], TimeWindow = TimeWindow.asInstanceOf[js.Any], WebAclId = WebAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSampledRequestsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSampledRequestsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxItems(value: GetSampledRequestsMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: ResourceId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    inline def setTimeWindow(value: TimeWindow): Self = StObject.set(x, "TimeWindow", value.asInstanceOf[js.Any])
    
    inline def setWebAclId(value: ResourceId): Self = StObject.set(x, "WebAclId", value.asInstanceOf[js.Any])
  }
}
