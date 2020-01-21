package typings.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.mediaGalleries.cancelMediaScan")
@js.native
object cancelMediaScan extends js.Object {
  /**
    * @deprecated Deprecated since Chrome 51. The mediaGalleries API no longer supports scanning.
    * @description
    * Cancel any pending media scan.
    * Well behaved apps should provide a way for the user to cancel scans they start.
    */
  def apply(): Unit = js.native
}

