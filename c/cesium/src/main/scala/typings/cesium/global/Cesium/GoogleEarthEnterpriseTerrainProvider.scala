package typings.cesium.global.Cesium

import typings.cesium.anon.Url
import typings.std.Uint16Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.GoogleEarthEnterpriseTerrainProvider")
@js.native
class GoogleEarthEnterpriseTerrainProvider protected ()
  extends typings.cesium.mod.GoogleEarthEnterpriseTerrainProvider {
  def this(options: Url) = this()
}
object GoogleEarthEnterpriseTerrainProvider {
  
  @JSGlobal("Cesium.GoogleEarthEnterpriseTerrainProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getEstimatedLevelZeroGeometricErrorForAHeightmap(ellipsoid: typings.cesium.mod.Ellipsoid, tileImageWidth: Double, numberOfTilesAtLevelZero: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEstimatedLevelZeroGeometricErrorForAHeightmap")(ellipsoid.asInstanceOf[js.Any], tileImageWidth.asInstanceOf[js.Any], numberOfTilesAtLevelZero.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def getRegularGridIndices(width: Double, height: Double): Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegularGridIndices")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Uint16Array]
  
  /* static member */
  @JSGlobal("Cesium.GoogleEarthEnterpriseTerrainProvider.heightmapTerrainQuality")
  @js.native
  def heightmapTerrainQuality: Double = js.native
  inline def heightmapTerrainQuality_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heightmapTerrainQuality")(x.asInstanceOf[js.Any])
}
