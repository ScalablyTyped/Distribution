package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var ellipsoid: Ellipsoid = js.native
  var enableLighting: Boolean = js.native
  var imageryLayers: ImageryLayerCollection = js.native
  var lightingFadeInDistance: Double = js.native
  var lightingFadeOutDistance: Double = js.native
  var maximumScreenSpaceError: Double = js.native
  var northPoleColor: Cartesian3 = js.native
  var oceanNormalMapUrl: String = js.native
  var show: Boolean = js.native
  var showWaterEffect: Boolean = js.native
  var southPoleColor: Cartesian3 = js.native
  var terrainProvider: TerrainProvider = js.native
  var tileCacheSize: Double = js.native
  def destroy(): Unit = js.native
  def getHeight(cartographic: Cartographic): Double = js.native
  def isDestroyed(): Boolean = js.native
  def pick(ray: Ray, scene: Scene): Cartesian3 = js.native
  def pick(ray: Ray, scene: Scene, result: Cartesian3): Cartesian3 = js.native
}

