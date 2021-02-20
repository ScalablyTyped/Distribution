package typings.chrome.global.chrome

import typings.chrome.chrome.printerProvider.CapabilityRequestedEvent
import typings.chrome.chrome.printerProvider.PrintRequestedEvent
import typings.chrome.chrome.printerProvider.PrinterInfoRequestedEvent
import typings.chrome.chrome.printerProvider.PrinterRequestedEvent
import org.scalablytyped.runtime.StObject
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
object printerProvider {
  
  @JSGlobal("chrome.printerProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.printerProvider.onGetCapabilityRequested")
  @js.native
  def onGetCapabilityRequested: CapabilityRequestedEvent = js.native
  @scala.inline
  def onGetCapabilityRequested_=(x: CapabilityRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onGetCapabilityRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.printerProvider.onGetPrintersRequested")
  @js.native
  def onGetPrintersRequested: PrinterRequestedEvent = js.native
  @scala.inline
  def onGetPrintersRequested_=(x: PrinterRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onGetPrintersRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.printerProvider.onGetUsbPrinterInfoRequested")
  @js.native
  def onGetUsbPrinterInfoRequested: PrinterInfoRequestedEvent = js.native
  @scala.inline
  def onGetUsbPrinterInfoRequested_=(x: PrinterInfoRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onGetUsbPrinterInfoRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.printerProvider.onPrintRequested")
  @js.native
  def onPrintRequested: PrintRequestedEvent = js.native
  @scala.inline
  def onPrintRequested_=(x: PrintRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPrintRequested")(x.asInstanceOf[js.Any])
}
