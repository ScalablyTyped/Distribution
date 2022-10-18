package typings.baseui

import typings.baseui.anon.EventEvent
import typings.baseui.anon.`4`
import typings.baseui.anon.`5`
import typings.baseui.anon.`6`
import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import typings.baseui.datepickerTypesMod.ContainerState
import typings.baseui.datepickerTypesMod.DatepickerOverrides
import typings.baseui.datepickerTypesMod.Density
import typings.baseui.datepickerTypesMod.InputRole
import typings.baseui.datepickerTypesMod.Locale
import typings.baseui.datepickerTypesMod.QuickSelectOption
import typings.baseui.datepickerTypesMod.StateChangeType
import typings.baseui.datepickerTypesMod.StateReducer
import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datepickerStatefulCalendarMod {
  
  @JSImport("baseui/datepicker/stateful-calendar", JSImport.Default)
  @js.native
  open class default[T] () extends StatefulComponent[T]
  object default {
    
    @JSImport("baseui/datepicker/stateful-calendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/datepicker/stateful-calendar", "default.defaultProps")
    @js.native
    def defaultProps: DatepickerProps[Any] = js.native
    inline def defaultProps_=(x: DatepickerProps[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined baseui.baseui/datepicker/types.StatefulDatepickerProps<baseui.baseui/datepicker/types.CalendarProps<T>, std.Date> & std.Omit<baseui.baseui/datepicker/types.CalendarProps<T>, keyof baseui.baseui/datepicker/types.StatefulDatepickerProps<baseui.baseui/datepicker/types.CalendarProps<T>, std.Date>> */
  trait DatepickerProps[T] extends StObject {
    
    var adapter: js.UndefOr[DateIOAdapter[js.Date]] = js.undefined
    
    var autoFocusCalendar: js.UndefOr[Boolean] = js.undefined
    
    var dateLabel: js.UndefOr[(js.Function1[/* day */ T, ReactNode]) | Null] = js.undefined
    
    var density: js.UndefOr[Density] = js.undefined
    
    var excludeDates: js.UndefOr[js.Array[T] | Null] = js.undefined
    
    var filterDate: js.UndefOr[(js.Function1[/* day */ T, Boolean]) | Null] = js.undefined
    
    var fixedHeight: js.UndefOr[Boolean] = js.undefined
    
    var hasLockedBehavior: js.UndefOr[Boolean] = js.undefined
    
    var highlightedDate: js.UndefOr[T | Null] = js.undefined
    
    var includeDates: js.UndefOr[js.Array[T] | Null] = js.undefined
    
    var initialState: js.UndefOr[ContainerState[js.Date]] = js.undefined
    
    var locale: js.UndefOr[Locale | Null] = js.undefined
    
    var maxDate: js.UndefOr[T | Null] = js.undefined
    
    var minDate: js.UndefOr[T | Null] = js.undefined
    
    var monthsShown: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* a */ `4`, Any]] = js.undefined
    
    var onDayClick: js.UndefOr[js.Function1[/* a */ EventEvent[T], Any]] = js.undefined
    
    var onDayFocus: js.UndefOr[js.Function1[/* a */ EventEvent[T], Any]] = js.undefined
    
    var onDayMouseLeave: js.UndefOr[js.Function1[/* a */ EventEvent[T], Any]] = js.undefined
    
    var onDayMouseOver: js.UndefOr[js.Function1[/* a */ EventEvent[T], Any]] = js.undefined
    
    var onMonthChange: js.UndefOr[js.Function1[/* a */ `6`[T], Any]] = js.undefined
    
    var onQuickSelectChange: js.UndefOr[js.Function1[/* option */ js.UndefOr[QuickSelectOption[T]], Any]] = js.undefined
    
    var onRangeChange: js.UndefOr[js.Function1[/* a */ `5`, Any]] = js.undefined
    
    var onYearChange: js.UndefOr[js.Function1[/* a */ `6`[T], Any]] = js.undefined
    
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var overrides: js.UndefOr[DatepickerOverrides] = js.undefined
    
    var peekNextMonth: js.UndefOr[Boolean] = js.undefined
    
    var quickSelect: js.UndefOr[Boolean] = js.undefined
    
    var quickSelectOptions: js.UndefOr[js.Array[QuickSelectOption[T]]] = js.undefined
    
    var range: js.UndefOr[Boolean] = js.undefined
    
    var selectedInput: js.UndefOr[InputRole] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer[js.Date]] = js.undefined
    
    var timeSelectEnd: js.UndefOr[Boolean] = js.undefined
    
    var timeSelectStart: js.UndefOr[Boolean] = js.undefined
    
    var trapTabbing: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[T | Null | (js.Array[js.UndefOr[T | Null]])] = js.undefined
  }
  object DatepickerProps {
    
    inline def apply[T](): DatepickerProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatepickerProps[T]]
    }
    
    extension [Self <: DatepickerProps[?], T](x: Self & DatepickerProps[T]) {
      
      inline def setAdapter(value: DateIOAdapter[js.Date]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
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
      
      inline def setInitialState(value: ContainerState[js.Date]): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
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
      
      inline def setOnChange(value: /* a */ `4` => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDayClick(value: /* a */ EventEvent[T] => Any): Self = StObject.set(x, "onDayClick", js.Any.fromFunction1(value))
      
      inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
      
      inline def setOnDayFocus(value: /* a */ EventEvent[T] => Any): Self = StObject.set(x, "onDayFocus", js.Any.fromFunction1(value))
      
      inline def setOnDayFocusUndefined: Self = StObject.set(x, "onDayFocus", js.undefined)
      
      inline def setOnDayMouseLeave(value: /* a */ EventEvent[T] => Any): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnDayMouseLeaveUndefined: Self = StObject.set(x, "onDayMouseLeave", js.undefined)
      
      inline def setOnDayMouseOver(value: /* a */ EventEvent[T] => Any): Self = StObject.set(x, "onDayMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnDayMouseOverUndefined: Self = StObject.set(x, "onDayMouseOver", js.undefined)
      
      inline def setOnMonthChange(value: /* a */ `6`[T] => Any): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setOnQuickSelectChange(value: /* option */ js.UndefOr[QuickSelectOption[T]] => Any): Self = StObject.set(x, "onQuickSelectChange", js.Any.fromFunction1(value))
      
      inline def setOnQuickSelectChangeUndefined: Self = StObject.set(x, "onQuickSelectChange", js.undefined)
      
      inline def setOnRangeChange(value: /* a */ `5` => Any): Self = StObject.set(x, "onRangeChange", js.Any.fromFunction1(value))
      
      inline def setOnRangeChangeUndefined: Self = StObject.set(x, "onRangeChange", js.undefined)
      
      inline def setOnYearChange(value: /* a */ `6`[T] => Any): Self = StObject.set(x, "onYearChange", js.Any.fromFunction1(value))
      
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
      
      inline def setStateReducer(
        value: (/* stateType */ StateChangeType, /* nextState */ ContainerState[js.Date], /* currentState */ ContainerState[js.Date]) => ContainerState[js.Date]
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
      
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
  
  @js.native
  trait StatefulComponent[T]
    extends Component[DatepickerProps[T], js.Object, Any]
}
