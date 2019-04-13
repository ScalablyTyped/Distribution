package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CesiumTerrainProvider")
@js.native
class CesiumTerrainProvider protected () extends TerrainProvider {
  def this(options: cesiumLib.Anon_CreditEllipsoid) = this()
  var requestVertexNormals: scala.Boolean = js.native
  var requestWaterMask: scala.Boolean = js.native
}

