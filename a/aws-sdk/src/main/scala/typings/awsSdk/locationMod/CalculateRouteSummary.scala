package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculateRouteSummary extends StObject {
  
  /**
    * The data provider of traffic and road network data used to calculate the route. Indicates one of the available providers:    Esri     Here    For more information about data providers, see Amazon Location Service data providers.
    */
  var DataSource: String
  
  /**
    * The total distance covered by the route. The sum of the distance travelled between every stop on the route.  If Esri is the data source for the route calculator, the route distance can’t be greater than 400 km. If the route exceeds 400 km, the response is a 400 RoutesValidationException error. 
    */
  var Distance: CalculateRouteSummaryDistanceDouble
  
  /**
    * The unit of measurement for route distances.
    */
  var DistanceUnit: typings.awsSdk.locationMod.DistanceUnit
  
  /**
    * The total travel time for the route measured in seconds. The sum of the travel time between every stop on the route.
    */
  var DurationSeconds: CalculateRouteSummaryDurationSecondsDouble
  
  /**
    * Specifies a geographical box surrounding a route. Used to zoom into a route when displaying it in a map. For example, [min x, min y, max x, max y]. The first 2 bbox parameters describe the lower southwest corner:    The first bbox position is the X coordinate or longitude of the lower southwest corner.    The second bbox position is the Y coordinate or latitude of the lower southwest corner.    The next 2 bbox parameters describe the upper northeast corner:    The third bbox position is the X coordinate, or longitude of the upper northeast corner.    The fourth bbox position is the Y coordinate, or latitude of the upper northeast corner.   
    */
  var RouteBBox: BoundingBox
}
object CalculateRouteSummary {
  
  inline def apply(
    DataSource: String,
    Distance: CalculateRouteSummaryDistanceDouble,
    DistanceUnit: DistanceUnit,
    DurationSeconds: CalculateRouteSummaryDurationSecondsDouble,
    RouteBBox: BoundingBox
  ): CalculateRouteSummary = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], DistanceUnit = DistanceUnit.asInstanceOf[js.Any], DurationSeconds = DurationSeconds.asInstanceOf[js.Any], RouteBBox = RouteBBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculateRouteSummary]
  }
  
  extension [Self <: CalculateRouteSummary](x: Self) {
    
    inline def setDataSource(value: String): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: CalculateRouteSummaryDistanceDouble): Self = StObject.set(x, "Distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUnit(value: DistanceUnit): Self = StObject.set(x, "DistanceUnit", value.asInstanceOf[js.Any])
    
    inline def setDurationSeconds(value: CalculateRouteSummaryDurationSecondsDouble): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setRouteBBox(value: BoundingBox): Self = StObject.set(x, "RouteBBox", value.asInstanceOf[js.Any])
    
    inline def setRouteBBoxVarargs(value: Double*): Self = StObject.set(x, "RouteBBox", js.Array(value*))
  }
}
