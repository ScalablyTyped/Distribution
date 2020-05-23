package typings.bingmaps.Microsoft.Maps.Directions

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectionsRequestOptions extends js.Object {
  /** The unit to use when displaying direction distances. */
  var distanceUnit: js.UndefOr[DistanceUnit] = js.undefined
  /** The number of routes to calculate. */
  var maxRoutes: js.UndefOr[Double] = js.undefined
  /** The features to avoid when calculating the route. */
  var routeAvoidance: js.UndefOr[js.Array[RouteAvoidance]] = js.undefined
  /** A boolean indicating whether the route line on the map can be dragged with the mouse cursor.  */
  var routeDraggable: js.UndefOr[Boolean] = js.undefined
  /** If multiple routes are returned, the index of the route and directions to display. */
  var routeIndex: js.UndefOr[Double] = js.undefined
  /** The type of directions to calculate. */
  var routeMode: js.UndefOr[RouteMode] = js.undefined
  /** The optimization setting for the route calculation. */
  var routeOptimization: js.UndefOr[RouteOptimization] = js.undefined
  /** The time to use when calculating the route. If this property is set to null, the current time is used */
  var time: js.UndefOr[Date] = js.undefined
  /** The type of the time specified. The default value is departure. */
  var timeType: js.UndefOr[TimeType] = js.undefined
  /** Specifies the vehicle attributes to use when calculating a truck route. */
  var vehicleSpec: js.UndefOr[IVehicleSpec] = js.undefined
}

object IDirectionsRequestOptions {
  @scala.inline
  def apply(
    distanceUnit: DistanceUnit = null,
    maxRoutes: js.UndefOr[Double] = js.undefined,
    routeAvoidance: js.Array[RouteAvoidance] = null,
    routeDraggable: js.UndefOr[Boolean] = js.undefined,
    routeIndex: js.UndefOr[Double] = js.undefined,
    routeMode: RouteMode = null,
    routeOptimization: RouteOptimization = null,
    time: Date = null,
    timeType: TimeType = null,
    vehicleSpec: IVehicleSpec = null
  ): IDirectionsRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (distanceUnit != null) __obj.updateDynamic("distanceUnit")(distanceUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRoutes)) __obj.updateDynamic("maxRoutes")(maxRoutes.get.asInstanceOf[js.Any])
    if (routeAvoidance != null) __obj.updateDynamic("routeAvoidance")(routeAvoidance.asInstanceOf[js.Any])
    if (!js.isUndefined(routeDraggable)) __obj.updateDynamic("routeDraggable")(routeDraggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(routeIndex)) __obj.updateDynamic("routeIndex")(routeIndex.get.asInstanceOf[js.Any])
    if (routeMode != null) __obj.updateDynamic("routeMode")(routeMode.asInstanceOf[js.Any])
    if (routeOptimization != null) __obj.updateDynamic("routeOptimization")(routeOptimization.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (timeType != null) __obj.updateDynamic("timeType")(timeType.asInstanceOf[js.Any])
    if (vehicleSpec != null) __obj.updateDynamic("vehicleSpec")(vehicleSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectionsRequestOptions]
  }
}

