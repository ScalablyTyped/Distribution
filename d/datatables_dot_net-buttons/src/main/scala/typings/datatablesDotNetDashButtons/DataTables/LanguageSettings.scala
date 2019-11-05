package typings.datatablesDotNetDashButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageSettings extends js.Object {
  var buttons: js.UndefOr[js.Object] = js.undefined
}

object LanguageSettings {
  @scala.inline
  def apply(buttons: js.Object = null): LanguageSettings = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    __obj.asInstanceOf[LanguageSettings]
  }
}

