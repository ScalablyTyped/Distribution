package typings.chrome.global.chrome

import typings.chrome.chrome.printerProvider.CapabilityRequestedEvent
import typings.chrome.chrome.printerProvider.PrintRequestedEvent
import typings.chrome.chrome.printerProvider.PrinterInfoRequestedEvent
import typings.chrome.chrome.printerProvider.PrinterRequestedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Printer Provider
////////////////////
/**
  * The chrome.printerProvider API exposes events used by print manager to query printers controlled by extensions, to query their capabilities and to submit print jobs to these printers.
  * Permissions:  "printerProvider"
  * @since Chrome 44.
  */
@JSGlobal("chrome.printerProvider")
@js.native
object printerProvider extends js.Object {
  
  var onGetCapabilityRequested: CapabilityRequestedEvent = js.native
  
  var onGetPrintersRequested: PrinterRequestedEvent = js.native
  
  var onGetUsbPrinterInfoRequested: PrinterInfoRequestedEvent = js.native
  
  var onPrintRequested: PrintRequestedEvent = js.native
}
