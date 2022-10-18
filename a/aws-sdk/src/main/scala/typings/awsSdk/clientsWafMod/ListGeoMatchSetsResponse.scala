package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGeoMatchSetsResponse extends StObject {
  
  /**
    * An array of GeoMatchSetSummary objects.
    */
  var GeoMatchSets: js.UndefOr[GeoMatchSetSummaries] = js.undefined
  
  /**
    * If you have more GeoMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more GeoMatchSet objects, submit another ListGeoMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafMod.NextMarker] = js.undefined
}
object ListGeoMatchSetsResponse {
  
  inline def apply(): ListGeoMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGeoMatchSetsResponse]
  }
  
  extension [Self <: ListGeoMatchSetsResponse](x: Self) {
    
    inline def setGeoMatchSets(value: GeoMatchSetSummaries): Self = StObject.set(x, "GeoMatchSets", value.asInstanceOf[js.Any])
    
    inline def setGeoMatchSetsUndefined: Self = StObject.set(x, "GeoMatchSets", js.undefined)
    
    inline def setGeoMatchSetsVarargs(value: GeoMatchSetSummary*): Self = StObject.set(x, "GeoMatchSets", js.Array(value*))
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
