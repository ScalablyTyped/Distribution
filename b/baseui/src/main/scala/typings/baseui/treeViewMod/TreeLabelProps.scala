package typings.baseui.treeViewMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeLabelProps extends js.Object {
  var hasChildren: Boolean
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  var label: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String
  var node: TreeNode[_]
  var overrides: js.UndefOr[TreeLabelOverrides] = js.undefined
}

object TreeLabelProps {
  @scala.inline
  def apply(
    hasChildren: Boolean,
    label: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String,
    node: TreeNode[_],
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    overrides: TreeLabelOverrides = null
  ): TreeLabelProps = {
    val __obj = js.Dynamic.literal(hasChildren = hasChildren.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeLabelProps]
  }
}

