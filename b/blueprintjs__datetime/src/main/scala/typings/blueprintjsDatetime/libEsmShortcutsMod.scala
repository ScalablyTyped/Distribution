package typings.blueprintjsDatetime

import typings.blueprintjsDatetime.anon.PartialIShortcutsProps
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typings.blueprintjsDatetime.libEsmCommonDateRangeMod.DateRange
import typings.blueprintjsDatetime.libEsmTimePickerMod.TimePrecision
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmShortcutsMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/shortcuts", "Shortcuts")
  @js.native
  open class Shortcuts protected ()
    extends PureComponent[IShortcutsProps, js.Object, Any] {
    def this(props: IShortcutsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IShortcutsProps, context: Any) = this()
    
    /* private */ var getShorcutClickHandler: Any = js.native
    
    /* private */ var isShortcutInRange: Any = js.native
  }
  /* static members */
  object Shortcuts {
    
    @JSImport("@blueprintjs/datetime/lib/esm/shortcuts", "Shortcuts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/shortcuts", "Shortcuts.defaultProps")
    @js.native
    def defaultProps: PartialIShortcutsProps = js.native
    inline def defaultProps_=(x: PartialIShortcutsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type DatePickerShortcut = IDatePickerShortcut
  
  type DateRangeShortcut = IDateRangeShortcut
  
  trait IDatePickerShortcut
    extends StObject
       with IDateShortcutBase {
    
    /**
      * Date represented by this shortcut. Note that time components of a
      * shortcut are ignored by default; set `includeTime: true` to respect them.
      */
    var date: js.Date
  }
  object IDatePickerShortcut {
    
    inline def apply(date: js.Date, label: String): IDatePickerShortcut = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatePickerShortcut]
    }
    
    extension [Self <: IDatePickerShortcut](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDateRangeShortcut
    extends StObject
       with IDateShortcutBase {
    
    /**
      * Date range represented by this shortcut. Note that time components of a
      * shortcut are ignored by default; set `includeTime: true` to respect them.
      */
    var dateRange: DateRange
  }
  object IDateRangeShortcut {
    
    inline def apply(dateRange: DateRange, label: String): IDateRangeShortcut = {
      val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateRangeShortcut]
    }
    
    extension [Self <: IDateRangeShortcut](x: Self) {
      
      inline def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDateShortcutBase extends StObject {
    
    /**
      * Set this prop to `true` to allow this shortcut to change the selected
      * times as well as the dates. By default, time components of a shortcut are
      * ignored; clicking a shortcut takes the date components of the `dateRange`
      * and combines them with the currently selected time.
      *
      * @default false
      */
    var includeTime: js.UndefOr[Boolean] = js.undefined
    
    /** Shortcut label that appears in the list. */
    var label: String
  }
  object IDateShortcutBase {
    
    inline def apply(label: String): IDateShortcutBase = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateShortcutBase]
    }
    
    extension [Self <: IDateShortcutBase](x: Self) {
      
      inline def setIncludeTime(value: Boolean): Self = StObject.set(x, "includeTime", value.asInstanceOf[js.Any])
      
      inline def setIncludeTimeUndefined: Self = StObject.set(x, "includeTime", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait IShortcutsProps extends StObject {
    
    var allowSingleDayRange: Boolean
    
    var maxDate: js.Date
    
    var minDate: js.Date
    
    def onShortcutClick(shortcut: DateRangeShortcut, index: Double): Unit
    
    var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
    
    var shortcuts: js.Array[DateRangeShortcut] | `true`
    
    var timePrecision: TimePrecision
    
    /**
      * The DatePicker component reuses this component for a single date.
      * This changes the default shortcut labels and affects which shortcuts are used.
      *
      * @default false
      */
    var useSingleDateShortcuts: js.UndefOr[Boolean] = js.undefined
  }
  object IShortcutsProps {
    
    inline def apply(
      allowSingleDayRange: Boolean,
      maxDate: js.Date,
      minDate: js.Date,
      onShortcutClick: (DateRangeShortcut, Double) => Unit,
      shortcuts: js.Array[DateRangeShortcut] | `true`,
      timePrecision: TimePrecision
    ): IShortcutsProps = {
      val __obj = js.Dynamic.literal(allowSingleDayRange = allowSingleDayRange.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], onShortcutClick = js.Any.fromFunction2(onShortcutClick), shortcuts = shortcuts.asInstanceOf[js.Any], timePrecision = timePrecision.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShortcutsProps]
    }
    
    extension [Self <: IShortcutsProps](x: Self) {
      
      inline def setAllowSingleDayRange(value: Boolean): Self = StObject.set(x, "allowSingleDayRange", value.asInstanceOf[js.Any])
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setOnShortcutClick(value: (DateRangeShortcut, Double) => Unit): Self = StObject.set(x, "onShortcutClick", js.Any.fromFunction2(value))
      
      inline def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      inline def setShortcuts(value: js.Array[DateRangeShortcut] | `true`): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      inline def setShortcutsVarargs(value: DateRangeShortcut*): Self = StObject.set(x, "shortcuts", js.Array(value*))
      
      inline def setTimePrecision(value: TimePrecision): Self = StObject.set(x, "timePrecision", value.asInstanceOf[js.Any])
      
      inline def setUseSingleDateShortcuts(value: Boolean): Self = StObject.set(x, "useSingleDateShortcuts", value.asInstanceOf[js.Any])
      
      inline def setUseSingleDateShortcutsUndefined: Self = StObject.set(x, "useSingleDateShortcuts", js.undefined)
    }
  }
}
