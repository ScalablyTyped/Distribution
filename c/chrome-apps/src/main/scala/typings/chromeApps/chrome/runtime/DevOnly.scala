package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.appDotwindowDotalpha
  - typings.chromeApps.chromeAppsStrings.diagnostics
  - typings.chromeApps.chromeAppsStrings.displaySource
  - typings.chromeApps.chromeAppsStrings.signedInDevices
*/
trait DevOnly extends js.Object

object DevOnly {
  @scala.inline
  def appDotwindowDotalpha: typings.chromeApps.chromeAppsStrings.appDotwindowDotalpha = this.cast("app.window.alpha")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diagnostics: typings.chromeApps.chromeAppsStrings.diagnostics = this.cast("diagnostics")
  @scala.inline
  def displaySource: typings.chromeApps.chromeAppsStrings.displaySource = this.cast("displaySource")
  @scala.inline
  def signedInDevices: typings.chromeApps.chromeAppsStrings.signedInDevices = this.cast("signedInDevices")
}

