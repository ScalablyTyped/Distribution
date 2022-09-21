package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemInfo extends StObject {
  
  /** A human-readable name for the file system. */
  var displayName: String
  
  /** The identifier of the file system. */
  var fileSystemId: String
  
  /**
    * List of currently opened files.
    * @since Since Chrome 42.
    */
  var openedFiles: js.Array[OpenedFileInfo]
  
  /**
    * The maximum number of files that can be opened at once. If 0, then not limited.
    * @since Since Chrome 42.
    */
  var openedFilesLimit: Double
  
  /**
    * Optional.
    * Whether the file system supports the tag field for observing directories.
    * @since Since Chrome 45. Warning: this is the current Beta channel.
    */
  var supportsNotifyTag: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of watchers.
    * @since Since Chrome 45. Warning: this is the current Beta channel.
    */
  var watchers: js.Array[FileWatchersInfo]
  
  /** Whether the file system supports operations which may change contents of the file system (such as creating, deleting or writing to files). */
  var writable: Boolean
}
object FileSystemInfo {
  
  inline def apply(
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
  
  extension [Self <: FileSystemInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    inline def setOpenedFiles(value: js.Array[OpenedFileInfo]): Self = StObject.set(x, "openedFiles", value.asInstanceOf[js.Any])
    
    inline def setOpenedFilesLimit(value: Double): Self = StObject.set(x, "openedFilesLimit", value.asInstanceOf[js.Any])
    
    inline def setOpenedFilesVarargs(value: OpenedFileInfo*): Self = StObject.set(x, "openedFiles", js.Array(value*))
    
    inline def setSupportsNotifyTag(value: Boolean): Self = StObject.set(x, "supportsNotifyTag", value.asInstanceOf[js.Any])
    
    inline def setSupportsNotifyTagUndefined: Self = StObject.set(x, "supportsNotifyTag", js.undefined)
    
    inline def setWatchers(value: js.Array[FileWatchersInfo]): Self = StObject.set(x, "watchers", value.asInstanceOf[js.Any])
    
    inline def setWatchersVarargs(value: FileWatchersInfo*): Self = StObject.set(x, "watchers", js.Array(value*))
    
    inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
