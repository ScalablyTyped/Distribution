package typings
package baseuiLib.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatepickerState extends js.Object {
  var calendarFocused: scala.Boolean
  var isOpen: scala.Boolean
  var isPseudoFocused: scala.Boolean
  var lastActiveElm: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object DatepickerState {
  @scala.inline
  def apply(
    calendarFocused: scala.Boolean,
    isOpen: scala.Boolean,
    isPseudoFocused: scala.Boolean,
    lastActiveElm: stdLib.HTMLElement = null
  ): DatepickerState = {
    val __obj = js.Dynamic.literal(calendarFocused = calendarFocused, isOpen = isOpen, isPseudoFocused = isPseudoFocused)
    if (lastActiveElm != null) __obj.updateDynamic("lastActiveElm")(lastActiveElm)
    __obj.asInstanceOf[DatepickerState]
  }
}

