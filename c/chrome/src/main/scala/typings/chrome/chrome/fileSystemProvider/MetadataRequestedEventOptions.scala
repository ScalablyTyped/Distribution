package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataRequestedEventOptions
  extends StObject
     with EntryPathRequestedEventOptions {
  
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
object MetadataRequestedEventOptions {
  
  inline def apply(
    entryPath: String,
    fileSystemId: String,
    isDirectory: Boolean,
    mimeType: Boolean,
    modificationTime: Boolean,
    name: Boolean,
    requestId: Double,
    size: Boolean,
    thumbnail: Boolean
  ): MetadataRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataRequestedEventOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataRequestedEventOptions] (val x: Self) extends AnyVal {
    
    inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: Boolean): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setModificationTime(value: Boolean): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: Boolean): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
