package typings.backlogJs.mod.Option.User

import typings.backlogJs.mod.Option.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserStarsParams extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var maxId: js.UndefOr[Double] = js.undefined
  var minId: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[Order] = js.undefined
}

object GetUserStarsParams {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    maxId: js.UndefOr[Double] = js.undefined,
    minId: js.UndefOr[Double] = js.undefined,
    order: Order = null
  ): GetUserStarsParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxId)) __obj.updateDynamic("maxId")(maxId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minId)) __obj.updateDynamic("minId")(minId.get.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserStarsParams]
  }
}

