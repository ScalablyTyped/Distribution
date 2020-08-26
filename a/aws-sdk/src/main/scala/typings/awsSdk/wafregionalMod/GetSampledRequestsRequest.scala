package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSampledRequestsRequest extends js.Object {
  /**
    * The number of requests that you want AWS WAF to return from among the first 5,000 requests that your AWS resource received during the time range. If your resource received fewer requests than the value of MaxItems, GetSampledRequests returns information about all of them. 
    */
  var MaxItems: GetSampledRequestsMaxItems = js.native
  /**
    *  RuleId is one of three values:   The RuleId of the Rule or the RuleGroupId of the RuleGroup for which you want GetSampledRequests to return a sample of requests.    Default_Action, which causes GetSampledRequests to return a sample of the requests that didn't match any of the rules in the specified WebACL.  
    */
  var RuleId: ResourceId = js.native
  /**
    * The start date and time and the end date and time of the range for which you want GetSampledRequests to return a sample of requests. You must specify the times in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example, "2016-09-27T14:50Z". You can specify any time range in the previous three hours.
    */
  var TimeWindow: typings.awsSdk.wafregionalMod.TimeWindow = js.native
  /**
    * The WebACLId of the WebACL for which you want GetSampledRequests to return a sample of requests.
    */
  var WebAclId: ResourceId = js.native
}

object GetSampledRequestsRequest {
  @scala.inline
  def apply(
    MaxItems: GetSampledRequestsMaxItems,
    RuleId: ResourceId,
    TimeWindow: TimeWindow,
    WebAclId: ResourceId
  ): GetSampledRequestsRequest = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any], TimeWindow = TimeWindow.asInstanceOf[js.Any], WebAclId = WebAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSampledRequestsRequest]
  }
  @scala.inline
  implicit class GetSampledRequestsRequestOps[Self <: GetSampledRequestsRequest] (val x: Self) extends AnyVal {
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
    def setMaxItems(value: GetSampledRequestsMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleId(value: ResourceId): Self = this.set("RuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeWindow(value: TimeWindow): Self = this.set("TimeWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAclId(value: ResourceId): Self = this.set("WebAclId", value.asInstanceOf[js.Any])
  }
  
}

