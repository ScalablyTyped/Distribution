package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.NumberDictionary
import typings.chromeApps.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typings.chromeApps.chrome.runtime.AutomationDesktop
  - typings.chromeApps.chrome.runtime.AutomationNonInteractive
*/
type AutomationOptions = _AutomationOptions | Boolean

type ExtensionConnectEvent = Event[js.Function1[/* port */ Port, Unit]]

type ExtensionMessageEvent = Event[
js.Function3[
  /* message */ Any, 
  /* sender */ MessageSender, 
  /* sendResponse */ js.Function1[/* response */ Any, Unit], 
  Unit
]]

type ManifestIcons = /**
  * @example
  * {
  *   '16': 'icon16.png',
  *   '48': 'icon48.png',
  *   '128': 'icon128.png'
  * }
  */
NumberDictionary[String]

type RuntimeEvent = Event[js.Function0[Unit]]
