package typings.cesium.global.Cesium

import typings.cesium.anon.Heightmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.HeightmapTessellator")
@js.native
object HeightmapTessellator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.cesium.mod.HeightmapTessellator & Double] = js.native
  
  /* 0 */ val DEFAULT_STRUCTURE: typings.cesium.mod.HeightmapTessellator.DEFAULT_STRUCTURE & Double = js.native
  
  def computeVertices(options: Heightmap): Unit = js.native
}
