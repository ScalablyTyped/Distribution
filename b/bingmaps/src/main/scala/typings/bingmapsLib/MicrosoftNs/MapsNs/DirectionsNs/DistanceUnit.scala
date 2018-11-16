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
  
  val km: km with java.lang.String = js.native
  val miles: miles with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.DistanceUnit with java.lang.String] = js.native
}

