package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TerrainProvider")
@js.native
abstract class TerrainProvider () extends js.Object {
  var availability: TileAvailability = js.native
  var credit: Credit = js.native
  var errorEvent: Event[js.Array[_]] = js.native
  var hasVertexNormals: scala.Boolean = js.native
  var hasWaterMask: scala.Boolean = js.native
  var ready: scala.Boolean = js.native
  val readyPromise: js.Promise[scala.Boolean] = js.native
  var tilingScheme: TilingScheme = js.native
  def getLevelMaximumGeometricError(level: scala.Double): scala.Double = js.native
  def getTileDataAvailable(x: scala.Double, y: scala.Double, level: scala.Double): scala.Boolean = js.native
  def requestTileGeometry(x: scala.Double, y: scala.Double, level: scala.Double): js.Promise[TerrainData] = js.native
  def requestTileGeometry(x: scala.Double, y: scala.Double, level: scala.Double, throttleRequests: scala.Boolean): js.Promise[TerrainData] = js.native
}

/* static members */
@JSImport("cesium", "TerrainProvider")
@js.native
object TerrainProvider extends js.Object {
  var heightmapTerrainQuality: scala.Double = js.native
  def getEstimatedLevelZeroGeometricErrorForAHeightmap(
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    tileImageWidth: scala.Double,
    numberOfTilesAtLevelZero: scala.Double
  ): scala.Double = js.native
  def getRegularGridIndices(width: scala.Double, height: scala.Double): stdLib.Uint16Array = js.native
}

