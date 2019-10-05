package typings.chromeDashApps

import typings.chromeDashApps.chrome.events.Event
import typings.chromeDashApps.chrome.printerProvider.PrintJob
import typings.chromeDashApps.chrome.printerProvider.PrinterCapabilities
import typings.chromeDashApps.chrome.printerProvider.PrinterInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofprinterProvider extends js.Object {
  /** Event fired when print manager requests printer capabilities. */
  val onGetCapabilityRequested: Event[
    js.Function2[
      /* printerId */ String, 
      /* resultCallback */ js.Function1[/* capabilities */ PrinterCapabilities, Unit], 
      Unit
    ]
  ]
  /** Event fired when print manager requests printers provided by extensions. */
  val onGetPrintersRequested: Event[
    js.Function1[
      /* resultCallback */ js.Function1[/* printerInfo */ js.Array[PrinterInfo], Unit], 
      Unit
    ]
  ]
  /**
    * Event fired when print manager requests information about a USB device that may be a printer.
    * Note: An application should not rely on this event being fired more than once per device. If a connected device is supported it should be returned in the onGetPrintersRequested event.
    * @since Chrome 45.
    */
  val onGetUsbPrinterInfoRequested: Event[
    js.Function2[
      /* device */ _, 
      /* resultCallback */ js.Function1[/* printerInfo */ js.UndefOr[PrinterInfo], Unit], 
      Unit
    ]
  ]
  /** Event fired when print manager requests printing. */
  val onPrintRequested: Event[
    js.Function2[
      /* printJob */ PrintJob, 
      /* resultCallback */ js.Function1[/* result */ String, Unit], 
      Unit
    ]
  ]
}

object TypeofprinterProvider {
  @scala.inline
  def apply(
    onGetCapabilityRequested: Event[
      js.Function2[
        /* printerId */ String, 
        /* resultCallback */ js.Function1[/* capabilities */ PrinterCapabilities, Unit], 
        Unit
      ]
    ],
    onGetPrintersRequested: Event[
      js.Function1[
        /* resultCallback */ js.Function1[/* printerInfo */ js.Array[PrinterInfo], Unit], 
        Unit
      ]
    ],
    onGetUsbPrinterInfoRequested: Event[
      js.Function2[
        /* device */ _, 
        /* resultCallback */ js.Function1[/* printerInfo */ js.UndefOr[PrinterInfo], Unit], 
        Unit
      ]
    ],
    onPrintRequested: Event[
      js.Function2[
        /* printJob */ PrintJob, 
        /* resultCallback */ js.Function1[/* result */ String, Unit], 
        Unit
      ]
    ]
  ): TypeofprinterProvider = {
    val __obj = js.Dynamic.literal(onGetCapabilityRequested = onGetCapabilityRequested, onGetPrintersRequested = onGetPrintersRequested, onGetUsbPrinterInfoRequested = onGetUsbPrinterInfoRequested, onPrintRequested = onPrintRequested)
  
    __obj.asInstanceOf[TypeofprinterProvider]
  }
}

