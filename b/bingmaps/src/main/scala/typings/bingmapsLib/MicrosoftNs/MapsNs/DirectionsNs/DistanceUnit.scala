package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DistanceUnit extends js.Object

@JSGlobal("Microsoft.Maps.Directions.DistanceUnit")
@js.native
object DistanceUnit extends js.Object {
  /** A distance in Kilometers. */
  @js.native
  sealed trait km
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.DistanceUnit
  
  /** A distance in Miles. */
  @js.native
  sealed trait miles
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.DistanceUnit
  
  /* 0 */ val km: km with scala.Double = js.native
  /* 1 */ val miles: miles with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.DistanceUnit with scala.Double] = js.native
}

