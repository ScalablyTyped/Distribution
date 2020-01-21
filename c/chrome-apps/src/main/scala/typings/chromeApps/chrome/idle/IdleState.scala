package typings.chromeApps.chrome.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.active
  - typings.chromeApps.chromeAppsStrings.idle
  - typings.chromeApps.chromeAppsStrings.locked
*/
trait IdleState extends js.Object

object IdleState {
  @scala.inline
  def active: typings.chromeApps.chromeAppsStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idle: typings.chromeApps.chromeAppsStrings.idle = this.cast("idle")
  @scala.inline
  def locked: typings.chromeApps.chromeAppsStrings.locked = this.cast("locked")
}

