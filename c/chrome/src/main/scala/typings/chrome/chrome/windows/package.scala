package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windows {
  import typings.chrome.chrome.events.Event

  type WindowIdEvent = Event[
    js.Function2[/* windowId */ Double, /* filters */ js.UndefOr[WindowEventFilter], Unit]
  ]
  type WindowReferenceEvent = Event[
    js.Function2[/* window */ Window, /* filters */ js.UndefOr[WindowEventFilter], Unit]
  ]
}
