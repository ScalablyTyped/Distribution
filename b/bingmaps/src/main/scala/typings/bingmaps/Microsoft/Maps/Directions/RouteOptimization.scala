package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RouteOptimization with Double] = js.native
  /* 4 */ @js.native
  object minimizeMoney extends TopLevel[minimizeMoney with Double]
  
  /* 5 */ @js.native
  object minimizeTransfers extends TopLevel[minimizeTransfers with Double]
  
  /* 6 */ @js.native
  object minimizeWalking extends TopLevel[minimizeWalking with Double]
  
  /* 1 */ @js.native
  object shortestDistance extends TopLevel[shortestDistance with Double]
  
  /* 0 */ @js.native
  object shortestTime extends TopLevel[shortestTime with Double]
  
  /* 3 */ @js.native
  object timeAvoidClosure extends TopLevel[timeAvoidClosure with Double]
  
  /* 2 */ @js.native
  object timeWithTraffic extends TopLevel[timeWithTraffic with Double]
  
}

