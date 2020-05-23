package typings.chartmogulNode.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cursor extends js.Object {
  var current_page: js.UndefOr[Double] = js.undefined
  var has_more: js.UndefOr[Boolean] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var total_pages: js.UndefOr[Double] = js.undefined
}

object Cursor {
  @scala.inline
  def apply(
    current_page: js.UndefOr[Double] = js.undefined,
    has_more: js.UndefOr[Boolean] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined,
    total_pages: js.UndefOr[Double] = js.undefined
  ): Cursor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current_page)) __obj.updateDynamic("current_page")(current_page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(has_more)) __obj.updateDynamic("has_more")(has_more.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total_pages)) __obj.updateDynamic("total_pages")(total_pages.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursor]
  }
}

