package typings.blueprintjsCore.treeNodeMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITreeNodeProps[T] extends ITreeNode[T] {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var contentRef: js.UndefOr[js.Function2[/* node */ TreeNode[T], /* element */ HTMLDivElement | Null, Unit]] = js.native
  
  var depth: Double = js.native
  
  var key: js.UndefOr[String | Double] = js.native
  
  var onClick: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
  ] = js.native
  
  var onCollapse: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], Unit]
  ] = js.native
  
  var onContextMenu: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
  ] = js.native
  
  var onDoubleClick: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
  ] = js.native
  
  var onExpand: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], Unit]
  ] = js.native
  
  var onMouseEnter: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
  ] = js.native
  
  var onMouseLeave: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
  ] = js.native
  
  var path: js.Array[Double] = js.native
}
object ITreeNodeProps {
  
  @scala.inline
  def apply[T](depth: Double, id: String | Double, label: String | Element, path: js.Array[Double]): ITreeNodeProps[T] = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeNodeProps[T]]
  }
  
  @scala.inline
  implicit class ITreeNodePropsOps[Self <: ITreeNodeProps[_], T] (val x: Self with ITreeNodeProps[T]) extends AnyVal {
    
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Double*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setContentRef(value: (/* node */ TreeNode[T], /* element */ HTMLDivElement | Null) => Unit): Self = this.set("contentRef", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteContentRef: Self = this.set("contentRef", js.undefined)
    
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnCollapse(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent]) => Unit): Self = this.set("onCollapse", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCollapse: Self = this.set("onCollapse", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = this.set("onContextMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnExpand(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent]) => Unit): Self = this.set("onExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
  }
}
