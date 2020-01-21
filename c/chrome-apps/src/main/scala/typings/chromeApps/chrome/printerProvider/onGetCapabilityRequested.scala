package typings.chromeApps.chrome.printerProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event fired when print manager requests printer capabilities. */
@JSGlobal("chrome.printerProvider.onGetCapabilityRequested")
@js.native
object onGetCapabilityRequested
  extends TopLevel[
      Event[
        js.Function2[
          /* printerId */ String, 
          /* resultCallback */ js.Function1[/* capabilities */ PrinterCapabilities, Unit], 
          Unit
        ]
      ]
    ]

