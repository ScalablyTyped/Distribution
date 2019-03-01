package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bookmarks extends js.Object {
  var bookmarks: js.UndefOr[java.lang.String] = js.undefined
  var history: js.UndefOr[java.lang.String] = js.undefined
  var newtab: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Bookmarks {
  @scala.inline
  def apply(
    bookmarks: java.lang.String = null,
    history: java.lang.String = null,
    newtab: java.lang.String = null
  ): Anon_Bookmarks = {
    val __obj = js.Dynamic.literal()
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks)
    if (history != null) __obj.updateDynamic("history")(history)
    if (newtab != null) __obj.updateDynamic("newtab")(newtab)
    __obj.asInstanceOf[Anon_Bookmarks]
  }
}

