package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AreaUnits extends js.Object

@JSGlobal("Microsoft.Maps.SpatialMath.AreaUnits")
@js.native
object AreaUnits extends js.Object {
  /** Area in Acres */
  @js.native
  sealed trait Acres
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.AreaUnits
  
  /** Area in Hectares */
  @js.native
  sealed trait Hectares
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.AreaUnits
  
  /** Area in square Feet */
  @js.native
  sealed trait SquareFeet
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.AreaUnits
  
  /** Area in square kilometers */
  @js.native
  sealed trait SquareKilometers
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.AreaUnits
  
  /** Area in square meters */
  @js.native
  sealed trait SquareMeters
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.AreaUnits
  
  /** Area in square miles */
  @js.native
  sealed trait SquareMiles
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.AreaUnits
  
  /** Area in square Yards */
  @js.native
  sealed trait SquareYards
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.AreaUnits
  
  /* 5 */ val Acres: Acres with scala.Double = js.native
  /* 6 */ val Hectares: Hectares with scala.Double = js.native
  /* 3 */ val SquareFeet: SquareFeet with scala.Double = js.native
  /* 1 */ val SquareKilometers: SquareKilometers with scala.Double = js.native
  /* 0 */ val SquareMeters: SquareMeters with scala.Double = js.native
  /* 2 */ val SquareMiles: SquareMiles with scala.Double = js.native
  /* 4 */ val SquareYards: SquareYards with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.AreaUnits with scala.Double] = js.native
}

