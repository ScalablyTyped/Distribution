package typings.chromeDashApps.chrome.mediaGalleries

import typings.filesystem.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.mediaGalleries.addScanResults")
@js.native
object addScanResults extends js.Object {
  /**
    * @deprecated Deprecated since Chrome 51. The mediaGalleries API no longer supports scanning.
    * @description
    * Show the user the scan results and let them add any or all of them as galleries.
    * This should be used after the 'finish' onScanProgress() event has happened.
    * All galleries the app has access to are returned, not just the newly added galleries.
    */
  def apply(callback: js.Function1[/* mediaFileSystems */ js.Array[FileSystem], Unit]): Unit = js.native
}

