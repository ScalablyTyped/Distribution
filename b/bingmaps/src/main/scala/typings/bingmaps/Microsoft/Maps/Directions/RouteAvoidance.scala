package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RouteAvoidance with Double] = js.native
  /* 32 */ @js.native
  object avoidAirline extends TopLevel[avoidAirline with Double]
  
  /* 64 */ @js.native
  object avoidBulletTrain extends TopLevel[avoidBulletTrain with Double]
  
  /* 16 */ @js.native
  object avoidExpressTrain extends TopLevel[avoidExpressTrain with Double]
  
  /* 4 */ @js.native
  object avoidHighways extends TopLevel[avoidHighways with Double]
  
  /* 8 */ @js.native
  object avoidToll extends TopLevel[avoidToll with Double]
  
  /* 1 */ @js.native
  object minimizeHighways extends TopLevel[minimizeHighways with Double]
  
  /* 2 */ @js.native
  object minimizeToll extends TopLevel[minimizeToll with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

