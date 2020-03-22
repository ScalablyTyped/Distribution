package typings.baseui.treeViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewOverrides extends TreeLabelOverrides {
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.undefined
  var TreeItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isLeafNode ? :boolean}> */ js.Any
  ] = js.undefined
  var TreeItemList: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isChildNode ? :boolean}> */ js.Any
  ] = js.undefined
  var TreeLabel: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<TreeLabelProps> */ js.Any
  ] = js.undefined
}

object TreeViewOverrides {
  @scala.inline
  def apply(
    CollapseIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null,
    ExpandIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null,
    IconContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null,
    LeafIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null,
    LeafIconContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null,
    Root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null,
    TreeItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isLeafNode ? :boolean}> */ js.Any = null,
    TreeItemContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null,
    TreeItemList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isChildNode ? :boolean}> */ js.Any = null,
    TreeLabel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<TreeLabelProps> */ js.Any = null
  ): TreeViewOverrides = {
    val __obj = js.Dynamic.literal()
    if (CollapseIcon != null) __obj.updateDynamic("CollapseIcon")(CollapseIcon.asInstanceOf[js.Any])
    if (ExpandIcon != null) __obj.updateDynamic("ExpandIcon")(ExpandIcon.asInstanceOf[js.Any])
    if (IconContainer != null) __obj.updateDynamic("IconContainer")(IconContainer.asInstanceOf[js.Any])
    if (LeafIcon != null) __obj.updateDynamic("LeafIcon")(LeafIcon.asInstanceOf[js.Any])
    if (LeafIconContainer != null) __obj.updateDynamic("LeafIconContainer")(LeafIconContainer.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (TreeItem != null) __obj.updateDynamic("TreeItem")(TreeItem.asInstanceOf[js.Any])
    if (TreeItemContent != null) __obj.updateDynamic("TreeItemContent")(TreeItemContent.asInstanceOf[js.Any])
    if (TreeItemList != null) __obj.updateDynamic("TreeItemList")(TreeItemList.asInstanceOf[js.Any])
    if (TreeLabel != null) __obj.updateDynamic("TreeLabel")(TreeLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewOverrides]
  }
}

