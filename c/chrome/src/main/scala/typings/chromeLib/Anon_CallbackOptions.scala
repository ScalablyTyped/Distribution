package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackOptions extends js.Object {
  def scan(
    options: chromeLib.chromeNs.documentScanNs.DocumentScanOptions,
    callback: js.Function1[/* result */ chromeLib.chromeNs.documentScanNs.DocumentScanCallbackArg, scala.Unit]
  ): scala.Unit
}

object Anon_CallbackOptions {
  @scala.inline
  def apply(
    scan: js.Function2[
      chromeLib.chromeNs.documentScanNs.DocumentScanOptions, 
      js.Function1[/* result */ chromeLib.chromeNs.documentScanNs.DocumentScanCallbackArg, scala.Unit], 
      scala.Unit
    ]
  ): Anon_CallbackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scan")(scan)
    __obj.asInstanceOf[Anon_CallbackOptions]
  }
}

