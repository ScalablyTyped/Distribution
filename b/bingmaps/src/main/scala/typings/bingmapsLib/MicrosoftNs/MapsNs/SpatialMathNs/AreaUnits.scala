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
  
  val Acres: Acres with java.lang.String = js.native
  val Hectares: Hectares with java.lang.String = js.native
  val SquareFeet: SquareFeet with java.lang.String = js.native
  val SquareKilometers: SquareKilometers with java.lang.String = js.native
  val SquareMeters: SquareMeters with java.lang.String = js.native
  val SquareMiles: SquareMiles with java.lang.String = js.native
  val SquareYards: SquareYards with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.AreaUnits with java.lang.String] = js.native
}

