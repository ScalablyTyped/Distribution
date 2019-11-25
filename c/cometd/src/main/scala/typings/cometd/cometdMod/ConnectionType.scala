package typings.cometd.cometdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cometd.cometdStrings.`long-polling`
  - typings.cometd.cometdStrings.`callback-polling`
  - typings.cometd.cometdStrings.iframe
  - typings.cometd.cometdStrings.flash
*/
trait ConnectionType extends js.Object

object ConnectionType {
  @scala.inline
  def `callback-polling`: typings.cometd.cometdStrings.`callback-polling` = this.cast("callback-polling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def flash: typings.cometd.cometdStrings.flash = this.cast("flash")
  @scala.inline
  def iframe: typings.cometd.cometdStrings.iframe = this.cast("iframe")
  @scala.inline
  def `long-polling`: typings.cometd.cometdStrings.`long-polling` = this.cast("long-polling")
}

