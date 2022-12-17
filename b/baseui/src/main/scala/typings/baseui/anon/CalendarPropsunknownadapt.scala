package typings.baseui.anon

import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import typings.baseui.datepickerTypesMod.DatepickerOverrides
import typings.baseui.datepickerTypesMod.InputRole
import typings.baseui.datepickerTypesMod.QuickSelectOption
import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/datepicker/types.CalendarProps<unknown> & {  adapter :baseui.baseui/datepicker/utils/types.DateIOAdapter<std.Date>} */
trait CalendarPropsunknownadapt extends StObject {
  
  var adapter: js.UndefOr[DateIOAdapter[Any]] = js.undefined
  
  /** Defines if the calendar is set to be focused on an initial render. */
  var autoFocusCalendar: js.UndefOr[Boolean] = js.undefined
  
  /** A function that is called with the current date to render the label text under that day on the calendar. */
  var dateLabel: js.UndefOr[(js.Function1[/* day */ Any, ReactNode]) | Null] = js.undefined
  
  /** Determines the density of the calendar */
  var density: js.UndefOr[typings.baseui.datepickerTypesMod.Density] = js.undefined
  
  /** A list of dates to disable. */
  var excludeDates: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  /** A filter function that is called to check the disabled state of a day. If `false` is returned the day is considered to be disabled. */
  var filterDate: js.UndefOr[(js.Function1[/* day */ Any, Boolean]) | Null] = js.undefined
  
  var fixedHeight: js.UndefOr[Boolean] = js.undefined
  
  /** Determines whether startDate and endDate should be updated independently of eachother */
  var hasLockedBehavior: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates a highlighted date on hover and keyboard navigation */
  var highlightedDate: js.UndefOr[Any | Null] = js.undefined
  
  /** A list of selectable dates. */
  var includeDates: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  /** A locale object. See `date-fns` for more details https://github.com/date-fns/date-fns/tree/master/src/locale. */
  var locale: js.UndefOr[typings.baseui.datepickerTypesMod.Locale | Null] = js.undefined
  
  /** A max date that is selectable. */
  var maxDate: js.UndefOr[Any | Null] = js.undefined
  
  /** A min date that is selectable. */
  var minDate: js.UndefOr[Any | Null] = js.undefined
  
  /** A number of months rendered in the calendar. */
  var monthsShown: js.UndefOr[Double] = js.undefined
  
  /** Event handler that is called when a new date is selected. */
  var onChange: js.UndefOr[js.Function1[/* a */ `1`, Any]] = js.undefined
  
  /** Day's `click` event handler. */
  var onDayClick: js.UndefOr[js.Function1[/* a */ Date, Any]] = js.undefined
  
  /** Day's `focus` event handler. */
  var onDayFocus: js.UndefOr[js.Function1[/* a */ Date, Any]] = js.undefined
  
  /** Day's `mouseleave` event handler. */
  var onDayMouseLeave: js.UndefOr[js.Function1[/* a */ Date, Any]] = js.undefined
  
  /** Day's `mouseover` event handler. */
  var onDayMouseOver: js.UndefOr[js.Function1[/* a */ Date, Any]] = js.undefined
  
  /** Event handler that is called when the current rendered month is changed. */
  var onMonthChange: js.UndefOr[js.Function1[/* a */ DateUnknown, Any]] = js.undefined
  
  /** Event handler that is called when a selection is made using the quick select menu. */
  var onQuickSelectChange: js.UndefOr[js.Function1[/* option */ js.UndefOr[QuickSelectOption[Any]], Any]] = js.undefined
  
  /** Event handler that is called when the current rendered month's year is changed. */
  var onYearChange: js.UndefOr[js.Function1[/* a */ DateUnknown, Any]] = js.undefined
  
  /** Sets the orientation of the calendar when multiple months are displayed */
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  var overrides: js.UndefOr[DatepickerOverrides] = js.undefined
  
  /** Defines if dates outside of the range of the current month are displayed. */
  var peekNextMonth: js.UndefOr[Boolean] = js.undefined
  
  /** Display select for quickly choosing date ranges. `range` must be true as well. */
  var quickSelect: js.UndefOr[Boolean] = js.undefined
  
  /** Array of custom options displayed in the quick select. Overrides default options if provided. */
  var quickSelectOptions: js.UndefOr[js.Array[QuickSelectOption[Any]]] = js.undefined
  
  /** Defines if a range of dates can be selected. */
  var range: js.UndefOr[Boolean] = js.undefined
  
  /** Determines whether user clicked startDate or endDate input to trigger calendar open */
  var selectedInput: js.UndefOr[InputRole] = js.undefined
  
  /** Determines if `TimePicker` component will be enabled for end time */
  var timeSelectEnd: js.UndefOr[Boolean] = js.undefined
  
  /** Determines if `TimePicker` component will be enabled for start time */
  var timeSelectStart: js.UndefOr[Boolean] = js.undefined
  
  /** Defines if tabbing inside the calendar is circled within it. */
  var trapTabbing: js.UndefOr[Boolean] = js.undefined
  
  /** Currently selected date. */
  var value: js.UndefOr[Any | Null | (js.Array[js.UndefOr[Any | Null]])] = js.undefined
}
object CalendarPropsunknownadapt {
  
  inline def apply(): CalendarPropsunknownadapt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarPropsunknownadapt]
  }
  
  extension [Self <: CalendarPropsunknownadapt](x: Self) {
    
    inline def setAdapter(value: DateIOAdapter[Any]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    inline def setAutoFocusCalendar(value: Boolean): Self = StObject.set(x, "autoFocusCalendar", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusCalendarUndefined: Self = StObject.set(x, "autoFocusCalendar", js.undefined)
    
    inline def setDateLabel(value: /* day */ Any => ReactNode): Self = StObject.set(x, "dateLabel", js.Any.fromFunction1(value))
    
    inline def setDateLabelNull: Self = StObject.set(x, "dateLabel", null)
    
    inline def setDateLabelUndefined: Self = StObject.set(x, "dateLabel", js.undefined)
    
    inline def setDensity(value: typings.baseui.datepickerTypesMod.Density): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setExcludeDates(value: js.Array[Any]): Self = StObject.set(x, "excludeDates", value.asInstanceOf[js.Any])
    
    inline def setExcludeDatesNull: Self = StObject.set(x, "excludeDates", null)
    
    inline def setExcludeDatesUndefined: Self = StObject.set(x, "excludeDates", js.undefined)
    
    inline def setExcludeDatesVarargs(value: Any*): Self = StObject.set(x, "excludeDates", js.Array(value*))
    
    inline def setFilterDate(value: /* day */ Any => Boolean): Self = StObject.set(x, "filterDate", js.Any.fromFunction1(value))
    
    inline def setFilterDateNull: Self = StObject.set(x, "filterDate", null)
    
    inline def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
    
    inline def setFixedHeight(value: Boolean): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
    
    inline def setFixedHeightUndefined: Self = StObject.set(x, "fixedHeight", js.undefined)
    
    inline def setHasLockedBehavior(value: Boolean): Self = StObject.set(x, "hasLockedBehavior", value.asInstanceOf[js.Any])
    
    inline def setHasLockedBehaviorUndefined: Self = StObject.set(x, "hasLockedBehavior", js.undefined)
    
    inline def setHighlightedDate(value: Any): Self = StObject.set(x, "highlightedDate", value.asInstanceOf[js.Any])
    
    inline def setHighlightedDateNull: Self = StObject.set(x, "highlightedDate", null)
    
    inline def setHighlightedDateUndefined: Self = StObject.set(x, "highlightedDate", js.undefined)
    
    inline def setIncludeDates(value: js.Array[Any]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDatesNull: Self = StObject.set(x, "includeDates", null)
    
    inline def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    inline def setIncludeDatesVarargs(value: Any*): Self = StObject.set(x, "includeDates", js.Array(value*))
    
    inline def setLocale(value: typings.baseui.datepickerTypesMod.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxDate(value: Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateNull: Self = StObject.set(x, "maxDate", null)
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateNull: Self = StObject.set(x, "minDate", null)
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setMonthsShown(value: Double): Self = StObject.set(x, "monthsShown", value.asInstanceOf[js.Any])
    
    inline def setMonthsShownUndefined: Self = StObject.set(x, "monthsShown", js.undefined)
    
    inline def setOnChange(value: /* a */ `1` => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnDayClick(value: /* a */ Date => Any): Self = StObject.set(x, "onDayClick", js.Any.fromFunction1(value))
    
    inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
    
    inline def setOnDayFocus(value: /* a */ Date => Any): Self = StObject.set(x, "onDayFocus", js.Any.fromFunction1(value))
    
    inline def setOnDayFocusUndefined: Self = StObject.set(x, "onDayFocus", js.undefined)
    
    inline def setOnDayMouseLeave(value: /* a */ Date => Any): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnDayMouseLeaveUndefined: Self = StObject.set(x, "onDayMouseLeave", js.undefined)
    
    inline def setOnDayMouseOver(value: /* a */ Date => Any): Self = StObject.set(x, "onDayMouseOver", js.Any.fromFunction1(value))
    
    inline def setOnDayMouseOverUndefined: Self = StObject.set(x, "onDayMouseOver", js.undefined)
    
    inline def setOnMonthChange(value: /* a */ DateUnknown => Any): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
    
    inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    inline def setOnQuickSelectChange(value: /* option */ js.UndefOr[QuickSelectOption[Any]] => Any): Self = StObject.set(x, "onQuickSelectChange", js.Any.fromFunction1(value))
    
    inline def setOnQuickSelectChangeUndefined: Self = StObject.set(x, "onQuickSelectChange", js.undefined)
    
    inline def setOnYearChange(value: /* a */ DateUnknown => Any): Self = StObject.set(x, "onYearChange", js.Any.fromFunction1(value))
    
    inline def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOverrides(value: DatepickerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPeekNextMonth(value: Boolean): Self = StObject.set(x, "peekNextMonth", value.asInstanceOf[js.Any])
    
    inline def setPeekNextMonthUndefined: Self = StObject.set(x, "peekNextMonth", js.undefined)
    
    inline def setQuickSelect(value: Boolean): Self = StObject.set(x, "quickSelect", value.asInstanceOf[js.Any])
    
    inline def setQuickSelectOptions(value: js.Array[QuickSelectOption[Any]]): Self = StObject.set(x, "quickSelectOptions", value.asInstanceOf[js.Any])
    
    inline def setQuickSelectOptionsUndefined: Self = StObject.set(x, "quickSelectOptions", js.undefined)
    
    inline def setQuickSelectOptionsVarargs(value: QuickSelectOption[Any]*): Self = StObject.set(x, "quickSelectOptions", js.Array(value*))
    
    inline def setQuickSelectUndefined: Self = StObject.set(x, "quickSelect", js.undefined)
    
    inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSelectedInput(value: InputRole): Self = StObject.set(x, "selectedInput", value.asInstanceOf[js.Any])
    
    inline def setSelectedInputNull: Self = StObject.set(x, "selectedInput", null)
    
    inline def setSelectedInputUndefined: Self = StObject.set(x, "selectedInput", js.undefined)
    
    inline def setTimeSelectEnd(value: Boolean): Self = StObject.set(x, "timeSelectEnd", value.asInstanceOf[js.Any])
    
    inline def setTimeSelectEndUndefined: Self = StObject.set(x, "timeSelectEnd", js.undefined)
    
    inline def setTimeSelectStart(value: Boolean): Self = StObject.set(x, "timeSelectStart", value.asInstanceOf[js.Any])
    
    inline def setTimeSelectStartUndefined: Self = StObject.set(x, "timeSelectStart", js.undefined)
    
    inline def setTrapTabbing(value: Boolean): Self = StObject.set(x, "trapTabbing", value.asInstanceOf[js.Any])
    
    inline def setTrapTabbingUndefined: Self = StObject.set(x, "trapTabbing", js.undefined)
    
    inline def setValue(value: Any | (js.Array[js.UndefOr[Any | Null]])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (js.UndefOr[Any | Null])*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
