package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.dialog.select()
trait DialogSelectConfig extends js.Object {
  var buttons: js.UndefOr[js.Array[_]] = js.undefined
  		// TODO interface for buttons
  var list: js.Array[DialogSelectConfigItem]
  var message: js.UndefOr[java.lang.String] = js.undefined
  var multiselect: js.UndefOr[scala.Boolean] = js.undefined
  var quickfind: js.UndefOr[scala.Boolean] = js.undefined
  var title: java.lang.String
}

object DialogSelectConfig {
  @scala.inline
  def apply(
    list: js.Array[DialogSelectConfigItem],
    title: java.lang.String,
    buttons: js.Array[_] = null,
    message: java.lang.String = null,
    multiselect: js.UndefOr[scala.Boolean] = js.undefined,
    quickfind: js.UndefOr[scala.Boolean] = js.undefined
  ): DialogSelectConfig = {
    val __obj = js.Dynamic.literal(list = list, title = title)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(multiselect)) __obj.updateDynamic("multiselect")(multiselect)
    if (!js.isUndefined(quickfind)) __obj.updateDynamic("quickfind")(quickfind)
    __obj.asInstanceOf[DialogSelectConfig]
  }
}

