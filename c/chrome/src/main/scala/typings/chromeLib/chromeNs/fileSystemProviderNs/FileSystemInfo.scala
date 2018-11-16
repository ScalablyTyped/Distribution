package typings
package chromeLib.chromeNs.fileSystemProviderNs

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
           * @since Since Chrome 42.
           */
  var openedFiles: js.Array[OpenedFileInfo]
  /**
           * The maximum number of files that can be opened at once. If 0, then not limited.
           * @since Since Chrome 42.
           */
  var openedFilesLimit: scala.Double
  /**
           * Optional.
            * Whether the file system supports the tag field for observing directories.
           * @since Since Chrome 45. Warning: this is the current Beta channel.
           */
  var supportsNotifyTag: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * List of watchers.
           * @since Since Chrome 45. Warning: this is the current Beta channel.
           */
  var watchers: js.Array[FileWatchersInfo]
  /** Whether the file system supports operations which may change contents of the file system (such as creating, deleting or writing to files). */
  var writable: scala.Boolean
}

