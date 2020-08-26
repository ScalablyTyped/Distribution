package typings.baseui.treeViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewOverrides extends TreeLabelOverrides {
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.native
  var TreeItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isLeafNode :boolean | undefined}> */ js.Any
  ] = js.native
  var TreeItemList: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isChildNode :boolean | undefined}> */ js.Any
  ] = js.native
  var TreeLabel: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<TreeLabelProps> */ js.Any
  ] = js.native
}

object TreeViewOverrides {
  @scala.inline
  def apply(): TreeViewOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeViewOverrides]
  }
  @scala.inline
  implicit class TreeViewOverridesOps[Self <: TreeViewOverrides] (val x: Self) extends AnyVal {
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
    def setRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
    ): Self = this.set("Root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    @scala.inline
    def setTreeItem(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isLeafNode :boolean | undefined}> */ js.Any
    ): Self = this.set("TreeItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeItem: Self = this.set("TreeItem", js.undefined)
    @scala.inline
    def setTreeItemList(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isChildNode :boolean | undefined}> */ js.Any
    ): Self = this.set("TreeItemList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeItemList: Self = this.set("TreeItemList", js.undefined)
    @scala.inline
    def setTreeLabel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<TreeLabelProps> */ js.Any
    ): Self = this.set("TreeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeLabel: Self = this.set("TreeLabel", js.undefined)
  }
  
}

