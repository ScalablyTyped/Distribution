package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRouteLeg extends StObject {
  
  /** The end time of the route leg. This property only applies when the routeMode of the DirectionsRequestOptions is set to transit. */
  var endTime: js.Date
  
  /** The location of the last waypoint of this leg. */
  var endWaypointLocation: Location
  
  /** The directions steps associated with this route leg. */
  var itineraryItems: js.Array[IDirectionsStep]
  
  /** The index of the route to which this route leg belongs. */
  var originalRouteIndex: Double
  
  /** The start time of the route leg. This property only applies when the routeMode of the DirectionsRequestOptions is set to transit. */
  var startTime: js.Date
  
  /** The location of the first waypoint of this route leg. */
  var startWaypointLocation: Location
  
  /** The sub legs of this route leg. A sub leg of a route is the part of the route between a stop point and a via point or between two via points.*/
  var subLegs: js.Array[IRouteSubLeg]
  
  /** The summary which describes this route leg. */
  var summary: IRouteSummary
}
object IRouteLeg {
  
  inline def apply(
    endTime: js.Date,
    endWaypointLocation: Location,
    itineraryItems: js.Array[IDirectionsStep],
    originalRouteIndex: Double,
    startTime: js.Date,
    startWaypointLocation: Location,
    subLegs: js.Array[IRouteSubLeg],
    summary: IRouteSummary
  ): IRouteLeg = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], endWaypointLocation = endWaypointLocation.asInstanceOf[js.Any], itineraryItems = itineraryItems.asInstanceOf[js.Any], originalRouteIndex = originalRouteIndex.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startWaypointLocation = startWaypointLocation.asInstanceOf[js.Any], subLegs = subLegs.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteLeg]
  }
  
  extension [Self <: IRouteLeg](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndWaypointLocation(value: Location): Self = StObject.set(x, "endWaypointLocation", value.asInstanceOf[js.Any])
    
    inline def setItineraryItems(value: js.Array[IDirectionsStep]): Self = StObject.set(x, "itineraryItems", value.asInstanceOf[js.Any])
    
    inline def setItineraryItemsVarargs(value: IDirectionsStep*): Self = StObject.set(x, "itineraryItems", js.Array(value*))
    
    inline def setOriginalRouteIndex(value: Double): Self = StObject.set(x, "originalRouteIndex", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartWaypointLocation(value: Location): Self = StObject.set(x, "startWaypointLocation", value.asInstanceOf[js.Any])
    
    inline def setSubLegs(value: js.Array[IRouteSubLeg]): Self = StObject.set(x, "subLegs", value.asInstanceOf[js.Any])
    
    inline def setSubLegsVarargs(value: IRouteSubLeg*): Self = StObject.set(x, "subLegs", js.Array(value*))
    
    inline def setSummary(value: IRouteSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
