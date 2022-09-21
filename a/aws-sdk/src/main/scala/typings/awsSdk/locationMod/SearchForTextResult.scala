package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchForTextResult extends StObject {
  
  /**
    * The distance in meters of a great-circle arc between the bias position specified and the result. Distance will be returned only if a bias position was specified in the query.  A great-circle arc is the shortest path on a sphere, in this case the Earth. This returns the shortest distance between two locations. 
    */
  var Distance: js.UndefOr[SearchForTextResultDistanceDouble] = js.undefined
  
  /**
    * Details about the search result, such as its address and position.
    */
  var Place: typings.awsSdk.locationMod.Place
  
  /**
    * The relative confidence in the match for a result among the results returned. For example, if more fields for an address match (including house number, street, city, country/region, and postal code), the relevance score is closer to 1. Returned only when the partner selected is Esri.
    */
  var Relevance: js.UndefOr[SearchForTextResultRelevanceDouble] = js.undefined
}
object SearchForTextResult {
  
  inline def apply(Place: Place): SearchForTextResult = {
    val __obj = js.Dynamic.literal(Place = Place.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchForTextResult]
  }
  
  extension [Self <: SearchForTextResult](x: Self) {
    
    inline def setDistance(value: SearchForTextResultDistanceDouble): Self = StObject.set(x, "Distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "Distance", js.undefined)
    
    inline def setPlace(value: Place): Self = StObject.set(x, "Place", value.asInstanceOf[js.Any])
    
    inline def setRelevance(value: SearchForTextResultRelevanceDouble): Self = StObject.set(x, "Relevance", value.asInstanceOf[js.Any])
    
    inline def setRelevanceUndefined: Self = StObject.set(x, "Relevance", js.undefined)
  }
}
