package typings.blueprintjsCore.treeMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.treeNodeMod.ITreeNode
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreeProps[T] extends IProps {
  /**
    * The data specifying the contents and appearance of the tree.
    */
  var contents: js.Array[ITreeNode[T]] = js.native
  /**
    * Invoked when a node is clicked anywhere other than the caret for expanding/collapsing the node.
    */
  var onNodeClick: js.UndefOr[TreeEventHandler[T]] = js.native
  /**
    * Invoked when caret of an expanded node is clicked.
    */
  var onNodeCollapse: js.UndefOr[TreeEventHandler[T]] = js.native
  /**
    * Invoked when a node is right-clicked or the context menu button is pressed on a focused node.
    */
  var onNodeContextMenu: js.UndefOr[TreeEventHandler[T]] = js.native
  /**
    * Invoked when a node is double-clicked. Be careful when using this in combination with
    * an `onNodeClick` (single-click) handler, as the way this behaves can vary between browsers.
    * See http://stackoverflow.com/q/5497073/3124288
    */
  var onNodeDoubleClick: js.UndefOr[TreeEventHandler[T]] = js.native
  /**
    * Invoked when the caret of a collapsed node is clicked.
    */
  var onNodeExpand: js.UndefOr[TreeEventHandler[T]] = js.native
  /**
    * Invoked when the mouse is moved over a node.
    */
  var onNodeMouseEnter: js.UndefOr[TreeEventHandler[T]] = js.native
  /**
    * Invoked when the mouse is moved out of a node.
    */
  var onNodeMouseLeave: js.UndefOr[TreeEventHandler[T]] = js.native
}

object ITreeProps {
  @scala.inline
  def apply[T](contents: js.Array[ITreeNode[T]]): ITreeProps[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeProps[T]]
  }
  @scala.inline
  implicit class ITreePropsOps[Self <: ITreeProps[_], T] (val x: Self with ITreeProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentsVarargs(value: ITreeNode[T]*): Self = this.set("contents", js.Array(value :_*))
    @scala.inline
    def setContents(value: js.Array[ITreeNode[T]]): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnNodeClick(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onNodeClick", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnNodeClick: Self = this.set("onNodeClick", js.undefined)
    @scala.inline
    def setOnNodeCollapse(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onNodeCollapse", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnNodeCollapse: Self = this.set("onNodeCollapse", js.undefined)
    @scala.inline
    def setOnNodeContextMenu(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onNodeContextMenu", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnNodeContextMenu: Self = this.set("onNodeContextMenu", js.undefined)
    @scala.inline
    def setOnNodeDoubleClick(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onNodeDoubleClick", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnNodeDoubleClick: Self = this.set("onNodeDoubleClick", js.undefined)
    @scala.inline
    def setOnNodeExpand(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onNodeExpand", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnNodeExpand: Self = this.set("onNodeExpand", js.undefined)
    @scala.inline
    def setOnNodeMouseEnter(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onNodeMouseEnter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnNodeMouseEnter: Self = this.set("onNodeMouseEnter", js.undefined)
    @scala.inline
    def setOnNodeMouseLeave(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onNodeMouseLeave", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnNodeMouseLeave: Self = this.set("onNodeMouseLeave", js.undefined)
  }
  
}

