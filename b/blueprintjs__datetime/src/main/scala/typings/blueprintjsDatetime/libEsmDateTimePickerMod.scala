package typings.blueprintjsDatetime

import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsDatetime.libEsmDatePickerMod.DatePickerProps
import typings.blueprintjsDatetime.libEsmTimePickerMod.TimePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmDateTimePickerMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker")
  @js.native
  open class DateTimePicker ()
    extends AbstractPureComponent2[IDateTimePickerProps, IDateTimePickerState, js.Object] {
    def this(props: IDateTimePickerProps) = this()
    def this(props: Unit, context: Any) = this()
    def this(props: IDateTimePickerProps, context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDateTimePicker(prevProps: DatePickerProps): Unit = js.native
    
    def handleDateChange(dateValue: js.Date, isUserChange: Boolean): Unit = js.native
    
    def handleTimeChange(timeValue: js.Date): Unit = js.native
  }
  /* static members */
  object DateTimePicker {
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker.defaultProps")
    @js.native
    def defaultProps: IDateTimePickerProps = js.native
    inline def defaultProps_=(x: IDateTimePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IDateTimePickerProps
    extends StObject
       with IProps {
    
    /**
      * Allows the user to clear the selection by clicking the currently selected day.
      *
      * @default true
      */
    var canClearSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Any props to be passed on to the `DatePicker` other than the `value` and `onChange` props as they come directly
      * from the `DateTimePicker` props.
      */
    var datePickerProps: js.UndefOr[DatePickerProps] = js.undefined
    
    /**
      * The initial date and time value that will be set.
      * This will be ignored if `value` is set.
      *
      * @default Date.now()
      */
    var defaultValue: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Callback invoked when the user changes the date or time.
      */
    var onChange: js.UndefOr[js.Function2[/* selectedDate */ js.Date, /* isUserChange */ Boolean, Unit]] = js.undefined
    
    /**
      * Any props to be passed on to the `TimePicker` other than the `value` and `onChange` props as they come directly
      * from the `DateTimePicker` props.
      */
    var timePickerProps: js.UndefOr[TimePickerProps] = js.undefined
    
    /**
      * The currently set date and time. If this prop is provided, the component acts in a controlled manner.
      */
    var value: js.UndefOr[js.Date | Null] = js.undefined
  }
  object IDateTimePickerProps {
    
    inline def apply(): IDateTimePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDateTimePickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDateTimePickerProps] (val x: Self) extends AnyVal {
      
      inline def setCanClearSelection(value: Boolean): Self = StObject.set(x, "canClearSelection", value.asInstanceOf[js.Any])
      
      inline def setCanClearSelectionUndefined: Self = StObject.set(x, "canClearSelection", js.undefined)
      
      inline def setDatePickerProps(value: DatePickerProps): Self = StObject.set(x, "datePickerProps", value.asInstanceOf[js.Any])
      
      inline def setDatePickerPropsUndefined: Self = StObject.set(x, "datePickerProps", js.undefined)
      
      inline def setDefaultValue(value: js.Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnChange(value: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setTimePickerProps(value: TimePickerProps): Self = StObject.set(x, "timePickerProps", value.asInstanceOf[js.Any])
      
      inline def setTimePickerPropsUndefined: Self = StObject.set(x, "timePickerProps", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IDateTimePickerState extends StObject {
    
    var dateValue: js.UndefOr[js.Date] = js.undefined
    
    var timeValue: js.UndefOr[js.Date] = js.undefined
  }
  object IDateTimePickerState {
    
    inline def apply(): IDateTimePickerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDateTimePickerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDateTimePickerState] (val x: Self) extends AnyVal {
      
      inline def setDateValue(value: js.Date): Self = StObject.set(x, "dateValue", value.asInstanceOf[js.Any])
      
      inline def setDateValueUndefined: Self = StObject.set(x, "dateValue", js.undefined)
      
      inline def setTimeValue(value: js.Date): Self = StObject.set(x, "timeValue", value.asInstanceOf[js.Any])
      
      inline def setTimeValueUndefined: Self = StObject.set(x, "timeValue", js.undefined)
    }
  }
}
