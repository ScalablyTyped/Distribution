package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.Direct
  - typings.chromeApps.chromeAppsStrings.Manual
  - typings.chromeApps.chromeAppsStrings.PAC
  - typings.chromeApps.chromeAppsStrings.WPAD
*/
trait ProxySettingsType extends js.Object

object ProxySettingsType {
  @scala.inline
  def Direct: typings.chromeApps.chromeAppsStrings.Direct = this.cast("Direct")
  @scala.inline
  def Manual: typings.chromeApps.chromeAppsStrings.Manual = this.cast("Manual")
  @scala.inline
  def PAC: typings.chromeApps.chromeAppsStrings.PAC = this.cast("PAC")
  @scala.inline
  def WPAD: typings.chromeApps.chromeAppsStrings.WPAD = this.cast("WPAD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

