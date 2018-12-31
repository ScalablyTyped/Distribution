package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouteSummary extends js.Object {
  /** The total travel distance of the route */
  var distance: scala.Double
  /** The cost of the route. This property is only returned if the routeMode of the IDirectionsRequestOptions is set to transit and the map culture is set to ja-jp. */
  var monetaryCost: scala.Double
  /** The location of the northeast corner of bounding box that defines the best map view of the route. */
  var northEast: bingmapsLib.MicrosoftNs.MapsNs.Location
  /** The location of the southwest corner of bounding box that defines the best map view of the route. */
  var southWest: bingmapsLib.MicrosoftNs.MapsNs.Location
  /** The total travel time, in seconds, for the route. */
  var time: scala.Double
  /**
    * The total travel time, in seconds, taking into account traffic delays, for the route.
    * This property is 0 if the avoidTraffic property of the IDirectionsRequestOptions is set to false.
    */
  var timeWithTraffic: scala.Double
}

