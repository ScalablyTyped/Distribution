package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RouteMode extends js.Object

@JSGlobal("Microsoft.Maps.Directions.RouteMode")
@js.native
object RouteMode extends js.Object {
  /** Driving directions are calculated. */
  @js.native
  sealed trait driving
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteMode
  
  /** Transit directions are calculated. */
  @js.native
  sealed trait transit
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteMode
  
  /** Driving directions using truck attributes are calculationed. */
  @js.native
  sealed trait truck
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteMode
  
  /** Walking directions are calculated. */
  @js.native
  sealed trait walking
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteMode
  
  /* 0 */ val driving: driving with scala.Double = js.native
  /* 1 */ val transit: transit with scala.Double = js.native
  /* 2 */ val truck: truck with scala.Double = js.native
  /* 3 */ val walking: walking with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteMode with scala.Double] = js.native
}

