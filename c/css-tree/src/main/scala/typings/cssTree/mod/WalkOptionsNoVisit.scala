package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkOptionsNoVisit extends js.Object {
  var enter: js.UndefOr[EnterOrLeaveFn[CssNode]] = js.undefined
  var leave: js.UndefOr[EnterOrLeaveFn[CssNode]] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
}

object WalkOptionsNoVisit {
  @scala.inline
  def apply(
    enter: EnterOrLeaveFn[CssNode] = null,
    leave: EnterOrLeaveFn[CssNode] = null,
    reverse: js.UndefOr[Boolean] = js.undefined
  ): WalkOptionsNoVisit = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkOptionsNoVisit]
  }
}

