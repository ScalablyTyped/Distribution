package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.connected
import typings.chromeDashApps.chromeDashAppsStrings.disconnected
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
  var CONNECTED: connected
  var DISCONNECTED: disconnected
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
    CONNECTED: connected,
    DISCONNECTED: disconnected,
    ERROR: error,
    LINK_CHANGED: linkChanged,
    LINK_DOWN: linkDown,
    LINK_UP: linkUp,
    RESUME: resume,
    SUSPEND: suspend
  ): Anon_CONNECTEDConnectedDISCONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED, DISCONNECTED = DISCONNECTED, ERROR = ERROR, LINK_CHANGED = LINK_CHANGED, LINK_DOWN = LINK_DOWN, LINK_UP = LINK_UP, RESUME = RESUME, SUSPEND = SUSPEND)
  
    __obj.asInstanceOf[Anon_CONNECTEDConnectedDISCONNECTED]
  }
}

