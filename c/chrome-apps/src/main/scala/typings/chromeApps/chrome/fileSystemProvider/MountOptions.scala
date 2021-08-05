package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountOptions extends StObject {
  
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
  
  inline def apply(displayName: String, fileSystemId: String): MountOptions = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountOptions]
  }
  
  extension [Self <: MountOptions](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    inline def setOpenedFilesLimit(value: integer): Self = StObject.set(x, "openedFilesLimit", value.asInstanceOf[js.Any])
    
    inline def setOpenedFilesLimitUndefined: Self = StObject.set(x, "openedFilesLimit", js.undefined)
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    inline def setSupportsNotifyTag(value: Boolean): Self = StObject.set(x, "supportsNotifyTag", value.asInstanceOf[js.Any])
    
    inline def setSupportsNotifyTagUndefined: Self = StObject.set(x, "supportsNotifyTag", js.undefined)
    
    inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
