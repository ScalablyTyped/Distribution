package typings.baseui.treeViewMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeLabelProps extends js.Object {
  
  var hasChildren: Boolean = js.native
  
  var isExpanded: js.UndefOr[Boolean] = js.native
  
  var label: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String = js.native
  
  var node: TreeNode[_] = js.native
  
  var overrides: js.UndefOr[TreeLabelOverrides] = js.native
}
object TreeLabelProps {
  
  @scala.inline
  def apply(
    hasChildren: Boolean,
    label: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String,
    node: TreeNode[_]
  ): TreeLabelProps = {
    val __obj = js.Dynamic.literal(hasChildren = hasChildren.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeLabelProps]
  }
  
  @scala.inline
  implicit class TreeLabelPropsOps[Self <: TreeLabelProps] (val x: Self) extends AnyVal {
    
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
    def setHasChildren(value: Boolean): Self = this.set("hasChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFunction1(value: /* node */ TreeNode[_] => ReactNode): Self = this.set("label", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabel(value: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: TreeNode[_]): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    
    @scala.inline
    def setOverrides(value: TreeLabelOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
}
