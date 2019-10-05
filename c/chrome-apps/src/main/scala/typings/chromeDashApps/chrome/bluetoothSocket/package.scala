package typings.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bluetoothSocket {
  type OnAcceptErrorEvent = typings.chromeDashApps.chrome.events.Event[js.Function1[/* info */ OnAcceptErrorEventData, Unit]]
  type OnAcceptEvent = typings.chromeDashApps.chrome.events.Event[js.Function1[/* info */ OnAcceptInfoData, Unit]]
  type OnReceiveErrorEvent = typings.chromeDashApps.chrome.events.Event[js.Function1[/* info */ OnReceiveErrorEventData, Unit]]
  type OnReceiveEvent = typings.chromeDashApps.chrome.events.Event[js.Function1[/* info */ OnReceiveEventData, Unit]]
}
