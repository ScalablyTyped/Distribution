package typings.bootstrapMultiselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Templates extends js.Object {
  var button: js.UndefOr[String] = js.undefined
  var divider: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var filterClearBtn: js.UndefOr[String] = js.undefined
  var li: js.UndefOr[String] = js.undefined
  var liGroup: js.UndefOr[String] = js.undefined
  var ul: js.UndefOr[String] = js.undefined
}

object Templates {
  @scala.inline
  def apply(
    button: String = null,
    divider: String = null,
    filter: String = null,
    filterClearBtn: String = null,
    li: String = null,
    liGroup: String = null,
    ul: String = null
  ): Templates = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (divider != null) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterClearBtn != null) __obj.updateDynamic("filterClearBtn")(filterClearBtn.asInstanceOf[js.Any])
    if (li != null) __obj.updateDynamic("li")(li.asInstanceOf[js.Any])
    if (liGroup != null) __obj.updateDynamic("liGroup")(liGroup.asInstanceOf[js.Any])
    if (ul != null) __obj.updateDynamic("ul")(ul.asInstanceOf[js.Any])
    __obj.asInstanceOf[Templates]
  }
}

