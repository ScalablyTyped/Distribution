package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchForPositionResult extends StObject {
  
  /**
    * The distance in meters of a great-circle arc between the query position and the result.  A great-circle arc is the shortest path on a sphere, in this case the Earth. This returns the shortest distance between two locations. 
    */
  var Distance: SearchForPositionResultDistanceDouble
  
  /**
    * Details about the search result, such as its address and position.
    */
  var Place: typings.awsSdk.locationMod.Place
}
object SearchForPositionResult {
  
  inline def apply(Distance: SearchForPositionResultDistanceDouble, Place: Place): SearchForPositionResult = {
    val __obj = js.Dynamic.literal(Distance = Distance.asInstanceOf[js.Any], Place = Place.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchForPositionResult]
  }
  
  extension [Self <: SearchForPositionResult](x: Self) {
    
    inline def setDistance(value: SearchForPositionResultDistanceDouble): Self = StObject.set(x, "Distance", value.asInstanceOf[js.Any])
    
    inline def setPlace(value: Place): Self = StObject.set(x, "Place", value.asInstanceOf[js.Any])
  }
}
