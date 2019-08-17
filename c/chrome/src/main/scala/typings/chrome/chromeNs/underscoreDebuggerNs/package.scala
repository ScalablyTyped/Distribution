package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object underscoreDebuggerNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type DebuggerDetachedEvent = Event[js.Function2[/* source */ Debuggee, /* reason */ String, Unit]]
  type DebuggerEventEvent = Event[
    js.Function3[/* source */ Debuggee, /* method */ String, /* params */ js.UndefOr[js.Object], Unit]
  ]
}
