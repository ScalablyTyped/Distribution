package typings.chromeApps.chrome.bluetoothSocket

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event raised when a network error occured while the runtime
  * was waiting for data on the socket. Once this event is raised,
  * the socket is set to paused and no more onReceive events are
  * raised for this socket.
  */
@JSGlobal("chrome.bluetoothSocket.onReceiveError")
@js.native
object onReceiveError extends TopLevel[OnReceiveErrorEvent]

