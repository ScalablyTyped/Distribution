package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

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
  sealed trait minimizeMoney
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization
  
  /** Minimize transit transfers when calculating directions. This option only affects routes with a transitRouteMode that have the culture set to ja-jp.*/
  @js.native
  sealed trait minimizeTransfers
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization
  
  /** Minimize the amount of walking when calculating directions. This option only affects routes with a transitRouteMode that have the culture set to ja-jp.*/
  @js.native
  sealed trait minimizeWalking
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization
  
  /** Calculate a route with the shortest distance. */
  @js.native
  sealed trait shortestDistance
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization
  
  /** Calculate a route the shortest time. */
  @js.native
  sealed trait shortestTime
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization
  
  /** The route is calculated to minimize the time and avoid road closures. Traffic information is not used in the calculation. */
  @js.native
  sealed trait timeAvoidClosure
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization
  
  /** The route is calculated to minimize the time and uses current traffic information. */
  @js.native
  sealed trait timeWithTraffic
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization
  
  /* 4 */ val minimizeMoney: minimizeMoney with scala.Double = js.native
  /* 5 */ val minimizeTransfers: minimizeTransfers with scala.Double = js.native
  /* 6 */ val minimizeWalking: minimizeWalking with scala.Double = js.native
  /* 1 */ val shortestDistance: shortestDistance with scala.Double = js.native
  /* 0 */ val shortestTime: shortestTime with scala.Double = js.native
  /* 3 */ val timeAvoidClosure: timeAvoidClosure with scala.Double = js.native
  /* 2 */ val timeWithTraffic: timeWithTraffic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteOptimization with scala.Double] = js.native
}

