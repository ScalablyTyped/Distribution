package typings.chromeDashApps.chrome.sockets.tcpServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcpServer.getSockets")
@js.native
object getSockets extends js.Object {
  /**
    * Retrieves the list of currently opened sockets owned by the application.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-getSockets
    * @param callback Called when the list of sockets is available.
    */
  def apply(
    callback: js.Function1[
      /* socketInfos */ js.Array[typings.chromeDashApps.chrome.sockets.tcpServer.SocketInfo], 
      Unit
    ]
  ): Unit = js.native
}

