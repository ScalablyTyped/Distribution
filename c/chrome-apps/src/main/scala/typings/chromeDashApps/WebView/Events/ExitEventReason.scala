package typings.chromeDashApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * String indicating the reason for the exit.
  */
/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.normal
  - typings.chromeDashApps.chromeDashAppsStrings.abnormal
  - typings.chromeDashApps.chromeDashAppsStrings.crash
  - typings.chromeDashApps.chromeDashAppsStrings.kill
*/
trait ExitEventReason extends js.Object

object ExitEventReason {
  @scala.inline
  def abnormal: typings.chromeDashApps.chromeDashAppsStrings.abnormal = this.cast("abnormal")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crash: typings.chromeDashApps.chromeDashAppsStrings.crash = this.cast("crash")
  @scala.inline
  def kill: typings.chromeDashApps.chromeDashAppsStrings.kill = this.cast("kill")
  @scala.inline
  def normal: typings.chromeDashApps.chromeDashAppsStrings.normal = this.cast("normal")
}

