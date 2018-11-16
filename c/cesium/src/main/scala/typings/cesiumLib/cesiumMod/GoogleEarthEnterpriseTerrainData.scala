package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GoogleEarthEnterpriseTerrainData")
@js.native
class GoogleEarthEnterpriseTerrainData protected ()
  extends cesiumLib.cesiumMod.CesiumNs.GoogleEarthEnterpriseTerrainData {
  def this(options: cesiumLib.Anon_CreatedByUpsamplingCredits) = this()
  /* CompleteClass */
  override var credits: js.Array[cesiumLib.cesiumMod.CesiumNs.Credit] = js.native
  /* CompleteClass */
  override var waterMask: stdLib.Uint8Array | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement = js.native
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
  ): stdLib.Promise[cesiumLib.cesiumMod.CesiumNs.TerrainData] = js.native
  /* CompleteClass */
  override def wasCreatedByUpsampling(): scala.Boolean = js.native
}

