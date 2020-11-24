package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "sampleTerrain")
@js.native
object sampleTerrain extends js.Object {
  
  def apply(terrainProvider: TerrainProvider, level: Double, positions: js.Array[Cartographic]): js.Promise[js.Array[Cartographic]] = js.native
}
