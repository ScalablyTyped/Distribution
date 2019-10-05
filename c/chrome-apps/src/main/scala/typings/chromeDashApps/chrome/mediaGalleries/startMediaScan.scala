package typings.chromeDashApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.mediaGalleries.startMediaScan")
@js.native
object startMediaScan extends js.Object {
  /**
    * @deprecated Deprecated since Chrome 51. The mediaGalleries API no longer supports scanning.
    * @description
    * Start a scan of the user's hard disks for directories containing media.
    * The scan may take a long time so progress and completion is communicated by events.
    * No permission is granted as a result of the scan, see addScanResults.
    */
  def apply(): Unit = js.native
}

