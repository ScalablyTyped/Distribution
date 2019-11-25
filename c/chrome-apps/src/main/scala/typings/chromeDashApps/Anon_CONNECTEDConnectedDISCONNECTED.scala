package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.connected_
import typings.chromeDashApps.chromeDashAppsStrings.disconnected_
import typings.chromeDashApps.chromeDashAppsStrings.error
import typings.chromeDashApps.chromeDashAppsStrings.linkChanged
import typings.chromeDashApps.chromeDashAppsStrings.linkDown
import typings.chromeDashApps.chromeDashAppsStrings.linkUp
import typings.chromeDashApps.chromeDashAppsStrings.resume
import typings.chromeDashApps.chromeDashAppsStrings.suspend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CONNECTEDConnectedDISCONNECTED extends js.Object {
  var CONNECTED: connected_
  var DISCONNECTED: disconnected_
  var ERROR: error
  var LINK_CHANGED: linkChanged
  var LINK_DOWN: linkDown
  var LINK_UP: linkUp
  var RESUME: resume
  var SUSPEND: suspend
}

object Anon_CONNECTEDConnectedDISCONNECTED {
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
  ): Anon_CONNECTEDConnectedDISCONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], LINK_CHANGED = LINK_CHANGED.asInstanceOf[js.Any], LINK_DOWN = LINK_DOWN.asInstanceOf[js.Any], LINK_UP = LINK_UP.asInstanceOf[js.Any], RESUME = RESUME.asInstanceOf[js.Any], SUSPEND = SUSPEND.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CONNECTEDConnectedDISCONNECTED]
  }
}

