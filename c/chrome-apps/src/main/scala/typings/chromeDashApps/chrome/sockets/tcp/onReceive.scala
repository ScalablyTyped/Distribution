package typings.chromeDashApps.chrome.sockets.tcp

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.sockets.ReceiveEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event raised when data has been received for a given socket. */
@JSGlobal("chrome.sockets.tcp.onReceive")
@js.native
object onReceive
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* args */ ReceiveEventArgs, Unit]]
    ]

