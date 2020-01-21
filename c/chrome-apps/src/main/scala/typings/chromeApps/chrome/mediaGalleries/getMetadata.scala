package typings.chromeApps.chrome.mediaGalleries

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.mediaGalleries.getMetadata")
@js.native
object getMetadata extends js.Object {
  /**
    * Gets the media-specific metadata for a media file.
    * This should work for files in media galleries as well as other DOM filesystems.
    * @since Chrome 38.
    */
  def apply(mediaFile: Blob, callback: js.Function1[/* metadata */ Metadata, Unit]): Unit = js.native
  /**
    * Gets the media-specific metadata for a media file.
    * This should work for files in media galleries as well as other DOM filesystems.
    * @since Chrome 38.
    */
  def apply(mediaFile: Blob, options: MetadataOptions, callback: js.Function1[/* metadata */ Metadata, Unit]): Unit = js.native
}

