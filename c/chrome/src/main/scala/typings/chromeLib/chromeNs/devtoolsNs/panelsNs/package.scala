package typings
package chromeLib.chromeNs.devtoolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object panelsNs {
  type ButtonClickedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  type ExtensionSidebarPaneHiddenEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  type ExtensionSidebarPaneShownEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* window */ chromeLib.chromeNs.windowsNs.Window, scala.Unit]]
  type PanelHiddenEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  type PanelSearchEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* action */ java.lang.String, 
      /* queryString */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ]
  type PanelShownEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* window */ chromeLib.Window, scala.Unit]]
  type SelectionChangedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
}
