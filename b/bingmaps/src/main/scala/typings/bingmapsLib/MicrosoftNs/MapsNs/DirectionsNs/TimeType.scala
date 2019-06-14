package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeType extends js.Object

@JSGlobal("Microsoft.Maps.Directions.TimeType")
@js.native
object TimeType extends js.Object {
  /** The dateTime parameter contains the desired arrival time for a transit request. */
  @js.native
  sealed trait arrival
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.TimeType
  
  /** The dateTime parameter contains the desired departure time for a transit request. */
  @js.native
  sealed trait departure
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.TimeType
  
  /** The dateTime parameter should be ignored and the first available transit taken. */
  @js.native
  sealed trait firstAvailable
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.TimeType
  
  /** The dateTime parameter contains the latest departure time available for a transit request.  */
  @js.native
  sealed trait lastAvailable
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.TimeType
  
  /* 0 */ val arrival: arrival with scala.Double = js.native
  /* 1 */ val departure: departure with scala.Double = js.native
  /* 2 */ val firstAvailable: firstAvailable with scala.Double = js.native
  /* 3 */ val lastAvailable: lastAvailable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.TimeType with scala.Double] = js.native
}

