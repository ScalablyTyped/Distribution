package typings.blueprintjsDatetime.dateInputMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateInputState extends js.Object {
  var isInputFocused: Boolean
  var isOpen: Boolean
  var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
  var value: Date
  var valueString: String
}

object IDateInputState {
  @scala.inline
  def apply(
    isInputFocused: Boolean,
    isOpen: Boolean,
    value: Date,
    valueString: String,
    selectedShortcutIndex: Int | Double = null
  ): IDateInputState = {
    val __obj = js.Dynamic.literal(isInputFocused = isInputFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueString = valueString.asInstanceOf[js.Any])
    if (selectedShortcutIndex != null) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateInputState]
  }
}

