package typings.backlogJs.mod.Option.User

import typings.backlogJs.mod.Option.ActivityType
import typings.backlogJs.mod.Option.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserActivitiesParams extends js.Object {
  var activityTypeId: js.UndefOr[js.Array[ActivityType]] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var maxId: js.UndefOr[Double] = js.undefined
  var minId: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[Order] = js.undefined
}

object GetUserActivitiesParams {
  @scala.inline
  def apply(
    activityTypeId: js.Array[ActivityType] = null,
    count: js.UndefOr[Double] = js.undefined,
    maxId: js.UndefOr[Double] = js.undefined,
    minId: js.UndefOr[Double] = js.undefined,
    order: Order = null
  ): GetUserActivitiesParams = {
    val __obj = js.Dynamic.literal()
    if (activityTypeId != null) __obj.updateDynamic("activityTypeId")(activityTypeId.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxId)) __obj.updateDynamic("maxId")(maxId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minId)) __obj.updateDynamic("minId")(minId.get.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserActivitiesParams]
  }
}

