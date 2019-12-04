package typings.baseui.datepickerMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatepickerState extends js.Object {
  var calendarFocused: Boolean
  var isOpen: Boolean
  var isPseudoFocused: Boolean
  var lastActiveElm: js.UndefOr[HTMLElement] = js.undefined
}

object DatepickerState {
  @scala.inline
  def apply(
    calendarFocused: Boolean,
    isOpen: Boolean,
    isPseudoFocused: Boolean,
    lastActiveElm: HTMLElement = null
  ): DatepickerState = {
    val __obj = js.Dynamic.literal(calendarFocused = calendarFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPseudoFocused = isPseudoFocused.asInstanceOf[js.Any])
    if (lastActiveElm != null) __obj.updateDynamic("lastActiveElm")(lastActiveElm.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerState]
  }
}

