package typings.chartmogulNode.commonMod

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
    current_page: js.UndefOr[Double] = js.undefined,
    has_more: js.UndefOr[Boolean] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined,
    total_pages: js.UndefOr[Double] = js.undefined
  ): Entries[T] = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    if (!js.isUndefined(current_page)) __obj.updateDynamic("current_page")(current_page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(has_more)) __obj.updateDynamic("has_more")(has_more.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total_pages)) __obj.updateDynamic("total_pages")(total_pages.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries[T]]
  }
}

