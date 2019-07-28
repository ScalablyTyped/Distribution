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
    val __obj = js.Dynamic.literal(title = title)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (message != null) __obj.updateDynamic("message")(message)
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DialogInputConfig]
  }
}

