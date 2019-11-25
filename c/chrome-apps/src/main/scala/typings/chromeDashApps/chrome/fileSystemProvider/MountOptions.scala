package typings.chromeDashApps.chrome.fileSystemProvider

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountOptions extends js.Object {
  /** A human-readable name for the file system. */
  var displayName: String
  /** The string indentifier of the file system. Must be unique per each extension. */
  var fileSystemId: String
  /**
    * The maximum number of files that can be opened at once. If not specified, or 0, then not limited.
    * @since Chrome 41.
    */
  var openedFilesLimit: js.UndefOr[integer] = js.undefined
  /**
    * Whether the framework should resume the file system at the next sign-in session.
    * @default true
    * @since Chrome 64.
    */
  var persistent: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the file system supports the tag field for observed directories.
    * @since Chrome 45.
    */
  var supportsNotifyTag: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the file system supports operations which may change contents
    * of the file system (such as creating, deleting or writing to files).
    */
  var writable: js.UndefOr[Boolean] = js.undefined
}

object MountOptions {
  @scala.inline
  def apply(
    displayName: String,
    fileSystemId: String,
    openedFilesLimit: Int | Double = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    supportsNotifyTag: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): MountOptions = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any])
    if (openedFilesLimit != null) __obj.updateDynamic("openedFilesLimit")(openedFilesLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsNotifyTag)) __obj.updateDynamic("supportsNotifyTag")(supportsNotifyTag.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountOptions]
  }
}

