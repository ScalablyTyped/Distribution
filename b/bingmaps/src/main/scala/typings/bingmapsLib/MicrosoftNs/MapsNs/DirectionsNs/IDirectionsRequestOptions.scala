package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectionsRequestOptions extends js.Object {
  /** The unit to use when displaying direction distances. */
  var distanceUnit: js.UndefOr[DistanceUnit] = js.undefined
  /** The number of routes to calculate. */
  var maxRoutes: js.UndefOr[scala.Double] = js.undefined
  /** The features to avoid when calculating the route. */
  var routeAvoidance: js.UndefOr[js.Array[RouteAvoidance]] = js.undefined
  /** A boolean indicating whether the route line on the map can be dragged with the mouse cursor.  */
  var routeDraggable: js.UndefOr[scala.Boolean] = js.undefined
  /** If multiple routes are returned, the index of the route and directions to display. */
  var routeIndex: js.UndefOr[scala.Double] = js.undefined
  /** The type of directions to calculate. */
  var routeMode: js.UndefOr[RouteMode] = js.undefined
  /** The optimization setting for the route calculation. */
  var routeOptimization: js.UndefOr[RouteOptimization] = js.undefined
  /** The time to use when calculating the route. If this property is set to null, the current time is used */
  var time: js.UndefOr[stdLib.Date] = js.undefined
  /** The type of the time specified. The default value is departure. */
  var timeType: js.UndefOr[TimeType] = js.undefined
  /** Specifies the vehicle attributes to use when calculating a truck route. */
  var vehicleSpec: js.UndefOr[IVehicleSpec] = js.undefined
}

