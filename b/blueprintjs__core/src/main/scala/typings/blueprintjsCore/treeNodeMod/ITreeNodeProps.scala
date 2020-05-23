package typings.blueprintjsCore.treeNodeMod

import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreeNodeProps[T] extends ITreeNode[T] {
  var children: js.UndefOr[ReactNode] = js.undefined
  var contentRef: js.UndefOr[js.Function2[/* node */ TreeNode[T], /* element */ HTMLDivElement | Null, Unit]] = js.undefined
  var depth: Double
  var key: js.UndefOr[String | Double] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onCollapse: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onContextMenu: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onDoubleClick: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onExpand: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var path: js.Array[Double]
}

object ITreeNodeProps {
  @scala.inline
  def apply[T](
    depth: Double,
    id: String | Double,
    label: String | Element,
    path: js.Array[Double],
    childNodes: js.Array[ITreeNode[T]] = null,
    children: ReactNode = null,
    className: String = null,
    contentRef: (/* node */ TreeNode[T], /* element */ HTMLDivElement | Null) => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hasCaret: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[Null | IconName | MaybeElement] = js.undefined,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    key: String | Double = null,
    nodeData: T = null,
    onClick: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit = null,
    onCollapse: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent]) => Unit = null,
    onContextMenu: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit = null,
    onDoubleClick: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit = null,
    onExpand: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent]) => Unit = null,
    onMouseEnter: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit = null,
    onMouseLeave: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit = null,
    secondaryLabel: js.UndefOr[Null | String | MaybeElement] = js.undefined
  ): ITreeNodeProps[T] = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentRef != null) __obj.updateDynamic("contentRef")(js.Any.fromFunction2(contentRef))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCaret)) __obj.updateDynamic("hasCaret")(hasCaret.get.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodeData != null) __obj.updateDynamic("nodeData")(nodeData.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction2(onCollapse))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction2(onContextMenu))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction2(onDoubleClick))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (!js.isUndefined(secondaryLabel)) __obj.updateDynamic("secondaryLabel")(secondaryLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeNodeProps[T]]
  }
}

