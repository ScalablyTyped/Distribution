package typings.chrome

import typings.chrome.chromeNs.printerProviderNs.CapabilityRequestedEvent
import typings.chrome.chromeNs.printerProviderNs.PrintRequestedEvent
import typings.chrome.chromeNs.printerProviderNs.PrinterInfoRequestedEvent
import typings.chrome.chromeNs.printerProviderNs.PrinterRequestedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofprinterProvider extends js.Object {
  var onGetCapabilityRequested: CapabilityRequestedEvent
  var onGetPrintersRequested: PrinterRequestedEvent
  var onGetUsbPrinterInfoRequested: PrinterInfoRequestedEvent
  var onPrintRequested: PrintRequestedEvent
}

object TypeofprinterProvider {
  @scala.inline
  def apply(
    onGetCapabilityRequested: CapabilityRequestedEvent,
    onGetPrintersRequested: PrinterRequestedEvent,
    onGetUsbPrinterInfoRequested: PrinterInfoRequestedEvent,
    onPrintRequested: PrintRequestedEvent
  ): TypeofprinterProvider = {
    val __obj = js.Dynamic.literal(onGetCapabilityRequested = onGetCapabilityRequested, onGetPrintersRequested = onGetPrintersRequested, onGetUsbPrinterInfoRequested = onGetUsbPrinterInfoRequested, onPrintRequested = onPrintRequested)
  
    __obj.asInstanceOf[TypeofprinterProvider]
  }
}

