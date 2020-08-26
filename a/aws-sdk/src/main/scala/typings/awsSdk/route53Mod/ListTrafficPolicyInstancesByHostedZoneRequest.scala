package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrafficPolicyInstancesByHostedZoneRequest extends js.Object {
  /**
    * The ID of the hosted zone that you want to list traffic policy instances for.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * The maximum number of traffic policy instances to be included in the response body for this request. If you have more than MaxItems traffic policy instances, the value of the IsTruncated element in the response is true, and the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker represent the first traffic policy instance that Amazon Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  /**
    * If the value of IsTruncated in the previous response is true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of trafficpolicyinstancename, specify the value of TrafficPolicyInstanceNameMarker from the previous response, which is the name of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.native
  /**
    * If the value of IsTruncated in the previous response is true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of trafficpolicyinstancetype, specify the value of TrafficPolicyInstanceTypeMarker from the previous response, which is the type of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.native
}

object ListTrafficPolicyInstancesByHostedZoneRequest {
  @scala.inline
  def apply(HostedZoneId: ResourceId): ListTrafficPolicyInstancesByHostedZoneRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesByHostedZoneRequest]
  }
  @scala.inline
  implicit class ListTrafficPolicyInstancesByHostedZoneRequestOps[Self <: ListTrafficPolicyInstancesByHostedZoneRequest] (val x: Self) extends AnyVal {
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
    def setHostedZoneId(value: ResourceId): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
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

