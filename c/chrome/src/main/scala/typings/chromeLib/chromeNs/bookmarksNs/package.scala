package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bookmarksNs {
  type BookmarkChangedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* id */ java.lang.String, /* changeInfo */ BookmarkChangeInfo, scala.Unit]
  ]
  type BookmarkChildrenReordered = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* id */ java.lang.String, /* reorderInfo */ BookmarkReorderInfo, scala.Unit]
  ]
  type BookmarkCreatedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* id */ java.lang.String, /* bookmark */ BookmarkTreeNode, scala.Unit]
  ]
  type BookmarkImportBeganEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  type BookmarkImportEndedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  type BookmarkMovedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* id */ java.lang.String, /* moveInfo */ BookmarkMoveInfo, scala.Unit]
  ]
  type BookmarkRemovedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* id */ java.lang.String, /* removeInfo */ BookmarkRemoveInfo, scala.Unit]
  ]
}
