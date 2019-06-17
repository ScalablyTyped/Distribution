package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ListItem extends js.Object {
  var ListItem: js.UndefOr[Override[_]] = js.undefined
}

object Anon_ListItem {
  @scala.inline
  def apply(ListItem: Override[_] = null): Anon_ListItem = {
    val __obj = js.Dynamic.literal()
    if (ListItem != null) __obj.updateDynamic("ListItem")(ListItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ListItem]
  }
}

