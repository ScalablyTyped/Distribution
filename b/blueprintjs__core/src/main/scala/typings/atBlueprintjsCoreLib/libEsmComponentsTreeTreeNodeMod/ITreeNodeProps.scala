package typings
package atBlueprintjsCoreLib.libEsmComponentsTreeTreeNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreeNodeProps[T] extends ITreeNode[T] {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var contentRef: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* element */ stdLib.HTMLDivElement | scala.Null, scala.Unit]
  ] = js.undefined
  var depth: scala.Double
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onCollapse: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLSpanElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onContextMenu: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onDoubleClick: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onExpand: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLSpanElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var path: js.Array[scala.Double]
}

object ITreeNodeProps {
  @scala.inline
  def apply[T](
    depth: scala.Double,
    id: java.lang.String | scala.Double,
    label: java.lang.String | reactLib.reactMod.Global.JSXNs.Element,
    path: js.Array[scala.Double],
    childNodes: js.Array[ITreeNode[T]] = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    contentRef: (/* node */ TreeNode[T], /* element */ stdLib.HTMLDivElement | scala.Null) => scala.Unit = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hasCaret: js.UndefOr[scala.Boolean] = js.undefined,
    icon: atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement = null,
    isExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String | scala.Double = null,
    nodeData: T = null,
    onClick: (/* node */ TreeNode[T], /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onCollapse: (/* node */ TreeNode[T], /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLSpanElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onContextMenu: (/* node */ TreeNode[T], /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onDoubleClick: (/* node */ TreeNode[T], /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onExpand: (/* node */ TreeNode[T], /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLSpanElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onMouseEnter: (/* node */ TreeNode[T], /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onMouseLeave: (/* node */ TreeNode[T], /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    secondaryLabel: java.lang.String | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement = null
  ): ITreeNodeProps[T] = {
    val __obj = js.Dynamic.literal(depth = depth, id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path)
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentRef != null) __obj.updateDynamic("contentRef")(js.Any.fromFunction2(contentRef))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hasCaret)) __obj.updateDynamic("hasCaret")(hasCaret)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodeData != null) __obj.updateDynamic("nodeData")(nodeData.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction2(onCollapse))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction2(onContextMenu))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction2(onDoubleClick))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (secondaryLabel != null) __obj.updateDynamic("secondaryLabel")(secondaryLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeNodeProps[T]]
  }
}

