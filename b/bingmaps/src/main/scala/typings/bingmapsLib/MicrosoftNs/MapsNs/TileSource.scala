package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.TileSource")
@js.native
class TileSource protected () extends js.Object {
  /**
    * @constructor
    * @param options The options to use to define the tile source.
    */
  def this(options: ITileSourceOptions) = this()
  /**
    * Gets the specified bounding box of the of the tile source.
    * @returns The specified bounding box of the of the tile source.
    */
  def getBounds(): LocationRect = js.native
  /**
    * Gets the pixel height of each tile in the tile source.
    * @returns The pixel height of each tile in the tile source.
    */
  def getHeight(): scala.Double = js.native
  /**
    * Gets the maximum zoom level specified for the tile source.
    * @returns The maximum zoom level specified for the tile source.
    */
  def getMaxZoom(): scala.Double = js.native
  /**
    * Gets the minimum zoom level specified for the tile source.
    * @returns The minimum zoom level specified for the tile source.
    */
  def getMinZoom(): scala.Double = js.native
  /**
    * Gets a string that constructs tile URLs used to retrieve tiles for the tile layer.
    * @returns A string that constructs tile URLs used to retrieve tiles for the tile layer.
    */
  def getUriConstructor(): java.lang.String | (js.Function1[/* tile */ PyramidTileId, java.lang.String]) = js.native
  /**
    * Gets the pixel width of each tile in the tile source.
    * @returns The pixel width of each tile in the tile source.
    */
  def getWidth(): scala.Double = js.native
}

