package typings.chrome.anon

import typings.chrome.chrome.printerProvider.CapabilityRequestedEvent
import typings.chrome.chrome.printerProvider.PrintRequestedEvent
import typings.chrome.chrome.printerProvider.PrinterInfoRequestedEvent
import typings.chrome.chrome.printerProvider.PrinterRequestedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofprinterProvider extends StObject {
  
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
    val __obj = js.Dynamic.literal(onGetCapabilityRequested = onGetCapabilityRequested.asInstanceOf[js.Any], onGetPrintersRequested = onGetPrintersRequested.asInstanceOf[js.Any], onGetUsbPrinterInfoRequested = onGetUsbPrinterInfoRequested.asInstanceOf[js.Any], onPrintRequested = onPrintRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofprinterProvider]
  }
  
  @scala.inline
  implicit class TypeofprinterProviderMutableBuilder[Self <: TypeofprinterProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnGetCapabilityRequested(value: CapabilityRequestedEvent): Self = StObject.set(x, "onGetCapabilityRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnGetPrintersRequested(value: PrinterRequestedEvent): Self = StObject.set(x, "onGetPrintersRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnGetUsbPrinterInfoRequested(value: PrinterInfoRequestedEvent): Self = StObject.set(x, "onGetUsbPrinterInfoRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPrintRequested(value: PrintRequestedEvent): Self = StObject.set(x, "onPrintRequested", value.asInstanceOf[js.Any])
  }
}
