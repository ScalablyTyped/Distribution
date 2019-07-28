package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeightmapTessellator extends js.Object

@JSImport("cesium", "HeightmapTessellator")
@js.native
object HeightmapTessellator extends js.Object {
  @js.native
  sealed trait DEFAULT_STRUCTURE extends HeightmapTessellator
  
  /* 0 */ val DEFAULT_STRUCTURE: typings.cesium.cesiumMod.HeightmapTessellator.DEFAULT_STRUCTURE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightmapTessellator with Double] = js.native
}

