package typings.blessed.mod.Widgets.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TImage extends js.Object {
  /**
    * Image bitmap.
    */
  var bmp: js.Any = js.native
  /**
    * Image cellmap (bitmap scaled down to cell size).
    */
  var cellmap: js.Any = js.native
  /**
    * Pixel height.
    */
  var height: Double = js.native
  /**
    * Pixel width.
    */
  var width: Double = js.native
}

object TImage {
  @scala.inline
  def apply(bmp: js.Any, cellmap: js.Any, height: Double, width: Double): TImage = {
    val __obj = js.Dynamic.literal(bmp = bmp.asInstanceOf[js.Any], cellmap = cellmap.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TImage]
  }
  @scala.inline
  implicit class TImageOps[Self <: TImage] (val x: Self) extends AnyVal {
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
    def setBmp(value: js.Any): Self = this.set("bmp", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellmap(value: js.Any): Self = this.set("cellmap", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

