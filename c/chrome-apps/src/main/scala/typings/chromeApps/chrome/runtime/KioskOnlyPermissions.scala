package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.audio
  - typings.chromeApps.chromeAppsStrings.networkingDotonc
  - typings.chromeApps.chromeAppsStrings.systemDotpowerSource
  - typings.chromeApps.chromeAppsStrings.virtualKeyboard
*/
trait KioskOnlyPermissions extends Permission

object KioskOnlyPermissions {
  @scala.inline
  def audio: typings.chromeApps.chromeAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def networkingDotonc: typings.chromeApps.chromeAppsStrings.networkingDotonc = this.cast("networking.onc")
  @scala.inline
  def systemDotpowerSource: typings.chromeApps.chromeAppsStrings.systemDotpowerSource = this.cast("system.powerSource")
  @scala.inline
  def virtualKeyboard: typings.chromeApps.chromeAppsStrings.virtualKeyboard = this.cast("virtualKeyboard")
}

