package typings.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtime {
  import org.scalablytyped.runtime.NumberDictionary
  import typings.std.Exclude

  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.chromeDashApps.chrome.runtime.AutomationDesktop
    - typings.chromeDashApps.chrome.runtime.AutomationNonInteractive
  */
  type AutomationOptions = _AutomationOptions | Boolean
  type ExtensionConnectEvent = typings.chromeDashApps.chrome.events.Event[js.Function1[/* port */ Port, Unit]]
  type ExtensionMessageEvent = typings.chromeDashApps.chrome.events.Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]
  ]
  type ManifestIcons = /**
    * @example
    * {
    *   '16': 'icon16.png',
    *   '48': 'icon48.png',
    *   '128': 'icon128.png'
    * }
    */
  NumberDictionary[String]
  /**
    * Optional permissions
    * @see NotAllowedAsOptionalPermissions for permissions that you're not allowed to set on demand.
    */
  type OptionalPermission = Exclude[Permission, NotAllowedAsOptionalPermissions]
  type RuntimeEvent = typings.chromeDashApps.chrome.events.Event[js.Function0[Unit]]
}
