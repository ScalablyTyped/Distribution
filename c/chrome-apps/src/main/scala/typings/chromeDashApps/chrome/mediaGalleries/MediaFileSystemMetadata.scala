package typings.chromeDashApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaFileSystemMetadata extends js.Object {
  /** If the media gallery is on a removable device, a unique id for the device while the device is online. */
  var deviceId: js.UndefOr[String] = js.undefined
  /** A unique and persistent id for the media gallery. */
  var galleryId: String
  /** True if the device is currently available. */
  var isAvailable: Boolean
  /** True if the device the media gallery is on was detected as a media device. i.e. a PTP or MTP device, or a DCIM directory is present. */
  var isMediaDevice: Boolean
  /** True if the media gallery is on a removable device. */
  var isRemovable: Boolean
  /** The name of the file system. */
  var name: String
}

object MediaFileSystemMetadata {
  @scala.inline
  def apply(
    galleryId: String,
    isAvailable: Boolean,
    isMediaDevice: Boolean,
    isRemovable: Boolean,
    name: String,
    deviceId: String = null
  ): MediaFileSystemMetadata = {
    val __obj = js.Dynamic.literal(galleryId = galleryId, isAvailable = isAvailable, isMediaDevice = isMediaDevice, isRemovable = isRemovable, name = name)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    __obj.asInstanceOf[MediaFileSystemMetadata]
  }
}

