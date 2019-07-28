package typings.chrome.chromeNs

import org.scalablytyped.runtime.NumberDictionary
import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtimeNs {
  type ExtensionConnectEvent = Event[js.Function1[/* port */ Port, Unit]]
  type ExtensionMessageEvent = Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ]
  type ManifestIcons = NumberDictionary[String]
  type PortDisconnectEvent = Event[js.Function1[/* port */ Port, Unit]]
  type PortMessageEvent = Event[js.Function2[/* message */ js.Any, /* port */ Port, Unit]]
  type RuntimeEvent = Event[js.Function0[Unit]]
  type RuntimeInstalledEvent = Event[js.Function1[/* details */ InstalledDetails, Unit]]
  type RuntimeRestartRequiredEvent = Event[js.Function1[/* reason */ String, Unit]]
  type RuntimeUpdateAvailableEvent = Event[js.Function1[/* details */ UpdateAvailableDetails, Unit]]
}
