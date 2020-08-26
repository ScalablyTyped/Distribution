package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrafficPolicyInstancesResponse extends js.Object {
  /**
    * If IsTruncated is true, HostedZoneIdMarker is the ID of the hosted zone of the first traffic policy instance that Route 53 will return if you submit another ListTrafficPolicyInstances request. 
    */
  var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.native
  /**
    * A flag that indicates whether there are more traffic policy instances to be listed. If the response was truncated, you can get more traffic policy instances by calling ListTrafficPolicyInstances again and specifying the values of the HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker in the corresponding request parameters.
    */
  var IsTruncated: PageTruncated = js.native
  /**
    * The value that you specified for the MaxItems parameter in the call to ListTrafficPolicyInstances that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  /**
    * If IsTruncated is true, TrafficPolicyInstanceNameMarker is the name of the first traffic policy instance that Route 53 will return if you submit another ListTrafficPolicyInstances request. 
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.native
  /**
    * If IsTruncated is true, TrafficPolicyInstanceTypeMarker is the DNS type of the resource record sets that are associated with the first traffic policy instance that Amazon Route 53 will return if you submit another ListTrafficPolicyInstances request. 
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.native
  /**
    * A list that contains one TrafficPolicyInstance element for each traffic policy instance that matches the elements in the request.
    */
  var TrafficPolicyInstances: typings.awsSdk.route53Mod.TrafficPolicyInstances = js.native
}

object ListTrafficPolicyInstancesResponse {
  @scala.inline
  def apply(IsTruncated: PageTruncated, MaxItems: PageMaxItems, TrafficPolicyInstances: TrafficPolicyInstances): ListTrafficPolicyInstancesResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], TrafficPolicyInstances = TrafficPolicyInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesResponse]
  }
  @scala.inline
  implicit class ListTrafficPolicyInstancesResponseOps[Self <: ListTrafficPolicyInstancesResponse] (val x: Self) extends AnyVal {
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
    def setTrafficPolicyInstancesVarargs(value: TrafficPolicyInstance*): Self = this.set("TrafficPolicyInstances", js.Array(value :_*))
    @scala.inline
    def setTrafficPolicyInstances(value: TrafficPolicyInstances): Self = this.set("TrafficPolicyInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostedZoneIdMarker(value: ResourceId): Self = this.set("HostedZoneIdMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedZoneIdMarker: Self = this.set("HostedZoneIdMarker", js.undefined)
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

