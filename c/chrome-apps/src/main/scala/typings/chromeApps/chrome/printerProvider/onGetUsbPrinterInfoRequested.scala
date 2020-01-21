package typings.chromeApps.chrome.printerProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event fired when print manager requests information about a USB device that may be a printer.
  * Note: An application should not rely on this event being fired more than once per device. If a connected device is supported it should be returned in the onGetPrintersRequested event.
  * @since Chrome 45.
  */
@JSGlobal("chrome.printerProvider.onGetUsbPrinterInfoRequested")
@js.native
object onGetUsbPrinterInfoRequested
  extends TopLevel[
      Event[
        js.Function2[
          /* device */ js.Any, 
          /* resultCallback */ js.Function1[/* printerInfo */ js.UndefOr[PrinterInfo], Unit], 
          Unit
        ]
      ]
    ]

