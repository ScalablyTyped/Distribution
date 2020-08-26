package typings.blueprintjsDatetime.dateInputMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateInputState extends js.Object {
  var isInputFocused: Boolean = js.native
  var isOpen: Boolean = js.native
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  var value: Date = js.native
  var valueString: String = js.native
}

object IDateInputState {
  @scala.inline
  def apply(isInputFocused: Boolean, isOpen: Boolean, value: Date, valueString: String): IDateInputState = {
    val __obj = js.Dynamic.literal(isInputFocused = isInputFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueString = valueString.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateInputState]
  }
  @scala.inline
  implicit class IDateInputStateOps[Self <: IDateInputState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsInputFocused(value: Boolean): Self = this.set("isInputFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueString(value: String): Self = this.set("valueString", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedShortcutIndex(value: Double): Self = this.set("selectedShortcutIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedShortcutIndex: Self = this.set("selectedShortcutIndex", js.undefined)
  }
  
}

