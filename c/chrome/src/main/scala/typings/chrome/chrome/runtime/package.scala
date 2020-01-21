package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtime {
  type ExtensionConnectEvent = typings.chrome.chrome.events.Event[js.Function1[/* port */ typings.chrome.chrome.runtime.Port, scala.Unit]]
  type ExtensionMessageEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ typings.chrome.chrome.runtime.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ]
  type ManifestIcons = org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  type PortDisconnectEvent = typings.chrome.chrome.events.Event[js.Function1[/* port */ typings.chrome.chrome.runtime.Port, scala.Unit]]
  type PortMessageEvent = typings.chrome.chrome.events.Event[
    js.Function2[/* message */ js.Any, /* port */ typings.chrome.chrome.runtime.Port, scala.Unit]
  ]
  type RuntimeEvent = typings.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type RuntimeInstalledEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* details */ typings.chrome.chrome.runtime.InstalledDetails, scala.Unit]
  ]
  type RuntimeRestartRequiredEvent = typings.chrome.chrome.events.Event[js.Function1[/* reason */ java.lang.String, scala.Unit]]
  type RuntimeUpdateAvailableEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* details */ typings.chrome.chrome.runtime.UpdateAvailableDetails, scala.Unit]
  ]
}
