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
  
  val Feet: Feet with java.lang.String = js.native
  val Kilometers: Kilometers with java.lang.String = js.native
  val Meters: Meters with java.lang.String = js.native
  val Miles: Miles with java.lang.String = js.native
  val NauticalMiles: NauticalMiles with java.lang.String = js.native
  val Yards: Yards with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits with java.lang.String] = js.native
}

