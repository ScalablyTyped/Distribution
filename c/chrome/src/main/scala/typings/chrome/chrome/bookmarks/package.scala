package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bookmarks {
  import typings.chrome.chrome.events.Event

  type BookmarkChangedEvent = Event[js.Function2[/* id */ String, /* changeInfo */ BookmarkChangeInfo, Unit]]
  type BookmarkChildrenReordered = Event[js.Function2[/* id */ String, /* reorderInfo */ BookmarkReorderInfo, Unit]]
  type BookmarkCreatedEvent = Event[js.Function2[/* id */ String, /* bookmark */ BookmarkTreeNode, Unit]]
  type BookmarkImportBeganEvent = Event[js.Function0[Unit]]
  type BookmarkImportEndedEvent = Event[js.Function0[Unit]]
  type BookmarkMovedEvent = Event[js.Function2[/* id */ String, /* moveInfo */ BookmarkMoveInfo, Unit]]
  type BookmarkRemovedEvent = Event[js.Function2[/* id */ String, /* removeInfo */ BookmarkRemoveInfo, Unit]]
}
