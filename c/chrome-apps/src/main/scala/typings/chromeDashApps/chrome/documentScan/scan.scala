package typings.chromeDashApps.chrome.documentScan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.documentScan.scan")
@js.native
object scan extends js.Object {
  /**
    * Performs a document scan. On success, the PNG data will be sent to the callback.
    * @param options Object containing scan parameters.
    * @param callback Called with the result and data from the scan.
    */
  def apply(options: DocumentScanOptions, callback: js.Function1[/* result */ DocumentScanCallbackArg, Unit]): Unit = js.native
}

