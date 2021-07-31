package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSampledRequestsRequest extends StObject {
  
  /**
    * The number of requests that you want AWS WAF to return from among the first 5,000 requests that your AWS resource received during the time range. If your resource received fewer requests than the value of MaxItems, GetSampledRequests returns information about all of them. 
    */
  var MaxItems: ListMaxItems
  
  /**
    * The metric name assigned to the Rule or RuleGroup for which you want a sample of requests.
    */
  var RuleMetricName: MetricName
  
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.wafv2Mod.Scope
  
  /**
    * The start date and time and the end date and time of the range for which you want GetSampledRequests to return a sample of requests. You must specify the times in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example, "2016-09-27T14:50Z". You can specify any time range in the previous three hours.
    */
  var TimeWindow: typings.awsSdk.wafv2Mod.TimeWindow
  
  /**
    * The Amazon resource name (ARN) of the WebACL for which you want a sample of requests.
    */
  var WebAclArn: ResourceArn
}
object GetSampledRequestsRequest {
  
  @scala.inline
  def apply(
    MaxItems: ListMaxItems,
    RuleMetricName: MetricName,
    Scope: Scope,
    TimeWindow: TimeWindow,
    WebAclArn: ResourceArn
  ): GetSampledRequestsRequest = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], RuleMetricName = RuleMetricName.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], TimeWindow = TimeWindow.asInstanceOf[js.Any], WebAclArn = WebAclArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSampledRequestsRequest]
  }
  
  @scala.inline
  implicit class GetSampledRequestsRequestMutableBuilder[Self <: GetSampledRequestsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxItems(value: ListMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleMetricName(value: MetricName): Self = StObject.set(x, "RuleMetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeWindow(value: TimeWindow): Self = StObject.set(x, "TimeWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAclArn(value: ResourceArn): Self = StObject.set(x, "WebAclArn", value.asInstanceOf[js.Any])
  }
}
