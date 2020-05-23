package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PyramidTileId extends js.Object {
  /** The height of the tile. */
  var pixelHeight: Double
  /** The width of the tile. */
  var pixelWidth: Double
  /** The quadkey ID of the tile. */
  var quadKey: String
  /** The x tile coordinate. */
  var x: Double
  /** The y tile coordinate. */
  var y: Double
  /** The zoom level of the tile. */
  var zoom: Double
}

object PyramidTileId {
  @scala.inline
  def apply(pixelHeight: Double, pixelWidth: Double, quadKey: String, x: Double, y: Double, zoom: Double): PyramidTileId = {
    val __obj = js.Dynamic.literal(pixelHeight = pixelHeight.asInstanceOf[js.Any], pixelWidth = pixelWidth.asInstanceOf[js.Any], quadKey = quadKey.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PyramidTileId]
  }
}

