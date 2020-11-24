package typings.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaFileSystemMetadata extends js.Object {
  
  /** If the media gallery is on a removable device, a unique id for the device while the device is online. */
  var deviceId: js.UndefOr[String] = js.native
  
  /** A unique and persistent id for the media gallery. */
  var galleryId: String = js.native
  
  /** True if the device is currently available. */
  var isAvailable: Boolean = js.native
  
  /** True if the device the media gallery is on was detected as a media device. i.e. a PTP or MTP device, or a DCIM directory is present. */
  var isMediaDevice: Boolean = js.native
  
  /** True if the media gallery is on a removable device. */
  var isRemovable: Boolean = js.native
  
  /** The name of the file system. */
  var name: String = js.native
}
object MediaFileSystemMetadata {
  
  @scala.inline
  def apply(
    galleryId: String,
    isAvailable: Boolean,
    isMediaDevice: Boolean,
    isRemovable: Boolean,
    name: String
  ): MediaFileSystemMetadata = {
    val __obj = js.Dynamic.literal(galleryId = galleryId.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any], isMediaDevice = isMediaDevice.asInstanceOf[js.Any], isRemovable = isRemovable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaFileSystemMetadata]
  }
  
  @scala.inline
  implicit class MediaFileSystemMetadataOps[Self <: MediaFileSystemMetadata] (val x: Self) extends AnyVal {
    
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
    def setGalleryId(value: String): Self = this.set("galleryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAvailable(value: Boolean): Self = this.set("isAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMediaDevice(value: Boolean): Self = this.set("isMediaDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRemovable(value: Boolean): Self = this.set("isRemovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
  }
}
