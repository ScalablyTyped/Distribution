package typings.chromeApps.WebView

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a rectangle in screen coordinates.
  * The containment semantics are array-like; that is, the coordinate (left, top) is considered to be contained by the rectangle,
  * but the coordinate (left + width, top) is not.
  **/
@js.native
trait SelectionRect extends js.Object {
  /** Height of the rectangle. */
  var height: integer = js.native
  /** Distance from the left edge of the screen to the left edge of the rectangle. */
  var left: integer = js.native
  /** Distance from the top edge of the screen to the top edge of the rectangle. */
  var top: integer = js.native
  /** Width of the rectangle. */
  var width: integer = js.native
}

object SelectionRect {
  @scala.inline
  def apply(height: integer, left: integer, top: integer, width: integer): SelectionRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRect]
  }
  @scala.inline
  implicit class SelectionRectOps[Self <: SelectionRect] (val x: Self) extends AnyVal {
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

