package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.Connected_
import typings.chromeApps.chromeAppsStrings.Connecting_
import typings.chromeApps.chromeAppsStrings.Disconnected_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCONNECTED extends js.Object {
  var CONNECTED: Connected_
  var CONNECTING: Connecting_
  var DISCONNECTED: Disconnected_
}

object AnonCONNECTED {
  @scala.inline
  def apply(CONNECTED: Connected_, CONNECTING: Connecting_, DISCONNECTED: Disconnected_): AnonCONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCONNECTED]
  }
}

