package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.printerProvider.PrintJob
import typings.chromeApps.chrome.printerProvider.PrinterCapabilities
import typings.chromeApps.chrome.printerProvider.PrinterInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.printerProvider
//////////////////////
// Printer Provider //
//////////////////////
/**
  * The chrome.printerProvider API exposes events used by print manager
  * to query printers controlled by extensions, to query their
  * capabilities and to submit print jobs to these printers.
  *
  * @requires Permissions: 'printerProvider'
  * @since Chrome 44.
  */
object printerProvider {
  
  /** Event fired when print manager requests printer capabilities. */
  @JSGlobal("chrome.printerProvider.onGetCapabilityRequested")
  @js.native
  val onGetCapabilityRequested: typings.chromeApps.chrome.events.Event[
    js.Function2[
      /* printerId */ String, 
      /* resultCallback */ js.Function1[/* capabilities */ PrinterCapabilities, Unit], 
      Unit
    ]
  ] = js.native
  
  /** Event fired when print manager requests printers provided by extensions. */
  @JSGlobal("chrome.printerProvider.onGetPrintersRequested")
  @js.native
  val onGetPrintersRequested: typings.chromeApps.chrome.events.Event[
    js.Function1[
      /* resultCallback */ js.Function1[/* printerInfo */ js.Array[PrinterInfo], Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Event fired when print manager requests information about a USB device that may be a printer.
    * Note: An application should not rely on this event being fired more than once per device. If a connected device is supported it should be returned in the onGetPrintersRequested event.
    * @since Chrome 45.
    */
  @JSGlobal("chrome.printerProvider.onGetUsbPrinterInfoRequested")
  @js.native
  val onGetUsbPrinterInfoRequested: typings.chromeApps.chrome.events.Event[
    js.Function2[
      /* device */ js.Any, 
      /* resultCallback */ js.Function1[/* printerInfo */ js.UndefOr[PrinterInfo], Unit], 
      Unit
    ]
  ] = js.native
  
  /** Event fired when print manager requests printing. */
  @JSGlobal("chrome.printerProvider.onPrintRequested")
  @js.native
  val onPrintRequested: typings.chromeApps.chrome.events.Event[
    js.Function2[
      /* printJob */ PrintJob, 
      /* resultCallback */ js.Function1[/* result */ String, Unit], 
      Unit
    ]
  ] = js.native
}
