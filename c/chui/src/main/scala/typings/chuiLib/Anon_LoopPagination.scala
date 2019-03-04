package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LoopPagination extends js.Object {
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var pagination: js.UndefOr[scala.Boolean] = js.undefined
  var panels: JQuery
  var target: js.Any
}

object Anon_LoopPagination {
  @scala.inline
  def apply(
    panels: JQuery,
    target: js.Any,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    pagination: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_LoopPagination = {
    val __obj = js.Dynamic.literal(panels = panels, target = target)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination)
    __obj.asInstanceOf[Anon_LoopPagination]
  }
}

