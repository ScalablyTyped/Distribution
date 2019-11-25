package typings.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The current state of the device. */
/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.Uninitialized
  - typings.chromeDashApps.chromeDashAppsStrings.Disabled
  - typings.chromeDashApps.chromeDashAppsStrings.Enabling
  - typings.chromeDashApps.chromeDashAppsStrings.Enabled
  - typings.chromeDashApps.chromeDashAppsStrings.Prohibited
*/
trait DeviceState extends js.Object

object DeviceState {
  @scala.inline
  def Disabled: typings.chromeDashApps.chromeDashAppsStrings.Disabled = this.cast("Disabled")
  @scala.inline
  def Enabled: typings.chromeDashApps.chromeDashAppsStrings.Enabled = this.cast("Enabled")
  @scala.inline
  def Enabling: typings.chromeDashApps.chromeDashAppsStrings.Enabling = this.cast("Enabling")
  @scala.inline
  def Prohibited: typings.chromeDashApps.chromeDashAppsStrings.Prohibited = this.cast("Prohibited")
  @scala.inline
  def Uninitialized: typings.chromeDashApps.chromeDashAppsStrings.Uninitialized = this.cast("Uninitialized")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

