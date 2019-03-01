package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileAvailability extends js.Object {
  def addAvailableTileRange(
    level: scala.Double,
    startX: scala.Double,
    startY: scala.Double,
    endX: scala.Double,
    endY: scala.Double
  ): scala.Unit
  def computeBestAvailableLevelOverRectangle(rectangle: Rectangle): scala.Double
  def computeChildMaskForTile(level: scala.Double, x: scala.Double, y: scala.Double): scala.Double
  def computeMaximumLevelAtPosition(position: Cartographic): scala.Double
  def isTileAvailable(level: scala.Double, x: scala.Double, y: scala.Double): scala.Boolean
}

object TileAvailability {
  @scala.inline
  def apply(
    addAvailableTileRange: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    computeBestAvailableLevelOverRectangle: js.Function1[Rectangle, scala.Double],
    computeChildMaskForTile: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double],
    computeMaximumLevelAtPosition: js.Function1[Cartographic, scala.Double],
    isTileAvailable: js.Function3[scala.Double, scala.Double, scala.Double, scala.Boolean]
  ): TileAvailability = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAvailableTileRange")(addAvailableTileRange)
    __obj.updateDynamic("computeBestAvailableLevelOverRectangle")(computeBestAvailableLevelOverRectangle)
    __obj.updateDynamic("computeChildMaskForTile")(computeChildMaskForTile)
    __obj.updateDynamic("computeMaximumLevelAtPosition")(computeMaximumLevelAtPosition)
    __obj.updateDynamic("isTileAvailable")(isTileAvailable)
    __obj.asInstanceOf[TileAvailability]
  }
}

