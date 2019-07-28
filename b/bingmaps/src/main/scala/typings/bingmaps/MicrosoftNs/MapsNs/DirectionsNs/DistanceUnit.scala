package typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs

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
  sealed trait km extends DistanceUnit
  
  /** A distance in Miles. */
  @js.native
  sealed trait miles extends DistanceUnit
  
  /* 0 */ val km: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.DistanceUnit.km with Double = js.native
  /* 1 */ val miles: typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs.DistanceUnit.miles with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DistanceUnit with Double] = js.native
}

