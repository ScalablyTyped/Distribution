package typings.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cometd.cometdStrings.disconnected
  - typings.cometd.cometdStrings.disconnecting
  - typings.cometd.cometdStrings.handshaking
  - typings.cometd.cometdStrings.connected
  - typings.cometd.cometdStrings.connecting
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.cometd.cometdStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typings.cometd.cometdStrings.connecting = this.cast("connecting")
  @scala.inline
  def disconnected: typings.cometd.cometdStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typings.cometd.cometdStrings.disconnecting = this.cast("disconnecting")
  @scala.inline
  def handshaking: typings.cometd.cometdStrings.handshaking = this.cast("handshaking")
}

