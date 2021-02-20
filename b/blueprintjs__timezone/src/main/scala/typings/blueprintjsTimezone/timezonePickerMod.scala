package typings.blueprintjsTimezone

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTimezone.anon.IPopoverPropschildrenReac
import typings.blueprintjsTimezone.anon.PartialIButtonProps
import typings.blueprintjsTimezone.anon.PartialIPopoverProps
import typings.blueprintjsTimezone.anon.PartialITimezonePickerPro
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.name
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
import typings.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezonePickerMod {
  
  object TimezoneDisplayFormat {
    
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezoneDisplayFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /** Abbreviation format: `"HST"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezoneDisplayFormat.ABBREVIATION")
    @js.native
    def ABBREVIATION: abbreviation = js.native
    @scala.inline
    def ABBREVIATION_=(x: abbreviation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABBREVIATION")(x.asInstanceOf[js.Any])
    
    /** Composite format: `"Pacific/Honolulu (HST) -10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezoneDisplayFormat.COMPOSITE")
    @js.native
    def COMPOSITE: composite = js.native
    @scala.inline
    def COMPOSITE_=(x: composite): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPOSITE")(x.asInstanceOf[js.Any])
    
    /** Name format: `"Pacific/Honolulu"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezoneDisplayFormat.NAME")
    @js.native
    def NAME: name = js.native
    @scala.inline
    def NAME_=(x: name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /** Offset format: `"-10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezoneDisplayFormat.OFFSET")
    @js.native
    def OFFSET: offset = js.native
    @scala.inline
    def OFFSET_=(x: offset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFSET")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezonePicker")
  @js.native
  class TimezonePicker protected ()
    extends AbstractPureComponent2[ITimezonePickerProps, ITimezonePickerState, js.Object] {
    def this(props: ITimezonePickerProps) = this()
    def this(props: ITimezonePickerProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTimezonePicker(prevProps: ITimezonePickerProps, prevState: ITimezonePickerState): Unit = js.native
    
    var filterItems: js.Any = js.native
    
    var handleItemSelect: js.Any = js.native
    
    var handleQueryChange: js.Any = js.native
    
    var initialTimezoneItems: js.Any = js.native
    
    var renderButton: js.Any = js.native
    
    var renderItem: js.Any = js.native
    
    var timezoneItems: js.Any = js.native
    
    /* protected */ def validateProps(props: IPopoverPropschildrenReac): Unit = js.native
  }
  /* static members */
  object TimezonePicker {
    
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezonePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezonePicker.defaultProps")
    @js.native
    def defaultProps: PartialITimezonePickerPro = js.native
    @scala.inline
    def defaultProps_=(x: PartialITimezonePickerPro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezonePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITimezonePickerProps extends IProps {
    
    /**
      * Props to spread to the target `Button`.
      * This prop will be ignored if `children` is provided.
      */
    var buttonProps: js.UndefOr[PartialIButtonProps] = js.native
    
    /**
      * The date to use when formatting timezone offsets.
      * An offset date is necessary to account for DST, but typically the default value of `now` will be sufficient.
      * @default now
      */
    var date: js.UndefOr[Date] = js.native
    
    /**
      * Whether this component is non-interactive.
      * This prop will be ignored if `children` is provided.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Props to spread to the filter `InputGroup`.
      * All props are supported except `ref` (use `inputRef` instead).
      * If you want to control the filter input, you can pass `value` and `onChange` here
      * to override `Select`'s own behavior.
      */
    var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
    
    /**
      * Callback invoked when the user selects a timezone.
      */
    def onChange(timezone: String): Unit = js.native
    
    /**
      * Text to show when no timezone has been selected (`value === undefined`).
      * This prop will be ignored if `children` is provided.
      * @default "Select timezone..."
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /** Props to spread to `Popover`. Note that `content` cannot be changed. */
    var popoverProps: js.UndefOr[PartialIPopoverProps] = js.native
    
    /**
      * Whether to show the local timezone at the top of the list of initial timezone suggestions.
      * @default true
      */
    var showLocalTimezone: js.UndefOr[Boolean] = js.native
    
    /**
      * The currently selected timezone UTC identifier, e.g. "Pacific/Honolulu".
      * See https://www.iana.org/time-zones for more information.
      */
    var value: js.UndefOr[String] = js.native
    
    /**
      * Format to use when displaying the selected (or default) timezone within the target element.
      * This prop will be ignored if `children` is provided.
      * @default TimezoneDisplayFormat.OFFSET
      */
    var valueDisplayFormat: js.UndefOr[TimezoneDisplayFormat] = js.native
  }
  object ITimezonePickerProps {
    
    @scala.inline
    def apply(onChange: String => Unit): ITimezonePickerProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[ITimezonePickerProps]
    }
    
    @scala.inline
    implicit class ITimezonePickerPropsMutableBuilder[Self <: ITimezonePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonProps(value: PartialIButtonProps): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInputProps(value: IInputGroupProps with HTMLInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopoverProps(value: PartialIPopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setShowLocalTimezone(value: Boolean): Self = StObject.set(x, "showLocalTimezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLocalTimezoneUndefined: Self = StObject.set(x, "showLocalTimezone", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueDisplayFormat(value: TimezoneDisplayFormat): Self = StObject.set(x, "valueDisplayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueDisplayFormatUndefined: Self = StObject.set(x, "valueDisplayFormat", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ITimezonePickerState extends StObject {
    
    var query: String = js.native
  }
  object ITimezonePickerState {
    
    @scala.inline
    def apply(query: String): ITimezonePickerState = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimezonePickerState]
    }
    
    @scala.inline
    implicit class ITimezonePickerStateMutableBuilder[Self <: ITimezonePickerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
