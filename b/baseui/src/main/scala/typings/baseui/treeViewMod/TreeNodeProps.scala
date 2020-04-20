package typings.baseui.treeViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeNodeProps extends js.Object {
  var indentGuides: js.UndefOr[Boolean] = js.undefined
  var node: TreeNode[_]
  var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode[_], Unit]] = js.undefined
  var overrides: js.UndefOr[TreeViewOverrides] = js.undefined
}

object TreeNodeProps {
  @scala.inline
  def apply(
    node: TreeNode[_],
    indentGuides: js.UndefOr[Boolean] = js.undefined,
    onToggle: /* node */ TreeNode[_] => Unit = null,
    overrides: TreeViewOverrides = null
  ): TreeNodeProps = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(indentGuides)) __obj.updateDynamic("indentGuides")(indentGuides.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeProps]
  }
}

