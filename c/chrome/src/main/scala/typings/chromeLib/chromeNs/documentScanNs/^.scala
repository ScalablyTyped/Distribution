package typings
package chromeLib.chromeNs.documentScanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.documentScan")
@js.native
object ^ extends js.Object {
  def scan(
    options: DocumentScanOptions,
    callback: js.Function1[/* result */ DocumentScanCallbackArg, scala.Unit]
  ): scala.Unit = js.native
}

