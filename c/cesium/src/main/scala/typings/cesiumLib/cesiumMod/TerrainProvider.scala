package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TerrainProvider")
@js.native
abstract class TerrainProvider ()
  extends cesiumLib.cesiumMod.CesiumNs.TerrainProvider

@JSImport("cesium", "TerrainProvider")
@js.native
object TerrainProvider extends js.Object {
  var heightmapTerrainQuality: scala.Double = js.native
  def getEstimatedLevelZeroGeometricErrorForAHeightmap(
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    tileImageWidth: scala.Double,
    numberOfTilesAtLevelZero: scala.Double
  ): scala.Double = js.native
  def getRegularGridIndices(width: scala.Double, height: scala.Double): stdLib.Uint16Array = js.native
}

