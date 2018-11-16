package typings
package chromeLib.chromeNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks")
@js.native
object bookmarksNsMembers extends js.Object {
  var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: scala.Double = js.native
  var MAX_WRITE_OPERATIONS_PER_HOUR: scala.Double = js.native
  var onChanged: BookmarkChangedEvent = js.native
  var onChildrenReordered: BookmarkChildrenReordered = js.native
  var onCreated: BookmarkCreatedEvent = js.native
  var onImportBegan: BookmarkImportBeganEvent = js.native
  var onImportEnded: BookmarkImportEndedEvent = js.native
  var onMoved: BookmarkMovedEvent = js.native
  var onRemoved: BookmarkRemovedEvent = js.native
  def create(bookmark: BookmarkCreateArg): scala.Unit = js.native
  def create(bookmark: BookmarkCreateArg, callback: js.Function1[/* result */ BookmarkTreeNode, scala.Unit]): scala.Unit = js.native
  def get(
    idList: js.Array[java.lang.String],
    callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], scala.Unit]
  ): scala.Unit = js.native
  def get(id: java.lang.String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], scala.Unit]): scala.Unit = js.native
  def getChildren(id: java.lang.String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], scala.Unit]): scala.Unit = js.native
  def getRecent(
    numberOfItems: scala.Double,
    callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], scala.Unit]
  ): scala.Unit = js.native
  def getSubTree(id: java.lang.String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], scala.Unit]): scala.Unit = js.native
  def getTree(callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], scala.Unit]): scala.Unit = js.native
  def move(id: java.lang.String, destination: BookmarkDestinationArg): scala.Unit = js.native
  def move(
    id: java.lang.String,
    destination: BookmarkDestinationArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, scala.Unit]
  ): scala.Unit = js.native
  def remove(id: java.lang.String): scala.Unit = js.native
  def remove(id: java.lang.String, callback: js.Function): scala.Unit = js.native
  def removeTree(id: java.lang.String): scala.Unit = js.native
  def removeTree(id: java.lang.String, callback: js.Function): scala.Unit = js.native
  def search(
    query: BookmarkSearchQuery,
    callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], scala.Unit]
  ): scala.Unit = js.native
  def search(
    query: java.lang.String,
    callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], scala.Unit]
  ): scala.Unit = js.native
  def update(id: java.lang.String, changes: BookmarkChangesArg): scala.Unit = js.native
  def update(
    id: java.lang.String,
    changes: BookmarkChangesArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, scala.Unit]
  ): scala.Unit = js.native
}

