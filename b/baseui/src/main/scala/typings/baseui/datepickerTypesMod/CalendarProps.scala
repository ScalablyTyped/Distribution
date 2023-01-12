package typings.baseui.datepickerTypesMod

import typings.baseui.anon.DateT
import typings.baseui.anon.DateTEventEvent
import typings.baseui.anon.`2`
import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import typings.baseui.datepickerStatefulContainerMod.InputProps
import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarProps[T]
  extends StObject
     with InputProps[T] {
  
  var adapter: js.UndefOr[DateIOAdapter[T]] = js.undefined
  
  /** Defines if the calendar is set to be focused on an initial render. */
  var autoFocusCalendar: js.UndefOr[Boolean] = js.undefined
  
  /** A function that is called with the current date to render the label text under that day on the calendar. */
  var dateLabel: js.UndefOr[(js.Function1[/* day */ T, ReactNode]) | Null] = js.undefined
  
  /** Determines the density of the calendar */
  var density: js.UndefOr[Density] = js.undefined
  
  /** A list of dates to disable. */
  var excludeDates: js.UndefOr[js.Array[T] | Null] = js.undefined
  
  /** A filter function that is called to check the disabled state of a day. If `false` is returned the day is considered to be disabled. */
  var filterDate: js.UndefOr[(js.Function1[/* day */ T, Boolean]) | Null] = js.undefined
  
  var fixedHeight: js.UndefOr[Boolean] = js.undefined
  
  /** Determines whether startDate and endDate should be updated independently of eachother */
  var hasLockedBehavior: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates a highlighted date on hover and keyboard navigation */
  var highlightedDate: js.UndefOr[T | Null] = js.undefined
  
  /** A list of selectable dates. */
  var includeDates: js.UndefOr[js.Array[T] | Null] = js.undefined
  
  /** A locale object. See `date-fns` for more details https://github.com/date-fns/date-fns/tree/master/src/locale. */
  var locale: js.UndefOr[Locale | Null] = js.undefined
  
  /** A max date that is selectable. */
  var maxDate: js.UndefOr[T | Null] = js.undefined
  
  /** A min date that is selectable. */
  var minDate: js.UndefOr[T | Null] = js.undefined
  
  /** A number of months rendered in the calendar. */
  var monthsShown: js.UndefOr[Double] = js.undefined
  
  /** Event handler that is called when a new date is selected. */
  var onChange: js.UndefOr[js.Function1[/* a */ `2`[T], Any]] = js.undefined
  
  /** Day's `click` event handler. */
  var onDayClick: js.UndefOr[js.Function1[/* a */ DateTEventEvent[T], Any]] = js.undefined
  
  /** Day's `focus` event handler. */
  var onDayFocus: js.UndefOr[js.Function1[/* a */ DateTEventEvent[T], Any]] = js.undefined
  
  /** Day's `mouseleave` event handler. */
  var onDayMouseLeave: js.UndefOr[js.Function1[/* a */ DateTEventEvent[T], Any]] = js.undefined
  
  /** Day's `mouseover` event handler. */
  var onDayMouseOver: js.UndefOr[js.Function1[/* a */ DateTEventEvent[T], Any]] = js.undefined
  
  /** Event handler that is called when the current rendered month is changed. */
  var onMonthChange: js.UndefOr[js.Function1[/* a */ DateT[T], Any]] = js.undefined
  
  /** Event handler that is called when a selection is made using the quick select menu. */
  var onQuickSelectChange: js.UndefOr[js.Function1[/* option */ js.UndefOr[QuickSelectOption[T]], Any]] = js.undefined
  
  /** Event handler that is called when the current rendered month's year is changed. */
  var onYearChange: js.UndefOr[js.Function1[/* a */ DateT[T], Any]] = js.undefined
  
  /** Sets the orientation of the calendar when multiple months are displayed */
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  var overrides: js.UndefOr[DatepickerOverrides] = js.undefined
  
  /** Defines if dates outside of the range of the current month are displayed. */
  var peekNextMonth: js.UndefOr[Boolean] = js.undefined
  
  /** Display select for quickly choosing date ranges. `range` must be true as well. */
  var quickSelect: js.UndefOr[Boolean] = js.undefined
  
  /** Array of custom options displayed in the quick select. Overrides default options if provided. */
  var quickSelectOptions: js.UndefOr[js.Array[QuickSelectOption[T]]] = js.undefined
  
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
  var value: js.UndefOr[T | Null | (js.Array[js.UndefOr[T | Null]])] = js.undefined
}
object CalendarProps {
  
  inline def apply[T](): CalendarProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarProps[?], T] (val x: Self & CalendarProps[T]) extends AnyVal {
    
    inline def setAdapter(value: DateIOAdapter[T]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    inline def setAutoFocusCalendar(value: Boolean): Self = StObject.set(x, "autoFocusCalendar", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusCalendarUndefined: Self = StObject.set(x, "autoFocusCalendar", js.undefined)
    
    inline def setDateLabel(value: /* day */ T => ReactNode): Self = StObject.set(x, "dateLabel", js.Any.fromFunction1(value))
    
    inline def setDateLabelNull: Self = StObject.set(x, "dateLabel", null)
    
    inline def setDateLabelUndefined: Self = StObject.set(x, "dateLabel", js.undefined)
    
    inline def setDensity(value: Density): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setExcludeDates(value: js.Array[T]): Self = StObject.set(x, "excludeDates", value.asInstanceOf[js.Any])
    
    inline def setExcludeDatesNull: Self = StObject.set(x, "excludeDates", null)
    
    inline def setExcludeDatesUndefined: Self = StObject.set(x, "excludeDates", js.undefined)
    
    inline def setExcludeDatesVarargs(value: T*): Self = StObject.set(x, "excludeDates", js.Array(value*))
    
    inline def setFilterDate(value: /* day */ T => Boolean): Self = StObject.set(x, "filterDate", js.Any.fromFunction1(value))
    
    inline def setFilterDateNull: Self = StObject.set(x, "filterDate", null)
    
    inline def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
    
    inline def setFixedHeight(value: Boolean): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
    
    inline def setFixedHeightUndefined: Self = StObject.set(x, "fixedHeight", js.undefined)
    
    inline def setHasLockedBehavior(value: Boolean): Self = StObject.set(x, "hasLockedBehavior", value.asInstanceOf[js.Any])
    
    inline def setHasLockedBehaviorUndefined: Self = StObject.set(x, "hasLockedBehavior", js.undefined)
    
    inline def setHighlightedDate(value: T): Self = StObject.set(x, "highlightedDate", value.asInstanceOf[js.Any])
    
    inline def setHighlightedDateNull: Self = StObject.set(x, "highlightedDate", null)
    
    inline def setHighlightedDateUndefined: Self = StObject.set(x, "highlightedDate", js.undefined)
    
    inline def setIncludeDates(value: js.Array[T]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDatesNull: Self = StObject.set(x, "includeDates", null)
    
    inline def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    inline def setIncludeDatesVarargs(value: T*): Self = StObject.set(x, "includeDates", js.Array(value*))
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxDate(value: T): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateNull: Self = StObject.set(x, "maxDate", null)
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: T): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateNull: Self = StObject.set(x, "minDate", null)
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setMonthsShown(value: Double): Self = StObject.set(x, "monthsShown", value.asInstanceOf[js.Any])
    
    inline def setMonthsShownUndefined: Self = StObject.set(x, "monthsShown", js.undefined)
    
    inline def setOnChange(value: /* a */ `2`[T] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnDayClick(value: /* a */ DateTEventEvent[T] => Any): Self = StObject.set(x, "onDayClick", js.Any.fromFunction1(value))
    
    inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
    
    inline def setOnDayFocus(value: /* a */ DateTEventEvent[T] => Any): Self = StObject.set(x, "onDayFocus", js.Any.fromFunction1(value))
    
    inline def setOnDayFocusUndefined: Self = StObject.set(x, "onDayFocus", js.undefined)
    
    inline def setOnDayMouseLeave(value: /* a */ DateTEventEvent[T] => Any): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnDayMouseLeaveUndefined: Self = StObject.set(x, "onDayMouseLeave", js.undefined)
    
    inline def setOnDayMouseOver(value: /* a */ DateTEventEvent[T] => Any): Self = StObject.set(x, "onDayMouseOver", js.Any.fromFunction1(value))
    
    inline def setOnDayMouseOverUndefined: Self = StObject.set(x, "onDayMouseOver", js.undefined)
    
    inline def setOnMonthChange(value: /* a */ DateT[T] => Any): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
    
    inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    inline def setOnQuickSelectChange(value: /* option */ js.UndefOr[QuickSelectOption[T]] => Any): Self = StObject.set(x, "onQuickSelectChange", js.Any.fromFunction1(value))
    
    inline def setOnQuickSelectChangeUndefined: Self = StObject.set(x, "onQuickSelectChange", js.undefined)
    
    inline def setOnYearChange(value: /* a */ DateT[T] => Any): Self = StObject.set(x, "onYearChange", js.Any.fromFunction1(value))
    
    inline def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOverrides(value: DatepickerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPeekNextMonth(value: Boolean): Self = StObject.set(x, "peekNextMonth", value.asInstanceOf[js.Any])
    
    inline def setPeekNextMonthUndefined: Self = StObject.set(x, "peekNextMonth", js.undefined)
    
    inline def setQuickSelect(value: Boolean): Self = StObject.set(x, "quickSelect", value.asInstanceOf[js.Any])
    
    inline def setQuickSelectOptions(value: js.Array[QuickSelectOption[T]]): Self = StObject.set(x, "quickSelectOptions", value.asInstanceOf[js.Any])
    
    inline def setQuickSelectOptionsUndefined: Self = StObject.set(x, "quickSelectOptions", js.undefined)
    
    inline def setQuickSelectOptionsVarargs(value: QuickSelectOption[T]*): Self = StObject.set(x, "quickSelectOptions", js.Array(value*))
    
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
    
    inline def setValue(value: T | (js.Array[js.UndefOr[T | Null]])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (js.UndefOr[T | Null])*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
