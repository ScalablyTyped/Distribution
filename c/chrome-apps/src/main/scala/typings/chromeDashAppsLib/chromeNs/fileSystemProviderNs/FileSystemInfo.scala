package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemInfo extends js.Object {
  /** A human-readable name for the file system. */
  var displayName: java.lang.String
  /** The identifier of the file system. */
  var fileSystemId: java.lang.String
  /**
    * List of currently opened files.
    * @since Chrome 42.
    */
  var openedFiles: js.Array[OpenedFileInfo]
  /**
    * The maximum number of files that can be opened at once. If 0, then not limited.
    * @since Chrome 42.
    */
  var openedFilesLimit: chromeDashAppsLib.chromeNs.integer
  /**
    * Whether the file system supports the tag field for observing directories.
    * @since Chrome 45.
    */
  var supportsNotifyTag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * List of watchers.
    * @since Chrome 45.
    */
  var watchers: js.Array[FileWatchersInfo]
  /**
    * Whether the file system supports operations which may
    * change contents of the file system (such as creating, deleting or writing to files).
    */
  var writable: scala.Boolean
}

object FileSystemInfo {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    fileSystemId: java.lang.String,
    openedFiles: js.Array[OpenedFileInfo],
    openedFilesLimit: chromeDashAppsLib.chromeNs.integer,
    watchers: js.Array[FileWatchersInfo],
    writable: scala.Boolean,
    supportsNotifyTag: js.UndefOr[scala.Boolean] = js.undefined
  ): FileSystemInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName, fileSystemId = fileSystemId, openedFiles = openedFiles, openedFilesLimit = openedFilesLimit, watchers = watchers, writable = writable)
    if (!js.isUndefined(supportsNotifyTag)) __obj.updateDynamic("supportsNotifyTag")(supportsNotifyTag)
    __obj.asInstanceOf[FileSystemInfo]
  }
}

