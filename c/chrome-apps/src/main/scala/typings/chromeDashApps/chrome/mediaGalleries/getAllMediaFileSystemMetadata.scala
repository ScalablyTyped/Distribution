package typings.chromeDashApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.mediaGalleries.getAllMediaFileSystemMetadata")
@js.native
object getAllMediaFileSystemMetadata extends js.Object {
  /**
    * @deprecated Deprecated since Chrome 51. Use getMediaFileSystemMetadata instead
    * Get metadata for all available media galleries.
    */
  def apply(callback: js.Function1[/* metadatas */ js.Array[MediaFileSystemMetadata], Unit]): Unit = js.native
}

