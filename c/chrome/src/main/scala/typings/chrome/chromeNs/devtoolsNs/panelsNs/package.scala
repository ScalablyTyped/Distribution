package typings.chrome.chromeNs.devtoolsNs

import typings.chrome.Window
import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object panelsNs {
  type ButtonClickedEvent = Event[js.Function0[Unit]]
  type ExtensionSidebarPaneHiddenEvent = Event[js.Function0[Unit]]
  type ExtensionSidebarPaneShownEvent = Event[js.Function1[/* window */ typings.chrome.chromeNs.windowsNs.Window, Unit]]
  type PanelHiddenEvent = Event[js.Function0[Unit]]
  type PanelSearchEvent = Event[js.Function2[/* action */ String, /* queryString */ js.UndefOr[String], Unit]]
  type PanelShownEvent = Event[js.Function1[/* window */ Window, Unit]]
  type SelectionChangedEvent = Event[js.Function0[Unit]]
}
