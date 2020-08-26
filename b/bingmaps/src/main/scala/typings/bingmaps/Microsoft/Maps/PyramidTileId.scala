package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PyramidTileId extends js.Object {
  /** The height of the tile. */
  var pixelHeight: Double = js.native
  /** The width of the tile. */
  var pixelWidth: Double = js.native
  /** The quadkey ID of the tile. */
  var quadKey: String = js.native
  /** The x tile coordinate. */
  var x: Double = js.native
  /** The y tile coordinate. */
  var y: Double = js.native
  /** The zoom level of the tile. */
  var zoom: Double = js.native
}

object PyramidTileId {
  @scala.inline
  def apply(pixelHeight: Double, pixelWidth: Double, quadKey: String, x: Double, y: Double, zoom: Double): PyramidTileId = {
    val __obj = js.Dynamic.literal(pixelHeight = pixelHeight.asInstanceOf[js.Any], pixelWidth = pixelWidth.asInstanceOf[js.Any], quadKey = quadKey.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PyramidTileId]
  }
  @scala.inline
  implicit class PyramidTileIdOps[Self <: PyramidTileId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPixelHeight(value: Double): Self = this.set("pixelHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelWidth(value: Double): Self = this.set("pixelWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuadKey(value: String): Self = this.set("quadKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
  
}

