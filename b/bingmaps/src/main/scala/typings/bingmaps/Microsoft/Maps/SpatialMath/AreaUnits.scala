package typings.bingmaps.Microsoft.Maps.SpatialMath

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.Acres
import typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.Hectares
import typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareFeet
import typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareKilometers
import typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareMeters
import typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareMiles
import typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareYards
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
  sealed trait Acres extends AreaUnits
  
  /** Area in Hectares */
  @js.native
  sealed trait Hectares extends AreaUnits
  
  /** Area in square Feet */
  @js.native
  sealed trait SquareFeet extends AreaUnits
  
  /** Area in square kilometers */
  @js.native
  sealed trait SquareKilometers extends AreaUnits
  
  /** Area in square meters */
  @js.native
  sealed trait SquareMeters extends AreaUnits
  
  /** Area in square miles */
  @js.native
  sealed trait SquareMiles extends AreaUnits
  
  /** Area in square Yards */
  @js.native
  sealed trait SquareYards extends AreaUnits
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AreaUnits with Double] = js.native
  /* 5 */ @js.native
  object Acres extends TopLevel[Acres with Double]
  
  /* 6 */ @js.native
  object Hectares extends TopLevel[Hectares with Double]
  
  /* 3 */ @js.native
  object SquareFeet extends TopLevel[SquareFeet with Double]
  
  /* 1 */ @js.native
  object SquareKilometers extends TopLevel[SquareKilometers with Double]
  
  /* 0 */ @js.native
  object SquareMeters extends TopLevel[SquareMeters with Double]
  
  /* 2 */ @js.native
  object SquareMiles extends TopLevel[SquareMiles with Double]
  
  /* 4 */ @js.native
  object SquareYards extends TopLevel[SquareYards with Double]
  
}

