package typings.chromeApps.anon

import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.printerProvider.PrintJob
import typings.chromeApps.chrome.printerProvider.PrinterCapabilities
import typings.chromeApps.chrome.printerProvider.PrinterInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofprinterProvider extends StObject {
  
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
      /* device */ js.Any, 
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
  
  inline def apply(
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
        /* device */ js.Any, 
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
    val __obj = js.Dynamic.literal(onGetCapabilityRequested = onGetCapabilityRequested.asInstanceOf[js.Any], onGetPrintersRequested = onGetPrintersRequested.asInstanceOf[js.Any], onGetUsbPrinterInfoRequested = onGetUsbPrinterInfoRequested.asInstanceOf[js.Any], onPrintRequested = onPrintRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofprinterProvider]
  }
  
  extension [Self <: TypeofprinterProvider](x: Self) {
    
    inline def setOnGetCapabilityRequested(
      value: Event[
          js.Function2[
            /* printerId */ String, 
            /* resultCallback */ js.Function1[/* capabilities */ PrinterCapabilities, Unit], 
            Unit
          ]
        ]
    ): Self = StObject.set(x, "onGetCapabilityRequested", value.asInstanceOf[js.Any])
    
    inline def setOnGetPrintersRequested(
      value: Event[
          js.Function1[
            /* resultCallback */ js.Function1[/* printerInfo */ js.Array[PrinterInfo], Unit], 
            Unit
          ]
        ]
    ): Self = StObject.set(x, "onGetPrintersRequested", value.asInstanceOf[js.Any])
    
    inline def setOnGetUsbPrinterInfoRequested(
      value: Event[
          js.Function2[
            /* device */ js.Any, 
            /* resultCallback */ js.Function1[/* printerInfo */ js.UndefOr[PrinterInfo], Unit], 
            Unit
          ]
        ]
    ): Self = StObject.set(x, "onGetUsbPrinterInfoRequested", value.asInstanceOf[js.Any])
    
    inline def setOnPrintRequested(
      value: Event[
          js.Function2[
            /* printJob */ PrintJob, 
            /* resultCallback */ js.Function1[/* result */ String, Unit], 
            Unit
          ]
        ]
    ): Self = StObject.set(x, "onPrintRequested", value.asInstanceOf[js.Any])
  }
}
