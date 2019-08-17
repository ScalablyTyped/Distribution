package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object managementNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type ManagementDisabledEvent = Event[js.Function1[/* info */ ExtensionInfo, Unit]]
  type ManagementEnabledEvent = Event[js.Function1[/* info */ ExtensionInfo, Unit]]
  type ManagementInstalledEvent = Event[js.Function1[/* info */ ExtensionInfo, Unit]]
  type ManagementUninstalledEvent = Event[js.Function1[/* id */ String, Unit]]
}
