package typings.chromeApps.chrome.system.display

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounds extends js.Object {
  /** The height of the display in pixels. */
  var height: integer = js.native
  /**  The x-coordinate of the upper-left corner. */
  var left: integer = js.native
  /**  The y-coordinate of the upper-left corner. */
  var top: integer = js.native
  /** The width of the display in pixels. */
  var width: integer = js.native
}

object Bounds {
  @scala.inline
  def apply(height: integer, left: integer, top: integer, width: integer): Bounds = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
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
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: integer): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: integer): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

