package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtimeNs {
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - AutomationDesktop
    - AutomationNonInteractive
  */
  type AutomationOptions = _AutomationOptions | scala.Boolean
  type ExtensionConnectEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* port */ Port, scala.Unit]]
  type ExtensionMessageEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, scala.Unit], 
      scala.Unit
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
  org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  /**
    * Optional permissions
    * @see NotAllowedAsOptionalPermissions for permissions that you're not allowed to set on demand.
    */
  type OptionalPermission = stdLib.Exclude[Permission, NotAllowedAsOptionalPermissions]
  type RuntimeEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
}
