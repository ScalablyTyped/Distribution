package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object contextMenus {
  
  type MenuClickedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* info */ typings.chrome.chrome.contextMenus.OnClickData, 
      /* tab */ js.UndefOr[typings.chrome.chrome.tabs.Tab], 
      scala.Unit
    ]
  ]
}
