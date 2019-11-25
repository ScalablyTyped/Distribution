package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.audio
  - typings.chromeDashApps.chromeDashAppsStrings.networkingDOTonc
  - typings.chromeDashApps.chromeDashAppsStrings.systemDOTpowerSource
  - typings.chromeDashApps.chromeDashAppsStrings.virtualKeyboard
*/
trait KioskOnlyPermissions extends Permission

object KioskOnlyPermissions {
  @scala.inline
  def audio: typings.chromeDashApps.chromeDashAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def networkingDOTonc: typings.chromeDashApps.chromeDashAppsStrings.networkingDOTonc = this.cast("networking.onc")
  @scala.inline
  def systemDOTpowerSource: typings.chromeDashApps.chromeDashAppsStrings.systemDOTpowerSource = this.cast("system.powerSource")
  @scala.inline
  def virtualKeyboard: typings.chromeDashApps.chromeDashAppsStrings.virtualKeyboard = this.cast("virtualKeyboard")
}

