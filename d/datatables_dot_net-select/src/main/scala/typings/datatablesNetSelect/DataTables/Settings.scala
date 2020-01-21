package typings.datatablesNetSelect.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /*
    * Select extension options
    */
  var select: js.UndefOr[Boolean | String | SelectSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(select: Boolean | String | SelectSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

