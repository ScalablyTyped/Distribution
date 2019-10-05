package typings.chromeDashApps.chrome.mediaGalleries

import typings.filesystem.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.mediaGalleries.getMediaFileSystems")
@js.native
object getMediaFileSystems extends js.Object {
  /**
    * Get the media galleries configured in this user agent.
    * If none are configured or available, the callback will receive an empty array.
    */
  def apply(callback: js.Function1[/* mediaFileSystems */ js.Array[FileSystem], Unit]): Unit = js.native
  /**
    * Get the media galleries configured in this user agent.
    * If none are configured or available, the callback will receive an empty array.
    */
  def apply(
    options: MediaFileSystemsOptions,
    callback: js.Function1[/* mediaFileSystems */ js.Array[FileSystem], Unit]
  ): Unit = js.native
}

