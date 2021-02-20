package typings.blueprintjsDatetime

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsDatetime.anon.TypeofLocaleUtils
import typings.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typings.blueprintjsDatetime.timePickerMod.TimePrecision
import typings.reactDayPicker.propsMod.DayPickerProps
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerCoreMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCore", "DISABLED_MODIFIER")
  @js.native
  val DISABLED_MODIFIER: /* "disabled" */ String = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCore", "DISALLOWED_MODIFIERS")
  @js.native
  val DISALLOWED_MODIFIERS: js.Array[String] = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCore", "HOVERED_RANGE_MODIFIER")
  @js.native
  val HOVERED_RANGE_MODIFIER: /* "hovered-range" */ String = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCore", "OUTSIDE_MODIFIER")
  @js.native
  val OUTSIDE_MODIFIER: /* "outside" */ String = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCore", "SELECTED_MODIFIER")
  @js.native
  val SELECTED_MODIFIER: /* "selected" */ String = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCore", "SELECTED_RANGE_MODIFIER")
  @js.native
  val SELECTED_RANGE_MODIFIER: /* "selected-range" */ String = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCore", "combineModifiers")
  @js.native
  def combineModifiers(baseModifiers: IDatePickerModifiers, userModifiers: IDatePickerModifiers): IDatePickerModifiers = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCore", "getDefaultMaxDate")
  @js.native
  def getDefaultMaxDate(): Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCore", "getDefaultMinDate")
  @js.native
  def getDefaultMinDate(): Date = js.native
  
  @js.native
  trait IDatePickerBaseProps extends StObject {
    
    /**
      * Props to pass to ReactDayPicker. See API documentation
      * [here](http://react-day-picker.js.org/api/DayPicker).
      *
      * The following props are managed by the component and cannot be configured:
      * `canChangeMonth`, `captionElement`, `fromMonth` (use `minDate`), `month` (use
      * `initialMonth`), `toMonth` (use `maxDate`).
      *
      * In case of supplying your owner `renderDay` function, make sure to apply the appropriate
      * CSS wrapper class to obtain default Blueprint styling.
      * eg.
      * `<div className={Classes.DATEPICKER_DAY_WRAPPER}>{CONTENT_HERE}</div>`
      *
      */
    var dayPickerProps: js.UndefOr[DayPickerProps] = js.native
    
    /**
      * Whether the current day should be highlighted in the calendar.
      * @default false
      */
    var highlightCurrentDay: js.UndefOr[Boolean] = js.native
    
    /**
      * The initial month the calendar displays.
      */
    var initialMonth: js.UndefOr[Date] = js.native
    
    /**
      * The locale name, which is passed to the functions in `localeUtils`
      * (and `formatDate` and `parseDate` if supported).
      */
    var locale: js.UndefOr[String] = js.native
    
    /**
      * Collection of functions that provide internationalization support.
      */
    var localeUtils: js.UndefOr[TypeofLocaleUtils] = js.native
    
    /**
      * The latest date the user can select.
      * @default Dec. 31st of this year.
      */
    var maxDate: js.UndefOr[Date] = js.native
    
    /**
      * The earliest date the user can select.
      * @default Jan. 1st, 20 years in the past.
      */
    var minDate: js.UndefOr[Date] = js.native
    
    /**
      * Collection of functions that determine which modifier classes get applied to which days.
      * Each function should accept a `Date` and return a boolean.
      * See the [**react-day-picker** documentation](http://react-day-picker.js.org/api/ModifiersUtils) to learn more.
      */
    var modifiers: js.UndefOr[IDatePickerModifiers] = js.native
    
    /**
      * If `true`, the month menu will appear to the left of the year menu.
      * Otherwise, the month menu will apear to the right of the year menu.
      * @default false
      */
    var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.native
    
    /**
      * Further configure the `TimePicker` that appears beneath the calendar.
      * `onChange` and `value` are ignored in favor of the corresponding
      * top-level props on this component.
      *
      * Passing any non-empty object to this prop will cause the `TimePicker` to appear.
      */
    var timePickerProps: js.UndefOr[ITimePickerProps] = js.native
    
    /**
      * The precision of time selection that accompanies the calendar. Passing a
      * `TimePrecision` value (or providing `timePickerProps`) shows a
      * `TimePicker` below the calendar. Time is preserved across date changes.
      *
      * This is shorthand for `timePickerProps.precision` and is a quick way to
      * enable time selection.
      */
    var timePrecision: js.UndefOr[TimePrecision] = js.native
  }
  object IDatePickerBaseProps {
    
    @scala.inline
    def apply(): IDatePickerBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDatePickerBaseProps]
    }
    
    @scala.inline
    implicit class IDatePickerBasePropsMutableBuilder[Self <: IDatePickerBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDayPickerProps(value: DayPickerProps): Self = StObject.set(x, "dayPickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayPickerPropsUndefined: Self = StObject.set(x, "dayPickerProps", js.undefined)
      
      @scala.inline
      def setHighlightCurrentDay(value: Boolean): Self = StObject.set(x, "highlightCurrentDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightCurrentDayUndefined: Self = StObject.set(x, "highlightCurrentDay", js.undefined)
      
      @scala.inline
      def setInitialMonth(value: Date): Self = StObject.set(x, "initialMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialMonthUndefined: Self = StObject.set(x, "initialMonth", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocaleUtils(value: TypeofLocaleUtils): Self = StObject.set(x, "localeUtils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUtilsUndefined: Self = StObject.set(x, "localeUtils", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setModifiers(value: IDatePickerModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setReverseMonthAndYearMenus(value: Boolean): Self = StObject.set(x, "reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseMonthAndYearMenusUndefined: Self = StObject.set(x, "reverseMonthAndYearMenus", js.undefined)
      
      @scala.inline
      def setTimePickerProps(value: ITimePickerProps): Self = StObject.set(x, "timePickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerPropsUndefined: Self = StObject.set(x, "timePickerProps", js.undefined)
      
      @scala.inline
      def setTimePrecision(value: TimePrecision): Self = StObject.set(x, "timePrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePrecisionUndefined: Self = StObject.set(x, "timePrecision", js.undefined)
    }
  }
  
  type IDatePickerModifiers = StringDictionary[js.Function1[/* date */ Date, Boolean]]
}
