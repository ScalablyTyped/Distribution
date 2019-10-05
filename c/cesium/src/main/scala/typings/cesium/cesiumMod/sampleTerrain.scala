package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "sampleTerrain")
@js.native
object sampleTerrain extends js.Object {
  def apply(terrainProvider: TerrainProvider, level: Double, positions: js.Array[Cartographic]): js.Promise[js.Array[Cartographic]] = js.native
}

