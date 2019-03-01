package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnGetCapabilityRequested extends js.Object {
  var onGetCapabilityRequested: chromeLib.chromeNs.printerProviderNs.CapabilityRequestedEvent
  var onGetPrintersRequested: chromeLib.chromeNs.printerProviderNs.PrinterRequestedEvent
  var onGetUsbPrinterInfoRequested: chromeLib.chromeNs.printerProviderNs.PrinterInfoRequestedEvent
  var onPrintRequested: chromeLib.chromeNs.printerProviderNs.PrintRequestedEvent
}

object Anon_OnGetCapabilityRequested {
  @scala.inline
  def apply(
    onGetCapabilityRequested: chromeLib.chromeNs.printerProviderNs.CapabilityRequestedEvent,
    onGetPrintersRequested: chromeLib.chromeNs.printerProviderNs.PrinterRequestedEvent,
    onGetUsbPrinterInfoRequested: chromeLib.chromeNs.printerProviderNs.PrinterInfoRequestedEvent,
    onPrintRequested: chromeLib.chromeNs.printerProviderNs.PrintRequestedEvent
  ): Anon_OnGetCapabilityRequested = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onGetCapabilityRequested")(onGetCapabilityRequested)
    __obj.updateDynamic("onGetPrintersRequested")(onGetPrintersRequested)
    __obj.updateDynamic("onGetUsbPrinterInfoRequested")(onGetUsbPrinterInfoRequested)
    __obj.updateDynamic("onPrintRequested")(onPrintRequested)
    __obj.asInstanceOf[Anon_OnGetCapabilityRequested]
  }
}

