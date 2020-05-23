package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CesiumTerrainProvider")
@js.native
class CesiumTerrainProvider protected () extends TerrainProvider {
  def this(options: typings.cesium.anon.Ellipsoid) = this()
  var requestVertexNormals: Boolean = js.native
  var requestWaterMask: Boolean = js.native
}

