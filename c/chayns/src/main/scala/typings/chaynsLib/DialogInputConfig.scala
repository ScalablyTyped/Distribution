package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.dialog.input()
trait DialogInputConfig extends js.Object {
  var buttons: js.UndefOr[js.Array[DialogButton]] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var placeholderText: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
}

object DialogInputConfig {
  @scala.inline
  def apply(
    title: java.lang.String,
    buttons: js.Array[DialogButton] = null,
    message: java.lang.String = null,
    placeholderText: java.lang.String = null,
    text: java.lang.String = null
  ): DialogInputConfig = {
    val __obj = js.Dynamic.literal(title = title)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (message != null) __obj.updateDynamic("message")(message)
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DialogInputConfig]
  }
}

