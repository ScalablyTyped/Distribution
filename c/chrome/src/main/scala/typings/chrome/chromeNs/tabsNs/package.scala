package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabsNs {
  type TabActivatedEvent = Event[js.Function1[/* activeInfo */ TabActiveInfo, Unit]]
  type TabAttachedEvent = Event[js.Function2[/* tabId */ Double, /* attachInfo */ TabAttachInfo, Unit]]
  type TabCreatedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
  type TabDetachedEvent = Event[js.Function2[/* tabId */ Double, /* detachInfo */ TabDetachInfo, Unit]]
  type TabHighlightedEvent = Event[js.Function1[/* highlightInfo */ TabHighlightInfo, Unit]]
  type TabMovedEvent = Event[js.Function2[/* tabId */ Double, /* moveInfo */ TabMoveInfo, Unit]]
  type TabRemovedEvent = Event[js.Function2[/* tabId */ Double, /* removeInfo */ TabRemoveInfo, Unit]]
  type TabReplacedEvent = Event[js.Function2[/* addedTabId */ Double, /* removedTabId */ Double, Unit]]
  type TabSelectedEvent = Event[js.Function2[/* tabId */ Double, /* selectInfo */ TabWindowInfo, Unit]]
  type TabUpdatedEvent = Event[
    js.Function3[/* tabId */ Double, /* changeInfo */ TabChangeInfo, /* tab */ Tab, Unit]
  ]
  type TabZoomChangeEvent = Event[js.Function1[/* ZoomChangeInfo */ ZoomChangeInfo, Unit]]
}
