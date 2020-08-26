package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrafficPoliciesRequest extends js.Object {
  /**
    * (Optional) The maximum number of traffic policies that you want Amazon Route 53 to return in response to this request. If you have more than MaxItems traffic policies, the value of IsTruncated in the response is true, and the value of TrafficPolicyIdMarker is the ID of the first traffic policy that Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  /**
    * (Conditional) For your first request to ListTrafficPolicies, don't include the TrafficPolicyIdMarker parameter. If you have more traffic policies than the value of MaxItems, ListTrafficPolicies returns only the first MaxItems traffic policies. To get the next group of policies, submit another request to ListTrafficPolicies. For the value of TrafficPolicyIdMarker, specify the value of TrafficPolicyIdMarker that was returned in the previous response.
    */
  var TrafficPolicyIdMarker: js.UndefOr[TrafficPolicyId] = js.native
}

object ListTrafficPoliciesRequest {
  @scala.inline
  def apply(): ListTrafficPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrafficPoliciesRequest]
  }
  @scala.inline
  implicit class ListTrafficPoliciesRequestOps[Self <: ListTrafficPoliciesRequest] (val x: Self) extends AnyVal {
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
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
    @scala.inline
    def setTrafficPolicyIdMarker(value: TrafficPolicyId): Self = this.set("TrafficPolicyIdMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficPolicyIdMarker: Self = this.set("TrafficPolicyIdMarker", js.undefined)
  }
  
}

