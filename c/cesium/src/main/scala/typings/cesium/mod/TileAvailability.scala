package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TileAvailability")
@js.native
open class TileAvailability protected () extends StObject {
  def this(tilingScheme: TilingScheme, maximumLevel: Double) = this()
  
  /**
    * Marks a rectangular range of tiles in a particular level as being available.  For best performance,
    * add your ranges in order of increasing level.
    * @param level - The level.
    * @param startX - The X coordinate of the first available tiles at the level.
    * @param startY - The Y coordinate of the first available tiles at the level.
    * @param endX - The X coordinate of the last available tiles at the level.
    * @param endY - The Y coordinate of the last available tiles at the level.
    */
  def addAvailableTileRange(level: Double, startX: Double, startY: Double, endX: Double, endY: Double): Unit = js.native
  
  /**
    * Finds the most detailed level that is available _everywhere_ within a given rectangle.  More detailed
    * tiles may be available in parts of the rectangle, but not the whole thing.  The return value of this
    * function may be safely passed to {@link sampleTerrain} for any position within the rectangle.  This function
    * usually completes in time logarithmic to the number of rectangles added with
    * {@link TileAvailability#addAvailableTileRange}.
    * @param rectangle - The rectangle.
    * @returns The best available level for the entire rectangle.
    */
  def computeBestAvailableLevelOverRectangle(rectangle: Rectangle): Double = js.native
  
  /**
    * Computes a bit mask indicating which of a tile's four children exist.
    * If a child's bit is set, a tile is available for that child.  If it is cleared,
    * the tile is not available.  The bit values are as follows:
    * <table>
    *     <tr><th>Bit Position</th><th>Bit Value</th><th>Child Tile</th></tr>
    *     <tr><td>0</td><td>1</td><td>Southwest</td></tr>
    *     <tr><td>1</td><td>2</td><td>Southeast</td></tr>
    *     <tr><td>2</td><td>4</td><td>Northwest</td></tr>
    *     <tr><td>3</td><td>8</td><td>Northeast</td></tr>
    * </table>
    * @param level - The level of the parent tile.
    * @param x - The X coordinate of the parent tile.
    * @param y - The Y coordinate of the parent tile.
    * @returns The bit mask indicating child availability.
    */
  def computeChildMaskForTile(level: Double, x: Double, y: Double): Double = js.native
  
  /**
    * Determines the level of the most detailed tile covering the position.  This function
    * usually completes in time logarithmic to the number of rectangles added with
    * {@link TileAvailability#addAvailableTileRange}.
    * @param position - The position for which to determine the maximum available level.  The height component is ignored.
    * @returns The level of the most detailed tile covering the position.
    */
  def computeMaximumLevelAtPosition(position: Cartographic): Double = js.native
  
  /**
    * Determines if a particular tile is available.
    * @param level - The tile level to check.
    * @param x - The X coordinate of the tile to check.
    * @param y - The Y coordinate of the tile to check.
    * @returns True if the tile is available; otherwise, false.
    */
  def isTileAvailable(level: Double, x: Double, y: Double): Boolean = js.native
}
