package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPagination extends js.Object {
  var loop: js.UndefOr[Boolean] = js.undefined
  var pagination: js.UndefOr[Boolean] = js.undefined
  var panels: JQuery
  var target: js.Any
}

object AnonPagination {
  @scala.inline
  def apply(
    panels: JQuery,
    target: js.Any,
    loop: js.UndefOr[Boolean] = js.undefined,
    pagination: js.UndefOr[Boolean] = js.undefined
  ): AnonPagination = {
    val __obj = js.Dynamic.literal(panels = panels.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPagination]
  }
}

