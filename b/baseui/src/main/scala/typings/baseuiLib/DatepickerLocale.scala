package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatepickerLocale extends js.Object {
  var ariaLabel: java.lang.String
  var nextMonth: java.lang.String
  var previousMonth: java.lang.String
  var screenReaderMessageInput: java.lang.String
  var timePickerAriaLabel: java.lang.String
  var timezonePickerAriaLabel: java.lang.String
}

object DatepickerLocale {
  @scala.inline
  def apply(
    ariaLabel: java.lang.String,
    nextMonth: java.lang.String,
    previousMonth: java.lang.String,
    screenReaderMessageInput: java.lang.String,
    timePickerAriaLabel: java.lang.String,
    timezonePickerAriaLabel: java.lang.String
  ): DatepickerLocale = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel, nextMonth = nextMonth, previousMonth = previousMonth, screenReaderMessageInput = screenReaderMessageInput, timePickerAriaLabel = timePickerAriaLabel, timezonePickerAriaLabel = timezonePickerAriaLabel)
  
    __obj.asInstanceOf[DatepickerLocale]
  }
}

