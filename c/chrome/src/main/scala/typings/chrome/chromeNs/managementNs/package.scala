package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object managementNs {
  type ManagementDisabledEvent = Event[js.Function1[/* info */ ExtensionInfo, Unit]]
  type ManagementEnabledEvent = Event[js.Function1[/* info */ ExtensionInfo, Unit]]
  type ManagementInstalledEvent = Event[js.Function1[/* info */ ExtensionInfo, Unit]]
  type ManagementUninstalledEvent = Event[js.Function1[/* id */ String, Unit]]
}
