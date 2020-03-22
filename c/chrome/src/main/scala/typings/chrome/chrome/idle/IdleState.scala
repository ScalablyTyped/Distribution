package typings.chrome.chrome.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chrome.chromeStrings.active
  - typings.chrome.chromeStrings.idle
  - typings.chrome.chromeStrings.locked
*/
trait IdleState extends js.Object

object IdleState {
  @scala.inline
  def active: typings.chrome.chromeStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idle: typings.chrome.chromeStrings.idle = this.cast("idle")
  @scala.inline
  def locked: typings.chrome.chromeStrings.locked = this.cast("locked")
}

