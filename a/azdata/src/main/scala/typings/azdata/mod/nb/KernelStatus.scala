package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.azdata.azdataStrings.unknown
  - typings.azdata.azdataStrings.starting
  - typings.azdata.azdataStrings.reconnecting
  - typings.azdata.azdataStrings.idle
  - typings.azdata.azdataStrings.busy
  - typings.azdata.azdataStrings.restarting
  - typings.azdata.azdataStrings.dead
  - typings.azdata.azdataStrings.connected
*/
trait KernelStatus extends js.Object

object KernelStatus {
  @scala.inline
  def busy: typings.azdata.azdataStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.azdata.azdataStrings.connected = this.cast("connected")
  @scala.inline
  def dead: typings.azdata.azdataStrings.dead = this.cast("dead")
  @scala.inline
  def idle: typings.azdata.azdataStrings.idle = this.cast("idle")
  @scala.inline
  def reconnecting: typings.azdata.azdataStrings.reconnecting = this.cast("reconnecting")
  @scala.inline
  def restarting: typings.azdata.azdataStrings.restarting = this.cast("restarting")
  @scala.inline
  def starting: typings.azdata.azdataStrings.starting = this.cast("starting")
  @scala.inline
  def unknown: typings.azdata.azdataStrings.unknown = this.cast("unknown")
}

