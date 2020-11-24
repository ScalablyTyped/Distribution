package typings.chrome.chrome.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object panels {
  
  type ButtonClickedEvent = typings.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  
  type ExtensionSidebarPaneHiddenEvent = typings.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  
  type ExtensionSidebarPaneShownEvent = typings.chrome.chrome.events.Event[js.Function1[/* window */ typings.chrome.chrome.windows.Window, scala.Unit]]
  
  type PanelHiddenEvent = typings.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  
  type PanelSearchEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* action */ java.lang.String, 
      /* queryString */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ]
  
  type PanelShownEvent = typings.chrome.chrome.events.Event[js.Function1[/* window */ typings.chrome.Window, scala.Unit]]
  
  type SelectionChangedEvent = typings.chrome.chrome.events.Event[js.Function0[scala.Unit]]
}
