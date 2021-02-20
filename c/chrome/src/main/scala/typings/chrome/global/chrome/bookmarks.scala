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
import scala.scalajs.js.`|`
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
  @scala.inline
  def MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.MAX_WRITE_OPERATIONS_PER_HOUR")
  @js.native
  def MAX_WRITE_OPERATIONS_PER_HOUR: Double = js.native
  @scala.inline
  def MAX_WRITE_OPERATIONS_PER_HOUR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_WRITE_OPERATIONS_PER_HOUR")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.create")
  @js.native
  def create(bookmark: BookmarkCreateArg): Unit = js.native
  @JSGlobal("chrome.bookmarks.create")
  @js.native
  def create(bookmark: BookmarkCreateArg, callback: js.Function1[/* result */ BookmarkTreeNode, Unit]): Unit = js.native
  
  @JSGlobal("chrome.bookmarks.get")
  @js.native
  def get(idList: js.Array[String], callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  @JSGlobal("chrome.bookmarks.get")
  @js.native
  def get(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  @JSGlobal("chrome.bookmarks.getChildren")
  @js.native
  def getChildren(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  @JSGlobal("chrome.bookmarks.getRecent")
  @js.native
  def getRecent(numberOfItems: Double, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  @JSGlobal("chrome.bookmarks.getSubTree")
  @js.native
  def getSubTree(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  @JSGlobal("chrome.bookmarks.getTree")
  @js.native
  def getTree(callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  @JSGlobal("chrome.bookmarks.move")
  @js.native
  def move(id: String, destination: BookmarkDestinationArg): Unit = js.native
  @JSGlobal("chrome.bookmarks.move")
  @js.native
  def move(
    id: String,
    destination: BookmarkDestinationArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.bookmarks.onChanged")
  @js.native
  def onChanged: BookmarkChangedEvent = js.native
  @scala.inline
  def onChanged_=(x: BookmarkChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.onChildrenReordered")
  @js.native
  def onChildrenReordered: BookmarkChildrenReordered = js.native
  @scala.inline
  def onChildrenReordered_=(x: BookmarkChildrenReordered): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChildrenReordered")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.onCreated")
  @js.native
  def onCreated: BookmarkCreatedEvent = js.native
  @scala.inline
  def onCreated_=(x: BookmarkCreatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.onImportBegan")
  @js.native
  def onImportBegan: BookmarkImportBeganEvent = js.native
  @scala.inline
  def onImportBegan_=(x: BookmarkImportBeganEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onImportBegan")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.onImportEnded")
  @js.native
  def onImportEnded: BookmarkImportEndedEvent = js.native
  @scala.inline
  def onImportEnded_=(x: BookmarkImportEndedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onImportEnded")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.onMoved")
  @js.native
  def onMoved: BookmarkMovedEvent = js.native
  @scala.inline
  def onMoved_=(x: BookmarkMovedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.onRemoved")
  @js.native
  def onRemoved: BookmarkRemovedEvent = js.native
  @scala.inline
  def onRemoved_=(x: BookmarkRemovedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.bookmarks.remove")
  @js.native
  def remove(id: String): Unit = js.native
  @JSGlobal("chrome.bookmarks.remove")
  @js.native
  def remove(id: String, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.bookmarks.removeTree")
  @js.native
  def removeTree(id: String): Unit = js.native
  @JSGlobal("chrome.bookmarks.removeTree")
  @js.native
  def removeTree(id: String, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.bookmarks.search")
  @js.native
  def search(query: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  @JSGlobal("chrome.bookmarks.search")
  @js.native
  def search(query: BookmarkSearchQuery, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  @JSGlobal("chrome.bookmarks.update")
  @js.native
  def update(id: String, changes: BookmarkChangesArg): Unit = js.native
  @JSGlobal("chrome.bookmarks.update")
  @js.native
  def update(
    id: String,
    changes: BookmarkChangesArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, Unit]
  ): Unit = js.native
}
