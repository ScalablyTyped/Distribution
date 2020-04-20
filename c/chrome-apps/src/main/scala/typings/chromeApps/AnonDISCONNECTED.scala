package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.connected__
import typings.chromeApps.chromeAppsStrings.disconnected__
import typings.chromeApps.chromeAppsStrings.error_
import typings.chromeApps.chromeAppsStrings.linkChanged
import typings.chromeApps.chromeAppsStrings.linkDown
import typings.chromeApps.chromeAppsStrings.linkUp
import typings.chromeApps.chromeAppsStrings.resume_
import typings.chromeApps.chromeAppsStrings.suspend_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDISCONNECTED extends js.Object {
  var CONNECTED: connected__
  var DISCONNECTED: disconnected__
  var ERROR: error_
  var LINK_CHANGED: linkChanged
  var LINK_DOWN: linkDown
  var LINK_UP: linkUp
  var RESUME: resume_
  var SUSPEND: suspend_
}

object AnonDISCONNECTED {
  @scala.inline
  def apply(
    CONNECTED: connected__,
    DISCONNECTED: disconnected__,
    ERROR: error_,
    LINK_CHANGED: linkChanged,
    LINK_DOWN: linkDown,
    LINK_UP: linkUp,
    RESUME: resume_,
    SUSPEND: suspend_
  ): AnonDISCONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], LINK_CHANGED = LINK_CHANGED.asInstanceOf[js.Any], LINK_DOWN = LINK_DOWN.asInstanceOf[js.Any], LINK_UP = LINK_UP.asInstanceOf[js.Any], RESUME = RESUME.asInstanceOf[js.Any], SUSPEND = SUSPEND.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDISCONNECTED]
  }
}

