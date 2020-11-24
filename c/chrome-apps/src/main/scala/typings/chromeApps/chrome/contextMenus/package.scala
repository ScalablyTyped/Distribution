package typings.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object contextMenus {
  
  type MenuClickedEvent = typings.chromeApps.chrome.events.Event[
    js.Function1[/* info */ typings.chromeApps.chrome.contextMenus.OnClickData, scala.Unit]
  ]
}
