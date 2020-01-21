package typings.chromeApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * String indicating the reason for the exit.
  */
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.normal
  - typings.chromeApps.chromeAppsStrings.abnormal
  - typings.chromeApps.chromeAppsStrings.crash
  - typings.chromeApps.chromeAppsStrings.kill
*/
trait ExitEventReason extends js.Object

object ExitEventReason {
  @scala.inline
  def abnormal: typings.chromeApps.chromeAppsStrings.abnormal = this.cast("abnormal")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crash: typings.chromeApps.chromeAppsStrings.crash = this.cast("crash")
  @scala.inline
  def kill: typings.chromeApps.chromeAppsStrings.kill = this.cast("kill")
  @scala.inline
  def normal: typings.chromeApps.chromeAppsStrings.normal = this.cast("normal")
}

