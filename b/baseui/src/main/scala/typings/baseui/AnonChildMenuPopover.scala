package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildMenuPopover extends js.Object {
  var ChildMenuPopover: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var ListItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object AnonChildMenuPopover {
  @scala.inline
  def apply(
    ChildMenuPopover: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    ListItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): AnonChildMenuPopover = {
    val __obj = js.Dynamic.literal()
    if (ChildMenuPopover != null) __obj.updateDynamic("ChildMenuPopover")(ChildMenuPopover.asInstanceOf[js.Any])
    if (ListItem != null) __obj.updateDynamic("ListItem")(ListItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildMenuPopover]
  }
}

