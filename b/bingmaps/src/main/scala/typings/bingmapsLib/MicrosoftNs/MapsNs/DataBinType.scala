package typings
package bingmapsLib.MicrosoftNs.MapsNs

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
  sealed trait circle
    extends bingmapsLib.MicrosoftNs.MapsNs.DataBinType
  
  /* Renders data bins as circles in a hexagonal grid. */
  @js.native
  sealed trait hexCircle
    extends bingmapsLib.MicrosoftNs.MapsNs.DataBinType
  
  /* Renders data bins as hexagons with a flat top edge. */
  @js.native
  sealed trait hexagon
    extends bingmapsLib.MicrosoftNs.MapsNs.DataBinType
  
  /* Renders data bins as hexagons with a pointy top corner. */
  @js.native
  sealed trait pointyHexagon
    extends bingmapsLib.MicrosoftNs.MapsNs.DataBinType
  
  /* Renders data bins as a square grid. */
  @js.native
  sealed trait square
    extends bingmapsLib.MicrosoftNs.MapsNs.DataBinType
  
  /* 0 */ val circle: circle with scala.Double = js.native
  /* 2 */ val hexCircle: hexCircle with scala.Double = js.native
  /* 1 */ val hexagon: hexagon with scala.Double = js.native
  /* 3 */ val pointyHexagon: pointyHexagon with scala.Double = js.native
  /* 4 */ val square: square with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.DataBinType with scala.Double] = js.native
}

