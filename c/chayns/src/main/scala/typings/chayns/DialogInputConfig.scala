package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.dialog.input()
trait DialogInputConfig extends js.Object {
  var buttons: js.UndefOr[js.Array[DialogButton]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var placeholderText: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var title: String
}

object DialogInputConfig {
  @scala.inline
  def apply(
    title: String,
    buttons: js.Array[DialogButton] = null,
    message: String = null,
    placeholderText: String = null,
    text: String = null
  ): DialogInputConfig = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogInputConfig]
  }
}

