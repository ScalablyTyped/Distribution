package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vpnProviderNs {
  type VpnConfigCreationEvent = Event[js.Function3[/* id */ String, /* name */ String, /* data */ js.Object, Unit]]
  type VpnConfigRemovalEvent = Event[js.Function1[/* id */ String, Unit]]
  type VpnPacketReceptionEvent = Event[js.Function1[/* data */ ArrayBuffer, Unit]]
  type VpnPlatformMessageEvent = Event[js.Function3[/* id */ String, /* message */ String, /* error */ String, Unit]]
  type VpnUiEvent = Event[js.Function2[/* event */ String, /* id */ js.UndefOr[String], Unit]]
}
