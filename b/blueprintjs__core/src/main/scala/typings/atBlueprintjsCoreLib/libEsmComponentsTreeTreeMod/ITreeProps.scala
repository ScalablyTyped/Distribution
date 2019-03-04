package typings
package atBlueprintjsCoreLib.libEsmComponentsTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreeProps[T]
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * The data specifying the contents and appearance of the tree.
    */
  var contents: js.Array[atBlueprintjsCoreLib.libEsmComponentsTreeTreeNodeMod.ITreeNode[T]]
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
    contents: js.Array[atBlueprintjsCoreLib.libEsmComponentsTreeTreeNodeMod.ITreeNode[T]],
    className: java.lang.String = null,
    onNodeClick: TreeEventHandler[T] = null,
    onNodeCollapse: TreeEventHandler[T] = null,
    onNodeContextMenu: TreeEventHandler[T] = null,
    onNodeDoubleClick: TreeEventHandler[T] = null,
    onNodeExpand: TreeEventHandler[T] = null,
    onNodeMouseEnter: TreeEventHandler[T] = null,
    onNodeMouseLeave: TreeEventHandler[T] = null
  ): ITreeProps[T] = {
    val __obj = js.Dynamic.literal(contents = contents)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onNodeClick != null) __obj.updateDynamic("onNodeClick")(onNodeClick)
    if (onNodeCollapse != null) __obj.updateDynamic("onNodeCollapse")(onNodeCollapse)
    if (onNodeContextMenu != null) __obj.updateDynamic("onNodeContextMenu")(onNodeContextMenu)
    if (onNodeDoubleClick != null) __obj.updateDynamic("onNodeDoubleClick")(onNodeDoubleClick)
    if (onNodeExpand != null) __obj.updateDynamic("onNodeExpand")(onNodeExpand)
    if (onNodeMouseEnter != null) __obj.updateDynamic("onNodeMouseEnter")(onNodeMouseEnter)
    if (onNodeMouseLeave != null) __obj.updateDynamic("onNodeMouseLeave")(onNodeMouseLeave)
    __obj.asInstanceOf[ITreeProps[T]]
  }
}

