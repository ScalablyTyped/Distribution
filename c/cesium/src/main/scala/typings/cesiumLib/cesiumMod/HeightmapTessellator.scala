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
  
  val DEFAULT_STRUCTURE: DEFAULT_STRUCTURE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.HeightmapTessellator with java.lang.String] = js.native
}

