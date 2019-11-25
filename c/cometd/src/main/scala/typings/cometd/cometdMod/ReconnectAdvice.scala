package typings.cometd.cometdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cometd.cometdStrings.retry
  - typings.cometd.cometdStrings.handshake
  - typings.cometd.cometdStrings.none
*/
trait ReconnectAdvice extends js.Object

object ReconnectAdvice {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def handshake: typings.cometd.cometdStrings.handshake = this.cast("handshake")
  @scala.inline
  def none: typings.cometd.cometdStrings.none = this.cast("none")
  @scala.inline
  def retry: typings.cometd.cometdStrings.retry = this.cast("retry")
}

