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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/datepicker.CalendarProps & {  aria-label :string | undefined,   aria-labelledby :string | undefined,   aria-describedby :string | undefined,   disabled :boolean | undefined,   clearable :boolean | undefined,   size :baseui.baseui/input.SIZE[keyof baseui.baseui/input.SIZE] | undefined,   error :boolean | undefined,   positive :boolean | undefined,   placeholder :string | undefined,   required :boolean | undefined,   displayValueAtRangeIndex :number | undefined,   formatDisplayValue :(date : std.Date | std.Array<std.Date>, formatString : string): string | undefined,   formatString :string | undefined,   mask :string | null | undefined,   mountNode :std.HTMLElement | undefined,   onClose :(): any | undefined} */
@js.native
trait DatepickerProps extends StObject {
  
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
  implicit class DatepickerPropsMutableBuilder[Self <: DatepickerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    @scala.inline
    def setAutoFocusCalendar(value: Boolean): Self = StObject.set(x, "autoFocusCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusCalendarUndefined: Self = StObject.set(x, "autoFocusCalendar", js.undefined)
    
    @scala.inline
    def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDisplayValueAtRangeIndex(value: Double): Self = StObject.set(x, "displayValueAtRangeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValueAtRangeIndexUndefined: Self = StObject.set(x, "displayValueAtRangeIndex", js.undefined)
    
    @scala.inline
    def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExcludeDates(value: js.Array[Date]): Self = StObject.set(x, "excludeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeDatesUndefined: Self = StObject.set(x, "excludeDates", js.undefined)
    
    @scala.inline
    def setExcludeDatesVarargs(value: Date*): Self = StObject.set(x, "excludeDates", js.Array(value :_*))
    
    @scala.inline
    def setFilterDate(value: /* day */ Date => Boolean): Self = StObject.set(x, "filterDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
    
    @scala.inline
    def setFormatDisplayValue(value: (/* date */ Date | js.Array[Date], /* formatString */ String) => String): Self = StObject.set(x, "formatDisplayValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatDisplayValueUndefined: Self = StObject.set(x, "formatDisplayValue", js.undefined)
    
    @scala.inline
    def setFormatString(value: String): Self = StObject.set(x, "formatString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatStringUndefined: Self = StObject.set(x, "formatString", js.undefined)
    
    @scala.inline
    def setHighlightedDate(value: Date): Self = StObject.set(x, "highlightedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedDateUndefined: Self = StObject.set(x, "highlightedDate", js.undefined)
    
    @scala.inline
    def setIncludeDates(value: js.Array[Date]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    @scala.inline
    def setIncludeDatesVarargs(value: Date*): Self = StObject.set(x, "includeDates", js.Array(value :_*))
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskNull: Self = StObject.set(x, "mask", null)
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setMonthsShown(value: Double): Self = StObject.set(x, "monthsShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsShownUndefined: Self = StObject.set(x, "monthsShown", js.undefined)
    
    @scala.inline
    def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* args */ typings.baseui.anon.Date => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => _): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnDayClick(value: /* args */ DateEvent => _): Self = StObject.set(x, "onDayClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
    
    @scala.inline
    def setOnDayMouseLeave(value: /* args */ DateEvent => _): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDayMouseLeaveUndefined: Self = StObject.set(x, "onDayMouseLeave", js.undefined)
    
    @scala.inline
    def setOnDayMouseOver(value: /* args */ DateEvent => _): Self = StObject.set(x, "onDayMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDayMouseOverUndefined: Self = StObject.set(x, "onDayMouseOver", js.undefined)
    
    @scala.inline
    def setOnMonthChange(value: /* args */ DateDate => _): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    @scala.inline
    def setOnYearChange(value: /* args */ DateDate => _): Self = StObject.set(x, "onYearChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setOverrides(value: DatepickerOverrides[SharedStylePropsT]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setPeekNextMonth(value: Boolean): Self = StObject.set(x, "peekNextMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeekNextMonthUndefined: Self = StObject.set(x, "peekNextMonth", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
    
    @scala.inline
    def setQuickSelect(value: Boolean): Self = StObject.set(x, "quickSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickSelectOptions(value: js.Array[BeginDate]): Self = StObject.set(x, "quickSelectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickSelectOptionsUndefined: Self = StObject.set(x, "quickSelectOptions", js.undefined)
    
    @scala.inline
    def setQuickSelectOptionsVarargs(value: BeginDate*): Self = StObject.set(x, "quickSelectOptions", js.Array(value :_*))
    
    @scala.inline
    def setQuickSelectUndefined: Self = StObject.set(x, "quickSelect", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTimeSelectEnd(value: Boolean): Self = StObject.set(x, "timeSelectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSelectEndUndefined: Self = StObject.set(x, "timeSelectEnd", js.undefined)
    
    @scala.inline
    def setTimeSelectStart(value: Boolean): Self = StObject.set(x, "timeSelectStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSelectStartUndefined: Self = StObject.set(x, "timeSelectStart", js.undefined)
    
    @scala.inline
    def setTrapTabbing(value: Boolean): Self = StObject.set(x, "trapTabbing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrapTabbingUndefined: Self = StObject.set(x, "trapTabbing", js.undefined)
    
    @scala.inline
    def setValue(value: Date | js.Array[Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Date*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
