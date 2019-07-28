package typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RouteOptimization extends js.Object

@JSGlobal("Microsoft.Maps.Directions.RouteOptimization")
@js.native
object RouteOptimization extends js.Object {
  /** Minimize the cost when calculating directions. This option only affects routes with a transitRouteMode that have the culture set to ja-jp.*/
  @js.native
  sealed trait minimizeMoney extends RouteOptimization
  
  /** Minimize transit transfers when calculating directions. This option only affects routes with a transitRouteMode that have the culture set to ja-jp.*/
  @js.native
  sealed trait minimizeTransfers extends RouteOptimization
  
  /** Minimize the amount of walking when calculating directions. This option only affects routes with a transitRouteMode that have the culture set to ja-jp.*/
  @js.native
  sealed trait minimizeWalking extends RouteOptimization
  
  /** Calculate a route with the shortest distance. */
  @js.native
  sealed trait shortestDistance extends RouteOptimization
  
  /** Calculate a route the shortest time. */
  @js.native
  sealed trait shortestTime extends RouteOptimization
  
  /** The route is calculated to minimize the time and avoid road closures. Traffic information is not used in the calculation. */
  @js.native
  sealed trait timeAvoidClosure extends RouteOptimization
  
  /** The route is calculated to minimize the time and uses current traffic information. */
  @js.native
  sealed trait timeWithTraffic extends RouteOptimization
  
  /* 4 */ val minimizeMoney: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization.minimizeMoney with Double = js.native
  /* 5 */ val minimizeTransfers: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization.minimizeTransfers with Double = js.native
  /* 6 */ val minimizeWalking: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization.minimizeWalking with Double = js.native
  /* 1 */ val shortestDistance: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization.shortestDistance with Double = js.native
  /* 0 */ val shortestTime: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization.shortestTime with Double = js.native
  /* 3 */ val timeAvoidClosure: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization.timeAvoidClosure with Double = js.native
  /* 2 */ val timeWithTraffic: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization.timeWithTraffic with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RouteOptimization with Double] = js.native
}

