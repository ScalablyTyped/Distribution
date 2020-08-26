package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrafficPolicyVersionsRequest extends js.Object {
  /**
    * Specify the value of Id of the traffic policy for which you want to list all versions.
    */
  var Id: TrafficPolicyId = js.native
  /**
    * The maximum number of traffic policy versions that you want Amazon Route 53 to include in the response body for this request. If the specified traffic policy has more than MaxItems versions, the value of IsTruncated in the response is true, and the value of the TrafficPolicyVersionMarker element is the ID of the first version that Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  /**
    * For your first request to ListTrafficPolicyVersions, don't include the TrafficPolicyVersionMarker parameter. If you have more traffic policy versions than the value of MaxItems, ListTrafficPolicyVersions returns only the first group of MaxItems versions. To get more traffic policy versions, submit another ListTrafficPolicyVersions request. For the value of TrafficPolicyVersionMarker, specify the value of TrafficPolicyVersionMarker in the previous response.
    */
  var TrafficPolicyVersionMarker: js.UndefOr[typings.awsSdk.route53Mod.TrafficPolicyVersionMarker] = js.native
}

object ListTrafficPolicyVersionsRequest {
  @scala.inline
  def apply(Id: TrafficPolicyId): ListTrafficPolicyVersionsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyVersionsRequest]
  }
  @scala.inline
  implicit class ListTrafficPolicyVersionsRequestOps[Self <: ListTrafficPolicyVersionsRequest] (val x: Self) extends AnyVal {
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
    def setId(value: TrafficPolicyId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
    @scala.inline
    def setTrafficPolicyVersionMarker(value: TrafficPolicyVersionMarker): Self = this.set("TrafficPolicyVersionMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficPolicyVersionMarker: Self = this.set("TrafficPolicyVersionMarker", js.undefined)
  }
  
}

