package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouteSummary extends js.Object {
  /** The total travel distance of the route */
  var distance: Double
  /** The cost of the route. This property is only returned if the routeMode of the IDirectionsRequestOptions is set to transit and the map culture is set to ja-jp. */
  var monetaryCost: Double
  /** The location of the northeast corner of bounding box that defines the best map view of the route. */
  var northEast: Location
  /** The location of the southwest corner of bounding box that defines the best map view of the route. */
  var southWest: Location
  /** The total travel time, in seconds, for the route. */
  var time: Double
  /**
    * The total travel time, in seconds, taking into account traffic delays, for the route.
    * This property is 0 if the avoidTraffic property of the IDirectionsRequestOptions is set to false.
    */
  var timeWithTraffic: Double
}

object IRouteSummary {
  @scala.inline
  def apply(
    distance: Double,
    monetaryCost: Double,
    northEast: Location,
    southWest: Location,
    time: Double,
    timeWithTraffic: Double
  ): IRouteSummary = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], monetaryCost = monetaryCost.asInstanceOf[js.Any], northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeWithTraffic = timeWithTraffic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRouteSummary]
  }
}

