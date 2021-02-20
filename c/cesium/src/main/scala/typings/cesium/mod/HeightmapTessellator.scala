package typings.cesium.mod

import typings.cesium.anon.Heightmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeightmapTessellator extends StObject
@JSImport("cesium", "HeightmapTessellator")
@js.native
object HeightmapTessellator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightmapTessellator with Double] = js.native
  
  @js.native
  sealed trait DEFAULT_STRUCTURE extends HeightmapTessellator
  /* 0 */ val DEFAULT_STRUCTURE: typings.cesium.mod.HeightmapTessellator.DEFAULT_STRUCTURE with Double = js.native
  
  def computeVertices(options: Heightmap): js.UndefOr[scala.Nothing] = js.native
}
