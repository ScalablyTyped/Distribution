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
  
  val AERIAL: AERIAL with java.lang.String = js.native
  val AERIAL_WITH_LABELS: AERIAL_WITH_LABELS with java.lang.String = js.native
  val COLLINS_BART: COLLINS_BART with java.lang.String = js.native
  val ORDNANCE_SURVEY: ORDNANCE_SURVEY with java.lang.String = js.native
  val ROAD: ROAD with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.BingMapsStyle with java.lang.String] = js.native
}

