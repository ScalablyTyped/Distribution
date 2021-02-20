package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHostedZonesResponse extends StObject {
  
  /**
    * A complex type that contains general information about the hosted zone.
    */
  var HostedZones: typings.awsSdk.route53Mod.HostedZones = js.native
  
  /**
    * A flag indicating whether there are more hosted zones to be listed. If the response was truncated, you can get more hosted zones by submitting another ListHostedZones request and specifying the value of NextMarker in the marker parameter.
    */
  var IsTruncated: PageTruncated = js.native
  
  /**
    * For the second and subsequent calls to ListHostedZones, Marker is the value that you specified for the marker parameter in the request that produced the current response.
    */
  var Marker: PageMarker = js.native
  
  /**
    * The value that you specified for the maxitems parameter in the call to ListHostedZones that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  
  /**
    * If IsTruncated is true, the value of NextMarker identifies the first hosted zone in the next group of hosted zones. Submit another ListHostedZones request, and specify the value of NextMarker from the response in the marker parameter. This element is present only if IsTruncated is true.
    */
  var NextMarker: js.UndefOr[PageMarker] = js.native
}
object ListHostedZonesResponse {
  
  @scala.inline
  def apply(HostedZones: HostedZones, IsTruncated: PageTruncated, Marker: PageMarker, MaxItems: PageMaxItems): ListHostedZonesResponse = {
    val __obj = js.Dynamic.literal(HostedZones = HostedZones.asInstanceOf[js.Any], IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedZonesResponse]
  }
  
  @scala.inline
  implicit class ListHostedZonesResponseMutableBuilder[Self <: ListHostedZonesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostedZones(value: HostedZones): Self = StObject.set(x, "HostedZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZonesVarargs(value: HostedZone*): Self = StObject.set(x, "HostedZones", js.Array(value :_*))
    
    @scala.inline
    def setIsTruncated(value: PageTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: PageMarker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarker(value: PageMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
