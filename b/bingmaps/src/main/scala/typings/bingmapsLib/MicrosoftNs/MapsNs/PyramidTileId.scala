package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.PyramidTileId")
@js.native
class PyramidTileId protected () extends js.Object {
  /**
           * @constructor
           * @param x The integer x position of the tile within the tile layer at the specified zoom level.
           * @param y The integer y position of the tile within the tile layer at the specified zoom level.
           * @param zoom The zoom level of the tile.
           * @param width The tile's width in pixels. Default value: 256
           * @param height The tile's height in pixels. Default value: 256
           */
  def this(x: scala.Double, y: scala.Double, zoom: scala.Double) = this()
  /**
           * @constructor
           * @param x The integer x position of the tile within the tile layer at the specified zoom level.
           * @param y The integer y position of the tile within the tile layer at the specified zoom level.
           * @param zoom The zoom level of the tile.
           * @param width The tile's width in pixels. Default value: 256
           * @param height The tile's height in pixels. Default value: 256
           */
  def this(x: scala.Double, y: scala.Double, zoom: scala.Double, width: scala.Double) = this()
  /**
           * @constructor
           * @param x The integer x position of the tile within the tile layer at the specified zoom level.
           * @param y The integer y position of the tile within the tile layer at the specified zoom level.
           * @param zoom The zoom level of the tile.
           * @param width The tile's width in pixels. Default value: 256
           * @param height The tile's height in pixels. Default value: 256
           */
  def this(x: scala.Double, y: scala.Double, zoom: scala.Double, width: scala.Double, height: scala.Double) = this()
  /** The height of the tile. */
  var pixelHeight: scala.Double = js.native
  /** The width of the tile. */
  var pixelWidth: scala.Double = js.native
  /** The quadkey ID of the tile. */
  var quadKey: java.lang.String = js.native
  /** The x tile coordinate. */
  var x: scala.Double = js.native
  /** The y tile coordinate. */
  var y: scala.Double = js.native
  /** The zoom level of the tile. */
  var zoom: scala.Double = js.native
}

@JSGlobal("Microsoft.Maps.PyramidTileId")
@js.native
object PyramidTileId extends js.Object {
  /**
           * Compares two PyramidTileId objects and returns a boolean indicating if the two PyramidTileId are equal.
           * @param tileId1 The first PyramidTileId to compare to the second.
           * @param tileId2 The second PyramidTileId to compare to the first.
           * @returns A boolean indicating if the two PyramidTileId are equal.
           */
  def areEqual(
    tileId1: bingmapsLib.MicrosoftNs.MapsNs.PyramidTileId,
    tileId2: bingmapsLib.MicrosoftNs.MapsNs.PyramidTileId
  ): scala.Boolean = js.native
  /**
           * Generates a PyramidTileId from a quadkey tile id string. 
           * @param quadkey The quadkey tile id string to convert into a PyramidTileId object.
           * @param width The tile's width in pixels. Default value: 256
           * @param height The tile's height in pixels. Default value: 256
           */
  def fromQuadKey(quadkey: java.lang.String): bingmapsLib.MicrosoftNs.MapsNs.PyramidTileId = js.native
  /**
           * Generates a PyramidTileId from a quadkey tile id string. 
           * @param quadkey The quadkey tile id string to convert into a PyramidTileId object.
           * @param width The tile's width in pixels. Default value: 256
           * @param height The tile's height in pixels. Default value: 256
           */
  def fromQuadKey(quadkey: java.lang.String, width: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.PyramidTileId = js.native
  /**
           * Generates a PyramidTileId from a quadkey tile id string. 
           * @param quadkey The quadkey tile id string to convert into a PyramidTileId object.
           * @param width The tile's width in pixels. Default value: 256
           * @param height The tile's height in pixels. Default value: 256
           */
  def fromQuadKey(quadkey: java.lang.String, width: scala.Double, height: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.PyramidTileId = js.native
}

