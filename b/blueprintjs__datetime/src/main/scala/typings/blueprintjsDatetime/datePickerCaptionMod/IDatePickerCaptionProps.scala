package typings.blueprintjsDatetime.datePickerCaptionMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CaptionElementProps * / any */ trait IDatePickerCaptionProps extends js.Object {
  var maxDate: Date
  var minDate: Date
  /** Callback invoked when the month or year `<select>` is changed. */
  var onDateChange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.undefined
  var onMonthChange: js.UndefOr[js.Function1[/* month */ Double, Unit]] = js.undefined
  var onYearChange: js.UndefOr[js.Function1[/* year */ Double, Unit]] = js.undefined
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined
}

object IDatePickerCaptionProps {
  @scala.inline
  def apply(
    maxDate: Date,
    minDate: Date,
    onDateChange: /* date */ Date => Unit = null,
    onMonthChange: /* month */ Double => Unit = null,
    onYearChange: /* year */ Double => Unit = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined
  ): IDatePickerCaptionProps = {
    val __obj = js.Dynamic.literal(maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1(onDateChange))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1(onMonthChange))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1(onYearChange))
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerCaptionProps]
  }
}

