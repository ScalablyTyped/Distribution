package typings.chromeApps.chrome.sockets.tcp

import typings.chromeApps.chrome.sockets.CreateInfo
import typings.chromeApps.chrome.sockets.SocketProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcp.create")
@js.native
object create extends js.Object {
  /** Creates a TCP socket. */
  def apply(callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = js.native
  /**
    * Creates a TCP socket.
    * @param properties The socket properties (optional).
    */
  def apply(properties: SocketProperties, callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = js.native
}

