package typings.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object permissions {
  type PermissionEvent = typings.chromeApps.chrome.events.Event[
    js.Function1[/* permissions */ typings.chromeApps.chrome.permissions.Permissions, scala.Unit]
  ]
}
