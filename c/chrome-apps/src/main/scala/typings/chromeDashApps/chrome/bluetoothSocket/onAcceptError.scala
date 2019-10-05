package typings.chromeDashApps.chrome.bluetoothSocket

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event raised when a network error occurred while the
  * runtime was waiting for new connections on the given
  * socket. Once this event is raised, the socket is set
  * to paused and no more onAccept events are raised for
  * this socket.
  */
@JSGlobal("chrome.bluetoothSocket.onAcceptError")
@js.native
object onAcceptError extends TopLevel[OnAcceptErrorEvent]

