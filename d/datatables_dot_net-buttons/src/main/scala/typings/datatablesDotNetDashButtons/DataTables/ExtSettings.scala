package typings.datatablesDotNetDashButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtSettings extends js.Object {
  var buttons: ExtButtonsSettings
}

object ExtSettings {
  @scala.inline
  def apply(buttons: ExtButtonsSettings): ExtSettings = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtSettings]
  }
}

