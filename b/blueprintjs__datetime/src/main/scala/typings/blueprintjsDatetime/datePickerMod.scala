package typings.blueprintjsDatetime

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import typings.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    /* private */ var computeValidDateInSpecifiedMonthYear: js.Any = js.native
    
    /* private */ var disabledDays: js.Any = js.native
    
    /* private */ var getDatePickerModifiers: js.Any = js.native
    
    /* private */ var getDisabledDaysModifier: js.Any = js.native
    
    /* private */ var handleClearClick: js.Any = js.native
    
    /* private */ var handleDayClick: js.Any = js.native
    
    /* private */ var handleMonthChange: js.Any = js.native
    
    /* private */ var handleShortcutClick: js.Any = js.native
    
    /* private */ var handleTimeChange: js.Any = js.native
    
    /* private */ var handleTodayClick: js.Any = js.native
    
    /* private */ var ignoreNextMonthChange: js.Any = js.native
    
    /* private */ var maybeRenderShortcuts: js.Any = js.native
    
    /* private */ var maybeRenderTimePicker: js.Any = js.native
    
    /* private */ var renderCaption: js.Any = js.native
    
    /* private */ var renderDay: js.Any = js.native
    
    /* private */ var renderNavbar: js.Any = js.native
    
    /* private */ var renderOptionsBar: js.Any = js.native
    
    /* private */ var shouldHighlightCurrentDay: js.Any = js.native
    
    /* private */ var updateDay: js.Any = js.native
    
    /**
      * Update `value` by invoking `onChange` (always) and setting state (if uncontrolled).
      */
    /* private */ var updateValue: js.Any = js.native
  }
  /* static members */
  object DatePicker {
    
    @JSImport("@blueprintjs/datetime/lib/esm/datePicker", "DatePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/datePicker", "DatePicker.defaultProps")
    @js.native
    def defaultProps: IDatePickerProps = js.native
    inline def defaultProps_=(x: IDatePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/datePicker", "DatePicker.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IDatePickerProps
    extends StObject
       with IDatePickerBaseProps
       with IProps {
    
    /**
      * Allows the user to clear the selection by clicking the currently selected day.
      * @default true
      */
    var canClearSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text for the reset button in the action bar.
      * @default "Clear"
      */
    var clearButtonText: js.UndefOr[String] = js.undefined
    
    /**
      * Initial day the calendar will display as selected.
      * This should not be set if `value` is set.
      */
    var defaultValue: js.UndefOr[Date] = js.undefined
    
    /**
      * Called when the user selects a day.
      * If being used in an uncontrolled manner, `selectedDate` will be `null` if the user clicks the currently selected
      * day. If being used in a controlled manner, `selectedDate` will contain the day clicked no matter what.
      * `isUserChange` is true if the user selected a day, and false if the date was automatically changed
      * by the user navigating to a new month or year rather than explicitly clicking on a date in the calendar.
      */
    var onChange: js.UndefOr[js.Function2[/* selectedDate */ Date, /* isUserChange */ Boolean, Unit]] = js.undefined
    
    /**
      * Called when the `shortcuts` props is enabled and the user changes the shortcut.
      */
    var onShortcutChange: js.UndefOr[js.Function2[/* shortcut */ IDatePickerShortcut, /* index */ Double, Unit]] = js.undefined
    
    /**
      * The currently selected shortcut.
      * If this prop is provided, the component acts in a controlled manner.
      */
    var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether shortcuts to quickly select a date are displayed or not.
      * If `true`, preset shortcuts will be displayed.
      * If `false`, no shortcuts will be displayed.
      * If an array is provided, the custom shortcuts will be displayed.
      */
    var shortcuts: js.UndefOr[Boolean | js.Array[IDatePickerShortcut]] = js.undefined
    
    /**
      * Whether the bottom bar displaying "Today" and "Clear" buttons should be shown.
      * @default false
      */
    var showActionsBar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text for the today button in the action bar.
      * @default "Today"
      */
    var todayButtonText: js.UndefOr[String] = js.undefined
    
    /**
      * The currently selected day. If this prop is provided, the component acts in a controlled manner.
      */
    var value: js.UndefOr[Date | Null] = js.undefined
  }
  object IDatePickerProps {
    
    inline def apply(): IDatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDatePickerProps]
    }
    
    extension [Self <: IDatePickerProps](x: Self) {
      
      inline def setCanClearSelection(value: Boolean): Self = StObject.set(x, "canClearSelection", value.asInstanceOf[js.Any])
      
      inline def setCanClearSelectionUndefined: Self = StObject.set(x, "canClearSelection", js.undefined)
      
      inline def setClearButtonText(value: String): Self = StObject.set(x, "clearButtonText", value.asInstanceOf[js.Any])
      
      inline def setClearButtonTextUndefined: Self = StObject.set(x, "clearButtonText", js.undefined)
      
      inline def setDefaultValue(value: Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnChange(value: (/* selectedDate */ Date, /* isUserChange */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnShortcutChange(value: (/* shortcut */ IDatePickerShortcut, /* index */ Double) => Unit): Self = StObject.set(x, "onShortcutChange", js.Any.fromFunction2(value))
      
      inline def setOnShortcutChangeUndefined: Self = StObject.set(x, "onShortcutChange", js.undefined)
      
      inline def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      inline def setShortcuts(value: Boolean | js.Array[IDatePickerShortcut]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      inline def setShortcutsVarargs(value: IDatePickerShortcut*): Self = StObject.set(x, "shortcuts", js.Array(value :_*))
      
      inline def setShowActionsBar(value: Boolean): Self = StObject.set(x, "showActionsBar", value.asInstanceOf[js.Any])
      
      inline def setShowActionsBarUndefined: Self = StObject.set(x, "showActionsBar", js.undefined)
      
      inline def setTodayButtonText(value: String): Self = StObject.set(x, "todayButtonText", value.asInstanceOf[js.Any])
      
      inline def setTodayButtonTextUndefined: Self = StObject.set(x, "todayButtonText", js.undefined)
      
      inline def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IDatePickerState extends StObject {
    
    var displayMonth: Double
    
    var displayYear: Double
    
    var selectedDay: Double | Null
    
    var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
    
    var value: Date | Null
  }
  object IDatePickerState {
    
    inline def apply(displayMonth: Double, displayYear: Double): IDatePickerState = {
      val __obj = js.Dynamic.literal(displayMonth = displayMonth.asInstanceOf[js.Any], displayYear = displayYear.asInstanceOf[js.Any], selectedDay = null, value = null)
      __obj.asInstanceOf[IDatePickerState]
    }
    
    extension [Self <: IDatePickerState](x: Self) {
      
      inline def setDisplayMonth(value: Double): Self = StObject.set(x, "displayMonth", value.asInstanceOf[js.Any])
      
      inline def setDisplayYear(value: Double): Self = StObject.set(x, "displayYear", value.asInstanceOf[js.Any])
      
      inline def setSelectedDay(value: Double): Self = StObject.set(x, "selectedDay", value.asInstanceOf[js.Any])
      
      inline def setSelectedDayNull: Self = StObject.set(x, "selectedDay", null)
      
      inline def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      inline def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
}
