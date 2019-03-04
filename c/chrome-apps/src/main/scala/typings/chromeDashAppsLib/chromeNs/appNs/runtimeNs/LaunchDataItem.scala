package typings
package chromeDashAppsLib.chromeNs.appNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchDataItem extends js.Object {
  /**
    * Entry for the item
    */
  var entry: filesystemLib.FileEntry
  /**
    * The MIME type of the file.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object LaunchDataItem {
  @scala.inline
  def apply(entry: filesystemLib.FileEntry, `type`: java.lang.String = null): LaunchDataItem = {
    val __obj = js.Dynamic.literal(entry = entry)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LaunchDataItem]
  }
}

