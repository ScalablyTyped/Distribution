package typings.awsSdk.wafMod

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
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.undefined
}
object ListGeoMatchSetsResponse {
  
  @scala.inline
  def apply(): ListGeoMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGeoMatchSetsResponse]
  }
  
  @scala.inline
  implicit class ListGeoMatchSetsResponseMutableBuilder[Self <: ListGeoMatchSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoMatchSets(value: GeoMatchSetSummaries): Self = StObject.set(x, "GeoMatchSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoMatchSetsUndefined: Self = StObject.set(x, "GeoMatchSets", js.undefined)
    
    @scala.inline
    def setGeoMatchSetsVarargs(value: GeoMatchSetSummary*): Self = StObject.set(x, "GeoMatchSets", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
