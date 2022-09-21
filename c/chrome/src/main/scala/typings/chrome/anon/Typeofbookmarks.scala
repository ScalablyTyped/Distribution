package typings.chrome.anon

import typings.chrome.chrome.bookmarks.BookmarkChangedEvent
import typings.chrome.chrome.bookmarks.BookmarkChangesArg
import typings.chrome.chrome.bookmarks.BookmarkChildrenReordered
import typings.chrome.chrome.bookmarks.BookmarkCreateArg
import typings.chrome.chrome.bookmarks.BookmarkCreatedEvent
import typings.chrome.chrome.bookmarks.BookmarkDestinationArg
import typings.chrome.chrome.bookmarks.BookmarkImportBeganEvent
import typings.chrome.chrome.bookmarks.BookmarkImportEndedEvent
import typings.chrome.chrome.bookmarks.BookmarkMovedEvent
import typings.chrome.chrome.bookmarks.BookmarkRemovedEvent
import typings.chrome.chrome.bookmarks.BookmarkSearchQuery
import typings.chrome.chrome.bookmarks.BookmarkTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofbookmarks extends StObject {
  
  var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Double = js.native
  
  var MAX_WRITE_OPERATIONS_PER_HOUR: Double = js.native
  
  def create(bookmark: BookmarkCreateArg): Unit = js.native
  def create(bookmark: BookmarkCreateArg, callback: js.Function1[/* result */ BookmarkTreeNode, Unit]): Unit = js.native
  @JSName("create")
  def create_Promise(bookmark: BookmarkCreateArg): js.Promise[BookmarkTreeNode] = js.native
  
  def get(idList: js.Array[String]): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  def get(idList: js.Array[String], callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  def get(id: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  def get(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  def getChildren(id: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  def getChildren(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  def getRecent(numberOfItems: Double): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  def getRecent(numberOfItems: Double, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  def getSubTree(id: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  def getSubTree(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  def getTree(): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  def getTree(callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  def move(id: String, destination: BookmarkDestinationArg): Unit = js.native
  def move(
    id: String,
    destination: BookmarkDestinationArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, Unit]
  ): Unit = js.native
  @JSName("move")
  def move_Promise(id: String, destination: BookmarkDestinationArg): js.Promise[BookmarkTreeNode] = js.native
  
  var onChanged: BookmarkChangedEvent = js.native
  
  var onChildrenReordered: BookmarkChildrenReordered = js.native
  
  var onCreated: BookmarkCreatedEvent = js.native
  
  var onImportBegan: BookmarkImportBeganEvent = js.native
  
  var onImportEnded: BookmarkImportEndedEvent = js.native
  
  var onMoved: BookmarkMovedEvent = js.native
  
  var onRemoved: BookmarkRemovedEvent = js.native
  
  def remove(id: String): Unit = js.native
  def remove(id: String, callback: js.Function): Unit = js.native
  
  def removeTree(id: String): Unit = js.native
  def removeTree(id: String, callback: js.Function): Unit = js.native
  @JSName("removeTree")
  def removeTree_Promise(id: String): js.Promise[Unit] = js.native
  
  @JSName("remove")
  def remove_Promise(id: String): js.Promise[Unit] = js.native
  
  def search(query: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  def search(query: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  def search(query: BookmarkSearchQuery): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  def search(query: BookmarkSearchQuery, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  def update(id: String, changes: BookmarkChangesArg): Unit = js.native
  def update(
    id: String,
    changes: BookmarkChangesArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, Unit]
  ): Unit = js.native
  @JSName("update")
  def update_Promise(id: String, changes: BookmarkChangesArg): js.Promise[BookmarkTreeNode] = js.native
}
