package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountOptions extends js.Object {
  /** A human-readable name for the file system. */
  var displayName: java.lang.String
  /** The string indentifier of the file system. Must be unique per each extension. */
  var fileSystemId: java.lang.String
  /**
    * The maximum number of files that can be opened at once. If not specified, or 0, then not limited.
    * @since Chrome 41.
    */
  var openedFilesLimit: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
    * Whether the framework should resume the file system at the next sign-in session.
    * @default true
    * @since Chrome 64.
    */
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the file system supports the tag field for observed directories.
    * @since Chrome 45.
    */
  var supportsNotifyTag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the file system supports operations which may change contents
    * of the file system (such as creating, deleting or writing to files).
    */
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

object MountOptions {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    fileSystemId: java.lang.String,
    openedFilesLimit: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    supportsNotifyTag: js.UndefOr[scala.Boolean] = js.undefined,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): MountOptions = {
    val __obj = js.Dynamic.literal(displayName = displayName, fileSystemId = fileSystemId)
    if (!js.isUndefined(openedFilesLimit)) __obj.updateDynamic("openedFilesLimit")(openedFilesLimit)
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (!js.isUndefined(supportsNotifyTag)) __obj.updateDynamic("supportsNotifyTag")(supportsNotifyTag)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[MountOptions]
  }
}

