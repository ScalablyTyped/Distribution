package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabsNs {
  type TabActivatedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* activeInfo */ TabActiveInfo, scala.Unit]]
  type TabAttachedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* tabId */ scala.Double, /* attachInfo */ TabAttachInfo, scala.Unit]
  ]
  type TabCreatedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* tab */ Tab, scala.Unit]]
  type TabDetachedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* tabId */ scala.Double, /* detachInfo */ TabDetachInfo, scala.Unit]
  ]
  type TabHighlightedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* highlightInfo */ TabHighlightInfo, scala.Unit]]
  type TabMovedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function2[/* tabId */ scala.Double, /* moveInfo */ TabMoveInfo, scala.Unit]]
  type TabRemovedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* tabId */ scala.Double, /* removeInfo */ TabRemoveInfo, scala.Unit]
  ]
  type TabReplacedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* addedTabId */ scala.Double, /* removedTabId */ scala.Double, scala.Unit]
  ]
  type TabSelectedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* tabId */ scala.Double, /* selectInfo */ TabWindowInfo, scala.Unit]
  ]
  type TabUpdatedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[/* tabId */ scala.Double, /* changeInfo */ TabChangeInfo, /* tab */ Tab, scala.Unit]
  ]
  type TabZoomChangeEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* ZoomChangeInfo */ ZoomChangeInfo, scala.Unit]]
}
