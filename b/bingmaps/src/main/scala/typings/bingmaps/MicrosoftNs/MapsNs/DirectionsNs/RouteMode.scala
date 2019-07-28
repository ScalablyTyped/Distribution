package typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs

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
  sealed trait driving extends RouteMode
  
  /** Transit directions are calculated. */
  @js.native
  sealed trait transit extends RouteMode
  
  /** Driving directions using truck attributes are calculationed. */
  @js.native
  sealed trait truck extends RouteMode
  
  /** Walking directions are calculated. */
  @js.native
  sealed trait walking extends RouteMode
  
  /* 0 */ val driving: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteMode.driving with Double = js.native
  /* 1 */ val transit: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteMode.transit with Double = js.native
  /* 2 */ val truck: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteMode.truck with Double = js.native
  /* 3 */ val walking: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.RouteMode.walking with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RouteMode with Double] = js.native
}

