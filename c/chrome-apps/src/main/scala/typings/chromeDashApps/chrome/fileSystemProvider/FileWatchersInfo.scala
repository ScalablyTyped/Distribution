package typings.chromeDashApps.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileWatchersInfo extends js.Object {
  /** The path of the entry being observed. */
  var entryPath: String
  /** Tag used by the last notification for the watcher.  */
  var lastTag: js.UndefOr[String] = js.undefined
  /**
    * Whether watching should include all child entries recursively.
    * It can be true for directories only.
    */
  var recursive: Boolean
}

object FileWatchersInfo {
  @scala.inline
  def apply(entryPath: String, recursive: Boolean, lastTag: String = null): FileWatchersInfo = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    if (lastTag != null) __obj.updateDynamic("lastTag")(lastTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileWatchersInfo]
  }
}

