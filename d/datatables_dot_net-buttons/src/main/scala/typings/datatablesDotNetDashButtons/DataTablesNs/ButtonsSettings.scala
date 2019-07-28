package typings.datatablesDotNetDashButtons.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region "Button Settings"
trait ButtonsSettings extends js.Object {
  var buttons: js.Array[String | FunctionButtom | ButtonSettings]
  var dom: js.UndefOr[ButtonDomSettings] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
}

object ButtonsSettings {
  @scala.inline
  def apply(
    buttons: js.Array[String | FunctionButtom | ButtonSettings],
    dom: ButtonDomSettings = null,
    name: String = null,
    tabIndex: Int | Double = null
  ): ButtonsSettings = {
    val __obj = js.Dynamic.literal(buttons = buttons)
    if (dom != null) __obj.updateDynamic("dom")(dom)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonsSettings]
  }
}

