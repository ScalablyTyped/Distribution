package typings.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.mediaGalleries.getAllGalleryWatch")
@js.native
object getAllGalleryWatch extends js.Object {
  /**
    * @deprecated Deprecated since Chrome 51. Applications should store their own gallery watches as they are added.
    * Notifies which galleries are being watched via the given callback.
    */
  def apply(callback: js.Function1[/* galleryIds */ js.Array[String], Unit]): Unit = js.native
}

