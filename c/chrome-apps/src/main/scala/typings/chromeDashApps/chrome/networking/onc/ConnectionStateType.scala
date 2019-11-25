package typings.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.Connected
  - typings.chromeDashApps.chromeDashAppsStrings.Connecting
  - typings.chromeDashApps.chromeDashAppsStrings.NotConnected
*/
trait ConnectionStateType extends js.Object

object ConnectionStateType {
  @scala.inline
  def Connected: typings.chromeDashApps.chromeDashAppsStrings.Connected = this.cast("Connected")
  @scala.inline
  def Connecting: typings.chromeDashApps.chromeDashAppsStrings.Connecting = this.cast("Connecting")
  @scala.inline
  def NotConnected: typings.chromeDashApps.chromeDashAppsStrings.NotConnected = this.cast("NotConnected")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

