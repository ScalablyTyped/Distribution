package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.Connected
import typings.chromeDashApps.chromeDashAppsStrings.Connecting
import typings.chromeDashApps.chromeDashAppsStrings.Disconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CONNECTED extends js.Object {
  var CONNECTED: Connected
  var CONNECTING: Connecting
  var DISCONNECTED: Disconnected
}

object Anon_CONNECTED {
  @scala.inline
  def apply(CONNECTED: Connected, CONNECTING: Connecting, DISCONNECTED: Disconnected): Anon_CONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED, CONNECTING = CONNECTING, DISCONNECTED = DISCONNECTED)
  
    __obj.asInstanceOf[Anon_CONNECTED]
  }
}

