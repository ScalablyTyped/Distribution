package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.Unknown
  - typings.chromeApps.chromeAppsStrings.Offline
  - typings.chromeApps.chromeAppsStrings.Online
  - typings.chromeApps.chromeAppsStrings.Portal
  - typings.chromeApps.chromeAppsStrings.ProxyAuthRequired
*/
trait CaptivePortalStatus extends js.Object

object CaptivePortalStatus {
  @scala.inline
  def Offline: typings.chromeApps.chromeAppsStrings.Offline = this.cast("Offline")
  @scala.inline
  def Online: typings.chromeApps.chromeAppsStrings.Online = this.cast("Online")
  @scala.inline
  def Portal: typings.chromeApps.chromeAppsStrings.Portal = this.cast("Portal")
  @scala.inline
  def ProxyAuthRequired: typings.chromeApps.chromeAppsStrings.ProxyAuthRequired = this.cast("ProxyAuthRequired")
  @scala.inline
  def Unknown: typings.chromeApps.chromeAppsStrings.Unknown = this.cast("Unknown")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

