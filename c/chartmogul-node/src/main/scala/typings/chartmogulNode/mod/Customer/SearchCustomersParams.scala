package typings.chartmogulNode.mod.Customer

import typings.chartmogulNode.commonMod.CursorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCustomersParams extends CursorParams {
  var email: String
}

object SearchCustomersParams {
  @scala.inline
  def apply(
    email: String,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): SearchCustomersParams = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCustomersParams]
  }
}

