package typings.chui.anon

import typings.chui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pagination extends js.Object {
  var loop: js.UndefOr[Boolean] = js.undefined
  var pagination: js.UndefOr[Boolean] = js.undefined
  var panels: JQuery
  var target: js.Any
}

object Pagination {
  @scala.inline
  def apply(
    panels: JQuery,
    target: js.Any,
    loop: js.UndefOr[Boolean] = js.undefined,
    pagination: js.UndefOr[Boolean] = js.undefined
  ): Pagination = {
    val __obj = js.Dynamic.literal(panels = panels.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
}

