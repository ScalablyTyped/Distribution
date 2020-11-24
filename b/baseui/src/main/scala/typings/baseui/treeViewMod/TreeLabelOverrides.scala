package typings.baseui.treeViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeLabelOverrides extends js.Object {
  
  var CollapseIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.native
  
  var ExpandIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.native
  
  var IconContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.native
  
  var LeafIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.native
  
  var LeafIconContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.native
  
  var TreeItemContent: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.native
}
object TreeLabelOverrides {
  
  @scala.inline
  def apply(): TreeLabelOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeLabelOverrides]
  }
  
  @scala.inline
  implicit class TreeLabelOverridesOps[Self <: TreeLabelOverrides] (val x: Self) extends AnyVal {
    
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
    def setCollapseIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
    ): Self = this.set("CollapseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseIcon: Self = this.set("CollapseIcon", js.undefined)
    
    @scala.inline
    def setExpandIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
    ): Self = this.set("ExpandIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandIcon: Self = this.set("ExpandIcon", js.undefined)
    
    @scala.inline
    def setIconContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
    ): Self = this.set("IconContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconContainer: Self = this.set("IconContainer", js.undefined)
    
    @scala.inline
    def setLeafIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
    ): Self = this.set("LeafIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeafIcon: Self = this.set("LeafIcon", js.undefined)
    
    @scala.inline
    def setLeafIconContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
    ): Self = this.set("LeafIconContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeafIconContainer: Self = this.set("LeafIconContainer", js.undefined)
    
    @scala.inline
    def setTreeItemContent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
    ): Self = this.set("TreeItemContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeItemContent: Self = this.set("TreeItemContent", js.undefined)
  }
}
