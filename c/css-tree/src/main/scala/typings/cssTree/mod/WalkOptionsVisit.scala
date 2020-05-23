package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkOptionsVisit[NodeType /* <: CssNode */] extends js.Object {
  var enter: js.UndefOr[EnterOrLeaveFn[NodeType]] = js.undefined
  var leave: js.UndefOr[EnterOrLeaveFn[NodeType]] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var visit: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any
}

object WalkOptionsVisit {
  @scala.inline
  def apply[NodeType](
    visit: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any,
    enter: EnterOrLeaveFn[NodeType] = null,
    leave: EnterOrLeaveFn[NodeType] = null,
    reverse: js.UndefOr[Boolean] = js.undefined
  ): WalkOptionsVisit[NodeType] = {
    val __obj = js.Dynamic.literal(visit = visit.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkOptionsVisit[NodeType]]
  }
}

