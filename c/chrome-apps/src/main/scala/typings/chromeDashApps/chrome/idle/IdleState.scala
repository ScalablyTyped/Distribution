package typings.chromeDashApps.chrome.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.active
  - typings.chromeDashApps.chromeDashAppsStrings.idle
  - typings.chromeDashApps.chromeDashAppsStrings.locked
*/
trait IdleState extends js.Object

object IdleState {
  @scala.inline
  def active: typings.chromeDashApps.chromeDashAppsStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idle: typings.chromeDashApps.chromeDashAppsStrings.idle = this.cast("idle")
  @scala.inline
  def locked: typings.chromeDashApps.chromeDashAppsStrings.locked = this.cast("locked")
}

