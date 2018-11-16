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
  
  val driving: driving with java.lang.String = js.native
  val transit: transit with java.lang.String = js.native
  val truck: truck with java.lang.String = js.native
  val walking: walking with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteMode with java.lang.String] = js.native
}

