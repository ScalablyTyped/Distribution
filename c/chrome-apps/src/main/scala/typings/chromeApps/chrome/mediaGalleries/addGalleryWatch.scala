package typings.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.mediaGalleries.addGalleryWatch")
@js.native
object addGalleryWatch extends js.Object {
  /**
    * Adds a gallery watch for the gallery with the specified gallery ID.
    * The given callback is then fired with a success or failure result.
    * @since Chrome 39.
    */
  def apply(galleryId: String, callback: js.Function1[/* result */ GalleryWatchResult, Unit]): Unit = js.native
}

