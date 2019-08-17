package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windowsNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type WindowIdEvent = Event[
    js.Function2[/* windowId */ Double, /* filters */ js.UndefOr[WindowEventFilter], Unit]
  ]
  type WindowReferenceEvent = Event[
    js.Function2[
      /* window */ typings.chrome.chromeNs.windowsNs.Window, 
      /* filters */ js.UndefOr[WindowEventFilter], 
      Unit
    ]
  ]
}
