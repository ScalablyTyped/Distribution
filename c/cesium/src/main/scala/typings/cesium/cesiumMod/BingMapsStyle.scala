package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BingMapsStyle extends js.Object

@JSImport("cesium", "BingMapsStyle")
@js.native
object BingMapsStyle extends js.Object {
  @js.native
  sealed trait AERIAL extends BingMapsStyle
  
  @js.native
  sealed trait AERIAL_WITH_LABELS extends BingMapsStyle
  
  @js.native
  sealed trait COLLINS_BART extends BingMapsStyle
  
  @js.native
  sealed trait ORDNANCE_SURVEY extends BingMapsStyle
  
  @js.native
  sealed trait ROAD extends BingMapsStyle
  
  /* 0 */ val AERIAL: typings.cesium.cesiumMod.BingMapsStyle.AERIAL with Double = js.native
  /* 1 */ val AERIAL_WITH_LABELS: typings.cesium.cesiumMod.BingMapsStyle.AERIAL_WITH_LABELS with Double = js.native
  /* 4 */ val COLLINS_BART: typings.cesium.cesiumMod.BingMapsStyle.COLLINS_BART with Double = js.native
  /* 3 */ val ORDNANCE_SURVEY: typings.cesium.cesiumMod.BingMapsStyle.ORDNANCE_SURVEY with Double = js.native
  /* 2 */ val ROAD: typings.cesium.cesiumMod.BingMapsStyle.ROAD with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BingMapsStyle with Double] = js.native
}

