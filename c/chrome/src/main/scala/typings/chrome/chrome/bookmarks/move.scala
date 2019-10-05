package typings.chrome.chrome.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks.move")
@js.native
object move extends js.Object {
  def apply(id: String, destination: BookmarkDestinationArg): Unit = js.native
  def apply(
    id: String,
    destination: BookmarkDestinationArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, Unit]
  ): Unit = js.native
}

