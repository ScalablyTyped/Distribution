package typings.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.mediaGalleries.dropPermissionForMediaFileSystem")
@js.native
object dropPermissionForMediaFileSystem extends js.Object {
  /**
    * @deprecated Deprecated since Chrome 51. The user can manually drop access to galleries via the permissions dialog.
    * @description Give up access to a given media gallery.
    */
  def apply(galleryId: String): Unit = js.native
  def apply(galleryId: String, callback: js.Function0[Unit]): Unit = js.native
}

