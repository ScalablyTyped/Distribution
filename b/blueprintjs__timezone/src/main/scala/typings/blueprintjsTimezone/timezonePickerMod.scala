package typings.blueprintjsTimezone

import typings.blueprintjsCore.inputGroupMod.InputGroupProps2
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTimezone.anon.PartialButtonPropsHTMLBut
import typings.blueprintjsTimezone.anon.PartialIPopoverProps
import typings.blueprintjsTimezone.anon.PartialTimezonePickerProp
import typings.blueprintjsTimezone.anon.TimezonePickerPropschildr
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.name
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
import typings.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    inline def ABBREVIATION_=(x: abbreviation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABBREVIATION")(x.asInstanceOf[js.Any])
    
    /** Composite format: `"Pacific/Honolulu (HST) -10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezoneDisplayFormat.COMPOSITE")
    @js.native
    def COMPOSITE: composite = js.native
    inline def COMPOSITE_=(x: composite): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPOSITE")(x.asInstanceOf[js.Any])
    
    /** Name format: `"Pacific/Honolulu"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezoneDisplayFormat.NAME")
    @js.native
    def NAME: name = js.native
    inline def NAME_=(x: name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /** Offset format: `"-10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezoneDisplayFormat.OFFSET")
    @js.native
    def OFFSET: offset = js.native
    inline def OFFSET_=(x: offset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFSET")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezonePicker")
  @js.native
  open class TimezonePicker protected ()
    extends AbstractPureComponent2[TimezonePickerProps, ITimezonePickerState, js.Object] {
    def this(props: TimezonePickerProps) = this()
    def this(props: TimezonePickerProps, context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTimezonePicker(prevProps: TimezonePickerProps, prevState: ITimezonePickerState): Unit = js.native
    
    /* private */ var filterItems: Any = js.native
    
    /* private */ var handleItemSelect: Any = js.native
    
    /* private */ var handleQueryChange: Any = js.native
    
    /* private */ var initialTimezoneItems: Any = js.native
    
    /* private */ var renderButton: Any = js.native
    
    /* private */ var renderItem: Any = js.native
    
    /* private */ var timezoneItems: Any = js.native
    
    /* protected */ def validateProps(props: TimezonePickerPropschildr): Unit = js.native
  }
  /* static members */
  object TimezonePicker {
    
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezonePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezonePicker.defaultProps")
    @js.native
    def defaultProps: PartialTimezonePickerProp = js.native
    inline def defaultProps_=(x: PartialTimezonePickerProp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker", "TimezonePicker.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait ITimezonePickerProps
    extends StObject
       with IProps {
    
    /**
      * Props to spread to the target `Button`.
      * This prop will be ignored if `children` is provided.
      */
    var buttonProps: js.UndefOr[PartialButtonPropsHTMLBut] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The date to use when formatting timezone offsets.
      * An offset date is necessary to account for DST, but typically the default value of `now` will be sufficient.
      *
      * @default now
      */
    var date: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Whether this component is non-interactive.
      * This prop will be ignored if `children` is provided.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Props to spread to the filter `InputGroup`.
      * All props are supported except `ref` (use `inputRef` instead).
      * If you want to control the filter input, you can pass `value` and `onChange` here
      * to override `Select`'s own behavior.
      */
    var inputProps: js.UndefOr[InputGroupProps2] = js.undefined
    
    /**
      * Callback invoked when the user selects a timezone.
      */
    def onChange(timezone: String): Unit
    
    /**
      * Text to show when no timezone has been selected (`value === undefined`).
      * This prop will be ignored if `children` is provided.
      *
      * @default "Select timezone..."
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Props to spread to `Popover`. Note that `content` cannot be changed. */
    var popoverProps: js.UndefOr[PartialIPopoverProps] = js.undefined
    
    /**
      * Whether to show the local timezone at the top of the list of initial timezone suggestions.
      *
      * @default true
      */
    var showLocalTimezone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The currently selected timezone UTC identifier, e.g. "Pacific/Honolulu".
      *
      * @see https://www.iana.org/time-zones
      */
    var value: js.UndefOr[String] = js.undefined
    
    /**
      * Format to use when displaying the selected (or default) timezone within the target element.
      * This prop will be ignored if `children` is provided.
      *
      * @default TimezoneDisplayFormat.OFFSET
      */
    var valueDisplayFormat: js.UndefOr[TimezoneDisplayFormat] = js.undefined
  }
  object ITimezonePickerProps {
    
    inline def apply(onChange: String => Unit): ITimezonePickerProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[ITimezonePickerProps]
    }
    
    extension [Self <: ITimezonePickerProps](x: Self) {
      
      inline def setButtonProps(value: PartialButtonPropsHTMLBut): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      inline def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInputProps(value: InputGroupProps2): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopoverProps(value: PartialIPopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setShowLocalTimezone(value: Boolean): Self = StObject.set(x, "showLocalTimezone", value.asInstanceOf[js.Any])
      
      inline def setShowLocalTimezoneUndefined: Self = StObject.set(x, "showLocalTimezone", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueDisplayFormat(value: TimezoneDisplayFormat): Self = StObject.set(x, "valueDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setValueDisplayFormatUndefined: Self = StObject.set(x, "valueDisplayFormat", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ITimezonePickerState extends StObject {
    
    var query: String
  }
  object ITimezonePickerState {
    
    inline def apply(query: String): ITimezonePickerState = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimezonePickerState]
    }
    
    extension [Self <: ITimezonePickerState](x: Self) {
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  type TimezonePickerProps = ITimezonePickerProps
}
