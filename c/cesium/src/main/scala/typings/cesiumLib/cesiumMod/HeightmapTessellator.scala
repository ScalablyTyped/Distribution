package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeightmapTessellator extends js.Object

@JSImport("cesium", "HeightmapTessellator")
@js.native
object HeightmapTessellator extends js.Object {
  @js.native
  sealed trait DEFAULT_STRUCTURE
    extends cesiumLib.cesiumMod.HeightmapTessellator
  
  /* 0 */ val DEFAULT_STRUCTURE: DEFAULT_STRUCTURE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.HeightmapTessellator with scala.Double] = js.native
}

