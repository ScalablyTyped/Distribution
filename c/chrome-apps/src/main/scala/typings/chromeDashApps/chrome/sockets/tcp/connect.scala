package typings.chromeDashApps.chrome.sockets.tcp

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcp.connect")
@js.native
object connect extends js.Object {
  /**
    * Connects the socket to a remote machine.
    * When the connect operation completes successfully,
    * onReceive events are raised when data is received from the peer.
    * If a network error occurs while the runtime is receiving packets,
    * a onReceiveError event is raised, at which point no more onReceive
    * event will be raised for this socket until the resume method is called.
    * @param socketId The socket identifier.
    * @param peerAddress The address of the remote machine. DNS name, IPv4 and IPv6 formats are supported.
    * @param peerPort The port of the remote machine.
    * @param callback Called when the connect attempt is complete.
    *                 The result code returned from the underlying network call.
    *                 A negative value indicates an error.
    */
  def apply(
    socketId: integer,
    peerAddress: String,
    peerPort: integer,
    callback: js.Function1[/* result */ integer, Unit]
  ): Unit = js.native
}

