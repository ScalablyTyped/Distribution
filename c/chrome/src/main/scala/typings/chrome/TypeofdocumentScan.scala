package typings.chrome

import typings.chrome.chrome.documentScan.DocumentScanCallbackArg
import typings.chrome.chrome.documentScan.DocumentScanOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdocumentScan extends js.Object {
  def scan(options: DocumentScanOptions, callback: js.Function1[/* result */ DocumentScanCallbackArg, Unit]): Unit
}

object TypeofdocumentScan {
  @scala.inline
  def apply(scan: (DocumentScanOptions, js.Function1[/* result */ DocumentScanCallbackArg, Unit]) => Unit): TypeofdocumentScan = {
    val __obj = js.Dynamic.literal(scan = js.Any.fromFunction2(scan))
    __obj.asInstanceOf[TypeofdocumentScan]
  }
}

