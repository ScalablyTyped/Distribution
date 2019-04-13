package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HeightmapTerrainData")
@js.native
class HeightmapTerrainData protected () extends js.Object {
  def this(options: cesiumLib.Anon_Buffer) = this()
  var waterMask: stdLib.Uint8Array | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement = js.native
  def createMesh(tilingScheme: TilingScheme, x: scala.Double, y: scala.Double, level: scala.Double): js.Promise[TerrainMesh] = js.native
  def interpolateHeight(rectangle: Rectangle, longitude: scala.Double, latitude: scala.Double): scala.Double = js.native
  def isChildAvailable(thisX: scala.Double, thisY: scala.Double, childX: scala.Double, childY: scala.Double): scala.Boolean = js.native
  def upsample(
    tilingScheme: TilingScheme,
    thisX: scala.Double,
    thisY: scala.Double,
    thisLevel: scala.Double,
    descendantX: scala.Double,
    descendantY: scala.Double,
    descendantLevel: scala.Double
  ): js.Promise[HeightmapTerrainData] = js.native
  def wasCreatedByUpsampling(): scala.Boolean = js.native
}

