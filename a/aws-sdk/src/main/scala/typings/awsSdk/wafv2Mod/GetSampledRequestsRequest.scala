package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSampledRequestsRequest extends js.Object {
  /**
    * The number of requests that you want AWS WAF to return from among the first 5,000 requests that your AWS resource received during the time range. If your resource received fewer requests than the value of MaxItems, GetSampledRequests returns information about all of them. 
    */
  var MaxItems: ListMaxItems = js.native
  /**
    * The metric name assigned to the Rule or RuleGroup for which you want a sample of requests.
    */
  var RuleMetricName: MetricName = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.wafv2Mod.Scope = js.native
  /**
    * The start date and time and the end date and time of the range for which you want GetSampledRequests to return a sample of requests. Specify the date and time in the following format: "2016-09-27T14:50Z". You can specify any time range in the previous three hours.
    */
  var TimeWindow: typings.awsSdk.wafv2Mod.TimeWindow = js.native
  /**
    * The Amazon resource name (ARN) of the WebACL for which you want a sample of requests.
    */
  var WebAclArn: ResourceArn = js.native
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
}

