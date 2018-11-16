package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtimeNs {
  type ExtensionConnectEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* port */ Port, scala.Unit]]
  type ExtensionMessageEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ]
  type PortDisconnectEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* port */ Port, scala.Unit]]
  type PortMessageEvent = chromeLib.chromeNs.eventsNs.Event[js.Function2[/* message */ js.Any, /* port */ Port, scala.Unit]]
  type RuntimeEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  type RuntimeInstalledEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* details */ InstalledDetails, scala.Unit]]
  type RuntimeRestartRequiredEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* reason */ java.lang.String, scala.Unit]]
  type RuntimeUpdateAvailableEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* details */ UpdateAvailableDetails, scala.Unit]]
}
