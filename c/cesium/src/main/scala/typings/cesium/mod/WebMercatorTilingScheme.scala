package typings.cesium.mod

import typings.cesium.anon.NumberOfLevelZeroTilesY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WebMercatorTilingScheme")
@js.native
open class WebMercatorTilingScheme () extends StObject {
  def this(options: NumberOfLevelZeroTilesY) = this()
  
  /**
    * Gets the ellipsoid that is tiled by this tiling scheme.
    */
  var ellipsoid: Ellipsoid = js.native
  
  /**
    * Gets the total number of tiles in the X direction at a specified level-of-detail.
    * @param level - The level-of-detail.
    * @returns The number of tiles in the X direction at the given level.
    */
  def getNumberOfXTilesAtLevel(level: Double): Double = js.native
  
  /**
    * Gets the total number of tiles in the Y direction at a specified level-of-detail.
    * @param level - The level-of-detail.
    * @returns The number of tiles in the Y direction at the given level.
    */
  def getNumberOfYTilesAtLevel(level: Double): Double = js.native
  
  /**
    * Calculates the tile x, y coordinates of the tile containing
    * a given cartographic position.
    * @param position - The position.
    * @param level - The tile level-of-detail.  Zero is the least detailed.
    * @param [result] - The instance to which to copy the result, or undefined if a new instance
    *        should be created.
    * @returns The specified 'result', or a new object containing the tile x, y coordinates
    *          if 'result' is undefined.
    */
  def positionToTileXY(position: Cartographic, level: Double): Cartesian2 = js.native
  def positionToTileXY(position: Cartographic, level: Double, result: Cartesian2): Cartesian2 = js.native
  
  /**
    * Gets the map projection used by this tiling scheme.
    */
  var projection: MapProjection = js.native
  
  /**
    * Gets the rectangle, in radians, covered by this tiling scheme.
    */
  var rectangle: Rectangle = js.native
  
  /**
    * Transforms a rectangle specified in geodetic radians to the native coordinate system
    * of this tiling scheme.
    * @param rectangle - The rectangle to transform.
    * @param [result] - The instance to which to copy the result, or undefined if a new instance
    *        should be created.
    * @returns The specified 'result', or a new object containing the native rectangle if 'result'
    *          is undefined.
    */
  def rectangleToNativeRectangle(rectangle: Rectangle): Rectangle = js.native
  def rectangleToNativeRectangle(rectangle: Rectangle, result: Rectangle): Rectangle = js.native
  
  /**
    * Converts tile x, y coordinates and level to a rectangle expressed in the native coordinates
    * of the tiling scheme.
    * @param x - The integer x coordinate of the tile.
    * @param y - The integer y coordinate of the tile.
    * @param level - The tile level-of-detail.  Zero is the least detailed.
    * @param [result] - The instance to which to copy the result, or undefined if a new instance
    *        should be created.
    * @returns The specified 'result', or a new object containing the rectangle
    *          if 'result' is undefined.
    */
  def tileXYToNativeRectangle(x: Double, y: Double, level: Double): Rectangle = js.native
  def tileXYToNativeRectangle(x: Double, y: Double, level: Double, result: Any): Rectangle = js.native
  
  /**
    * Converts tile x, y coordinates and level to a cartographic rectangle in radians.
    * @param x - The integer x coordinate of the tile.
    * @param y - The integer y coordinate of the tile.
    * @param level - The tile level-of-detail.  Zero is the least detailed.
    * @param [result] - The instance to which to copy the result, or undefined if a new instance
    *        should be created.
    * @returns The specified 'result', or a new object containing the rectangle
    *          if 'result' is undefined.
    */
  def tileXYToRectangle(x: Double, y: Double, level: Double): Rectangle = js.native
  def tileXYToRectangle(x: Double, y: Double, level: Double, result: Any): Rectangle = js.native
}
