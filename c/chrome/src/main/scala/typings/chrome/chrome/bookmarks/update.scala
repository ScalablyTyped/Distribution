package typings.chrome.chrome.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks.update")
@js.native
object update extends js.Object {
  def apply(id: String, changes: BookmarkChangesArg): Unit = js.native
  def apply(
    id: String,
    changes: BookmarkChangesArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, Unit]
  ): Unit = js.native
}

