package typings.atBlueprintjsCore.libEsmComponentsTreeTreeMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsCore.libEsmComponentsTreeTreeNodeMod.ITreeNode
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreeProps[T] extends IProps {
  /**
    * The data specifying the contents and appearance of the tree.
    */
  var contents: js.Array[ITreeNode[T]]
  /**
    * Invoked when a node is clicked anywhere other than the caret for expanding/collapsing the node.
    */
  var onNodeClick: js.UndefOr[TreeEventHandler[T]] = js.undefined
  /**
    * Invoked when caret of an expanded node is clicked.
    */
  var onNodeCollapse: js.UndefOr[TreeEventHandler[T]] = js.undefined
  /**
    * Invoked when a node is right-clicked or the context menu button is pressed on a focused node.
    */
  var onNodeContextMenu: js.UndefOr[TreeEventHandler[T]] = js.undefined
  /**
    * Invoked when a node is double-clicked. Be careful when using this in combination with
    * an `onNodeClick` (single-click) handler, as the way this behaves can vary between browsers.
    * See http://stackoverflow.com/q/5497073/3124288
    */
  var onNodeDoubleClick: js.UndefOr[TreeEventHandler[T]] = js.undefined
  /**
    * Invoked when the caret of a collapsed node is clicked.
    */
  var onNodeExpand: js.UndefOr[TreeEventHandler[T]] = js.undefined
  /**
    * Invoked when the mouse is moved over a node.
    */
  var onNodeMouseEnter: js.UndefOr[TreeEventHandler[T]] = js.undefined
  /**
    * Invoked when the mouse is moved out of a node.
    */
  var onNodeMouseLeave: js.UndefOr[TreeEventHandler[T]] = js.undefined
}

object ITreeProps {
  @scala.inline
  def apply[T](
    contents: js.Array[ITreeNode[T]],
    className: String = null,
    onNodeClick: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onNodeCollapse: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onNodeContextMenu: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onNodeDoubleClick: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onNodeExpand: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onNodeMouseEnter: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onNodeMouseLeave: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null
  ): ITreeProps[T] = {
    val __obj = js.Dynamic.literal(contents = contents)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onNodeClick != null) __obj.updateDynamic("onNodeClick")(js.Any.fromFunction3(onNodeClick))
    if (onNodeCollapse != null) __obj.updateDynamic("onNodeCollapse")(js.Any.fromFunction3(onNodeCollapse))
    if (onNodeContextMenu != null) __obj.updateDynamic("onNodeContextMenu")(js.Any.fromFunction3(onNodeContextMenu))
    if (onNodeDoubleClick != null) __obj.updateDynamic("onNodeDoubleClick")(js.Any.fromFunction3(onNodeDoubleClick))
    if (onNodeExpand != null) __obj.updateDynamic("onNodeExpand")(js.Any.fromFunction3(onNodeExpand))
    if (onNodeMouseEnter != null) __obj.updateDynamic("onNodeMouseEnter")(js.Any.fromFunction3(onNodeMouseEnter))
    if (onNodeMouseLeave != null) __obj.updateDynamic("onNodeMouseLeave")(js.Any.fromFunction3(onNodeMouseLeave))
    __obj.asInstanceOf[ITreeProps[T]]
  }
}

