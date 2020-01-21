package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.connected_
import typings.chromeApps.chromeAppsStrings.failure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCONNECTEDConnected extends js.Object {
  var CONNECTED: connected_
  var FAILURE: failure
}

object AnonCONNECTEDConnected {
  @scala.inline
  def apply(CONNECTED: connected_, FAILURE: failure): AnonCONNECTEDConnected = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], FAILURE = FAILURE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCONNECTEDConnected]
  }
}

