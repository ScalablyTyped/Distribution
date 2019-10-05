package typings.chromeDashApps.chrome.sockets.tcpServer

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.sockets.AcceptEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event raised when a connection has been made to the server socket.
  *
  * @see https://developer.chrome.com/apps/sockets_tcpServer#event-onAccept
  */
@JSGlobal("chrome.sockets.tcpServer.onAccept")
@js.native
object onAccept
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* args */ AcceptEventArgs, Unit]]
    ]

