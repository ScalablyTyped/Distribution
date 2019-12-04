package typings.baseui.treeDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeNodeProps extends js.Object {
  var node: TreeNode
  var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode, Unit]] = js.undefined
  var overrides: js.UndefOr[TreeViewOverrides] = js.undefined
}

object TreeNodeProps {
  @scala.inline
  def apply(node: TreeNode, onToggle: /* node */ TreeNode => Unit = null, overrides: TreeViewOverrides = null): TreeNodeProps = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeProps]
  }
}

