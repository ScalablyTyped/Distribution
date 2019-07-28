package typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs

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
  sealed trait avoidAirline extends RouteAvoidance
  
  /** Avoid using bullet trains when calculating the route. This option only affects routes with a transitRouteMode that have the culture set to ja-jp. */
  @js.native
  sealed trait avoidBulletTrain extends RouteAvoidance
  
  /** Avoid using express trains when calculating the route. This option only affects routes with a transitRouteMode that have the culture set to ja-jp. */
  @js.native
  sealed trait avoidExpressTrain extends RouteAvoidance
  
  /** Avoid using limited access highways when calculating the route. */
  @js.native
  sealed trait avoidHighways extends RouteAvoidance
  
  /** Avoid using roads with tolls when calculating the route. */
  @js.native
  sealed trait avoidToll extends RouteAvoidance
  
  /** Reduce the use of limited access highways when calculating the route. */
  @js.native
  sealed trait minimizeHighways extends RouteAvoidance
  
  /** Reduce the use of roads with tolls when calculating the route. */
  @js.native
  sealed trait minimizeToll extends RouteAvoidance
  
  /** Calculate the best route using any travel option available. */
  @js.native
  sealed trait none extends RouteAvoidance
  
  /* 32 */ val avoidAirline: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance.avoidAirline with Double = js.native
  /* 64 */ val avoidBulletTrain: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance.avoidBulletTrain with Double = js.native
  /* 16 */ val avoidExpressTrain: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance.avoidExpressTrain with Double = js.native
  /* 4 */ val avoidHighways: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance.avoidHighways with Double = js.native
  /* 8 */ val avoidToll: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance.avoidToll with Double = js.native
  /* 1 */ val minimizeHighways: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance.minimizeHighways with Double = js.native
  /* 2 */ val minimizeToll: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance.minimizeToll with Double = js.native
  /* 0 */ val none: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteAvoidance.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RouteAvoidance with Double] = js.native
}

