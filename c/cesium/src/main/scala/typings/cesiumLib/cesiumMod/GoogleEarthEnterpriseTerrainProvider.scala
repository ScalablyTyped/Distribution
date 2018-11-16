package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GoogleEarthEnterpriseTerrainProvider")
@js.native
class GoogleEarthEnterpriseTerrainProvider protected ()
  extends cesiumLib.cesiumMod.CesiumNs.GoogleEarthEnterpriseTerrainProvider {
  def this(options: cesiumLib.Anon_Metadata) = this()
}

@JSImport("cesium", "GoogleEarthEnterpriseTerrainProvider")
@js.native
object GoogleEarthEnterpriseTerrainProvider extends js.Object {
  var heightmapTerrainQuality: scala.Double = js.native
  def getEstimatedLevelZeroGeometricErrorForAHeightmap(
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    tileImageWidth: scala.Double,
    numberOfTilesAtLevelZero: scala.Double
  ): scala.Double = js.native
  def getRegularGridIndices(width: scala.Double, height: scala.Double): stdLib.Uint16Array = js.native
}

