package typings.baseui.treeDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewProps extends js.Object {
  var data: js.Array[TreeNode]
  var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode, Unit]] = js.undefined
  var overrides: js.UndefOr[TreeViewOverrides] = js.undefined
}

object TreeViewProps {
  @scala.inline
  def apply(
    data: js.Array[TreeNode],
    onToggle: /* node */ TreeNode => Unit = null,
    overrides: TreeViewOverrides = null
  ): TreeViewProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewProps]
  }
}

