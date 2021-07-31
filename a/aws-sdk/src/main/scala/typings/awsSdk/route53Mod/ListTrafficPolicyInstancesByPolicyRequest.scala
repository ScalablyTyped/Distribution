package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrafficPolicyInstancesByPolicyRequest extends StObject {
  
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstancesByPolicy request.  For the value of hostedzoneid, specify the value of HostedZoneIdMarker from the previous response, which is the hosted zone ID of the first traffic policy instance that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The maximum number of traffic policy instances to be included in the response body for this request. If you have more than MaxItems traffic policy instances, the value of the IsTruncated element in the response is true, and the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker represent the first traffic policy instance that Amazon Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  
  /**
    * The ID of the traffic policy for which you want to list traffic policy instances.
    */
  var TrafficPolicyId: typings.awsSdk.route53Mod.TrafficPolicyId
  
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstancesByPolicy request. For the value of trafficpolicyinstancename, specify the value of TrafficPolicyInstanceNameMarker from the previous response, which is the name of the first traffic policy instance that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
  
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstancesByPolicy request. For the value of trafficpolicyinstancetype, specify the value of TrafficPolicyInstanceTypeMarker from the previous response, which is the name of the first traffic policy instance that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
  
  /**
    * The version of the traffic policy for which you want to list traffic policy instances. The version must be associated with the traffic policy that is specified by TrafficPolicyId.
    */
  var TrafficPolicyVersion: typings.awsSdk.route53Mod.TrafficPolicyVersion
}
object ListTrafficPolicyInstancesByPolicyRequest {
  
  @scala.inline
  def apply(TrafficPolicyId: TrafficPolicyId, TrafficPolicyVersion: TrafficPolicyVersion): ListTrafficPolicyInstancesByPolicyRequest = {
    val __obj = js.Dynamic.literal(TrafficPolicyId = TrafficPolicyId.asInstanceOf[js.Any], TrafficPolicyVersion = TrafficPolicyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesByPolicyRequest]
  }
  
  @scala.inline
  implicit class ListTrafficPolicyInstancesByPolicyRequestMutableBuilder[Self <: ListTrafficPolicyInstancesByPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostedZoneIdMarker(value: ResourceId): Self = StObject.set(x, "HostedZoneIdMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneIdMarkerUndefined: Self = StObject.set(x, "HostedZoneIdMarker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setTrafficPolicyId(value: TrafficPolicyId): Self = StObject.set(x, "TrafficPolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyInstanceNameMarker(value: DNSName): Self = StObject.set(x, "TrafficPolicyInstanceNameMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyInstanceNameMarkerUndefined: Self = StObject.set(x, "TrafficPolicyInstanceNameMarker", js.undefined)
    
    @scala.inline
    def setTrafficPolicyInstanceTypeMarker(value: RRType): Self = StObject.set(x, "TrafficPolicyInstanceTypeMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyInstanceTypeMarkerUndefined: Self = StObject.set(x, "TrafficPolicyInstanceTypeMarker", js.undefined)
    
    @scala.inline
    def setTrafficPolicyVersion(value: TrafficPolicyVersion): Self = StObject.set(x, "TrafficPolicyVersion", value.asInstanceOf[js.Any])
  }
}
