package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RouteAvoidance extends js.Object

@JSGlobal("Microsoft.Maps.Directions.RouteAvoidance")
@js.native
object RouteAvoidance extends js.Object {
  /** Avoid using airlines when calculating the route. This option only affects routes with a transitRouteMode that have the culture set to ja-jp. */
  @js.native
  sealed trait avoidAirline
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance
  
  /** Avoid using bullet trains when calculating the route. This option only affects routes with a transitRouteMode that have the culture set to ja-jp. */
  @js.native
  sealed trait avoidBulletTrain
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance
  
  /** Avoid using express trains when calculating the route. This option only affects routes with a transitRouteMode that have the culture set to ja-jp. */
  @js.native
  sealed trait avoidExpressTrain
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance
  
  /** Avoid using limited access highways when calculating the route. */
  @js.native
  sealed trait avoidHighways
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance
  
  /** Avoid using roads with tolls when calculating the route. */
  @js.native
  sealed trait avoidToll
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance
  
  /** Reduce the use of limited access highways when calculating the route. */
  @js.native
  sealed trait minimizeHighways
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance
  
  /** Reduce the use of roads with tolls when calculating the route. */
  @js.native
  sealed trait minimizeToll
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance
  
  /** Calculate the best route using any travel option available. */
  @js.native
  sealed trait none
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance
  
  /* 32 */ val avoidAirline: avoidAirline with scala.Double = js.native
  /* 64 */ val avoidBulletTrain: avoidBulletTrain with scala.Double = js.native
  /* 16 */ val avoidExpressTrain: avoidExpressTrain with scala.Double = js.native
  /* 4 */ val avoidHighways: avoidHighways with scala.Double = js.native
  /* 8 */ val avoidToll: avoidToll with scala.Double = js.native
  /* 1 */ val minimizeHighways: minimizeHighways with scala.Double = js.native
  /* 2 */ val minimizeToll: minimizeToll with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance with scala.Double] = js.native
}

