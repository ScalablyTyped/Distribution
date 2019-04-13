package typings
package chromeDashAppsLib.chromeNs.displaySourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @enum
  * @description
  * **'connected'**
  * Connected using this Display Source (i.e., there is an active session)
  *
  * **'connecting'**
  * In process of connection to this Display Source
  *
  * **'disconnected'**
  * Disconnected from this Display Source
  */
@JSGlobal("chrome.displaySource.SinkState")
@js.native
object SinkState extends js.Object {
  var CONNECTED: chromeDashAppsLib.chromeDashAppsLibStrings.Connected = js.native
  var CONNECTING: chromeDashAppsLib.chromeDashAppsLibStrings.Connecting = js.native
  var DISCONNECTED: chromeDashAppsLib.chromeDashAppsLibStrings.Disconnected = js.native
}

