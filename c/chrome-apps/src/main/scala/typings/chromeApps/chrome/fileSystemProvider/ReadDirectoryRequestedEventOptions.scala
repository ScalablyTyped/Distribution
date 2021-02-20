package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadDirectoryRequestedEventOptions extends RequestedEventOptions {
  
  /** The path of the directory which is to be operated on. */
  var directoryPath: String = js.native
  
  /**
    * Set to true if is_directory value is requested
    * @since Chrome 49.
    */
  var isDirectory: Boolean = js.native
  
  /**
    * Set to true if mimeType value is requested.
    * @since Chrome 49.
    */
  var mimeType: Boolean = js.native
  
  /**
    * Set to true if modificationTime value is requested
    * @since Chrome 49.
    */
  var modificationTime: Boolean = js.native
  
  /**
    * Set to true if is_directory value is requested.
    * @since Chrome 49.
    */
  var name: Boolean = js.native
  
  /**
    * Set to true if size value is requested.
    * @since Chrome 49.
    */
  var size: Boolean = js.native
  
  /**
    * Set to true if the thumbnail is requested.
    */
  var thumbnail: Boolean = js.native
}
object ReadDirectoryRequestedEventOptions {
  
  @scala.inline
  def apply(
    directoryPath: String,
    fileSystemId: String,
    isDirectory: Boolean,
    mimeType: Boolean,
    modificationTime: Boolean,
    name: Boolean,
    requestId: integer,
    size: Boolean,
    thumbnail: Boolean
  ): ReadDirectoryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadDirectoryRequestedEventOptions]
  }
  
  @scala.inline
  implicit class ReadDirectoryRequestedEventOptionsMutableBuilder[Self <: ReadDirectoryRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryPath(value: String): Self = StObject.set(x, "directoryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: Boolean): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationTime(value: Boolean): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: Boolean): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
