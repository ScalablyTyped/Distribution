package typings.baseui.treeViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewProps extends js.Object {
  var data: js.Array[TreeNode]
  var getId: js.UndefOr[js.Function1[/* node */ TreeNode, Double | String]] = js.undefined
  var indentGuides: js.UndefOr[Boolean] = js.undefined
  var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode, Unit]] = js.undefined
  var overrides: js.UndefOr[TreeViewOverrides] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var singleExpanded: js.UndefOr[Boolean] = js.undefined
}

object TreeViewProps {
  @scala.inline
  def apply(
    data: js.Array[TreeNode],
    getId: /* node */ TreeNode => Double | String = null,
    indentGuides: js.UndefOr[Boolean] = js.undefined,
    onToggle: /* node */ TreeNode => Unit = null,
    overrides: TreeViewOverrides = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    singleExpanded: js.UndefOr[Boolean] = js.undefined
  ): TreeViewProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction1(getId))
    if (!js.isUndefined(indentGuides)) __obj.updateDynamic("indentGuides")(indentGuides.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(singleExpanded)) __obj.updateDynamic("singleExpanded")(singleExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewProps]
  }
}

