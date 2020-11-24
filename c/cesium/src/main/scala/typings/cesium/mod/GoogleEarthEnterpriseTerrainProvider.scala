package typings.cesium.mod

import typings.cesium.anon.Url
import typings.std.Request
import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GoogleEarthEnterpriseTerrainProvider")
@js.native
class GoogleEarthEnterpriseTerrainProvider protected () extends js.Object {
  def this(options: Url) = this()
  
  var availability: TileAvailability = js.native
  
  var credit: Credit = js.native
  
  var errorEvent: Event[js.Array[_]] = js.native
  
  def getLevelMaximumGeometricError(level: Double): Double = js.native
  
  def getTileDataAvailable(x: Double, y: Double, level: Double): Boolean = js.native
  
  var hasVertexNormals: Boolean = js.native
  
  var hasWaterMask: Boolean = js.native
  
  var ready: Boolean = js.native
  
  val readyPromise: js.Promise[Boolean] = js.native
  
  def requestTileGeometry(x: Double, y: Double, level: Double): js.Promise[TerrainData] = js.native
  def requestTileGeometry(x: Double, y: Double, level: Double, request: Request): js.Promise[TerrainData] = js.native
  
  var tilingScheme: TilingScheme = js.native
}
/* static members */
@JSImport("cesium", "GoogleEarthEnterpriseTerrainProvider")
@js.native
object GoogleEarthEnterpriseTerrainProvider extends js.Object {
  
  def getEstimatedLevelZeroGeometricErrorForAHeightmap(ellipsoid: Ellipsoid, tileImageWidth: Double, numberOfTilesAtLevelZero: Double): Double = js.native
  
  def getRegularGridIndices(width: Double, height: Double): Uint16Array = js.native
  
  var heightmapTerrainQuality: Double = js.native
}
