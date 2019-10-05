package typings.chrome.chrome.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks.create")
@js.native
object create extends js.Object {
  def apply(bookmark: BookmarkCreateArg): Unit = js.native
  def apply(bookmark: BookmarkCreateArg, callback: js.Function1[/* result */ BookmarkTreeNode, Unit]): Unit = js.native
}

