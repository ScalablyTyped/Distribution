package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.anon.Heightmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeightmapTessellator extends js.Object
@JSImport("cesium", "HeightmapTessellator")
@js.native
object HeightmapTessellator extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightmapTessellator with Double] = js.native
  
  def computeVertices(options: Heightmap): js.UndefOr[scala.Nothing] = js.native
  
  @js.native
  sealed trait DEFAULT_STRUCTURE extends HeightmapTessellator
  /* 0 */ @js.native
  object DEFAULT_STRUCTURE extends TopLevel[DEFAULT_STRUCTURE with Double]
}
