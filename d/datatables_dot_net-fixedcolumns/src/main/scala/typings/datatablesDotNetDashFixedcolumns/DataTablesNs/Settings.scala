package typings.datatablesDotNetDashFixedcolumns.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /*
    * FixedColumns extension options
    */
  var fixedColumns: js.UndefOr[Boolean | FixedColumnsSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(fixedColumns: Boolean | FixedColumnsSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (fixedColumns != null) __obj.updateDynamic("fixedColumns")(fixedColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

