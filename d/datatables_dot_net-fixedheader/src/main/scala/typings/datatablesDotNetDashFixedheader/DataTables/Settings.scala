package typings.datatablesDotNetDashFixedheader.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /*
    * FixedHeader extension options
    */
  var fixedHeader: js.UndefOr[Boolean | FixedHeaderSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(fixedHeader: Boolean | FixedHeaderSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (fixedHeader != null) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

