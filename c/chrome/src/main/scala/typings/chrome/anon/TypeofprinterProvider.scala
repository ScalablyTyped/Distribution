package typings.chrome.anon

import typings.chrome.chrome.printerProvider.CapabilityRequestedEvent
import typings.chrome.chrome.printerProvider.PrintRequestedEvent
import typings.chrome.chrome.printerProvider.PrinterInfoRequestedEvent
import typings.chrome.chrome.printerProvider.PrinterRequestedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofprinterProvider extends js.Object {
  var onGetCapabilityRequested: CapabilityRequestedEvent = js.native
  var onGetPrintersRequested: PrinterRequestedEvent = js.native
  var onGetUsbPrinterInfoRequested: PrinterInfoRequestedEvent = js.native
  var onPrintRequested: PrintRequestedEvent = js.native
}

object TypeofprinterProvider {
  @scala.inline
  def apply(
    onGetCapabilityRequested: CapabilityRequestedEvent,
    onGetPrintersRequested: PrinterRequestedEvent,
    onGetUsbPrinterInfoRequested: PrinterInfoRequestedEvent,
    onPrintRequested: PrintRequestedEvent
  ): TypeofprinterProvider = {
    val __obj = js.Dynamic.literal(onGetCapabilityRequested = onGetCapabilityRequested.asInstanceOf[js.Any], onGetPrintersRequested = onGetPrintersRequested.asInstanceOf[js.Any], onGetUsbPrinterInfoRequested = onGetUsbPrinterInfoRequested.asInstanceOf[js.Any], onPrintRequested = onPrintRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofprinterProvider]
  }
  @scala.inline
  implicit class TypeofprinterProviderOps[Self <: TypeofprinterProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnGetCapabilityRequested(value: CapabilityRequestedEvent): Self = this.set("onGetCapabilityRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnGetPrintersRequested(value: PrinterRequestedEvent): Self = this.set("onGetPrintersRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnGetUsbPrinterInfoRequested(value: PrinterInfoRequestedEvent): Self = this.set("onGetUsbPrinterInfoRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPrintRequested(value: PrintRequestedEvent): Self = this.set("onPrintRequested", value.asInstanceOf[js.Any])
  }
  
}

