package typings.baseui.treeViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeNodeProps extends js.Object {
  
  var indentGuides: js.UndefOr[Boolean] = js.native
  
  var node: TreeNode[_] = js.native
  
  var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode[_], Unit]] = js.native
  
  var overrides: js.UndefOr[TreeViewOverrides] = js.native
}
object TreeNodeProps {
  
  @scala.inline
  def apply(node: TreeNode[_]): TreeNodeProps = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeProps]
  }
  
  @scala.inline
  implicit class TreeNodePropsOps[Self <: TreeNodeProps] (val x: Self) extends AnyVal {
    
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
    def setNode(value: TreeNode[_]): Self = this.set("node", value.asInstanceOf[js.Any])
    
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
  }
}
