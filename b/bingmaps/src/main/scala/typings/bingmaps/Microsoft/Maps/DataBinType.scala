package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataBinType extends js.Object

@JSGlobal("Microsoft.Maps.DataBinType")
@js.native
object DataBinType extends js.Object {
  /* Renders data bins as circles in a square grid. */
  @js.native
  sealed trait circle extends DataBinType
  
  /* Renders data bins as circles in a hexagonal grid. */
  @js.native
  sealed trait hexCircle extends DataBinType
  
  /* Renders data bins as hexagons with a flat top edge. */
  @js.native
  sealed trait hexagon extends DataBinType
  
  /* Renders data bins as hexagons with a pointy top corner. */
  @js.native
  sealed trait pointyHexagon extends DataBinType
  
  /* Renders data bins as a square grid. */
  @js.native
  sealed trait square extends DataBinType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataBinType with Double] = js.native
  /* 0 */ @js.native
  object circle extends TopLevel[circle with Double]
  
  /* 2 */ @js.native
  object hexCircle extends TopLevel[hexCircle with Double]
  
  /* 1 */ @js.native
  object hexagon extends TopLevel[hexagon with Double]
  
  /* 3 */ @js.native
  object pointyHexagon extends TopLevel[pointyHexagon with Double]
  
  /* 4 */ @js.native
  object square extends TopLevel[square with Double]
  
}

