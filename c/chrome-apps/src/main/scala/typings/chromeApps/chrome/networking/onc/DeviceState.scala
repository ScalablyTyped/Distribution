package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The current state of the device. */
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.Uninitialized
  - typings.chromeApps.chromeAppsStrings.Disabled
  - typings.chromeApps.chromeAppsStrings.Enabling
  - typings.chromeApps.chromeAppsStrings.Enabled
  - typings.chromeApps.chromeAppsStrings.Prohibited
*/
trait DeviceState extends js.Object

object DeviceState {
  @scala.inline
  def Disabled: typings.chromeApps.chromeAppsStrings.Disabled = this.cast("Disabled")
  @scala.inline
  def Enabled: typings.chromeApps.chromeAppsStrings.Enabled = this.cast("Enabled")
  @scala.inline
  def Enabling: typings.chromeApps.chromeAppsStrings.Enabling = this.cast("Enabling")
  @scala.inline
  def Prohibited: typings.chromeApps.chromeAppsStrings.Prohibited = this.cast("Prohibited")
  @scala.inline
  def Uninitialized: typings.chromeApps.chromeAppsStrings.Uninitialized = this.cast("Uninitialized")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

