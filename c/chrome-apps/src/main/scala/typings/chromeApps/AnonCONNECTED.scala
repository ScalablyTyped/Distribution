package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.Connected
import typings.chromeApps.chromeAppsStrings.Connecting
import typings.chromeApps.chromeAppsStrings.Disconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCONNECTED extends js.Object {
  var CONNECTED: Connected
  var CONNECTING: Connecting
  var DISCONNECTED: Disconnected
}

object AnonCONNECTED {
  @scala.inline
  def apply(CONNECTED: Connected, CONNECTING: Connecting, DISCONNECTED: Disconnected): AnonCONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCONNECTED]
  }
}

