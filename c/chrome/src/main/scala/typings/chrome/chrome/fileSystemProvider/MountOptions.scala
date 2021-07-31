package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountOptions extends StObject {
  
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
  def apply(displayName: String, fileSystemId: String): MountOptions = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountOptions]
  }
  
  @scala.inline
  implicit class MountOptionsMutableBuilder[Self <: MountOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenedFilesLimit(value: Double): Self = StObject.set(x, "openedFilesLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenedFilesLimitUndefined: Self = StObject.set(x, "openedFilesLimit", js.undefined)
    
    @scala.inline
    def setSupportsNotifyTag(value: Boolean): Self = StObject.set(x, "supportsNotifyTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsNotifyTagUndefined: Self = StObject.set(x, "supportsNotifyTag", js.undefined)
    
    @scala.inline
    def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
