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
    addAvailableTileRange: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    computeBestAvailableLevelOverRectangle: Rectangle => scala.Double,
    computeChildMaskForTile: (scala.Double, scala.Double, scala.Double) => scala.Double,
    computeMaximumLevelAtPosition: Cartographic => scala.Double,
    isTileAvailable: (scala.Double, scala.Double, scala.Double) => scala.Boolean
  ): TileAvailability = {
    val __obj = js.Dynamic.literal(addAvailableTileRange = js.Any.fromFunction5(addAvailableTileRange), computeBestAvailableLevelOverRectangle = js.Any.fromFunction1(computeBestAvailableLevelOverRectangle), computeChildMaskForTile = js.Any.fromFunction3(computeChildMaskForTile), computeMaximumLevelAtPosition = js.Any.fromFunction1(computeMaximumLevelAtPosition), isTileAvailable = js.Any.fromFunction3(isTileAvailable))
  
    __obj.asInstanceOf[TileAvailability]
  }
}

