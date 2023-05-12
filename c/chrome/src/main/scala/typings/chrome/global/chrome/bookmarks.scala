package typings.chrome.global.chrome

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

////////////////////
// Bookmarks
////////////////////
/**
  * Use the chrome.bookmarks API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages, which you can use to create a custom Bookmark Manager page.
  * Availability: Since Chrome 5.
  * Permissions:  "bookmarks"
  */
object bookmarks {
  
  @JSGlobal("chrome.bookmarks")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.bookmarks.MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE")
  @js.native
  def MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Double = js.native
  inline def MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.MAX_WRITE_OPERATIONS_PER_HOUR")
  @js.native
  def MAX_WRITE_OPERATIONS_PER_HOUR: Double = js.native
  inline def MAX_WRITE_OPERATIONS_PER_HOUR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_WRITE_OPERATIONS_PER_HOUR")(x.asInstanceOf[js.Any])
  
  inline def create(bookmark: BookmarkCreateArg): js.Promise[BookmarkTreeNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(bookmark.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BookmarkTreeNode]]
  inline def create(bookmark: BookmarkCreateArg, callback: js.Function1[/* result */ BookmarkTreeNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(bookmark.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get(idList: js.Array[String]): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(idList.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  inline def get(idList: js.Array[String], callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(idList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(id: String): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  inline def get(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getChildren(id: String): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  inline def getChildren(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getRecent(numberOfItems: Double): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecent")(numberOfItems.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  inline def getRecent(numberOfItems: Double, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getRecent")(numberOfItems.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getSubTree(id: String): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubTree")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  inline def getSubTree(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubTree")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getTree(): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTree")().asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  inline def getTree(callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTree")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def move(id: String, destination: BookmarkDestinationArg): js.Promise[BookmarkTreeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(id.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BookmarkTreeNode]]
  inline def move(
    id: String,
    destination: BookmarkDestinationArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(id.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.bookmarks.onChanged")
  @js.native
  def onChanged: BookmarkChangedEvent = js.native
  inline def onChanged_=(x: BookmarkChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.onChildrenReordered")
  @js.native
  def onChildrenReordered: BookmarkChildrenReordered = js.native
  inline def onChildrenReordered_=(x: BookmarkChildrenReordered): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChildrenReordered")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.onCreated")
  @js.native
  def onCreated: BookmarkCreatedEvent = js.native
  inline def onCreated_=(x: BookmarkCreatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.onImportBegan")
  @js.native
  def onImportBegan: BookmarkImportBeganEvent = js.native
  inline def onImportBegan_=(x: BookmarkImportBeganEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onImportBegan")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.onImportEnded")
  @js.native
  def onImportEnded: BookmarkImportEndedEvent = js.native
  inline def onImportEnded_=(x: BookmarkImportEndedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onImportEnded")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.onMoved")
  @js.native
  def onMoved: BookmarkMovedEvent = js.native
  inline def onMoved_=(x: BookmarkMovedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.onRemoved")
  @js.native
  def onRemoved: BookmarkRemovedEvent = js.native
  inline def onRemoved_=(x: BookmarkRemovedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(x.asInstanceOf[js.Any])
  
  inline def remove(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def remove(id: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeTree(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTree")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeTree(id: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTree")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def search(query: String): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  inline def search(query: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def search(query: BookmarkSearchQuery): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  inline def search(query: BookmarkSearchQuery, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def update(id: String, changes: BookmarkChangesArg): js.Promise[BookmarkTreeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BookmarkTreeNode]]
  inline def update(
    id: String,
    changes: BookmarkChangesArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], changes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
