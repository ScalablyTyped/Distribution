package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonDomButtomButton extends ButtonDomButtomCommon {
  var active: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonDomButtomButton {
  @scala.inline
  def apply(
    active: java.lang.String = null,
    className: java.lang.String = null,
    disabled: java.lang.String = null,
    tag: java.lang.String = null
  ): ButtonDomButtomButton = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (className != null) __obj.updateDynamic("className")(className)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[ButtonDomButtomButton]
  }
}

