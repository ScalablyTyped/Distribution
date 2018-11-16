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

