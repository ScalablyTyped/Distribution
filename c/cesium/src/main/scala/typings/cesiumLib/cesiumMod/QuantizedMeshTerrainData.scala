package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "QuantizedMeshTerrainData")
@js.native
class QuantizedMeshTerrainData protected ()
  extends cesiumLib.cesiumMod.CesiumNs.QuantizedMeshTerrainData {
  def this(options: cesiumLib.Anon_CreatedByUpsamplingBoundingSphere) = this()
  /* CompleteClass */
  override var waterMask: stdLib.Uint8Array | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement = js.native
  /* CompleteClass */
  override def createMesh(
    tilingScheme: cesiumLib.cesiumMod.CesiumNs.TilingScheme,
    x: scala.Double,
    y: scala.Double,
    level: scala.Double
  ): stdLib.Promise[cesiumLib.cesiumMod.CesiumNs.TerrainMesh] = js.native
  /* CompleteClass */
  override def interpolateHeight(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle, longitude: scala.Double, latitude: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def isChildAvailable(thisX: scala.Double, thisY: scala.Double, childX: scala.Double, childY: scala.Double): scala.Boolean = js.native
  /* CompleteClass */
  override def upsample(
    tilingScheme: cesiumLib.cesiumMod.CesiumNs.TilingScheme,
    thisX: scala.Double,
    thisY: scala.Double,
    thisLevel: scala.Double,
    descendantX: scala.Double,
    descendantY: scala.Double,
    descendantLevel: scala.Double
  ): stdLib.Promise[cesiumLib.cesiumMod.CesiumNs.QuantizedMeshTerrainData] = js.native
  /* CompleteClass */
  override def wasCreatedByUpsampling(): scala.Boolean = js.native
}

