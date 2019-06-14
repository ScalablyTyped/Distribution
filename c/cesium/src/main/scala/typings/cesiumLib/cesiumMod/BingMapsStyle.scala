package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BingMapsStyle extends js.Object

@JSImport("cesium", "BingMapsStyle")
@js.native
object BingMapsStyle extends js.Object {
  @js.native
  sealed trait AERIAL
    extends cesiumLib.cesiumMod.BingMapsStyle
  
  @js.native
  sealed trait AERIAL_WITH_LABELS
    extends cesiumLib.cesiumMod.BingMapsStyle
  
  @js.native
  sealed trait COLLINS_BART
    extends cesiumLib.cesiumMod.BingMapsStyle
  
  @js.native
  sealed trait ORDNANCE_SURVEY
    extends cesiumLib.cesiumMod.BingMapsStyle
  
  @js.native
  sealed trait ROAD
    extends cesiumLib.cesiumMod.BingMapsStyle
  
  /* 0 */ val AERIAL: AERIAL with scala.Double = js.native
  /* 1 */ val AERIAL_WITH_LABELS: AERIAL_WITH_LABELS with scala.Double = js.native
  /* 4 */ val COLLINS_BART: COLLINS_BART with scala.Double = js.native
  /* 3 */ val ORDNANCE_SURVEY: ORDNANCE_SURVEY with scala.Double = js.native
  /* 2 */ val ROAD: ROAD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.BingMapsStyle with scala.Double] = js.native
}

