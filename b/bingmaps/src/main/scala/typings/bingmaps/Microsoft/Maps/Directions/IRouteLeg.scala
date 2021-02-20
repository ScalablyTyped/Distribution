package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouteLeg extends StObject {
  
  /** The end time of the route leg. This property only applies when the routeMode of the DirectionsRequestOptions is set to transit. */
  var endTime: Date = js.native
  
  /** The location of the last waypoint of this leg. */
  var endWaypointLocation: Location = js.native
  
  /** The directions steps associated with this route leg. */
  var itineraryItems: js.Array[IDirectionsStep] = js.native
  
  /** The index of the route to which this route leg belongs. */
  var originalRouteIndex: Double = js.native
  
  /** The start time of the route leg. This property only applies when the routeMode of the DirectionsRequestOptions is set to transit. */
  var startTime: Date = js.native
  
  /** The location of the first waypoint of this route leg. */
  var startWaypointLocation: Location = js.native
  
  /** The sub legs of this route leg. A sub leg of a route is the part of the route between a stop point and a via point or between two via points.*/
  var subLegs: js.Array[IRouteSubLeg] = js.native
  
  /** The summary which describes this route leg. */
  var summary: IRouteSummary = js.native
}
object IRouteLeg {
  
  @scala.inline
  def apply(
    endTime: Date,
    endWaypointLocation: Location,
    itineraryItems: js.Array[IDirectionsStep],
    originalRouteIndex: Double,
    startTime: Date,
    startWaypointLocation: Location,
    subLegs: js.Array[IRouteSubLeg],
    summary: IRouteSummary
  ): IRouteLeg = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], endWaypointLocation = endWaypointLocation.asInstanceOf[js.Any], itineraryItems = itineraryItems.asInstanceOf[js.Any], originalRouteIndex = originalRouteIndex.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startWaypointLocation = startWaypointLocation.asInstanceOf[js.Any], subLegs = subLegs.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteLeg]
  }
  
  @scala.inline
  implicit class IRouteLegMutableBuilder[Self <: IRouteLeg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndWaypointLocation(value: Location): Self = StObject.set(x, "endWaypointLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItineraryItems(value: js.Array[IDirectionsStep]): Self = StObject.set(x, "itineraryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItineraryItemsVarargs(value: IDirectionsStep*): Self = StObject.set(x, "itineraryItems", js.Array(value :_*))
    
    @scala.inline
    def setOriginalRouteIndex(value: Double): Self = StObject.set(x, "originalRouteIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartWaypointLocation(value: Location): Self = StObject.set(x, "startWaypointLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubLegs(value: js.Array[IRouteSubLeg]): Self = StObject.set(x, "subLegs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubLegsVarargs(value: IRouteSubLeg*): Self = StObject.set(x, "subLegs", js.Array(value :_*))
    
    @scala.inline
    def setSummary(value: IRouteSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
