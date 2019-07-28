package typings.cesium.cesiumMod

import typings.cesium.Anon_Buffer
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HeightmapTerrainData")
@js.native
class HeightmapTerrainData protected () extends js.Object {
  def this(options: Anon_Buffer) = this()
  var waterMask: Uint8Array | HTMLImageElement | HTMLCanvasElement = js.native
  def createMesh(tilingScheme: TilingScheme, x: Double, y: Double, level: Double): js.Promise[TerrainMesh] = js.native
  def interpolateHeight(rectangle: Rectangle, longitude: Double, latitude: Double): Double = js.native
  def isChildAvailable(thisX: Double, thisY: Double, childX: Double, childY: Double): Boolean = js.native
  def upsample(
    tilingScheme: TilingScheme,
    thisX: Double,
    thisY: Double,
    thisLevel: Double,
    descendantX: Double,
    descendantY: Double,
    descendantLevel: Double
  ): js.Promise[HeightmapTerrainData] = js.native
  def wasCreatedByUpsampling(): Boolean = js.native
}

