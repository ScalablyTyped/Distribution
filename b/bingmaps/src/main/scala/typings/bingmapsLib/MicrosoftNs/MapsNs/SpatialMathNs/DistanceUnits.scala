package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DistanceUnits extends js.Object

@JSGlobal("Microsoft.Maps.SpatialMath.DistanceUnits")
@js.native
object DistanceUnits extends js.Object {
  /** A distance in Feet */
  @js.native
  sealed trait Feet
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  
  /** A distance in kilometers */
  @js.native
  sealed trait Kilometers
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  
  /** A distance in meters */
  @js.native
  sealed trait Meters
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  
  /** A distance in miles */
  @js.native
  sealed trait Miles
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  
  /** A distance in Nautical Miles */
  @js.native
  sealed trait NauticalMiles
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  
  /** A distance in Yards */
  @js.native
  sealed trait Yards
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  
  /* 3 */ val Feet: Feet with scala.Double = js.native
  /* 1 */ val Kilometers: Kilometers with scala.Double = js.native
  /* 0 */ val Meters: Meters with scala.Double = js.native
  /* 2 */ val Miles: Miles with scala.Double = js.native
  /* 5 */ val NauticalMiles: NauticalMiles with scala.Double = js.native
  /* 4 */ val Yards: Yards with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits with scala.Double] = js.native
}

