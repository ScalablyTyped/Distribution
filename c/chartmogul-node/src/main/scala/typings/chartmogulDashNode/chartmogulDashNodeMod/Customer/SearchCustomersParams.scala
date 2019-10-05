package typings.chartmogulDashNode.chartmogulDashNodeMod.Customer

import typings.chartmogulDashNode.commonMod.CursorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCustomersParams extends CursorParams {
  var email: String
}

object SearchCustomersParams {
  @scala.inline
  def apply(email: String, page: Int | Double = null, per_page: Int | Double = null): SearchCustomersParams = {
    val __obj = js.Dynamic.literal(email = email)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCustomersParams]
  }
}

