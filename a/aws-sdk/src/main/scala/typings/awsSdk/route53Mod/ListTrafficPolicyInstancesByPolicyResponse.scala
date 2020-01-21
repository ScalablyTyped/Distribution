package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrafficPolicyInstancesByPolicyResponse extends js.Object {
  /**
    * If IsTruncated is true, HostedZoneIdMarker is the ID of the hosted zone of the first traffic policy instance in the next group of traffic policy instances.
    */
  var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.native
  /**
    * A flag that indicates whether there are more traffic policy instances to be listed. If the response was truncated, you can get the next group of traffic policy instances by calling ListTrafficPolicyInstancesByPolicy again and specifying the values of the HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker elements in the corresponding request parameters.
    */
  var IsTruncated: PageTruncated = js.native
  /**
    * The value that you specified for the MaxItems parameter in the call to ListTrafficPolicyInstancesByPolicy that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  /**
    * If IsTruncated is true, TrafficPolicyInstanceNameMarker is the name of the first traffic policy instance in the next group of MaxItems traffic policy instances.
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.native
  /**
    * If IsTruncated is true, TrafficPolicyInstanceTypeMarker is the DNS type of the resource record sets that are associated with the first traffic policy instance in the next group of MaxItems traffic policy instances.
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.native
  /**
    * A list that contains one TrafficPolicyInstance element for each traffic policy instance that matches the elements in the request.
    */
  var TrafficPolicyInstances: typings.awsSdk.route53Mod.TrafficPolicyInstances = js.native
}

object ListTrafficPolicyInstancesByPolicyResponse {
  @scala.inline
  def apply(
    IsTruncated: PageTruncated,
    MaxItems: PageMaxItems,
    TrafficPolicyInstances: TrafficPolicyInstances,
    HostedZoneIdMarker: ResourceId = null,
    TrafficPolicyInstanceNameMarker: DNSName = null,
    TrafficPolicyInstanceTypeMarker: RRType = null
  ): ListTrafficPolicyInstancesByPolicyResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], TrafficPolicyInstances = TrafficPolicyInstances.asInstanceOf[js.Any])
    if (HostedZoneIdMarker != null) __obj.updateDynamic("HostedZoneIdMarker")(HostedZoneIdMarker.asInstanceOf[js.Any])
    if (TrafficPolicyInstanceNameMarker != null) __obj.updateDynamic("TrafficPolicyInstanceNameMarker")(TrafficPolicyInstanceNameMarker.asInstanceOf[js.Any])
    if (TrafficPolicyInstanceTypeMarker != null) __obj.updateDynamic("TrafficPolicyInstanceTypeMarker")(TrafficPolicyInstanceTypeMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesByPolicyResponse]
  }
}

