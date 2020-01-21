package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.Connected
  - typings.chromeApps.chromeAppsStrings.Connecting
  - typings.chromeApps.chromeAppsStrings.NotConnected
*/
trait ConnectionStateType extends js.Object

object ConnectionStateType {
  @scala.inline
  def Connected: typings.chromeApps.chromeAppsStrings.Connected = this.cast("Connected")
  @scala.inline
  def Connecting: typings.chromeApps.chromeAppsStrings.Connecting = this.cast("Connecting")
  @scala.inline
  def NotConnected: typings.chromeApps.chromeAppsStrings.NotConnected = this.cast("NotConnected")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

