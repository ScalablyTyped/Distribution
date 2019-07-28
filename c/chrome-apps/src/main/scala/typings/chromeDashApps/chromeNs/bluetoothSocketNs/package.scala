package typings.chromeDashApps.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bluetoothSocketNs {
  type OnAcceptErrorEvent = typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* info */ OnAcceptErrorEventData, Unit]]
  type OnAcceptEvent = typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* info */ OnAcceptInfoData, Unit]]
  type OnReceiveErrorEvent = typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* info */ OnReceiveErrorEventData, Unit]]
  type OnReceiveEvent = typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* info */ OnReceiveEventData, Unit]]
}
