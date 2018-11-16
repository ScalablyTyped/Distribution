package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TileAvailability")
@js.native
class TileAvailability protected ()
  extends cesiumLib.cesiumMod.CesiumNs.TileAvailability {
  def this(tilingScheme: cesiumLib.cesiumMod.CesiumNs.TilingScheme, maximumLevel: scala.Double) = this()
  /* CompleteClass */
  override def addAvailableTileRange(
    level: scala.Double,
    startX: scala.Double,
    startY: scala.Double,
    endX: scala.Double,
    endY: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def computeBestAvailableLevelOverRectangle(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): scala.Double = js.native
  /* CompleteClass */
  override def computeChildMaskForTile(level: scala.Double, x: scala.Double, y: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def computeMaximumLevelAtPosition(position: cesiumLib.cesiumMod.CesiumNs.Cartographic): scala.Double = js.native
  /* CompleteClass */
  override def isTileAvailable(level: scala.Double, x: scala.Double, y: scala.Double): scala.Boolean = js.native
}

