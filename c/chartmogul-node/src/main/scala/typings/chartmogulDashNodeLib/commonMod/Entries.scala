package typings
package chartmogulDashNodeLib.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entries[T] extends Cursor {
  var entries: js.Array[T]
}

object Entries {
  @scala.inline
  def apply[T](
    entries: js.Array[T],
    current_page: scala.Int | scala.Double = null,
    has_more: js.UndefOr[scala.Boolean] = js.undefined,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    total_pages: scala.Int | scala.Double = null
  ): Entries[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entries")(entries)
    if (current_page != null) __obj.updateDynamic("current_page")(current_page.asInstanceOf[js.Any])
    if (!js.isUndefined(has_more)) __obj.updateDynamic("has_more")(has_more)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (total_pages != null) __obj.updateDynamic("total_pages")(total_pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries[T]]
  }
}

