package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemInfo extends js.Object {
  /** A human-readable name for the file system. */
  var displayName: String
  /** The identifier of the file system. */
  var fileSystemId: String
  /**
    * List of currently opened files.
    * @since Chrome 42.
    */
  var openedFiles: js.Array[OpenedFileInfo]
  /**
    * The maximum number of files that can be opened at once. If 0, then not limited.
    * @since Chrome 42.
    */
  var openedFilesLimit: integer
  /**
    * Whether the file system supports the tag field for observing directories.
    * @since Chrome 45.
    */
  var supportsNotifyTag: js.UndefOr[Boolean] = js.undefined
  /**
    * List of watchers.
    * @since Chrome 45.
    */
  var watchers: js.Array[FileWatchersInfo]
  /**
    * Whether the file system supports operations which may
    * change contents of the file system (such as creating, deleting or writing to files).
    */
  var writable: Boolean
}

object FileSystemInfo {
  @scala.inline
  def apply(
    displayName: String,
    fileSystemId: String,
    openedFiles: js.Array[OpenedFileInfo],
    openedFilesLimit: integer,
    watchers: js.Array[FileWatchersInfo],
    writable: Boolean,
    supportsNotifyTag: js.UndefOr[Boolean] = js.undefined
  ): FileSystemInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], openedFiles = openedFiles.asInstanceOf[js.Any], openedFilesLimit = openedFilesLimit.asInstanceOf[js.Any], watchers = watchers.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsNotifyTag)) __obj.updateDynamic("supportsNotifyTag")(supportsNotifyTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemInfo]
  }
}

