package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdocumentScan extends js.Object {
  def scan(
    options: chromeLib.chromeNs.documentScanNs.DocumentScanOptions,
    callback: js.Function1[/* result */ chromeLib.chromeNs.documentScanNs.DocumentScanCallbackArg, scala.Unit]
  ): scala.Unit
}

object TypeofdocumentScan {
  @scala.inline
  def apply(
    scan: (chromeLib.chromeNs.documentScanNs.DocumentScanOptions, js.Function1[/* result */ chromeLib.chromeNs.documentScanNs.DocumentScanCallbackArg, scala.Unit]) => scala.Unit
  ): TypeofdocumentScan = {
    val __obj = js.Dynamic.literal(scan = js.Any.fromFunction2(scan))
  
    __obj.asInstanceOf[TypeofdocumentScan]
  }
}

