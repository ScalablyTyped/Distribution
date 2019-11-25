package typings.backlogDashJs.backlogDashJsMod.Option.Project

import typings.backlogDashJs.backlogDashJsMod.Option.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSharedFilesParams extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[Order] = js.undefined
}

object GetSharedFilesParams {
  @scala.inline
  def apply(count: Int | Double = null, offset: Int | Double = null, order: Order = null): GetSharedFilesParams = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSharedFilesParams]
  }
}

