package typings.chromeApps.chrome.sockets.tcp

import typings.chromeApps.chrome.sockets.SocketInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcp.getSockets")
@js.native
object getSockets extends js.Object {
  /**
    * @description Retrieves the list of currently opened sockets owned by the application.
    * @param callback Called when the list of sockets is available. Provides an array of socket info.
    */
  def apply(callback: js.Function1[/* socketInfos */ js.Array[SocketInfo], Unit]): Unit = js.native
}

