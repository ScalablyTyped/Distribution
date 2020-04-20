package typings.chromeApps.chrome.system.display

import typings.chromeApps.AnonBOTTOM
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.BOTTOM
import typings.chromeApps.chromeAppsStrings.LEFT
import typings.chromeApps.chromeAppsStrings.RIGHT
import typings.chromeApps.chromeAppsStrings.TOP
import typings.chromeApps.chromeAppsStrings.bottom_
import typings.chromeApps.chromeAppsStrings.left_
import typings.chromeApps.chromeAppsStrings.right_
import typings.chromeApps.chromeAppsStrings.top_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 53
  */
trait DisplayLayout extends js.Object {
  /** The unique identifier of the display. */
  var id: String
  /** The offset of the display along the connected edge. 0 indicates that the topmost or leftmost corners are aligned. */
  var offset: integer
  /** The unique identifier of the parent display. Empty if this is the root. */
  var parentId: String
  /**
    * The layout position of this display relative to the parent.
    * This will be ignored for the root.
    * @see enum DisplayPosition
    */
  var position: ToStringLiteral[
    AnonBOTTOM, 
    TOP | RIGHT | BOTTOM | LEFT, 
    Exclude[TOP | RIGHT | BOTTOM | LEFT, top_ | right_ | bottom_ | left_]
  ]
}

object DisplayLayout {
  @scala.inline
  def apply(
    id: String,
    offset: integer,
    parentId: String,
    position: ToStringLiteral[
      AnonBOTTOM, 
      TOP | RIGHT | BOTTOM | LEFT, 
      Exclude[TOP | RIGHT | BOTTOM | LEFT, top_ | right_ | bottom_ | left_]
    ]
  ): DisplayLayout = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayLayout]
  }
}

