package typings.cesium.mod

import typings.cesium.AnonCreditEllipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CesiumTerrainProvider")
@js.native
class CesiumTerrainProvider protected () extends TerrainProvider {
  def this(options: AnonCreditEllipsoid) = this()
  var requestVertexNormals: Boolean = js.native
  var requestWaterMask: Boolean = js.native
}

