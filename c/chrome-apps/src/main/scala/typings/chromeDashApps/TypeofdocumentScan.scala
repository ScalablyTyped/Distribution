package typings.chromeDashApps

import typings.chromeDashApps.chromeNs.documentScanNs.DocumentScanCallbackArg
import typings.chromeDashApps.chromeNs.documentScanNs.DocumentScanOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdocumentScan extends js.Object {
  /**
    * Performs a document scan. On success, the PNG data will be sent to the callback.
    * @param options Object containing scan parameters.
    * @param callback Called with the result and data from the scan.
    */
  def scan(options: DocumentScanOptions, callback: js.Function1[/* result */ DocumentScanCallbackArg, Unit]): Unit
}

object TypeofdocumentScan {
  @scala.inline
  def apply(scan: (DocumentScanOptions, js.Function1[/* result */ DocumentScanCallbackArg, Unit]) => Unit): TypeofdocumentScan = {
    val __obj = js.Dynamic.literal(scan = js.Any.fromFunction2(scan))
  
    __obj.asInstanceOf[TypeofdocumentScan]
  }
}

