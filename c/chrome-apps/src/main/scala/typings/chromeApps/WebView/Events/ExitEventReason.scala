package typings.chromeApps.WebView.Events

import typings.chromeApps.chromeAppsStrings.normal_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * String indicating the reason for the exit.
  */
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.normal_
  - typings.chromeApps.chromeAppsStrings.abnormal
  - typings.chromeApps.chromeAppsStrings.crash
  - typings.chromeApps.chromeAppsStrings.kill
*/
trait ExitEventReason extends js.Object

object ExitEventReason {
  @scala.inline
  def abnormal: typings.chromeApps.chromeAppsStrings.abnormal = "abnormal".asInstanceOf[typings.chromeApps.chromeAppsStrings.abnormal]
  @scala.inline
  def crash: typings.chromeApps.chromeAppsStrings.crash = "crash".asInstanceOf[typings.chromeApps.chromeAppsStrings.crash]
  @scala.inline
  def kill: typings.chromeApps.chromeAppsStrings.kill = "kill".asInstanceOf[typings.chromeApps.chromeAppsStrings.kill]
  @scala.inline
  def normal: normal_ = "normal".asInstanceOf[normal_]
}

