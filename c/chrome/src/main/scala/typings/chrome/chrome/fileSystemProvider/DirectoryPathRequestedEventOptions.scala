package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryPathRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** The path of the directory which is to be operated on. */
  var directoryPath: String
  
  /** Set to true if is_directory value is requested. */
  var isDirectory: Boolean
  
  /** Set to true if mimeType value is requested. */
  var mimeType: Boolean
  
  /** Set to true if modificationTime value is requested. */
  var modificationTime: Boolean
  
  /** Set to true if name value is requested. */
  var name: Boolean
  
  /** Set to true if size value is requested. */
  var size: Boolean
  
  /** Set to true if the thumbnail is requested. */
  var thumbnail: Boolean
}
object DirectoryPathRequestedEventOptions {
  
  inline def apply(
    directoryPath: String,
    fileSystemId: String,
    isDirectory: Boolean,
    mimeType: Boolean,
    modificationTime: Boolean,
    name: Boolean,
    requestId: Double,
    size: Boolean,
    thumbnail: Boolean
  ): DirectoryPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryPathRequestedEventOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectoryPathRequestedEventOptions] (val x: Self) extends AnyVal {
    
    inline def setDirectoryPath(value: String): Self = StObject.set(x, "directoryPath", value.asInstanceOf[js.Any])
    
    inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: Boolean): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setModificationTime(value: Boolean): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: Boolean): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
