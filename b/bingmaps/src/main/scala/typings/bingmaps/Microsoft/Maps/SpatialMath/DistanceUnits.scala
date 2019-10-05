package typings.bingmaps.Microsoft.Maps.SpatialMath

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
  sealed trait Feet extends DistanceUnits
  
  /** A distance in kilometers */
  @js.native
  sealed trait Kilometers extends DistanceUnits
  
  /** A distance in meters */
  @js.native
  sealed trait Meters extends DistanceUnits
  
  /** A distance in miles */
  @js.native
  sealed trait Miles extends DistanceUnits
  
  /** A distance in Nautical Miles */
  @js.native
  sealed trait NauticalMiles extends DistanceUnits
  
  /** A distance in Yards */
  @js.native
  sealed trait Yards extends DistanceUnits
  
  /* 3 */ val Feet: typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Feet with Double = js.native
  /* 1 */ val Kilometers: typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Kilometers with Double = js.native
  /* 0 */ val Meters: typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Meters with Double = js.native
  /* 2 */ val Miles: typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Miles with Double = js.native
  /* 5 */ val NauticalMiles: typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.NauticalMiles with Double = js.native
  /* 4 */ val Yards: typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Yards with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DistanceUnits with Double] = js.native
}

