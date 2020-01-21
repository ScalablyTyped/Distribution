package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.connected_
import typings.chromeApps.chromeAppsStrings.disconnected_
import typings.chromeApps.chromeAppsStrings.error
import typings.chromeApps.chromeAppsStrings.linkChanged
import typings.chromeApps.chromeAppsStrings.linkDown
import typings.chromeApps.chromeAppsStrings.linkUp
import typings.chromeApps.chromeAppsStrings.resume
import typings.chromeApps.chromeAppsStrings.suspend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCONNECTEDConnectedDISCONNECTED extends js.Object {
  var CONNECTED: connected_
  var DISCONNECTED: disconnected_
  var ERROR: error
  var LINK_CHANGED: linkChanged
  var LINK_DOWN: linkDown
  var LINK_UP: linkUp
  var RESUME: resume
  var SUSPEND: suspend
}

object AnonCONNECTEDConnectedDISCONNECTED {
  @scala.inline
  def apply(
    CONNECTED: connected_,
    DISCONNECTED: disconnected_,
    ERROR: error,
    LINK_CHANGED: linkChanged,
    LINK_DOWN: linkDown,
    LINK_UP: linkUp,
    RESUME: resume,
    SUSPEND: suspend
  ): AnonCONNECTEDConnectedDISCONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], LINK_CHANGED = LINK_CHANGED.asInstanceOf[js.Any], LINK_DOWN = LINK_DOWN.asInstanceOf[js.Any], LINK_UP = LINK_UP.asInstanceOf[js.Any], RESUME = RESUME.asInstanceOf[js.Any], SUSPEND = SUSPEND.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCONNECTEDConnectedDISCONNECTED]
  }
}

