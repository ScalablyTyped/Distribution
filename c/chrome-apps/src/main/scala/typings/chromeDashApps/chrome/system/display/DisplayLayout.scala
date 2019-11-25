package typings.chromeDashApps.chrome.system.display

import typings.chromeDashApps.Anon_BOTTOM
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chromeDashAppsStrings.bottom
import typings.chromeDashApps.chromeDashAppsStrings.left
import typings.chromeDashApps.chromeDashAppsStrings.right
import typings.chromeDashApps.chromeDashAppsStrings.top
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
  var position: ToStringLiteral[Anon_BOTTOM, String, Exclude[String, top | right | bottom | left]]
}

object DisplayLayout {
  @scala.inline
  def apply(
    id: String,
    offset: integer,
    parentId: String,
    position: ToStringLiteral[Anon_BOTTOM, String, Exclude[String, top | right | bottom | left]]
  ): DisplayLayout = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisplayLayout]
  }
}

