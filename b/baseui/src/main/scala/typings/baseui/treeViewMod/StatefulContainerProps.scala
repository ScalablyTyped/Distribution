package typings.baseui.treeViewMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/tree-view.TreeViewProps & {children (props : baseui.baseui/tree-view.TreeViewProps): react.react.ReactNode} */
trait StatefulContainerProps extends js.Object {
  var data: js.Array[TreeNode]
  var getId: js.UndefOr[js.Function1[/* node */ TreeNode, Double | String]] = js.undefined
  var indentGuides: js.UndefOr[Boolean] = js.undefined
  var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode, Unit]] = js.undefined
  var overrides: js.UndefOr[TreeViewOverrides] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var singleExpanded: js.UndefOr[Boolean] = js.undefined
  def children(props: TreeViewProps): ReactNode
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    children: TreeViewProps => ReactNode,
    data: js.Array[TreeNode],
    getId: /* node */ TreeNode => Double | String = null,
    indentGuides: js.UndefOr[Boolean] = js.undefined,
    onToggle: /* node */ TreeNode => Unit = null,
    overrides: TreeViewOverrides = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    singleExpanded: js.UndefOr[Boolean] = js.undefined
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data.asInstanceOf[js.Any])
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction1(getId))
    if (!js.isUndefined(indentGuides)) __obj.updateDynamic("indentGuides")(indentGuides.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(singleExpanded)) __obj.updateDynamic("singleExpanded")(singleExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

