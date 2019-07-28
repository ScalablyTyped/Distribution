package typings.datatablesDotNetDashButtons.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * Buttons extension options
    */
  var buttons: js.UndefOr[Boolean | (js.Array[ButtonSettings | String]) | ButtonsSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(buttons: Boolean | (js.Array[ButtonSettings | String]) | ButtonsSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

