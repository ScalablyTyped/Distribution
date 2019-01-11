package typings
package chromeDashAppsLib.chromeNs.printerProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.printerProvider")
@js.native
object ^ extends js.Object {
  /** Event fired when print manager requests printer capabilities. */
  val onGetCapabilityRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* printerId */ java.lang.String, 
      /* resultCallback */ js.Function1[
        /* capabilities */ chromeDashAppsLib.chromeNs.printerProviderNs.PrinterCapabilities, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.native
  /** Event fired when print manager requests printers provided by extensions. */
  val onGetPrintersRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.Array[chromeDashAppsLib.chromeNs.printerProviderNs.PrinterInfo], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.native
  /**
    * Event fired when print manager requests information about a USB device that may be a printer.
    * Note: An application should not rely on this event being fired more than once per device. If a connected device is supported it should be returned in the onGetPrintersRequested event.
    * @since Chrome 45.
    */
  val onGetUsbPrinterInfoRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* device */ js.Any, 
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.UndefOr[chromeDashAppsLib.chromeNs.printerProviderNs.PrinterInfo], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.native
  /** Event fired when print manager requests printing. */
  val onPrintRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* printJob */ chromeDashAppsLib.chromeNs.printerProviderNs.PrintJob, 
      /* resultCallback */ js.Function1[/* result */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ] = js.native
}

