package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofprinterProvider extends js.Object {
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
  ]
  /** Event fired when print manager requests printers provided by extensions. */
  val onGetPrintersRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.Array[chromeDashAppsLib.chromeNs.printerProviderNs.PrinterInfo], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  /**
    * Event fired when print manager requests information about a USB device that may be a printer.
    * Note: An application should not rely on this event being fired more than once per device. If a connected device is supported it should be returned in the onGetPrintersRequested event.
    * @since Chrome 45.
    */
  val onGetUsbPrinterInfoRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* device */ _, 
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.UndefOr[chromeDashAppsLib.chromeNs.printerProviderNs.PrinterInfo], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  /** Event fired when print manager requests printing. */
  val onPrintRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* printJob */ chromeDashAppsLib.chromeNs.printerProviderNs.PrintJob, 
      /* resultCallback */ js.Function1[/* result */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
}

object TypeofprinterProvider {
  @scala.inline
  def apply(
    onGetCapabilityRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
      js.Function2[
        /* printerId */ java.lang.String, 
        /* resultCallback */ js.Function1[
          /* capabilities */ chromeDashAppsLib.chromeNs.printerProviderNs.PrinterCapabilities, 
          scala.Unit
        ], 
        scala.Unit
      ]
    ],
    onGetPrintersRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
      js.Function1[
        /* resultCallback */ js.Function1[
          /* printerInfo */ js.Array[chromeDashAppsLib.chromeNs.printerProviderNs.PrinterInfo], 
          scala.Unit
        ], 
        scala.Unit
      ]
    ],
    onGetUsbPrinterInfoRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
      js.Function2[
        /* device */ _, 
        /* resultCallback */ js.Function1[
          /* printerInfo */ js.UndefOr[chromeDashAppsLib.chromeNs.printerProviderNs.PrinterInfo], 
          scala.Unit
        ], 
        scala.Unit
      ]
    ],
    onPrintRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
      js.Function2[
        /* printJob */ chromeDashAppsLib.chromeNs.printerProviderNs.PrintJob, 
        /* resultCallback */ js.Function1[/* result */ java.lang.String, scala.Unit], 
        scala.Unit
      ]
    ]
  ): TypeofprinterProvider = {
    val __obj = js.Dynamic.literal(onGetCapabilityRequested = onGetCapabilityRequested, onGetPrintersRequested = onGetPrintersRequested, onGetUsbPrinterInfoRequested = onGetUsbPrinterInfoRequested, onPrintRequested = onPrintRequested)
  
    __obj.asInstanceOf[TypeofprinterProvider]
  }
}

