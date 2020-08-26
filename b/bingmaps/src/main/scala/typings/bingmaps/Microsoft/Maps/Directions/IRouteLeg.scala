package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouteLeg extends js.Object {
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
  implicit class IRouteLegOps[Self <: IRouteLeg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndTime(value: Date): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndWaypointLocation(value: Location): Self = this.set("endWaypointLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setItineraryItemsVarargs(value: IDirectionsStep*): Self = this.set("itineraryItems", js.Array(value :_*))
    @scala.inline
    def setItineraryItems(value: js.Array[IDirectionsStep]): Self = this.set("itineraryItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalRouteIndex(value: Double): Self = this.set("originalRouteIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartWaypointLocation(value: Location): Self = this.set("startWaypointLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubLegsVarargs(value: IRouteSubLeg*): Self = this.set("subLegs", js.Array(value :_*))
    @scala.inline
    def setSubLegs(value: js.Array[IRouteSubLeg]): Self = this.set("subLegs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: IRouteSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
  }
  
}

