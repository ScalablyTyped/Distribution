package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonListItem extends js.Object {
  var ListItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object AnonListItem {
  @scala.inline
  def apply(
    ListItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): AnonListItem = {
    val __obj = js.Dynamic.literal()
    if (ListItem != null) __obj.updateDynamic("ListItem")(ListItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonListItem]
  }
}

