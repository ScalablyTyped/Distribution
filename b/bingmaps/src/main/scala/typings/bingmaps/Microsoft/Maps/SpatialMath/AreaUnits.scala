package typings.bingmaps.Microsoft.Maps.SpatialMath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
