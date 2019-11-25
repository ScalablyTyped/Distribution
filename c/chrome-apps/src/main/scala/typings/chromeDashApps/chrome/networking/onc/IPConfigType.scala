package typings.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.DHCP
  - typings.chromeDashApps.chromeDashAppsStrings.Static
*/
trait IPConfigType extends js.Object

object IPConfigType {
  @scala.inline
  def DHCP: typings.chromeDashApps.chromeDashAppsStrings.DHCP = this.cast("DHCP")
  @scala.inline
  def Static: typings.chromeDashApps.chromeDashAppsStrings.Static = this.cast("Static")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

