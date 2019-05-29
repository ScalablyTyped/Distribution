package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * Buttons extension options
    */
  var buttons: js.UndefOr[scala.Boolean | (js.Array[ButtonSettings | java.lang.String]) | ButtonsSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(buttons: scala.Boolean | (js.Array[ButtonSettings | java.lang.String]) | ButtonsSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

