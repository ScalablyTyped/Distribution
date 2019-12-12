package typings.bingmaps.Microsoft.Maps.SpatialMath

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Feet
import typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Kilometers
import typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Meters
import typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Miles
import typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.NauticalMiles
import typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Yards
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DistanceUnits with Double] = js.native
  /* 3 */ @js.native
  object Feet extends TopLevel[Feet with Double]
  
  /* 1 */ @js.native
  object Kilometers extends TopLevel[Kilometers with Double]
  
  /* 0 */ @js.native
  object Meters extends TopLevel[Meters with Double]
  
  /* 2 */ @js.native
  object Miles extends TopLevel[Miles with Double]
  
  /* 5 */ @js.native
  object NauticalMiles extends TopLevel[NauticalMiles with Double]
  
  /* 4 */ @js.native
  object Yards extends TopLevel[Yards with Double]
  
}

