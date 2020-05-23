package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileSource extends js.Object {
  /**
    * Gets the specified bounding box of the of the tile source.
    * @returns The specified bounding box of the of the tile source.
    */
  def getBounds(): LocationRect
  /**
    * Gets the pixel height of each tile in the tile source.
    * @returns The pixel height of each tile in the tile source.
    */
  def getHeight(): Double
  /**
    * Gets the maximum zoom level specified for the tile source.
    * @returns The maximum zoom level specified for the tile source.
    */
  def getMaxZoom(): Double
  /**
    * Gets the minimum zoom level specified for the tile source.
    * @returns The minimum zoom level specified for the tile source.
    */
  def getMinZoom(): Double
  /**
    * Gets a string that constructs tile URLs used to retrieve tiles for the tile layer.
    * @returns A string that constructs tile URLs used to retrieve tiles for the tile layer.
    */
  def getUriConstructor(): String | (js.Function1[/* tile */ PyramidTileId, String])
  /**
    * Gets the pixel width of each tile in the tile source.
    * @returns The pixel width of each tile in the tile source.
    */
  def getWidth(): Double
}

object TileSource {
  @scala.inline
  def apply(
    getBounds: () => LocationRect,
    getHeight: () => Double,
    getMaxZoom: () => Double,
    getMinZoom: () => Double,
    getUriConstructor: () => String | (js.Function1[/* tile */ PyramidTileId, String]),
    getWidth: () => Double
  ): TileSource = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), getHeight = js.Any.fromFunction0(getHeight), getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinZoom = js.Any.fromFunction0(getMinZoom), getUriConstructor = js.Any.fromFunction0(getUriConstructor), getWidth = js.Any.fromFunction0(getWidth))
    __obj.asInstanceOf[TileSource]
  }
}

