package typings.baseui.anon

import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.mouseLeave
import typings.baseui.baseuiStrings.mouseOver
import typings.baseui.baseuiStrings.moveDown
import typings.baseui.baseuiStrings.moveLeft
import typings.baseui.baseuiStrings.moveRight
import typings.baseui.baseuiStrings.moveUp
import typings.baseui.baseuiStrings.vertical
import typings.baseui.datepickerMod.CalendarProps
import typings.baseui.datepickerMod.ContainerState
import typings.baseui.datepickerMod.DatepickerOverrides
import typings.baseui.datepickerMod.SharedStylePropsT
import typings.baseui.datepickerMod.StateReducer
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/datepicker.StatefulDatepickerProps<baseui.baseui/datepicker.CalendarProps> */
trait StatefulDatepickerPropsCa extends StObject {
  
  var autoFocusCalendar: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[js.Function1[/* args */ CalendarProps, ReactNode]] = js.undefined
  
  var excludeDates: js.UndefOr[js.Array[typings.std.Date]] = js.undefined
  
  var filterDate: js.UndefOr[js.Function1[/* day */ typings.std.Date, Boolean]] = js.undefined
  
  var highlightedDate: js.UndefOr[typings.std.Date] = js.undefined
  
  var includeDates: js.UndefOr[js.Array[typings.std.Date]] = js.undefined
  
  var initialState: js.UndefOr[ContainerState] = js.undefined
  
  // see https://github.com/date-fns/date-fns/blob/master/src/locale/index.js.flow
  var locale: js.UndefOr[js.Any] = js.undefined
  
  var maxDate: js.UndefOr[typings.std.Date] = js.undefined
  
  var minDate: js.UndefOr[typings.std.Date] = js.undefined
  
  var monthsShown: js.UndefOr[Double] = js.undefined
  
  var onChange: js.UndefOr[typings.baseui.datepickerMod.onChange] = js.undefined
  
  var onDayClick: js.UndefOr[js.Function1[/* args */ DateEvent, js.Any]] = js.undefined
  
  var onDayMouseLeave: js.UndefOr[js.Function1[/* args */ DateEvent, js.Any]] = js.undefined
  
  var onDayMouseOver: js.UndefOr[js.Function1[/* args */ DateEvent, js.Any]] = js.undefined
  
  var onMonthChange: js.UndefOr[js.Function1[/* args */ DateDate, js.Any]] = js.undefined
  
  var onYearChange: js.UndefOr[js.Function1[/* args */ DateDate, js.Any]] = js.undefined
  
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  var overrides: js.UndefOr[DatepickerOverrides[SharedStylePropsT]] = js.undefined
  
  var peekNextMonth: js.UndefOr[Boolean] = js.undefined
  
  var quickSelect: js.UndefOr[Boolean] = js.undefined
  
  var quickSelectOptions: js.UndefOr[js.Array[BeginDate]] = js.undefined
  
  var range: js.UndefOr[Boolean] = js.undefined
  
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
  
  var timeSelectEnd: js.UndefOr[Boolean] = js.undefined
  
  var timeSelectStart: js.UndefOr[Boolean] = js.undefined
  
  var trapTabbing: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[typings.std.Date | js.Array[typings.std.Date] | Null] = js.undefined
}
object StatefulDatepickerPropsCa {
  
  @scala.inline
  def apply(): StatefulDatepickerPropsCa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulDatepickerPropsCa]
  }
  
  @scala.inline
  implicit class StatefulDatepickerPropsCaMutableBuilder[Self <: StatefulDatepickerPropsCa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocusCalendar(value: Boolean): Self = StObject.set(x, "autoFocusCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusCalendarUndefined: Self = StObject.set(x, "autoFocusCalendar", js.undefined)
    
    @scala.inline
    def setChildren(value: /* args */ CalendarProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setExcludeDates(value: js.Array[typings.std.Date]): Self = StObject.set(x, "excludeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeDatesUndefined: Self = StObject.set(x, "excludeDates", js.undefined)
    
    @scala.inline
    def setExcludeDatesVarargs(value: typings.std.Date*): Self = StObject.set(x, "excludeDates", js.Array(value :_*))
    
    @scala.inline
    def setFilterDate(value: /* day */ typings.std.Date => Boolean): Self = StObject.set(x, "filterDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
    
    @scala.inline
    def setHighlightedDate(value: typings.std.Date): Self = StObject.set(x, "highlightedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedDateUndefined: Self = StObject.set(x, "highlightedDate", js.undefined)
    
    @scala.inline
    def setIncludeDates(value: js.Array[typings.std.Date]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    @scala.inline
    def setIncludeDatesVarargs(value: typings.std.Date*): Self = StObject.set(x, "includeDates", js.Array(value :_*))
    
    @scala.inline
    def setInitialState(value: ContainerState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: typings.std.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: typings.std.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setMonthsShown(value: Double): Self = StObject.set(x, "monthsShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsShownUndefined: Self = StObject.set(x, "monthsShown", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* args */ Date => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnDayClick(value: /* args */ DateEvent => js.Any): Self = StObject.set(x, "onDayClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
    
    @scala.inline
    def setOnDayMouseLeave(value: /* args */ DateEvent => js.Any): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDayMouseLeaveUndefined: Self = StObject.set(x, "onDayMouseLeave", js.undefined)
    
    @scala.inline
    def setOnDayMouseOver(value: /* args */ DateEvent => js.Any): Self = StObject.set(x, "onDayMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDayMouseOverUndefined: Self = StObject.set(x, "onDayMouseOver", js.undefined)
    
    @scala.inline
    def setOnMonthChange(value: /* args */ DateDate => js.Any): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    @scala.inline
    def setOnYearChange(value: /* args */ DateDate => js.Any): Self = StObject.set(x, "onYearChange", js.Any.fromFunction1(value))
    
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
    def setStateReducer(
      value: (/* stateType */ mouseLeave | moveRight | moveDown | moveUp | mouseOver | change_ | moveLeft, /* nextState */ ContainerState, /* currentState */ ContainerState) => ContainerState
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    
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
    def setValue(value: typings.std.Date | js.Array[typings.std.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: typings.std.Date*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
