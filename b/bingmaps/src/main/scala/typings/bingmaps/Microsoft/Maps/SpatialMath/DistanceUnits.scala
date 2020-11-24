package typings.bingmaps.Microsoft.Maps.SpatialMath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
