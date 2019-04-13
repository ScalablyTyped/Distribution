package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Globe")
@js.native
class Globe () extends js.Object {
  def this(ellipsoid: Ellipsoid) = this()
  var baseColor: Color = js.native
  var depthTestAgainstTerrain: scala.Boolean = js.native
  var ellipsoid: Ellipsoid = js.native
  var enableLighting: scala.Boolean = js.native
  var imageryLayers: ImageryLayerCollection = js.native
  var lightingFadeInDistance: scala.Double = js.native
  var lightingFadeOutDistance: scala.Double = js.native
  var maximumScreenSpaceError: scala.Double = js.native
  var northPoleColor: Cartesian3 = js.native
  var oceanNormalMapUrl: java.lang.String = js.native
  var show: scala.Boolean = js.native
  var showWaterEffect: scala.Boolean = js.native
  var southPoleColor: Cartesian3 = js.native
  var terrainProvider: TerrainProvider = js.native
  var tileCacheSize: scala.Double = js.native
  def destroy(): scala.Unit = js.native
  def getHeight(cartographic: Cartographic): scala.Double = js.native
  def isDestroyed(): scala.Boolean = js.native
  def pick(ray: Ray, scene: Scene): Cartesian3 = js.native
  def pick(ray: Ray, scene: Scene, result: Cartesian3): Cartesian3 = js.native
}

