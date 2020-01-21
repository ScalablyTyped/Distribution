package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.DHCP
  - typings.chromeApps.chromeAppsStrings.Static
*/
trait IPConfigType extends js.Object

object IPConfigType {
  @scala.inline
  def DHCP: typings.chromeApps.chromeAppsStrings.DHCP = this.cast("DHCP")
  @scala.inline
  def Static: typings.chromeApps.chromeAppsStrings.Static = this.cast("Static")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

