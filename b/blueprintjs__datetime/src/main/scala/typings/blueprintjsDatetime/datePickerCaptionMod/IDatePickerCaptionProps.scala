package typings.blueprintjsDatetime.datePickerCaptionMod

import typings.reactDayPicker.classNamesMod.ClassNames
import typings.reactDayPicker.localeUtilsMod.LocaleUtils
import typings.reactDayPicker.propsMod.CaptionElementProps
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePickerCaptionProps extends CaptionElementProps {
  var maxDate: Date = js.native
  var minDate: Date = js.native
  /** Callback invoked when the month or year `<select>` is changed. */
  var onDateChange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
  var onMonthChange: js.UndefOr[js.Function1[/* month */ Double, Unit]] = js.native
  var onYearChange: js.UndefOr[js.Function1[/* year */ Double, Unit]] = js.native
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.native
}

object IDatePickerCaptionProps {
  @scala.inline
  def apply(
    classNames: ClassNames,
    date: Date,
    locale: String,
    localeUtils: LocaleUtils,
    maxDate: Date,
    minDate: Date
  ): IDatePickerCaptionProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerCaptionProps]
  }
  @scala.inline
  implicit class IDatePickerCaptionPropsOps[Self <: IDatePickerCaptionProps] (val x: Self) extends AnyVal {
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
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDateChange(value: /* date */ Date => Unit): Self = this.set("onDateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDateChange: Self = this.set("onDateChange", js.undefined)
    @scala.inline
    def setOnMonthChange(value: /* month */ Double => Unit): Self = this.set("onMonthChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMonthChange: Self = this.set("onMonthChange", js.undefined)
    @scala.inline
    def setOnYearChange(value: /* year */ Double => Unit): Self = this.set("onYearChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnYearChange: Self = this.set("onYearChange", js.undefined)
    @scala.inline
    def setReverseMonthAndYearMenus(value: Boolean): Self = this.set("reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseMonthAndYearMenus: Self = this.set("reverseMonthAndYearMenus", js.undefined)
  }
  
}

