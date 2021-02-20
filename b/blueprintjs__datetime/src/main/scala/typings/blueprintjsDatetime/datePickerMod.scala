package typings.blueprintjsDatetime

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import typings.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePicker", "DatePicker")
  @js.native
  class DatePicker protected ()
    extends AbstractPureComponent2[IDatePickerProps, IDatePickerState, js.Object] {
    def this(props: IDatePickerProps) = this()
    def this(props: IDatePickerProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDatePicker(prevProps: IDatePickerProps, prevState: IDatePickerState): Unit = js.native
    
    var computeValidDateInSpecifiedMonthYear: js.Any = js.native
    
    var disabledDays: js.Any = js.native
    
    var getDatePickerModifiers: js.Any = js.native
    
    var getDisabledDaysModifier: js.Any = js.native
    
    var handleClearClick: js.Any = js.native
    
    var handleDayClick: js.Any = js.native
    
    var handleMonthChange: js.Any = js.native
    
    var handleShortcutClick: js.Any = js.native
    
    var handleTimeChange: js.Any = js.native
    
    var handleTodayClick: js.Any = js.native
    
    var ignoreNextMonthChange: js.Any = js.native
    
    var maybeRenderShortcuts: js.Any = js.native
    
    var maybeRenderTimePicker: js.Any = js.native
    
    var renderCaption: js.Any = js.native
    
    var renderDay: js.Any = js.native
    
    var renderNavbar: js.Any = js.native
    
    var renderOptionsBar: js.Any = js.native
    
    var shouldHighlightCurrentDay: js.Any = js.native
    
    var updateDay: js.Any = js.native
    
    /**
      * Update `value` by invoking `onChange` (always) and setting state (if uncontrolled).
      */
    var updateValue: js.Any = js.native
  }
  /* static members */
  object DatePicker {
    
    @JSImport("@blueprintjs/datetime/lib/esm/datePicker", "DatePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/datePicker", "DatePicker.defaultProps")
    @js.native
    def defaultProps: IDatePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDatePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/datePicker", "DatePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDatePickerProps
    extends IDatePickerBaseProps
       with IProps {
    
    /**
      * Allows the user to clear the selection by clicking the currently selected day.
      * @default true
      */
    var canClearSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * Text for the reset button in the action bar.
      * @default "Clear"
      */
    var clearButtonText: js.UndefOr[String] = js.native
    
    /**
      * Initial day the calendar will display as selected.
      * This should not be set if `value` is set.
      */
    var defaultValue: js.UndefOr[Date] = js.native
    
    /**
      * Called when the user selects a day.
      * If being used in an uncontrolled manner, `selectedDate` will be `null` if the user clicks the currently selected
      * day. If being used in a controlled manner, `selectedDate` will contain the day clicked no matter what.
      * `isUserChange` is true if the user selected a day, and false if the date was automatically changed
      * by the user navigating to a new month or year rather than explicitly clicking on a date in the calendar.
      */
    var onChange: js.UndefOr[js.Function2[/* selectedDate */ Date, /* isUserChange */ Boolean, Unit]] = js.native
    
    /**
      * Called when the `shortcuts` props is enabled and the user changes the shortcut.
      */
    var onShortcutChange: js.UndefOr[js.Function2[/* shortcut */ IDatePickerShortcut, /* index */ Double, Unit]] = js.native
    
    /**
      * The currently selected shortcut.
      * If this prop is provided, the component acts in a controlled manner.
      */
    var selectedShortcutIndex: js.UndefOr[Double] = js.native
    
    /**
      * Whether shortcuts to quickly select a date are displayed or not.
      * If `true`, preset shortcuts will be displayed.
      * If `false`, no shortcuts will be displayed.
      * If an array is provided, the custom shortcuts will be displayed.
      */
    var shortcuts: js.UndefOr[Boolean | js.Array[IDatePickerShortcut]] = js.native
    
    /**
      * Whether the bottom bar displaying "Today" and "Clear" buttons should be shown.
      * @default false
      */
    var showActionsBar: js.UndefOr[Boolean] = js.native
    
    /**
      * Text for the today button in the action bar.
      * @default "Today"
      */
    var todayButtonText: js.UndefOr[String] = js.native
    
    /**
      * The currently selected day. If this prop is provided, the component acts in a controlled manner.
      */
    var value: js.UndefOr[Date | Null] = js.native
  }
  object IDatePickerProps {
    
    @scala.inline
    def apply(): IDatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDatePickerProps]
    }
    
    @scala.inline
    implicit class IDatePickerPropsMutableBuilder[Self <: IDatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanClearSelection(value: Boolean): Self = StObject.set(x, "canClearSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanClearSelectionUndefined: Self = StObject.set(x, "canClearSelection", js.undefined)
      
      @scala.inline
      def setClearButtonText(value: String): Self = StObject.set(x, "clearButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearButtonTextUndefined: Self = StObject.set(x, "clearButtonText", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* selectedDate */ Date, /* isUserChange */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnShortcutChange(value: (/* shortcut */ IDatePickerShortcut, /* index */ Double) => Unit): Self = StObject.set(x, "onShortcutChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnShortcutChangeUndefined: Self = StObject.set(x, "onShortcutChange", js.undefined)
      
      @scala.inline
      def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      @scala.inline
      def setShortcuts(value: Boolean | js.Array[IDatePickerShortcut]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      @scala.inline
      def setShortcutsVarargs(value: IDatePickerShortcut*): Self = StObject.set(x, "shortcuts", js.Array(value :_*))
      
      @scala.inline
      def setShowActionsBar(value: Boolean): Self = StObject.set(x, "showActionsBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowActionsBarUndefined: Self = StObject.set(x, "showActionsBar", js.undefined)
      
      @scala.inline
      def setTodayButtonText(value: String): Self = StObject.set(x, "todayButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayButtonTextUndefined: Self = StObject.set(x, "todayButtonText", js.undefined)
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait IDatePickerState extends StObject {
    
    var displayMonth: Double = js.native
    
    var displayYear: Double = js.native
    
    var selectedDay: Double | Null = js.native
    
    var selectedShortcutIndex: js.UndefOr[Double] = js.native
    
    var value: Date | Null = js.native
  }
  object IDatePickerState {
    
    @scala.inline
    def apply(displayMonth: Double, displayYear: Double): IDatePickerState = {
      val __obj = js.Dynamic.literal(displayMonth = displayMonth.asInstanceOf[js.Any], displayYear = displayYear.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatePickerState]
    }
    
    @scala.inline
    implicit class IDatePickerStateMutableBuilder[Self <: IDatePickerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayMonth(value: Double): Self = StObject.set(x, "displayMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayYear(value: Double): Self = StObject.set(x, "displayYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDay(value: Double): Self = StObject.set(x, "selectedDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDayNull: Self = StObject.set(x, "selectedDay", null)
      
      @scala.inline
      def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
}
