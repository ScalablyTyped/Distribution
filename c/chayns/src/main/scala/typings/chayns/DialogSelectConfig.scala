package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.dialog.select()
trait DialogSelectConfig extends js.Object {
  var buttons: js.UndefOr[js.Array[_]] = js.undefined
          // TODO interface for buttons
  var list: js.Array[DialogSelectConfigItem]
  var message: js.UndefOr[String] = js.undefined
  var multiselect: js.UndefOr[Boolean] = js.undefined
  var quickfind: js.UndefOr[Boolean] = js.undefined
  var title: String
}

object DialogSelectConfig {
  @scala.inline
  def apply(
    list: js.Array[DialogSelectConfigItem],
    title: String,
    buttons: js.Array[_] = null,
    message: String = null,
    multiselect: js.UndefOr[Boolean] = js.undefined,
    quickfind: js.UndefOr[Boolean] = js.undefined
  ): DialogSelectConfig = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(multiselect)) __obj.updateDynamic("multiselect")(multiselect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quickfind)) __obj.updateDynamic("quickfind")(quickfind.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSelectConfig]
  }
}

