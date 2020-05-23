package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.ITileSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.TileSource")
@js.native
class TileSource protected ()
  extends typings.bingmaps.Microsoft.Maps.TileSource {
  /**
    * @constructor
    * @param options The options to use to define the tile source.
    */
  def this(options: ITileSourceOptions) = this()
  /**
    * Gets the specified bounding box of the of the tile source.
    * @returns The specified bounding box of the of the tile source.
    */
  /* CompleteClass */
  override def getBounds(): typings.bingmaps.Microsoft.Maps.LocationRect = js.native
  /**
    * Gets the pixel height of each tile in the tile source.
    * @returns The pixel height of each tile in the tile source.
    */
  /* CompleteClass */
  override def getHeight(): Double = js.native
  /**
    * Gets the maximum zoom level specified for the tile source.
    * @returns The maximum zoom level specified for the tile source.
    */
  /* CompleteClass */
  override def getMaxZoom(): Double = js.native
  /**
    * Gets the minimum zoom level specified for the tile source.
    * @returns The minimum zoom level specified for the tile source.
    */
  /* CompleteClass */
  override def getMinZoom(): Double = js.native
  /**
    * Gets a string that constructs tile URLs used to retrieve tiles for the tile layer.
    * @returns A string that constructs tile URLs used to retrieve tiles for the tile layer.
    */
  /* CompleteClass */
  override def getUriConstructor(): String | (js.Function1[/* tile */ typings.bingmaps.Microsoft.Maps.PyramidTileId, String]) = js.native
  /**
    * Gets the pixel width of each tile in the tile source.
    * @returns The pixel width of each tile in the tile source.
    */
  /* CompleteClass */
  override def getWidth(): Double = js.native
}

