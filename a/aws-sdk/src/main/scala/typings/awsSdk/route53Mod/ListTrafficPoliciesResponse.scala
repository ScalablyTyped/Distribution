package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrafficPoliciesResponse extends js.Object {
  /**
    * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you can get the next group of traffic policies by submitting another ListTrafficPolicies request and specifying the value of TrafficPolicyIdMarker in the TrafficPolicyIdMarker request parameter.
    */
  var IsTruncated: PageTruncated = js.native
  /**
    * The value that you specified for the MaxItems parameter in the ListTrafficPolicies request that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  /**
    * If the value of IsTruncated is true, TrafficPolicyIdMarker is the ID of the first traffic policy in the next group of MaxItems traffic policies.
    */
  var TrafficPolicyIdMarker: TrafficPolicyId = js.native
  /**
    * A list that contains one TrafficPolicySummary element for each traffic policy that was created by the current AWS account.
    */
  var TrafficPolicySummaries: typings.awsSdk.route53Mod.TrafficPolicySummaries = js.native
}

object ListTrafficPoliciesResponse {
  @scala.inline
  def apply(
    IsTruncated: PageTruncated,
    MaxItems: PageMaxItems,
    TrafficPolicyIdMarker: TrafficPolicyId,
    TrafficPolicySummaries: TrafficPolicySummaries
  ): ListTrafficPoliciesResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], TrafficPolicyIdMarker = TrafficPolicyIdMarker.asInstanceOf[js.Any], TrafficPolicySummaries = TrafficPolicySummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPoliciesResponse]
  }
  @scala.inline
  implicit class ListTrafficPoliciesResponseOps[Self <: ListTrafficPoliciesResponse] (val x: Self) extends AnyVal {
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
    def setIsTruncated(value: PageTruncated): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrafficPolicyIdMarker(value: TrafficPolicyId): Self = this.set("TrafficPolicyIdMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrafficPolicySummariesVarargs(value: TrafficPolicySummary*): Self = this.set("TrafficPolicySummaries", js.Array(value :_*))
    @scala.inline
    def setTrafficPolicySummaries(value: TrafficPolicySummaries): Self = this.set("TrafficPolicySummaries", value.asInstanceOf[js.Any])
  }
  
}

