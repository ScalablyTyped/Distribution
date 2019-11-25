package typings.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.Direct
  - typings.chromeDashApps.chromeDashAppsStrings.Manual
  - typings.chromeDashApps.chromeDashAppsStrings.PAC
  - typings.chromeDashApps.chromeDashAppsStrings.WPAD
*/
trait ProxySettingsType extends js.Object

object ProxySettingsType {
  @scala.inline
  def Direct: typings.chromeDashApps.chromeDashAppsStrings.Direct = this.cast("Direct")
  @scala.inline
  def Manual: typings.chromeDashApps.chromeDashAppsStrings.Manual = this.cast("Manual")
  @scala.inline
  def PAC: typings.chromeDashApps.chromeDashAppsStrings.PAC = this.cast("PAC")
  @scala.inline
  def WPAD: typings.chromeDashApps.chromeDashAppsStrings.WPAD = this.cast("WPAD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

