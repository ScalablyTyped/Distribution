package typings.blueprintjsDatetime

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import typings.blueprintjsDatetime.dateRangeMod.DateRange
import typings.blueprintjsDatetime.monthAndYearMod.MonthAndYear
import typings.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateRangePickerMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/dateRangePicker", "DateRangePicker")
  @js.native
  class DateRangePicker protected ()
    extends AbstractPureComponent2[IDateRangePickerProps, IDateRangePickerState, js.Object] {
    def this(props: IDateRangePickerProps) = this()
    def this(props: IDateRangePickerProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDateRangePicker(prevProps: IDateRangePickerProps, prevState: IDateRangePickerState): Unit = js.native
    
    var disabledDays: js.Any = js.native
    
    var getDateRangePickerModifiers: js.Any = js.native
    
    var getDisabledDaysModifier: js.Any = js.native
    
    var handleDayClick: js.Any = js.native
    
    var handleDayMouseEnter: js.Any = js.native
    
    var handleDayMouseLeave: js.Any = js.native
    
    var handleLeftMonthChange: js.Any = js.native
    
    var handleLeftMonthSelectChange: js.Any = js.native
    
    var handleLeftYearSelectChange: js.Any = js.native
    
    var handleNextState: js.Any = js.native
    
    var handleRightMonthChange: js.Any = js.native
    
    var handleRightMonthSelectChange: js.Any = js.native
    
    var handleRightYearSelectChange: js.Any = js.native
    
    var handleShortcutClick: js.Any = js.native
    
    var handleTimeChange: js.Any = js.native
    
    var handleTimeChangeLeftCalendar: js.Any = js.native
    
    var handleTimeChangeRightCalendar: js.Any = js.native
    
    var maybeRenderShortcuts: js.Any = js.native
    
    var maybeRenderTimePickers: js.Any = js.native
    
    var modifiers: js.Any = js.native
    
    var renderCalendars: js.Any = js.native
    
    var renderDay: js.Any = js.native
    
    var renderLeftCaption: js.Any = js.native
    
    var renderLeftNavbar: js.Any = js.native
    
    var renderRightCaption: js.Any = js.native
    
    var renderRightNavbar: js.Any = js.native
    
    var renderSingleCaption: js.Any = js.native
    
    var renderSingleNavbar: js.Any = js.native
    
    var setViews: js.Any = js.native
    
    var shouldHighlightCurrentDay: js.Any = js.native
    
    var updateLeftView: js.Any = js.native
    
    var updateRightView: js.Any = js.native
  }
  /* static members */
  object DateRangePicker {
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangePicker", "DateRangePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangePicker", "DateRangePicker.defaultProps")
    @js.native
    def defaultProps: IDateRangePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDateRangePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangePicker", "DateRangePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDateRangePickerProps
    extends IDatePickerBaseProps
       with IProps {
    
    /**
      * Whether the start and end dates of the range can be the same day.
      * If `true`, clicking a selected date will create a one-day range.
      * If `false`, clicking a selected date will clear the selection.
      * @default false
      */
    var allowSingleDayRange: js.UndefOr[Boolean] = js.native
    
    /**
      * The date-range boundary that the next click should modify.
      * This will be honored unless the next click would overlap the other boundary date.
      * In that case, the two boundary dates will be auto-swapped to keep them in chronological order.
      * If `undefined`, the picker will revert to its default selection behavior.
      */
    var boundaryToModify: js.UndefOr[Boundary] = js.native
    
    /**
      * Whether displayed months in the calendar are contiguous.
      * If false, each side of the calendar can move independently to non-contiguous months.
      * @default true
      */
    var contiguousCalendarMonths: js.UndefOr[Boolean] = js.native
    
    /**
      * Initial `DateRange` the calendar will display as selected.
      * This should not be set if `value` is set.
      */
    var defaultValue: js.UndefOr[DateRange] = js.native
    
    /**
      * Called when the user selects a day.
      * If no days are selected, it will pass `[null, null]`.
      * If a start date is selected but not an end date, it will pass `[selectedDate, null]`.
      * If both a start and end date are selected, it will pass `[startDate, endDate]`.
      */
    var onChange: js.UndefOr[js.Function1[/* selectedDates */ DateRange, Unit]] = js.native
    
    /**
      * Called when the user changes the hovered date range, either from mouseenter or mouseleave.
      * When triggered from mouseenter, it will pass the date range that would result from next click.
      * When triggered from mouseleave, it will pass `undefined`.
      */
    var onHoverChange: js.UndefOr[
        js.Function3[
          /* hoveredDates */ DateRange, 
          /* hoveredDay */ Date, 
          /* hoveredBoundary */ Boundary, 
          Unit
        ]
      ] = js.native
    
    /**
      * Called when the `shortcuts` props is enabled and the user changes the shortcut.
      */
    var onShortcutChange: js.UndefOr[js.Function2[/* shortcut */ IDateRangeShortcut, /* index */ Double, Unit]] = js.native
    
    /**
      * The currently selected shortcut.
      * If this prop is provided, the component acts in a controlled manner.
      */
    var selectedShortcutIndex: js.UndefOr[Double] = js.native
    
    /**
      * Whether shortcuts to quickly select a range of dates are displayed or not.
      * If `true`, preset shortcuts will be displayed.
      * If `false`, no shortcuts will be displayed.
      * If an array is provided, the custom shortcuts will be displayed.
      * @default true
      */
    var shortcuts: js.UndefOr[Boolean | js.Array[IDateRangeShortcut]] = js.native
    
    /**
      * Whether to show only a single month calendar.
      * @default false
      */
    var singleMonthOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * The currently selected `DateRange`.
      * If this prop is provided, the component acts in a controlled manner.
      */
    var value: js.UndefOr[DateRange] = js.native
  }
  object IDateRangePickerProps {
    
    @scala.inline
    def apply(): IDateRangePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDateRangePickerProps]
    }
    
    @scala.inline
    implicit class IDateRangePickerPropsMutableBuilder[Self <: IDateRangePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSingleDayRange(value: Boolean): Self = StObject.set(x, "allowSingleDayRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSingleDayRangeUndefined: Self = StObject.set(x, "allowSingleDayRange", js.undefined)
      
      @scala.inline
      def setBoundaryToModify(value: Boundary): Self = StObject.set(x, "boundaryToModify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryToModifyUndefined: Self = StObject.set(x, "boundaryToModify", js.undefined)
      
      @scala.inline
      def setContiguousCalendarMonths(value: Boolean): Self = StObject.set(x, "contiguousCalendarMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContiguousCalendarMonthsUndefined: Self = StObject.set(x, "contiguousCalendarMonths", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: DateRange): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* selectedDates */ DateRange => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnHoverChange(
        value: (/* hoveredDates */ DateRange, /* hoveredDay */ Date, /* hoveredBoundary */ Boundary) => Unit
      ): Self = StObject.set(x, "onHoverChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnHoverChangeUndefined: Self = StObject.set(x, "onHoverChange", js.undefined)
      
      @scala.inline
      def setOnShortcutChange(value: (/* shortcut */ IDateRangeShortcut, /* index */ Double) => Unit): Self = StObject.set(x, "onShortcutChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnShortcutChangeUndefined: Self = StObject.set(x, "onShortcutChange", js.undefined)
      
      @scala.inline
      def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      @scala.inline
      def setShortcuts(value: Boolean | js.Array[IDateRangeShortcut]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      @scala.inline
      def setShortcutsVarargs(value: IDateRangeShortcut*): Self = StObject.set(x, "shortcuts", js.Array(value :_*))
      
      @scala.inline
      def setSingleMonthOnly(value: Boolean): Self = StObject.set(x, "singleMonthOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleMonthOnlyUndefined: Self = StObject.set(x, "singleMonthOnly", js.undefined)
      
      @scala.inline
      def setValue(value: DateRange): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait IDateRangePickerState extends StObject {
    
    var hoverValue: js.UndefOr[DateRange] = js.native
    
    var leftView: js.UndefOr[MonthAndYear] = js.native
    
    var rightView: js.UndefOr[MonthAndYear] = js.native
    
    var selectedShortcutIndex: js.UndefOr[Double] = js.native
    
    var time: js.UndefOr[DateRange] = js.native
    
    var value: js.UndefOr[DateRange] = js.native
  }
  object IDateRangePickerState {
    
    @scala.inline
    def apply(): IDateRangePickerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDateRangePickerState]
    }
    
    @scala.inline
    implicit class IDateRangePickerStateMutableBuilder[Self <: IDateRangePickerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHoverValue(value: DateRange): Self = StObject.set(x, "hoverValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverValueUndefined: Self = StObject.set(x, "hoverValue", js.undefined)
      
      @scala.inline
      def setLeftView(value: MonthAndYear): Self = StObject.set(x, "leftView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftViewUndefined: Self = StObject.set(x, "leftView", js.undefined)
      
      @scala.inline
      def setRightView(value: MonthAndYear): Self = StObject.set(x, "rightView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightViewUndefined: Self = StObject.set(x, "rightView", js.undefined)
      
      @scala.inline
      def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      @scala.inline
      def setTime(value: DateRange): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setValue(value: DateRange): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
