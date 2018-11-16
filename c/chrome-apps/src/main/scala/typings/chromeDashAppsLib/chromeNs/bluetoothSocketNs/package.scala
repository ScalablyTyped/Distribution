package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bluetoothSocketNs {
  type OnAcceptErrorCode = chromeDashAppsLib.chromeDashAppsLibStrings.system_error | chromeDashAppsLib.chromeDashAppsLibStrings.not_listening
  type OnAcceptErrorEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* info */ OnAcceptErrorEventData, scala.Unit]]
  type OnAcceptEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* info */ OnAcceptInfoData, scala.Unit]]
  type OnReceiveErrorCode = chromeDashAppsLib.chromeDashAppsLibStrings.disconnected | chromeDashAppsLib.chromeDashAppsLibStrings.system_error | chromeDashAppsLib.chromeDashAppsLibStrings.not_connected
  type OnReceiveErrorEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* info */ OnReceiveErrorEventData, scala.Unit]]
  type OnReceiveEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* info */ OnReceiveEventData, scala.Unit]]
}
