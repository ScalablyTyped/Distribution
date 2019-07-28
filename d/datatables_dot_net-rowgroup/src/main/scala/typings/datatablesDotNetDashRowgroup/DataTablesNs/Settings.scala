package typings.datatablesDotNetDashRowgroup.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
  		 * RowGroup extension options
  		 */
  var rowGroup: js.UndefOr[Boolean | RowGroupSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(rowGroup: Boolean | RowGroupSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (rowGroup != null) __obj.updateDynamic("rowGroup")(rowGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

