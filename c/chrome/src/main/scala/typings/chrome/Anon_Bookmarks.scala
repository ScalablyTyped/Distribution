package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bookmarks extends js.Object {
  var bookmarks: js.UndefOr[String] = js.undefined
  var history: js.UndefOr[String] = js.undefined
  var newtab: js.UndefOr[String] = js.undefined
}

object Anon_Bookmarks {
  @scala.inline
  def apply(bookmarks: String = null, history: String = null, newtab: String = null): Anon_Bookmarks = {
    val __obj = js.Dynamic.literal()
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks)
    if (history != null) __obj.updateDynamic("history")(history)
    if (newtab != null) __obj.updateDynamic("newtab")(newtab)
    __obj.asInstanceOf[Anon_Bookmarks]
  }
}

