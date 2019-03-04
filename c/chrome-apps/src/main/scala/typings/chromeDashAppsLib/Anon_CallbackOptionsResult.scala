package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackOptionsResult extends js.Object {
  /**
    * Performs a document scan. On success, the PNG data will be sent to the callback.
    * @param options Object containing scan parameters.
    * @param callback Called with the result and data from the scan.
    */
  def scan(
    options: chromeDashAppsLib.chromeNs.documentScanNs.DocumentScanOptions,
    callback: js.Function1[
      /* result */ chromeDashAppsLib.chromeNs.documentScanNs.DocumentScanCallbackArg, 
      scala.Unit
    ]
  ): scala.Unit
}

object Anon_CallbackOptionsResult {
  @scala.inline
  def apply(
    scan: js.Function2[
      chromeDashAppsLib.chromeNs.documentScanNs.DocumentScanOptions, 
      js.Function1[
        /* result */ chromeDashAppsLib.chromeNs.documentScanNs.DocumentScanCallbackArg, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): Anon_CallbackOptionsResult = {
    val __obj = js.Dynamic.literal(scan = scan)
  
    __obj.asInstanceOf[Anon_CallbackOptionsResult]
  }
}

