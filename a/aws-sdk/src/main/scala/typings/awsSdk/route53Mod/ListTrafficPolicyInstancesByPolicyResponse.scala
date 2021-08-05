package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrafficPolicyInstancesByPolicyResponse extends StObject {
  
  /**
    * If IsTruncated is true, HostedZoneIdMarker is the ID of the hosted zone of the first traffic policy instance in the next group of traffic policy instances.
    */
  var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * A flag that indicates whether there are more traffic policy instances to be listed. If the response was truncated, you can get the next group of traffic policy instances by calling ListTrafficPolicyInstancesByPolicy again and specifying the values of the HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker elements in the corresponding request parameters.
    */
  var IsTruncated: PageTruncated
  
  /**
    * The value that you specified for the MaxItems parameter in the call to ListTrafficPolicyInstancesByPolicy that produced the current response.
    */
  var MaxItems: PageMaxItems
  
  /**
    * If IsTruncated is true, TrafficPolicyInstanceNameMarker is the name of the first traffic policy instance in the next group of MaxItems traffic policy instances.
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
  
  /**
    * If IsTruncated is true, TrafficPolicyInstanceTypeMarker is the DNS type of the resource record sets that are associated with the first traffic policy instance in the next group of MaxItems traffic policy instances.
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
  
  /**
    * A list that contains one TrafficPolicyInstance element for each traffic policy instance that matches the elements in the request.
    */
  var TrafficPolicyInstances: typings.awsSdk.route53Mod.TrafficPolicyInstances
}
object ListTrafficPolicyInstancesByPolicyResponse {
  
  inline def apply(IsTruncated: PageTruncated, MaxItems: PageMaxItems, TrafficPolicyInstances: TrafficPolicyInstances): ListTrafficPolicyInstancesByPolicyResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], TrafficPolicyInstances = TrafficPolicyInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesByPolicyResponse]
  }
  
  extension [Self <: ListTrafficPolicyInstancesByPolicyResponse](x: Self) {
    
    inline def setHostedZoneIdMarker(value: ResourceId): Self = StObject.set(x, "HostedZoneIdMarker", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneIdMarkerUndefined: Self = StObject.set(x, "HostedZoneIdMarker", js.undefined)
    
    inline def setIsTruncated(value: PageTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setTrafficPolicyInstanceNameMarker(value: DNSName): Self = StObject.set(x, "TrafficPolicyInstanceNameMarker", value.asInstanceOf[js.Any])
    
    inline def setTrafficPolicyInstanceNameMarkerUndefined: Self = StObject.set(x, "TrafficPolicyInstanceNameMarker", js.undefined)
    
    inline def setTrafficPolicyInstanceTypeMarker(value: RRType): Self = StObject.set(x, "TrafficPolicyInstanceTypeMarker", value.asInstanceOf[js.Any])
    
    inline def setTrafficPolicyInstanceTypeMarkerUndefined: Self = StObject.set(x, "TrafficPolicyInstanceTypeMarker", js.undefined)
    
    inline def setTrafficPolicyInstances(value: TrafficPolicyInstances): Self = StObject.set(x, "TrafficPolicyInstances", value.asInstanceOf[js.Any])
    
    inline def setTrafficPolicyInstancesVarargs(value: TrafficPolicyInstance*): Self = StObject.set(x, "TrafficPolicyInstances", js.Array(value :_*))
  }
}
