package typings.cesium.cesiumMod

import typings.cesium.Anon_CreditEllipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CesiumTerrainProvider")
@js.native
class CesiumTerrainProvider protected () extends TerrainProvider {
  def this(options: Anon_CreditEllipsoid) = this()
  var requestVertexNormals: Boolean = js.native
  var requestWaterMask: Boolean = js.native
}

