package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object _debugger {
  import typings.chrome.chrome.events.Event

  type DebuggerDetachedEvent = Event[js.Function2[/* source */ Debuggee, /* reason */ String, Unit]]
  type DebuggerEventEvent = Event[
    js.Function3[/* source */ Debuggee, /* method */ String, /* params */ js.UndefOr[js.Object], Unit]
  ]
}
