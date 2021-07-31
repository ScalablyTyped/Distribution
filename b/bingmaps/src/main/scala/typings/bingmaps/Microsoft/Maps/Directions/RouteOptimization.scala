package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RouteOptimization extends StObject
@JSGlobal("Microsoft.Maps.Directions.RouteOptimization")
@js.native
object RouteOptimization extends StObject {
  
  /** Minimize the cost when calculating directions. This option only affects routes with a transitRouteMode that have the culture set to ja-jp.*/
  @js.native
  sealed trait minimizeMoney
    extends StObject
       with RouteOptimization
  
  /** Minimize transit transfers when calculating directions. This option only affects routes with a transitRouteMode that have the culture set to ja-jp.*/
  @js.native
  sealed trait minimizeTransfers
    extends StObject
       with RouteOptimization
  
  /** Minimize the amount of walking when calculating directions. This option only affects routes with a transitRouteMode that have the culture set to ja-jp.*/
  @js.native
  sealed trait minimizeWalking
    extends StObject
       with RouteOptimization
  
  /** Calculate a route with the shortest distance. */
  @js.native
  sealed trait shortestDistance
    extends StObject
       with RouteOptimization
  
  /** Calculate a route the shortest time. */
  @js.native
  sealed trait shortestTime
    extends StObject
       with RouteOptimization
  
  /** The route is calculated to minimize the time and avoid road closures. Traffic information is not used in the calculation. */
  @js.native
  sealed trait timeAvoidClosure
    extends StObject
       with RouteOptimization
  
  /** The route is calculated to minimize the time and uses current traffic information. */
  @js.native
  sealed trait timeWithTraffic
    extends StObject
       with RouteOptimization
}
