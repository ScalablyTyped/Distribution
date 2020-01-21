package typings.chromeApps.chrome.sockets.tcp

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.sockets.ReceiveErrorEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event raised when a network error occured while the runtime was
  * waiting for data on the socket address and port. Once this event
  * is raised, the socket is set to paused and no more onReceive
  * events are raised for this socket.
  */
@JSGlobal("chrome.sockets.tcp.onReceiveError")
@js.native
object onReceiveError
  extends TopLevel[Event[js.Function1[/* args */ ReceiveErrorEventArgs, Unit]]]

