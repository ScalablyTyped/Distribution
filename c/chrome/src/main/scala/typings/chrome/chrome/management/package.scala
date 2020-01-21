package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object management {
  type ManagementDisabledEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* info */ typings.chrome.chrome.management.ExtensionInfo, scala.Unit]
  ]
  type ManagementEnabledEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* info */ typings.chrome.chrome.management.ExtensionInfo, scala.Unit]
  ]
  type ManagementInstalledEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* info */ typings.chrome.chrome.management.ExtensionInfo, scala.Unit]
  ]
  type ManagementUninstalledEvent = typings.chrome.chrome.events.Event[js.Function1[/* id */ java.lang.String, scala.Unit]]
}
