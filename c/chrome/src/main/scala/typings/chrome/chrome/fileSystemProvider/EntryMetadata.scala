package typings.chrome.chrome.fileSystemProvider

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryMetadata extends StObject {
  
  /** True if it is a directory. */
  var isDirectory: Boolean
  
  /** Optional. Mime type for the entry.  */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** The last modified time of this entry. */
  var modificationTime: Date
  
  /** Name of this entry (not full path name). Must not contain '/'. For root it must be empty. */
  var name: String
  
  /** File size in bytes. */
  var size: Double
  
  /** Optional. Thumbnail image as a data URI in either PNG, JPEG or WEBP format, at most 32 KB in size. Optional, but can be provided only when explicitly requested by the onGetMetadataRequested event.  */
  var thumbnail: js.UndefOr[String] = js.undefined
}
object EntryMetadata {
  
  inline def apply(isDirectory: Boolean, modificationTime: Date, name: String, size: Double): EntryMetadata = {
    val __obj = js.Dynamic.literal(isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryMetadata]
  }
  
  extension [Self <: EntryMetadata](x: Self) {
    
    inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setModificationTime(value: Date): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
