package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountOptions extends js.Object {
  /** A human-readable name for the file system. */
  var displayName: java.lang.String
  /** The string indentifier of the file system. Must be unique per each extension. */
  var fileSystemId: java.lang.String
  /**
    * Optional.
    * The maximum number of files that can be opened at once. If not specified, or 0, then not limited.
    * @since Since Chrome 41.
    */
  var openedFilesLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional.
    * Whether the file system supports the tag field for observed directories.
    * @since Since Chrome 45. Warning: this is the current Beta channel.
    */
  var supportsNotifyTag: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Whether the file system supports operations which may change contents of the file system (such as creating, deleting or writing to files).  */
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

object MountOptions {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    fileSystemId: java.lang.String,
    openedFilesLimit: scala.Int | scala.Double = null,
    supportsNotifyTag: js.UndefOr[scala.Boolean] = js.undefined,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): MountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    if (openedFilesLimit != null) __obj.updateDynamic("openedFilesLimit")(openedFilesLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsNotifyTag)) __obj.updateDynamic("supportsNotifyTag")(supportsNotifyTag)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[MountOptions]
  }
}

