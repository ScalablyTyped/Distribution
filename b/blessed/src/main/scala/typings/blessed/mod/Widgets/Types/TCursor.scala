package typings.blessed.mod.Widgets.Types

import typings.blessed.blessedStrings.block
import typings.blessed.blessedStrings.line
import typings.blessed.blessedStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TCursor extends js.Object {
  /**
    * Have blessed draw a custom cursor and hide the terminal cursor (experimental).
    */
  var artificial: Boolean = js.native
  /**
    * Whether the cursor blinks.
    */
  var blink: Boolean = js.native
  /**
    * Color of the color. Accepts any valid color value (null is default).
    */
  var color: String = js.native
  /**
    * Shape of the cursor. Can be: block, underline, or line.
    */
  var shape: block | underline | line = js.native
}

object TCursor {
  @scala.inline
  def apply(artificial: Boolean, blink: Boolean, color: String, shape: block | underline | line): TCursor = {
    val __obj = js.Dynamic.literal(artificial = artificial.asInstanceOf[js.Any], blink = blink.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[TCursor]
  }
  @scala.inline
  implicit class TCursorOps[Self <: TCursor] (val x: Self) extends AnyVal {
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
    def setArtificial(value: Boolean): Self = this.set("artificial", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlink(value: Boolean): Self = this.set("blink", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: block | underline | line): Self = this.set("shape", value.asInstanceOf[js.Any])
  }
  
}

