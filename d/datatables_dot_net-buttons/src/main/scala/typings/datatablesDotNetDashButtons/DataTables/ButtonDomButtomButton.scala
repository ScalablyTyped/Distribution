package typings.datatablesDotNetDashButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonDomButtomButton extends ButtonDomButtomCommon {
  var active: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
}

object ButtonDomButtomButton {
  @scala.inline
  def apply(active: String = null, className: String = null, disabled: String = null, tag: String = null): ButtonDomButtomButton = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonDomButtomButton]
  }
}

