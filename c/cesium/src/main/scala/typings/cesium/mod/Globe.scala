package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Globe")
@js.native
class Globe () extends js.Object {
  def this(ellipsoid: Ellipsoid) = this()
  
  var atmosphereBrightnessShift: Double = js.native
  
  var atmosphereHueShift: Double = js.native
  
  var atmosphereSaturationShift: Double = js.native
  
  var baseColor: Color = js.native
  
  var cartographicLimitRectangle: Rectangle = js.native
  
  var depthTestAgainstTerrain: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  var dynamicAtmosphereLighting: Boolean = js.native
  
  var dynamicAtmosphereLightingFromSun: Boolean = js.native
  
  var ellipsoid: Ellipsoid = js.native
  
  var enableLighting: Boolean = js.native
  
  var fillHighlightColor: Color = js.native
  
  def getHeight(cartographic: Cartographic): Double = js.native
  
  var imageryLayers: ImageryLayerCollection = js.native
  
  val imageryLayersUpdatedEvent: Event[js.Array[_]] = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var lightingFadeInDistance: Double = js.native
  
  var lightingFadeOutDistance: Double = js.native
  
  var loadingDescendantLimit: Double = js.native
  
  var material: Material = js.native
  
  var maximumScreenSpaceError: Double = js.native
  
  var nightFadeInDistance: Double = js.native
  
  var nightFadeOutDistance: Double = js.native
  
  var northPoleColor: Cartesian3 = js.native
  
  var oceanNormalMapUrl: String = js.native
  
  def pick(ray: Ray, scene: Scene): Cartesian3 = js.native
  def pick(ray: Ray, scene: Scene, result: Cartesian3): Cartesian3 = js.native
  
  var preloadAncestors: Boolean = js.native
  
  var preloadSiblings: Boolean = js.native
  
  var show: Boolean = js.native
  
  var showGroundAtmosphere: Boolean = js.native
  
  var showSkirts: Boolean = js.native
  
  var showWaterEffect: Boolean = js.native
  
  var southPoleColor: Cartesian3 = js.native
  
  var terrainProvider: TerrainProvider = js.native
  
  val terrainProviderChanged: Event[js.Array[TerrainProvider]] = js.native
  
  var tileCacheSize: Double = js.native
  
  var tileLoadProgressEvent: Event[js.Array[Double]] = js.native
  
  val tilesLoaded: Boolean = js.native
}
