package typings.bingmaps.Microsoft.Maps

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
  
  /* 0 */ val circle: typings.bingmaps.Microsoft.Maps.DataBinType.circle with Double = js.native
  /* 2 */ val hexCircle: typings.bingmaps.Microsoft.Maps.DataBinType.hexCircle with Double = js.native
  /* 1 */ val hexagon: typings.bingmaps.Microsoft.Maps.DataBinType.hexagon with Double = js.native
  /* 3 */ val pointyHexagon: typings.bingmaps.Microsoft.Maps.DataBinType.pointyHexagon with Double = js.native
  /* 4 */ val square: typings.bingmaps.Microsoft.Maps.DataBinType.square with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataBinType with Double] = js.native
}

