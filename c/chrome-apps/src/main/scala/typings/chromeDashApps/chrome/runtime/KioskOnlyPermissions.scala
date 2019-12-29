package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.audio
  - typings.chromeDashApps.chromeDashAppsStrings.networkingDotonc
  - typings.chromeDashApps.chromeDashAppsStrings.systemDotpowerSource
  - typings.chromeDashApps.chromeDashAppsStrings.virtualKeyboard
*/
trait KioskOnlyPermissions extends Permission

object KioskOnlyPermissions {
  @scala.inline
  def audio: typings.chromeDashApps.chromeDashAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def networkingDotonc: typings.chromeDashApps.chromeDashAppsStrings.networkingDotonc = this.cast("networking.onc")
  @scala.inline
  def systemDotpowerSource: typings.chromeDashApps.chromeDashAppsStrings.systemDotpowerSource = this.cast("system.powerSource")
  @scala.inline
  def virtualKeyboard: typings.chromeDashApps.chromeDashAppsStrings.virtualKeyboard = this.cast("virtualKeyboard")
}

