package typings.baseui.treeViewMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/tree-view.TreeViewProps & {children (props : baseui.baseui/tree-view.TreeViewProps): react.react.ReactNode} */
@js.native
trait StatefulContainerProps extends js.Object {
  
  def children(props: TreeViewProps): ReactNode = js.native
  
  var data: js.Array[TreeNode[_]] = js.native
  
  var getId: js.UndefOr[js.Function1[/* node */ TreeNode[_], Double | String]] = js.native
  
  var indentGuides: js.UndefOr[Boolean] = js.native
  
  var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode[_], Unit]] = js.native
  
  var overrides: js.UndefOr[TreeViewOverrides] = js.native
  
  var renderAll: js.UndefOr[Boolean] = js.native
  
  var singleExpanded: js.UndefOr[Boolean] = js.native
}
object StatefulContainerProps {
  
  @scala.inline
  def apply(children: TreeViewProps => ReactNode, data: js.Array[TreeNode[_]]): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerProps]
  }
  
  @scala.inline
  implicit class StatefulContainerPropsOps[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: TreeViewProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataVarargs(value: TreeNode[js.Any]*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[TreeNode[_]]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetId(value: /* node */ TreeNode[_] => Double | String): Self = this.set("getId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetId: Self = this.set("getId", js.undefined)
    
    @scala.inline
    def setIndentGuides(value: Boolean): Self = this.set("indentGuides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentGuides: Self = this.set("indentGuides", js.undefined)
    
    @scala.inline
    def setOnToggle(value: /* node */ TreeNode[_] => Unit): Self = this.set("onToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    
    @scala.inline
    def setOverrides(value: TreeViewOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setRenderAll(value: Boolean): Self = this.set("renderAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderAll: Self = this.set("renderAll", js.undefined)
    
    @scala.inline
    def setSingleExpanded(value: Boolean): Self = this.set("singleExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleExpanded: Self = this.set("singleExpanded", js.undefined)
  }
}
