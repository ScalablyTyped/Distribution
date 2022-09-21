package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDirectionsRequestOptions extends StObject {
  
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
  var time: js.UndefOr[js.Date] = js.undefined
  
  /** The type of the time specified. The default value is departure. */
  var timeType: js.UndefOr[TimeType] = js.undefined
  
  /** Specifies the vehicle attributes to use when calculating a truck route. */
  var vehicleSpec: js.UndefOr[IVehicleSpec] = js.undefined
}
object IDirectionsRequestOptions {
  
  inline def apply(): IDirectionsRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectionsRequestOptions]
  }
  
  extension [Self <: IDirectionsRequestOptions](x: Self) {
    
    inline def setDistanceUnit(value: DistanceUnit): Self = StObject.set(x, "distanceUnit", value.asInstanceOf[js.Any])
    
    inline def setDistanceUnitUndefined: Self = StObject.set(x, "distanceUnit", js.undefined)
    
    inline def setMaxRoutes(value: Double): Self = StObject.set(x, "maxRoutes", value.asInstanceOf[js.Any])
    
    inline def setMaxRoutesUndefined: Self = StObject.set(x, "maxRoutes", js.undefined)
    
    inline def setRouteAvoidance(value: js.Array[RouteAvoidance]): Self = StObject.set(x, "routeAvoidance", value.asInstanceOf[js.Any])
    
    inline def setRouteAvoidanceUndefined: Self = StObject.set(x, "routeAvoidance", js.undefined)
    
    inline def setRouteAvoidanceVarargs(value: RouteAvoidance*): Self = StObject.set(x, "routeAvoidance", js.Array(value*))
    
    inline def setRouteDraggable(value: Boolean): Self = StObject.set(x, "routeDraggable", value.asInstanceOf[js.Any])
    
    inline def setRouteDraggableUndefined: Self = StObject.set(x, "routeDraggable", js.undefined)
    
    inline def setRouteIndex(value: Double): Self = StObject.set(x, "routeIndex", value.asInstanceOf[js.Any])
    
    inline def setRouteIndexUndefined: Self = StObject.set(x, "routeIndex", js.undefined)
    
    inline def setRouteMode(value: RouteMode): Self = StObject.set(x, "routeMode", value.asInstanceOf[js.Any])
    
    inline def setRouteModeUndefined: Self = StObject.set(x, "routeMode", js.undefined)
    
    inline def setRouteOptimization(value: RouteOptimization): Self = StObject.set(x, "routeOptimization", value.asInstanceOf[js.Any])
    
    inline def setRouteOptimizationUndefined: Self = StObject.set(x, "routeOptimization", js.undefined)
    
    inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeType(value: TimeType): Self = StObject.set(x, "timeType", value.asInstanceOf[js.Any])
    
    inline def setTimeTypeUndefined: Self = StObject.set(x, "timeType", js.undefined)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setVehicleSpec(value: IVehicleSpec): Self = StObject.set(x, "vehicleSpec", value.asInstanceOf[js.Any])
    
    inline def setVehicleSpecUndefined: Self = StObject.set(x, "vehicleSpec", js.undefined)
  }
}
