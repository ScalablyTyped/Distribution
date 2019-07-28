package typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs

import typings.bingmaps.MicrosoftNs.MapsNs.Location
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouteLeg extends js.Object {
  /** The end time of the route leg. This property only applies when the routeMode of the DirectionsRequestOptions is set to transit. */
  var endTime: Date
  /** The location of the last waypoint of this leg. */
  var endWaypointLocation: Location
  /** The directions steps associated with this route leg. */
  var itineraryItems: js.Array[IDirectionsStep]
  /** The index of the route to which this route leg belongs. */
  var originalRouteIndex: Double
  /** The start time of the route leg. This property only applies when the routeMode of the DirectionsRequestOptions is set to transit. */
  var startTime: Date
  /** The location of the first waypoint of this route leg. */
  var startWaypointLocation: Location
  /** The sub legs of this route leg. A sub leg of a route is the part of the route between a stop point and a via point or between two via points.*/
  var subLegs: js.Array[IRouteSubLeg]
  /** The summary which describes this route leg. */
  var summary: IRouteSummary
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
    val __obj = js.Dynamic.literal(endTime = endTime, endWaypointLocation = endWaypointLocation, itineraryItems = itineraryItems, originalRouteIndex = originalRouteIndex, startTime = startTime, startWaypointLocation = startWaypointLocation, subLegs = subLegs, summary = summary)
  
    __obj.asInstanceOf[IRouteLeg]
  }
}

