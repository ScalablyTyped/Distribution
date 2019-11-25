package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountOptions extends js.Object {
  /** A human-readable name for the file system. */
  var displayName: String
  /** The string indentifier of the file system. Must be unique per each extension. */
  var fileSystemId: String
  /**
    * Optional.
    * The maximum number of files that can be opened at once. If not specified, or 0, then not limited.
    * @since Since Chrome 41.
    */
  var openedFilesLimit: js.UndefOr[Double] = js.undefined
  /**
    * Optional.
    * Whether the file system supports the tag field for observed directories.
    * @since Since Chrome 45. Warning: this is the current Beta channel.
    */
  var supportsNotifyTag: js.UndefOr[Boolean] = js.undefined
  /** Optional. Whether the file system supports operations which may change contents of the file system (such as creating, deleting or writing to files).  */
  var writable: js.UndefOr[Boolean] = js.undefined
}

object MountOptions {
  @scala.inline
  def apply(
    displayName: String,
    fileSystemId: String,
    openedFilesLimit: Int | Double = null,
    supportsNotifyTag: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): MountOptions = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any])
    if (openedFilesLimit != null) __obj.updateDynamic("openedFilesLimit")(openedFilesLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsNotifyTag)) __obj.updateDynamic("supportsNotifyTag")(supportsNotifyTag.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountOptions]
  }
}

