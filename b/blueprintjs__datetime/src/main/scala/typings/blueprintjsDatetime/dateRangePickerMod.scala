package typings.blueprintjsDatetime

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.datePickerCoreMod.DatePickerBaseProps
import typings.blueprintjsDatetime.dateRangeMod.DateRange
import typings.blueprintjsDatetime.monthAndYearMod.MonthAndYear
import typings.blueprintjsDatetime.shortcutsMod.DateRangeShortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateRangePickerMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/dateRangePicker", "DateRangePicker")
  @js.native
  open class DateRangePicker protected ()
    extends AbstractPureComponent2[DateRangePickerProps, IDateRangePickerState, js.Object] {
    def this(props: DateRangePickerProps) = this()
    def this(props: DateRangePickerProps, context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDateRangePicker(prevProps: DateRangePickerProps, prevState: IDateRangePickerState): Unit = js.native
    
    /* private */ var disabledDays: Any = js.native
    
    /* private */ var getDateRangePickerModifiers: Any = js.native
    
    /* private */ var getDisabledDaysModifier: Any = js.native
    
    /* private */ var handleDayClick: Any = js.native
    
    /* private */ var handleDayMouseEnter: Any = js.native
    
    /* private */ var handleDayMouseLeave: Any = js.native
    
    /* private */ var handleLeftMonthChange: Any = js.native
    
    /* private */ var handleLeftMonthSelectChange: Any = js.native
    
    /* private */ var handleLeftYearSelectChange: Any = js.native
    
    /* private */ var handleNextState: Any = js.native
    
    /* private */ var handleRightMonthChange: Any = js.native
    
    /* private */ var handleRightMonthSelectChange: Any = js.native
    
    /* private */ var handleRightYearSelectChange: Any = js.native
    
    /* private */ var handleShortcutClick: Any = js.native
    
    /* private */ var handleTimeChange: Any = js.native
    
    /* private */ var handleTimeChangeLeftCalendar: Any = js.native
    
    /* private */ var handleTimeChangeRightCalendar: Any = js.native
    
    /* private */ var maybeRenderShortcuts: Any = js.native
    
    /* private */ var maybeRenderTimePickers: Any = js.native
    
    /* private */ var modifiers: Any = js.native
    
    /* private */ var renderCalendars: Any = js.native
    
    /* private */ var renderDay: Any = js.native
    
    /* private */ var renderLeftCaption: Any = js.native
    
    /* private */ var renderLeftNavbar: Any = js.native
    
    /* private */ var renderRightCaption: Any = js.native
    
    /* private */ var renderRightNavbar: Any = js.native
    
    /* private */ var renderSingleCaption: Any = js.native
    
    /* private */ var renderSingleNavbar: Any = js.native
    
    /* private */ var setViews: Any = js.native
    
    /* private */ var shouldHighlightCurrentDay: Any = js.native
    
    /* private */ var updateLeftView: Any = js.native
    
    /* private */ var updateRightView: Any = js.native
  }
  /* static members */
  object DateRangePicker {
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangePicker", "DateRangePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangePicker", "DateRangePicker.defaultProps")
    @js.native
    def defaultProps: DateRangePickerProps = js.native
    inline def defaultProps_=(x: DateRangePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangePicker", "DateRangePicker.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type DateRangePickerProps = IDateRangePickerProps
  
  trait IDateRangePickerProps
    extends StObject
       with DatePickerBaseProps
       with IProps {
    
    /**
      * Whether the start and end dates of the range can be the same day.
      * If `true`, clicking a selected date will create a one-day range.
      * If `false`, clicking a selected date will clear the selection.
      *
      * @default false
      */
    var allowSingleDayRange: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The date-range boundary that the next click should modify.
      * This will be honored unless the next click would overlap the other boundary date.
      * In that case, the two boundary dates will be auto-swapped to keep them in chronological order.
      * If `undefined`, the picker will revert to its default selection behavior.
      */
    var boundaryToModify: js.UndefOr[Boundary] = js.undefined
    
    /**
      * Whether displayed months in the calendar are contiguous.
      * If false, each side of the calendar can move independently to non-contiguous months.
      *
      * @default true
      */
    var contiguousCalendarMonths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Initial `DateRange` the calendar will display as selected.
      * This should not be set if `value` is set.
      */
    var defaultValue: js.UndefOr[DateRange] = js.undefined
    
    /**
      * Called when the user selects a day.
      * If no days are selected, it will pass `[null, null]`.
      * If a start date is selected but not an end date, it will pass `[selectedDate, null]`.
      * If both a start and end date are selected, it will pass `[startDate, endDate]`.
      */
    var onChange: js.UndefOr[js.Function1[/* selectedDates */ DateRange, Unit]] = js.undefined
    
    /**
      * Called when the user changes the hovered date range, either from mouseenter or mouseleave.
      * When triggered from mouseenter, it will pass the date range that would result from next click.
      * When triggered from mouseleave, it will pass `undefined`.
      */
    var onHoverChange: js.UndefOr[
        js.Function3[
          /* hoveredDates */ DateRange, 
          /* hoveredDay */ js.Date, 
          /* hoveredBoundary */ Boundary, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Called when the `shortcuts` props is enabled and the user changes the shortcut.
      */
    var onShortcutChange: js.UndefOr[js.Function2[/* shortcut */ DateRangeShortcut, /* index */ Double, Unit]] = js.undefined
    
    /**
      * The currently selected shortcut.
      * If this prop is provided, the component acts in a controlled manner.
      */
    var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether shortcuts to quickly select a range of dates are displayed or not.
      * If `true`, preset shortcuts will be displayed.
      * If `false`, no shortcuts will be displayed.
      * If an array is provided, the custom shortcuts will be displayed.
      *
      * @default true
      */
    var shortcuts: js.UndefOr[Boolean | js.Array[DateRangeShortcut]] = js.undefined
    
    /**
      * Whether to show only a single month calendar.
      *
      * @default false
      */
    var singleMonthOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The currently selected `DateRange`.
      * If this prop is provided, the component acts in a controlled manner.
      */
    var value: js.UndefOr[DateRange] = js.undefined
  }
  object IDateRangePickerProps {
    
    inline def apply(): IDateRangePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDateRangePickerProps]
    }
    
    extension [Self <: IDateRangePickerProps](x: Self) {
      
      inline def setAllowSingleDayRange(value: Boolean): Self = StObject.set(x, "allowSingleDayRange", value.asInstanceOf[js.Any])
      
      inline def setAllowSingleDayRangeUndefined: Self = StObject.set(x, "allowSingleDayRange", js.undefined)
      
      inline def setBoundaryToModify(value: Boundary): Self = StObject.set(x, "boundaryToModify", value.asInstanceOf[js.Any])
      
      inline def setBoundaryToModifyUndefined: Self = StObject.set(x, "boundaryToModify", js.undefined)
      
      inline def setContiguousCalendarMonths(value: Boolean): Self = StObject.set(x, "contiguousCalendarMonths", value.asInstanceOf[js.Any])
      
      inline def setContiguousCalendarMonthsUndefined: Self = StObject.set(x, "contiguousCalendarMonths", js.undefined)
      
      inline def setDefaultValue(value: DateRange): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnChange(value: /* selectedDates */ DateRange => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnHoverChange(
        value: (/* hoveredDates */ DateRange, /* hoveredDay */ js.Date, /* hoveredBoundary */ Boundary) => Unit
      ): Self = StObject.set(x, "onHoverChange", js.Any.fromFunction3(value))
      
      inline def setOnHoverChangeUndefined: Self = StObject.set(x, "onHoverChange", js.undefined)
      
      inline def setOnShortcutChange(value: (/* shortcut */ DateRangeShortcut, /* index */ Double) => Unit): Self = StObject.set(x, "onShortcutChange", js.Any.fromFunction2(value))
      
      inline def setOnShortcutChangeUndefined: Self = StObject.set(x, "onShortcutChange", js.undefined)
      
      inline def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      inline def setShortcuts(value: Boolean | js.Array[DateRangeShortcut]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      inline def setShortcutsVarargs(value: DateRangeShortcut*): Self = StObject.set(x, "shortcuts", js.Array(value*))
      
      inline def setSingleMonthOnly(value: Boolean): Self = StObject.set(x, "singleMonthOnly", value.asInstanceOf[js.Any])
      
      inline def setSingleMonthOnlyUndefined: Self = StObject.set(x, "singleMonthOnly", js.undefined)
      
      inline def setValue(value: DateRange): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IDateRangePickerState extends StObject {
    
    var hoverValue: js.UndefOr[DateRange] = js.undefined
    
    var leftView: js.UndefOr[MonthAndYear] = js.undefined
    
    var rightView: js.UndefOr[MonthAndYear] = js.undefined
    
    var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
    
    var time: js.UndefOr[DateRange] = js.undefined
    
    var value: js.UndefOr[DateRange] = js.undefined
  }
  object IDateRangePickerState {
    
    inline def apply(): IDateRangePickerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDateRangePickerState]
    }
    
    extension [Self <: IDateRangePickerState](x: Self) {
      
      inline def setHoverValue(value: DateRange): Self = StObject.set(x, "hoverValue", value.asInstanceOf[js.Any])
      
      inline def setHoverValueUndefined: Self = StObject.set(x, "hoverValue", js.undefined)
      
      inline def setLeftView(value: MonthAndYear): Self = StObject.set(x, "leftView", value.asInstanceOf[js.Any])
      
      inline def setLeftViewUndefined: Self = StObject.set(x, "leftView", js.undefined)
      
      inline def setRightView(value: MonthAndYear): Self = StObject.set(x, "rightView", value.asInstanceOf[js.Any])
      
      inline def setRightViewUndefined: Self = StObject.set(x, "rightView", js.undefined)
      
      inline def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      inline def setTime(value: DateRange): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setValue(value: DateRange): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
