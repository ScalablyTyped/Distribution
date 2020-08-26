package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrafficPolicyInstancesByPolicyRequest extends js.Object {
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstancesByPolicy request.  For the value of hostedzoneid, specify the value of HostedZoneIdMarker from the previous response, which is the hosted zone ID of the first traffic policy instance that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.native
  /**
    * The maximum number of traffic policy instances to be included in the response body for this request. If you have more than MaxItems traffic policy instances, the value of the IsTruncated element in the response is true, and the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker represent the first traffic policy instance that Amazon Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  /**
    * The ID of the traffic policy for which you want to list traffic policy instances.
    */
  var TrafficPolicyId: typings.awsSdk.route53Mod.TrafficPolicyId = js.native
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstancesByPolicy request. For the value of trafficpolicyinstancename, specify the value of TrafficPolicyInstanceNameMarker from the previous response, which is the name of the first traffic policy instance that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.native
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstancesByPolicy request. For the value of trafficpolicyinstancetype, specify the value of TrafficPolicyInstanceTypeMarker from the previous response, which is the name of the first traffic policy instance that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.native
  /**
    * The version of the traffic policy for which you want to list traffic policy instances. The version must be associated with the traffic policy that is specified by TrafficPolicyId.
    */
  var TrafficPolicyVersion: typings.awsSdk.route53Mod.TrafficPolicyVersion = js.native
}

object ListTrafficPolicyInstancesByPolicyRequest {
  @scala.inline
  def apply(TrafficPolicyId: TrafficPolicyId, TrafficPolicyVersion: TrafficPolicyVersion): ListTrafficPolicyInstancesByPolicyRequest = {
    val __obj = js.Dynamic.literal(TrafficPolicyId = TrafficPolicyId.asInstanceOf[js.Any], TrafficPolicyVersion = TrafficPolicyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesByPolicyRequest]
  }
  @scala.inline
  implicit class ListTrafficPolicyInstancesByPolicyRequestOps[Self <: ListTrafficPolicyInstancesByPolicyRequest] (val x: Self) extends AnyVal {
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
    def setTrafficPolicyId(value: TrafficPolicyId): Self = this.set("TrafficPolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrafficPolicyVersion(value: TrafficPolicyVersion): Self = this.set("TrafficPolicyVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostedZoneIdMarker(value: ResourceId): Self = this.set("HostedZoneIdMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedZoneIdMarker: Self = this.set("HostedZoneIdMarker", js.undefined)
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
    @scala.inline
    def setTrafficPolicyInstanceNameMarker(value: DNSName): Self = this.set("TrafficPolicyInstanceNameMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficPolicyInstanceNameMarker: Self = this.set("TrafficPolicyInstanceNameMarker", js.undefined)
    @scala.inline
    def setTrafficPolicyInstanceTypeMarker(value: RRType): Self = this.set("TrafficPolicyInstanceTypeMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficPolicyInstanceTypeMarker: Self = this.set("TrafficPolicyInstanceTypeMarker", js.undefined)
  }
  
}

