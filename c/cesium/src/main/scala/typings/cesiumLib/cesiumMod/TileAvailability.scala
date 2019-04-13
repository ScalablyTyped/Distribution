package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TileAvailability")
@js.native
class TileAvailability protected () extends js.Object {
  def this(tilingScheme: TilingScheme, maximumLevel: scala.Double) = this()
  def addAvailableTileRange(
    level: scala.Double,
    startX: scala.Double,
    startY: scala.Double,
    endX: scala.Double,
    endY: scala.Double
  ): scala.Unit = js.native
  def computeBestAvailableLevelOverRectangle(rectangle: Rectangle): scala.Double = js.native
  def computeChildMaskForTile(level: scala.Double, x: scala.Double, y: scala.Double): scala.Double = js.native
  def computeMaximumLevelAtPosition(position: Cartographic): scala.Double = js.native
  def isTileAvailable(level: scala.Double, x: scala.Double, y: scala.Double): scala.Boolean = js.native
}

