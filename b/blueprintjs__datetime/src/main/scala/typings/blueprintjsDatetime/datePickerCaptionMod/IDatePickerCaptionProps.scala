package typings.blueprintjsDatetime.datePickerCaptionMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactDayPicker.commonMod.ClassNames
import typings.reactDayPicker.propsMod.CaptionElementProps
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerCaptionProps extends CaptionElementProps {
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
    classNames: ClassNames,
    date: Date,
    locale: String,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any,
    maxDate: Date,
    minDate: Date,
    months: js.Array[String] = null,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onDateChange: /* date */ Date => Unit = null,
    onMonthChange: /* month */ Double => Unit = null,
    onYearChange: /* year */ Double => Unit = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined
  ): IDatePickerCaptionProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1(onDateChange))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1(onMonthChange))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1(onYearChange))
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerCaptionProps]
  }
}

