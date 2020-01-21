package typings.chromeApps.chrome.fileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileSystem.getVolumeList")
@js.native
object getVolumeList extends js.Object {
  /**
    * @requires(Kiosk) Chrome OS Kiosk mode only
    * @requires Permissions: The 'fileSystem': {'requestFileSystem'} manifest permission is required.
    * Returns a list of volumes available for requestFileSystem().
    * Available to kiosk apps running in the kiosk session only.
    * In case of an error, volumes will be undefined, and chrome.runtime.lastError will be set.
    * @since Chrome 44.
    */
  def apply(callback: js.Function1[/* volumes */ js.Array[Volume], Unit]): Unit = js.native
}

