package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region "Button Settings"
trait ButtonsSettings extends js.Object {
  var buttons: js.Array[java.lang.String | FunctionButtom | ButtonSettings]
  var dom: js.UndefOr[ButtonDomSettings] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
}

object ButtonsSettings {
  @scala.inline
  def apply(
    buttons: js.Array[java.lang.String | FunctionButtom | ButtonSettings],
    dom: ButtonDomSettings = null,
    name: java.lang.String = null,
    tabIndex: scala.Int | scala.Double = null
  ): ButtonsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttons")(buttons)
    if (dom != null) __obj.updateDynamic("dom")(dom)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonsSettings]
  }
}

