package typings.baseui.datepickerMod

import typings.baseui.anon.BeginDate
import typings.baseui.anon.DateDate
import typings.baseui.anon.DateEvent
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.vertical
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/datepicker.CalendarProps & {  aria-label :string | undefined,   aria-labelledby :string | undefined,   aria-describedby :string | undefined,   disabled :boolean | undefined,   clearable :boolean | undefined,   size :baseui.baseui/input.SIZE[keyof baseui.baseui/input.SIZE] | undefined,   error :boolean | undefined,   positive :boolean | undefined,   placeholder :string | undefined,   required :boolean | undefined,   displayValueAtRangeIndex :number | undefined,   formatDisplayValue :(date : std.Date | std.Array<std.Date>, formatString : string): string | undefined,   formatString :string | undefined,   mask :string | null | undefined,   mountNode :std.HTMLElement | undefined,   onClose :(): any | undefined} */
@js.native
trait DatepickerProps extends js.Object {
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var autoFocusCalendar: js.UndefOr[Boolean] = js.native
  var clearable: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var displayValueAtRangeIndex: js.UndefOr[Double] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var excludeDates: js.UndefOr[js.Array[Date]] = js.native
  var filterDate: js.UndefOr[js.Function1[/* day */ Date, Boolean]] = js.native
  var formatDisplayValue: js.UndefOr[
    js.Function2[/* date */ Date | js.Array[Date], /* formatString */ String, String]
  ] = js.native
  var formatString: js.UndefOr[String] = js.native
  var highlightedDate: js.UndefOr[Date] = js.native
  var includeDates: js.UndefOr[js.Array[Date]] = js.native
  // see https://github.com/date-fns/date-fns/blob/master/src/locale/index.js.flow
  var locale: js.UndefOr[js.Any] = js.native
  var mask: js.UndefOr[String | Null] = js.native
  var maxDate: js.UndefOr[Date] = js.native
  var minDate: js.UndefOr[Date] = js.native
  var monthsShown: js.UndefOr[Double] = js.native
  var mountNode: js.UndefOr[HTMLElement] = js.native
  var onChange: js.UndefOr[typings.baseui.datepickerMod.onChange] = js.native
  var onClose: js.UndefOr[js.Function0[_]] = js.native
  var onDayClick: js.UndefOr[js.Function1[/* args */ DateEvent, _]] = js.native
  var onDayMouseLeave: js.UndefOr[js.Function1[/* args */ DateEvent, _]] = js.native
  var onDayMouseOver: js.UndefOr[js.Function1[/* args */ DateEvent, _]] = js.native
  var onMonthChange: js.UndefOr[js.Function1[/* args */ DateDate, _]] = js.native
  var onYearChange: js.UndefOr[js.Function1[/* args */ DateDate, _]] = js.native
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  var overrides: js.UndefOr[DatepickerOverrides[SharedStylePropsT]] = js.native
  var peekNextMonth: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var positive: js.UndefOr[Boolean] = js.native
  var quickSelect: js.UndefOr[Boolean] = js.native
  var quickSelectOptions: js.UndefOr[js.Array[BeginDate]] = js.native
  var range: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[mini | default_ | compact | large_] = js.native
  var timeSelectEnd: js.UndefOr[Boolean] = js.native
  var timeSelectStart: js.UndefOr[Boolean] = js.native
  var trapTabbing: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[Date | js.Array[Date] | Null] = js.native
}

object DatepickerProps {
  @scala.inline
  def apply(): DatepickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerProps]
  }
  @scala.inline
  implicit class DatepickerPropsOps[Self <: DatepickerProps] (val x: Self) extends AnyVal {
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
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def setAutoFocusCalendar(value: Boolean): Self = this.set("autoFocusCalendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocusCalendar: Self = this.set("autoFocusCalendar", js.undefined)
    @scala.inline
    def setClearable(value: Boolean): Self = this.set("clearable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearable: Self = this.set("clearable", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisplayValueAtRangeIndex(value: Double): Self = this.set("displayValueAtRangeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayValueAtRangeIndex: Self = this.set("displayValueAtRangeIndex", js.undefined)
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExcludeDatesVarargs(value: Date*): Self = this.set("excludeDates", js.Array(value :_*))
    @scala.inline
    def setExcludeDates(value: js.Array[Date]): Self = this.set("excludeDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeDates: Self = this.set("excludeDates", js.undefined)
    @scala.inline
    def setFilterDate(value: /* day */ Date => Boolean): Self = this.set("filterDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilterDate: Self = this.set("filterDate", js.undefined)
    @scala.inline
    def setFormatDisplayValue(value: (/* date */ Date | js.Array[Date], /* formatString */ String) => String): Self = this.set("formatDisplayValue", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatDisplayValue: Self = this.set("formatDisplayValue", js.undefined)
    @scala.inline
    def setFormatString(value: String): Self = this.set("formatString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatString: Self = this.set("formatString", js.undefined)
    @scala.inline
    def setHighlightedDate(value: Date): Self = this.set("highlightedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightedDate: Self = this.set("highlightedDate", js.undefined)
    @scala.inline
    def setIncludeDatesVarargs(value: Date*): Self = this.set("includeDates", js.Array(value :_*))
    @scala.inline
    def setIncludeDates(value: js.Array[Date]): Self = this.set("includeDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDates: Self = this.set("includeDates", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaskNull: Self = this.set("mask", null)
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setMonthsShown(value: Double): Self = this.set("monthsShown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthsShown: Self = this.set("monthsShown", js.undefined)
    @scala.inline
    def setMountNode(value: HTMLElement): Self = this.set("mountNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountNode: Self = this.set("mountNode", js.undefined)
    @scala.inline
    def setOnChange(value: /* args */ typings.baseui.anon.Date => js.Any): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClose(value: () => _): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnDayClick(value: /* args */ DateEvent => _): Self = this.set("onDayClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDayClick: Self = this.set("onDayClick", js.undefined)
    @scala.inline
    def setOnDayMouseLeave(value: /* args */ DateEvent => _): Self = this.set("onDayMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDayMouseLeave: Self = this.set("onDayMouseLeave", js.undefined)
    @scala.inline
    def setOnDayMouseOver(value: /* args */ DateEvent => _): Self = this.set("onDayMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDayMouseOver: Self = this.set("onDayMouseOver", js.undefined)
    @scala.inline
    def setOnMonthChange(value: /* args */ DateDate => _): Self = this.set("onMonthChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMonthChange: Self = this.set("onMonthChange", js.undefined)
    @scala.inline
    def setOnYearChange(value: /* args */ DateDate => _): Self = this.set("onYearChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnYearChange: Self = this.set("onYearChange", js.undefined)
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setOverrides(value: DatepickerOverrides[SharedStylePropsT]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setPeekNextMonth(value: Boolean): Self = this.set("peekNextMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeekNextMonth: Self = this.set("peekNextMonth", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPositive(value: Boolean): Self = this.set("positive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositive: Self = this.set("positive", js.undefined)
    @scala.inline
    def setQuickSelect(value: Boolean): Self = this.set("quickSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuickSelect: Self = this.set("quickSelect", js.undefined)
    @scala.inline
    def setQuickSelectOptionsVarargs(value: BeginDate*): Self = this.set("quickSelectOptions", js.Array(value :_*))
    @scala.inline
    def setQuickSelectOptions(value: js.Array[BeginDate]): Self = this.set("quickSelectOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuickSelectOptions: Self = this.set("quickSelectOptions", js.undefined)
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setSize(value: mini | default_ | compact | large_): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTimeSelectEnd(value: Boolean): Self = this.set("timeSelectEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSelectEnd: Self = this.set("timeSelectEnd", js.undefined)
    @scala.inline
    def setTimeSelectStart(value: Boolean): Self = this.set("timeSelectStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSelectStart: Self = this.set("timeSelectStart", js.undefined)
    @scala.inline
    def setTrapTabbing(value: Boolean): Self = this.set("trapTabbing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrapTabbing: Self = this.set("trapTabbing", js.undefined)
    @scala.inline
    def setValueVarargs(value: Date*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: Date | js.Array[Date]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

