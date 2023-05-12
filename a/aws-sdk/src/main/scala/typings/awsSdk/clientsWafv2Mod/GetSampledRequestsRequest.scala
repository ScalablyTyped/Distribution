package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSampledRequestsRequest extends StObject {
  
  /**
    * The number of requests that you want WAF to return from among the first 5,000 requests that your Amazon Web Services resource received during the time range. If your resource received fewer requests than the value of MaxItems, GetSampledRequests returns information about all of them. 
    */
  var MaxItems: ListMaxItems
  
  /**
    * The metric name assigned to the Rule or RuleGroup dimension for which you want a sample of requests.
    */
  var RuleMetricName: MetricName
  
  /**
    * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.clientsWafv2Mod.Scope
  
  /**
    * The start date and time and the end date and time of the range for which you want GetSampledRequests to return a sample of requests. You must specify the times in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example, "2016-09-27T14:50Z". You can specify any time range in the previous three hours. If you specify a start time that's earlier than three hours ago, WAF sets it to three hours ago.
    */
  var TimeWindow: typings.awsSdk.clientsWafv2Mod.TimeWindow
  
  /**
    * The Amazon resource name (ARN) of the WebACL for which you want a sample of requests.
    */
  var WebAclArn: ResourceArn
}
object GetSampledRequestsRequest {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: GetSampledRequestsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxItems(value: ListMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setRuleMetricName(value: MetricName): Self = StObject.set(x, "RuleMetricName", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setTimeWindow(value: TimeWindow): Self = StObject.set(x, "TimeWindow", value.asInstanceOf[js.Any])
    
    inline def setWebAclArn(value: ResourceArn): Self = StObject.set(x, "WebAclArn", value.asInstanceOf[js.Any])
  }
}
