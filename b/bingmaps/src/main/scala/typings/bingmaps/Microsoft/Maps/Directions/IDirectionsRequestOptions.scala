package typings.bingmaps.Microsoft.Maps.Directions

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDirectionsRequestOptions extends js.Object {
  /** The unit to use when displaying direction distances. */
  var distanceUnit: js.UndefOr[DistanceUnit] = js.native
  /** The number of routes to calculate. */
  var maxRoutes: js.UndefOr[Double] = js.native
  /** The features to avoid when calculating the route. */
  var routeAvoidance: js.UndefOr[js.Array[RouteAvoidance]] = js.native
  /** A boolean indicating whether the route line on the map can be dragged with the mouse cursor.  */
  var routeDraggable: js.UndefOr[Boolean] = js.native
  /** If multiple routes are returned, the index of the route and directions to display. */
  var routeIndex: js.UndefOr[Double] = js.native
  /** The type of directions to calculate. */
  var routeMode: js.UndefOr[RouteMode] = js.native
  /** The optimization setting for the route calculation. */
  var routeOptimization: js.UndefOr[RouteOptimization] = js.native
  /** The time to use when calculating the route. If this property is set to null, the current time is used */
  var time: js.UndefOr[Date] = js.native
  /** The type of the time specified. The default value is departure. */
  var timeType: js.UndefOr[TimeType] = js.native
  /** Specifies the vehicle attributes to use when calculating a truck route. */
  var vehicleSpec: js.UndefOr[IVehicleSpec] = js.native
}

object IDirectionsRequestOptions {
  @scala.inline
  def apply(): IDirectionsRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectionsRequestOptions]
  }
  @scala.inline
  implicit class IDirectionsRequestOptionsOps[Self <: IDirectionsRequestOptions] (val x: Self) extends AnyVal {
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
    def setDistanceUnit(value: DistanceUnit): Self = this.set("distanceUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistanceUnit: Self = this.set("distanceUnit", js.undefined)
    @scala.inline
    def setMaxRoutes(value: Double): Self = this.set("maxRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRoutes: Self = this.set("maxRoutes", js.undefined)
    @scala.inline
    def setRouteAvoidanceVarargs(value: RouteAvoidance*): Self = this.set("routeAvoidance", js.Array(value :_*))
    @scala.inline
    def setRouteAvoidance(value: js.Array[RouteAvoidance]): Self = this.set("routeAvoidance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteAvoidance: Self = this.set("routeAvoidance", js.undefined)
    @scala.inline
    def setRouteDraggable(value: Boolean): Self = this.set("routeDraggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteDraggable: Self = this.set("routeDraggable", js.undefined)
    @scala.inline
    def setRouteIndex(value: Double): Self = this.set("routeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteIndex: Self = this.set("routeIndex", js.undefined)
    @scala.inline
    def setRouteMode(value: RouteMode): Self = this.set("routeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteMode: Self = this.set("routeMode", js.undefined)
    @scala.inline
    def setRouteOptimization(value: RouteOptimization): Self = this.set("routeOptimization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteOptimization: Self = this.set("routeOptimization", js.undefined)
    @scala.inline
    def setTime(value: Date): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setTimeType(value: TimeType): Self = this.set("timeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeType: Self = this.set("timeType", js.undefined)
    @scala.inline
    def setVehicleSpec(value: IVehicleSpec): Self = this.set("vehicleSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleSpec: Self = this.set("vehicleSpec", js.undefined)
  }
  
}

