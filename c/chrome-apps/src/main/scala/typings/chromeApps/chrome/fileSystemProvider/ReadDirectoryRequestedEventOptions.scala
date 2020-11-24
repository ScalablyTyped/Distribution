package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
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
  implicit class ReadDirectoryRequestedEventOptionsOps[Self <: ReadDirectoryRequestedEventOptions] (val x: Self) extends AnyVal {
    
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
    def setDirectoryPath(value: String): Self = this.set("directoryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirectory(value: Boolean): Self = this.set("isDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: Boolean): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationTime(value: Boolean): Self = this.set("modificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Boolean): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: Boolean): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
}
