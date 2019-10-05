package typings.backlogDashJs.backlogDashJsMod.Option.Group

import typings.backlogDashJs.backlogDashJsMod.Option.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupsParams extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[Order] = js.undefined
}

object GetGroupsParams {
  @scala.inline
  def apply(count: Int | Double = null, offset: Int | Double = null, order: Order = null): GetGroupsParams = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[GetGroupsParams]
  }
}

