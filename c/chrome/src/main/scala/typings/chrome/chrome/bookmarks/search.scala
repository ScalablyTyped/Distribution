package typings.chrome.chrome.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks.search")
@js.native
object search extends js.Object {
  def apply(query: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  def apply(query: BookmarkSearchQuery, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
}

