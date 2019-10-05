package typings.chromeDashApps.chrome.sockets.tcpServer

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcpServer.listen")
@js.native
object listen extends js.Object {
  /**
    * Listens for connections on the specified port and address. If the
    * port/address is in use, the callback indicates a failure.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-listen
    * @param socketId The socket identifier.
    * @param address  The address of the local machine.
    * @param port     The port of the local machine. When set to 0, a free port
    *                 is chosen dynamically. The dynamically allocated port can
    *                 be found by calling getInfo.
    * @param backlog  Length of the socket's listen queue. The default value
    *                 depends on the Operating System (SOMAXCONN), which
    *                 ensures a reasonable queue length for most applications.
    * @param callback Called when listen operation completes.
    */
  def apply(
    socketId: integer,
    address: String,
    port: integer,
    backlog: integer,
    callback: js.Function1[/* result */ integer, Unit]
  ): Unit = js.native
  /**
    * Listens for connections on the specified port and address. If the
    * port/address is in use, the callback indicates a failure.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-listen
    * @param socketId The socket identifier.
    * @param address  The address of the local machine.
    * @param port     The port of the local machine. When set to 0, a free port
    *                 is chosen dynamically. The dynamically allocated port can
    *                 be found by calling getInfo.
    * @param callback Called when listen operation completes.
    */
  def apply(
    socketId: integer,
    address: String,
    port: integer,
    callback: js.Function1[/* result */ integer, Unit]
  ): Unit = js.native
}

