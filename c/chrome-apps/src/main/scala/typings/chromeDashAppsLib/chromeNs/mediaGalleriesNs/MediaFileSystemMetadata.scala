package typings
package chromeDashAppsLib.chromeNs.mediaGalleriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MediaFileSystemMetadata extends js.Object {
  /** If the media gallery is on a removable device, a unique id for the device while the device is online. */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /** A unique and persistent id for the media gallery. */
  var galleryId: java.lang.String
  /** True if the device is currently available. */
  var isAvailable: scala.Boolean
  /** True if the device the media gallery is on was detected as a media device. i.e. a PTP or MTP device, or a DCIM directory is present. */
  var isMediaDevice: scala.Boolean
  /** True if the media gallery is on a removable device. */
  var isRemovable: scala.Boolean
  /** The name of the file system. */
  var name: java.lang.String
}

