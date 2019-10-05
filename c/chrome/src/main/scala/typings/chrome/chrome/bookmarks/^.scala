package typings.chrome.chrome.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks")
@js.native
object ^ extends js.Object {
  var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Double = js.native
  var MAX_WRITE_OPERATIONS_PER_HOUR: Double = js.native
  var onChanged: BookmarkChangedEvent = js.native
  var onChildrenReordered: BookmarkChildrenReordered = js.native
  var onCreated: BookmarkCreatedEvent = js.native
  var onImportBegan: BookmarkImportBeganEvent = js.native
  var onImportEnded: BookmarkImportEndedEvent = js.native
  var onMoved: BookmarkMovedEvent = js.native
  var onRemoved: BookmarkRemovedEvent = js.native
}

