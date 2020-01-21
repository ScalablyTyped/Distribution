package typings.chromeApps.chrome.bluetoothSocket

import typings.chromeApps.chromeAppsStrings.disconnected_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.disconnected_
  - typings.chromeApps.chromeAppsStrings.system_error
  - typings.chromeApps.chromeAppsStrings.not_connected
*/
trait OnReceiveErrorCode extends js.Object

object OnReceiveErrorCode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disconnected: disconnected_ = this.cast("disconnected")
  @scala.inline
  def not_connected: typings.chromeApps.chromeAppsStrings.not_connected = this.cast("not_connected")
  @scala.inline
  def system_error: typings.chromeApps.chromeAppsStrings.system_error = this.cast("system_error")
}

