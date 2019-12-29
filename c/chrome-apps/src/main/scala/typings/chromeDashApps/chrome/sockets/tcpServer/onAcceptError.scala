package typings.chromeDashApps.chrome.sockets.tcpServer

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import typings.chromeDashApps.chrome.sockets.AcceptErrorEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event raised when a network error occured while the runtime was waiting
  * for new connections on the socket address and port. Once this event is
  * raised, the socket is set to paused and no more onAccept events are
  * raised for this socket until the socket is resumed.
  *
  * @see https://developer.chrome.com/apps/sockets_tcpServer#event-onAcceptError
  */
@JSGlobal("chrome.sockets.tcpServer.onAcceptError")
@js.native
object onAcceptError
  extends TopLevel[Event[js.Function1[/* args */ AcceptErrorEventArgs, Unit]]]

