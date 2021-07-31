package typings.blueprintjsDatetime

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typings.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimePickerMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker")
  @js.native
  class DateTimePicker ()
    extends AbstractPureComponent2[IDateTimePickerProps, IDateTimePickerState, js.Object] {
    def this(props: IDateTimePickerProps) = this()
    def this(props: Unit, context: js.Any) = this()
    def this(props: IDateTimePickerProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDateTimePicker(prevProps: IDatePickerProps): Unit = js.native
    
    def handleDateChange(dateValue: Date, isUserChange: Boolean): Unit = js.native
    
    def handleTimeChange(timeValue: Date): Unit = js.native
  }
  /* static members */
  object DateTimePicker {
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker.defaultProps")
    @js.native
    def defaultProps: IDateTimePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDateTimePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IDateTimePickerProps
    extends StObject
       with IProps {
    
    /**
      * Allows the user to clear the selection by clicking the currently selected day.
      * @default true
      */
    var canClearSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Any props to be passed on to the `DatePicker` other than the `value` and `onChange` props as they come directly
      * from the `DateTimePicker` props.
      */
    var datePickerProps: js.UndefOr[IDatePickerProps] = js.undefined
    
    /**
      * The initial date and time value that will be set.
      * This will be ignored if `value` is set.
      * @default Date.now()
      */
    var defaultValue: js.UndefOr[Date] = js.undefined
    
    /**
      * Callback invoked when the user changes the date or time.
      */
    var onChange: js.UndefOr[js.Function2[/* selectedDate */ Date, /* isUserChange */ Boolean, Unit]] = js.undefined
    
    /**
      * Any props to be passed on to the `TimePicker` other than the `value` and `onChange` props as they come directly
      * from the `DateTimePicker` props.
      */
    var timePickerProps: js.UndefOr[ITimePickerProps] = js.undefined
    
    /**
      * The currently set date and time. If this prop is provided, the component acts in a controlled manner.
      */
    var value: js.UndefOr[Date | Null] = js.undefined
  }
  object IDateTimePickerProps {
    
    @scala.inline
    def apply(): IDateTimePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDateTimePickerProps]
    }
    
    @scala.inline
    implicit class IDateTimePickerPropsMutableBuilder[Self <: IDateTimePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanClearSelection(value: Boolean): Self = StObject.set(x, "canClearSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanClearSelectionUndefined: Self = StObject.set(x, "canClearSelection", js.undefined)
      
      @scala.inline
      def setDatePickerProps(value: IDatePickerProps): Self = StObject.set(x, "datePickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePickerPropsUndefined: Self = StObject.set(x, "datePickerProps", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* selectedDate */ Date, /* isUserChange */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setTimePickerProps(value: ITimePickerProps): Self = StObject.set(x, "timePickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerPropsUndefined: Self = StObject.set(x, "timePickerProps", js.undefined)
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IDateTimePickerState extends StObject {
    
    var dateValue: js.UndefOr[Date] = js.undefined
    
    var timeValue: js.UndefOr[Date] = js.undefined
  }
  object IDateTimePickerState {
    
    @scala.inline
    def apply(): IDateTimePickerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDateTimePickerState]
    }
    
    @scala.inline
    implicit class IDateTimePickerStateMutableBuilder[Self <: IDateTimePickerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateValue(value: Date): Self = StObject.set(x, "dateValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateValueUndefined: Self = StObject.set(x, "dateValue", js.undefined)
      
      @scala.inline
      def setTimeValue(value: Date): Self = StObject.set(x, "timeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeValueUndefined: Self = StObject.set(x, "timeValue", js.undefined)
    }
  }
}
