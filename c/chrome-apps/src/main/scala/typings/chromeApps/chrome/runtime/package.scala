package typings.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object runtime {
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.chromeApps.chrome.runtime.AutomationDesktop
    - typings.chromeApps.chrome.runtime.AutomationNonInteractive
  */
  type AutomationOptions = typings.chromeApps.chrome.runtime._AutomationOptions | scala.Boolean
  
  type ExtensionConnectEvent = typings.chromeApps.chrome.events.Event[js.Function1[/* port */ typings.chromeApps.chrome.runtime.Port, scala.Unit]]
  
  type ExtensionMessageEvent = typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ typings.chromeApps.chrome.runtime.MessageSender, 
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
  
  type RuntimeEvent = typings.chromeApps.chrome.events.Event[js.Function0[scala.Unit]]
}
