package typings.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bluetoothSocket {
  import typings.chromeDashApps.chrome.events.Event

  type OnAcceptErrorEvent = Event[js.Function1[/* info */ OnAcceptErrorEventData, Unit]]
  type OnAcceptEvent = Event[js.Function1[/* info */ OnAcceptInfoData, Unit]]
  type OnReceiveErrorEvent = Event[js.Function1[/* info */ OnReceiveErrorEventData, Unit]]
  type OnReceiveEvent = Event[js.Function1[/* info */ OnReceiveEventData, Unit]]
}
