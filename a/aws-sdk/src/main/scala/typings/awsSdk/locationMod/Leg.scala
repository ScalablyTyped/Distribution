package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Leg extends StObject {
  
  /**
    * The distance between the leg's StartPosition and EndPosition along a calculated route.    The default measurement is Kilometers unless the request specifies a DistanceUnit of Miles.  
    */
  var Distance: LegDistanceDouble
  
  /**
    * The estimated travel time between the leg's StartPosition and EndPosition. The travel mode and departure time that you specify in the request determines the calculated time.
    */
  var DurationSeconds: LegDurationSecondsDouble
  
  /**
    * The terminating position of the leg. Follows the format [longitude,latitude].  If the EndPosition isn't located on a road, it's snapped to a nearby road.  
    */
  var EndPosition: Position
  
  /**
    * Contains the calculated route's path as a linestring geometry.
    */
  var Geometry: js.UndefOr[LegGeometry] = js.undefined
  
  /**
    * The starting position of the leg. Follows the format [longitude,latitude].  If the StartPosition isn't located on a road, it's snapped to a nearby road.  
    */
  var StartPosition: Position
  
  /**
    * Contains a list of steps, which represent subsections of a leg. Each step provides instructions for how to move to the next step in the leg such as the step's start position, end position, travel distance, travel duration, and geometry offset.
    */
  var Steps: StepList
}
object Leg {
  
  inline def apply(
    Distance: LegDistanceDouble,
    DurationSeconds: LegDurationSecondsDouble,
    EndPosition: Position,
    StartPosition: Position,
    Steps: StepList
  ): Leg = {
    val __obj = js.Dynamic.literal(Distance = Distance.asInstanceOf[js.Any], DurationSeconds = DurationSeconds.asInstanceOf[js.Any], EndPosition = EndPosition.asInstanceOf[js.Any], StartPosition = StartPosition.asInstanceOf[js.Any], Steps = Steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leg]
  }
  
  extension [Self <: Leg](x: Self) {
    
    inline def setDistance(value: LegDistanceDouble): Self = StObject.set(x, "Distance", value.asInstanceOf[js.Any])
    
    inline def setDurationSeconds(value: LegDurationSecondsDouble): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setEndPosition(value: Position): Self = StObject.set(x, "EndPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionVarargs(value: Double*): Self = StObject.set(x, "EndPosition", js.Array(value*))
    
    inline def setGeometry(value: LegGeometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "Geometry", js.undefined)
    
    inline def setStartPosition(value: Position): Self = StObject.set(x, "StartPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionVarargs(value: Double*): Self = StObject.set(x, "StartPosition", js.Array(value*))
    
    inline def setSteps(value: StepList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "Steps", js.Array(value*))
  }
}
