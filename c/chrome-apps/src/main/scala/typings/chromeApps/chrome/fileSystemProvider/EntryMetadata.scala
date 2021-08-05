package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.double
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryMetadata extends StObject {
  
  /** True if it is a directory. Must be provided if requested in options */
  var isDirectory: js.UndefOr[Boolean] = js.undefined
  
  /** Mime type for the entry.  */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** The last modified time of this entry. */
  var modificationTime: js.UndefOr[Date] = js.undefined
  
  /**
    * Name of this entry (not full path name).
    * Must not contain '/'.
    * For root it must be empty.
    * Must be provided if requested in options.
    **/
  var name: js.UndefOr[String] = js.undefined
  
  /** File size in bytes. Must be provided if requested in options. */
  var size: js.UndefOr[double] = js.undefined
  
  /**
    * Thumbnail image as a data URI in either PNG, JPEG or WEBP format, at most 32 KB in size.
    * Optional, but can be provided only when explicitly requested
    * by the onGetMetadataRequested event.
    */
  var thumbnail: js.UndefOr[String] = js.undefined
}
object EntryMetadata {
  
  inline def apply(): EntryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntryMetadata]
  }
  
  extension [Self <: EntryMetadata](x: Self) {
    
    inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setModificationTime(value: Date): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
    
    inline def setModificationTimeUndefined: Self = StObject.set(x, "modificationTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
