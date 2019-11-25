package typings.chrome.chrome.system.display

import typings.chrome.chromeStrings.bottom
import typings.chrome.chromeStrings.left
import typings.chrome.chromeStrings.right
import typings.chrome.chromeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayLayout extends js.Object {
  /** The unique identifier of the display. */
  var id: String
  /** The offset of the display along the connected edge. 0 indicates that the topmost or leftmost corners are aligned. */
  var offset: Double
  /** The unique identifier of the parent display. Empty if this is the root. */
  var parentId: String
  /**
    * The layout position of this display relative to the parent.
    * This will be ignored for the root.
    * @see enum
    */
  var position: top | right | bottom | left
}

object DisplayLayout {
  @scala.inline
  def apply(id: String, offset: Double, parentId: String, position: top | right | bottom | left): DisplayLayout = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisplayLayout]
  }
}

