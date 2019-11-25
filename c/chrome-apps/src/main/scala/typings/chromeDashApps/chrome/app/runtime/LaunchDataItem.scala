package typings.chromeDashApps.chrome.app.runtime

import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchDataItem extends js.Object {
  /**
    * Entry for the item
    */
  var entry: FileEntry
  /**
    * The MIME type of the file.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object LaunchDataItem {
  @scala.inline
  def apply(entry: FileEntry, `type`: String = null): LaunchDataItem = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchDataItem]
  }
}

