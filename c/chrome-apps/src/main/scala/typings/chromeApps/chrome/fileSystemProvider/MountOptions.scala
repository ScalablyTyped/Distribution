package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MountOptions extends js.Object {
  /** A human-readable name for the file system. */
  var displayName: String = js.native
  /** The string indentifier of the file system. Must be unique per each extension. */
  var fileSystemId: String = js.native
  /**
    * The maximum number of files that can be opened at once. If not specified, or 0, then not limited.
    * @since Chrome 41.
    */
  var openedFilesLimit: js.UndefOr[integer] = js.native
  /**
    * Whether the framework should resume the file system at the next sign-in session.
    * @default true
    * @since Chrome 64.
    */
  var persistent: js.UndefOr[Boolean] = js.native
  /**
    * Whether the file system supports the tag field for observed directories.
    * @since Chrome 45.
    */
  var supportsNotifyTag: js.UndefOr[Boolean] = js.native
  /**
    * Whether the file system supports operations which may change contents
    * of the file system (such as creating, deleting or writing to files).
    */
  var writable: js.UndefOr[Boolean] = js.native
}

object MountOptions {
  @scala.inline
  def apply(displayName: String, fileSystemId: String): MountOptions = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountOptions]
  }
  @scala.inline
  implicit class MountOptionsOps[Self <: MountOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenedFilesLimit(value: integer): Self = this.set("openedFilesLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenedFilesLimit: Self = this.set("openedFilesLimit", js.undefined)
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistent: Self = this.set("persistent", js.undefined)
    @scala.inline
    def setSupportsNotifyTag(value: Boolean): Self = this.set("supportsNotifyTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsNotifyTag: Self = this.set("supportsNotifyTag", js.undefined)
    @scala.inline
    def setWritable(value: Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritable: Self = this.set("writable", js.undefined)
  }
  
}

