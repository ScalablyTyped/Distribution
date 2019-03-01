package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkOptions extends js.Object {
  var enter: js.UndefOr[EnterOrLeaveFn] = js.undefined
  var leave: js.UndefOr[EnterOrLeaveFn] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var visit: js.UndefOr[java.lang.String] = js.undefined
}

object WalkOptions {
  @scala.inline
  def apply(
    enter: EnterOrLeaveFn = null,
    leave: EnterOrLeaveFn = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    visit: java.lang.String = null
  ): WalkOptions = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (leave != null) __obj.updateDynamic("leave")(leave)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (visit != null) __obj.updateDynamic("visit")(visit)
    __obj.asInstanceOf[WalkOptions]
  }
}

