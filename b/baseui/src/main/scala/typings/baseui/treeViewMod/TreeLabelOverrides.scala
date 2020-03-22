package typings.baseui.treeViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeLabelOverrides extends js.Object {
  var CollapseIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.undefined
  var ExpandIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.undefined
  var IconContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.undefined
  var LeafIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.undefined
  var LeafIconContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.undefined
  var TreeItemContent: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.undefined
}

object TreeLabelOverrides {
  @scala.inline
  def apply(
    CollapseIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null,
    ExpandIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null,
    IconContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null,
    LeafIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null,
    LeafIconContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null,
    TreeItemContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null
  ): TreeLabelOverrides = {
    val __obj = js.Dynamic.literal()
    if (CollapseIcon != null) __obj.updateDynamic("CollapseIcon")(CollapseIcon.asInstanceOf[js.Any])
    if (ExpandIcon != null) __obj.updateDynamic("ExpandIcon")(ExpandIcon.asInstanceOf[js.Any])
    if (IconContainer != null) __obj.updateDynamic("IconContainer")(IconContainer.asInstanceOf[js.Any])
    if (LeafIcon != null) __obj.updateDynamic("LeafIcon")(LeafIcon.asInstanceOf[js.Any])
    if (LeafIconContainer != null) __obj.updateDynamic("LeafIconContainer")(LeafIconContainer.asInstanceOf[js.Any])
    if (TreeItemContent != null) __obj.updateDynamic("TreeItemContent")(TreeItemContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeLabelOverrides]
  }
}

