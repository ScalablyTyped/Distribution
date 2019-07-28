package typings.datatablesDotNetDashButtons.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonExportOptions extends js.Object {
  var columns: js.UndefOr[ButtonSelectorTypes | js.Array[ButtonSelectorTypes]] = js.undefined
}

object ButtonExportOptions {
  @scala.inline
  def apply(columns: ButtonSelectorTypes | js.Array[ButtonSelectorTypes] = null): ButtonExportOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonExportOptions]
  }
}

