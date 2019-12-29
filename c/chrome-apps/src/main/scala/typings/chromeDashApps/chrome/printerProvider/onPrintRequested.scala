package typings.chromeDashApps.chrome.printerProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event fired when print manager requests printing. */
@JSGlobal("chrome.printerProvider.onPrintRequested")
@js.native
object onPrintRequested
  extends TopLevel[
      Event[
        js.Function2[
          /* printJob */ PrintJob, 
          /* resultCallback */ js.Function1[/* result */ String, Unit], 
          Unit
        ]
      ]
    ]

