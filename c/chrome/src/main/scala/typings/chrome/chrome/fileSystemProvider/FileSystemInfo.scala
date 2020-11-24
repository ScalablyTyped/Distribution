package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemInfo extends js.Object {
  
  /** A human-readable name for the file system. */
  var displayName: String = js.native
  
  /** The identifier of the file system. */
  var fileSystemId: String = js.native
  
  /**
    * List of currently opened files.
    * @since Since Chrome 42.
    */
  var openedFiles: js.Array[OpenedFileInfo] = js.native
  
  /**
    * The maximum number of files that can be opened at once. If 0, then not limited.
    * @since Since Chrome 42.
    */
  var openedFilesLimit: Double = js.native
  
  /**
    * Optional.
    * Whether the file system supports the tag field for observing directories.
    * @since Since Chrome 45. Warning: this is the current Beta channel.
    */
  var supportsNotifyTag: js.UndefOr[Boolean] = js.native
  
  /**
    * List of watchers.
    * @since Since Chrome 45. Warning: this is the current Beta channel.
    */
  var watchers: js.Array[FileWatchersInfo] = js.native
  
  /** Whether the file system supports operations which may change contents of the file system (such as creating, deleting or writing to files). */
  var writable: Boolean = js.native
}
object FileSystemInfo {
  
  @scala.inline
  def apply(
    displayName: String,
    fileSystemId: String,
    openedFiles: js.Array[OpenedFileInfo],
    openedFilesLimit: Double,
    watchers: js.Array[FileWatchersInfo],
    writable: Boolean
  ): FileSystemInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], openedFiles = openedFiles.asInstanceOf[js.Any], openedFilesLimit = openedFilesLimit.asInstanceOf[js.Any], watchers = watchers.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemInfo]
  }
  
  @scala.inline
  implicit class FileSystemInfoOps[Self <: FileSystemInfo] (val x: Self) extends AnyVal {
    
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
    def setOpenedFilesVarargs(value: OpenedFileInfo*): Self = this.set("openedFiles", js.Array(value :_*))
    
    @scala.inline
    def setOpenedFiles(value: js.Array[OpenedFileInfo]): Self = this.set("openedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenedFilesLimit(value: Double): Self = this.set("openedFilesLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchersVarargs(value: FileWatchersInfo*): Self = this.set("watchers", js.Array(value :_*))
    
    @scala.inline
    def setWatchers(value: js.Array[FileWatchersInfo]): Self = this.set("watchers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritable(value: Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsNotifyTag(value: Boolean): Self = this.set("supportsNotifyTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsNotifyTag: Self = this.set("supportsNotifyTag", js.undefined)
  }
}
