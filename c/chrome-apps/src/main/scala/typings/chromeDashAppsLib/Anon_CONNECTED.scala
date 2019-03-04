package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CONNECTED extends js.Object {
  var CONNECTED: chromeDashAppsLib.chromeDashAppsLibStrings.Connected
  var CONNECTING: chromeDashAppsLib.chromeDashAppsLibStrings.Connecting
  var DISCONNECTED: chromeDashAppsLib.chromeDashAppsLibStrings.Disconnected
}

object Anon_CONNECTED {
  @scala.inline
  def apply(
    CONNECTED: chromeDashAppsLib.chromeDashAppsLibStrings.Connected,
    CONNECTING: chromeDashAppsLib.chromeDashAppsLibStrings.Connecting,
    DISCONNECTED: chromeDashAppsLib.chromeDashAppsLibStrings.Disconnected
  ): Anon_CONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED, CONNECTING = CONNECTING, DISCONNECTED = DISCONNECTED)
  
    __obj.asInstanceOf[Anon_CONNECTED]
  }
}

