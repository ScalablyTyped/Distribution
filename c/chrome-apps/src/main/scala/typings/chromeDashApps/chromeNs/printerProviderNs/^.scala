package typings.chromeDashApps.chromeNs.printerProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.printerProvider")
@js.native
object ^ extends js.Object {
  /** Event fired when print manager requests printer capabilities. */
  val onGetCapabilityRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function2[
      /* printerId */ String, 
      /* resultCallback */ js.Function1[/* capabilities */ PrinterCapabilities, Unit], 
      Unit
    ]
  ] = js.native
  /** Event fired when print manager requests printers provided by extensions. */
  val onGetPrintersRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
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
  val onGetUsbPrinterInfoRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function2[
      /* device */ js.Any, 
      /* resultCallback */ js.Function1[/* printerInfo */ js.UndefOr[PrinterInfo], Unit], 
      Unit
    ]
  ] = js.native
  /** Event fired when print manager requests printing. */
  val onPrintRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function2[
      /* printJob */ PrintJob, 
      /* resultCallback */ js.Function1[/* result */ String, Unit], 
      Unit
    ]
  ] = js.native
}

