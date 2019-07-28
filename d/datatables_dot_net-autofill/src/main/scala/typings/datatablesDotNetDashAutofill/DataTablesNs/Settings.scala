package typings.datatablesDotNetDashAutofill.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /*
    * autoFill extension options
    */
  var autoFill: js.UndefOr[Boolean | AutoFillSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(autoFill: Boolean | AutoFillSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (autoFill != null) __obj.updateDynamic("autoFill")(autoFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

