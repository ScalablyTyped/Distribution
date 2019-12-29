package typings.blessed.blessedMod.Widgets.Types

import typings.blessed.blessedStrings.block
import typings.blessed.blessedStrings.line
import typings.blessed.blessedStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TCursor extends js.Object {
  /**
    * Have blessed draw a custom cursor and hide the terminal cursor (experimental).
    */
  var artificial: Boolean
  /**
    * Whether the cursor blinks.
    */
  var blink: Boolean
  /**
    * Color of the color. Accepts any valid color value (null is default).
    */
  var color: String
  /**
    * Shape of the cursor. Can be: block, underline, or line.
    */
  var shape: block | underline | line
}

object TCursor {
  @scala.inline
  def apply(artificial: Boolean, blink: Boolean, color: String, shape: block | underline | line): TCursor = {
    val __obj = js.Dynamic.literal(artificial = artificial.asInstanceOf[js.Any], blink = blink.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TCursor]
  }
}

