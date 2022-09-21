package typings.blueprintjsDatetime

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsDatetime.timePickerMod.TimePickerProps
import typings.blueprintjsDatetime.timePickerMod.TimePrecision
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.distDayPickerMod.DayPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerCoreMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def combineModifiers(baseModifiers: DatePickerModifiers, userModifiers: DatePickerModifiers): IDatePickerModifiers = (^.asInstanceOf[js.Dynamic].applyDynamic("combineModifiers")(baseModifiers.asInstanceOf[js.Any], userModifiers.asInstanceOf[js.Any])).asInstanceOf[IDatePickerModifiers]
  
  inline def getDefaultMaxDate(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultMaxDate")().asInstanceOf[js.Date]
  
  inline def getDefaultMinDate(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultMinDate")().asInstanceOf[js.Date]
  
  trait DatePickerBaseProps extends StObject {
    
    /**
      * Props to pass to ReactDayPicker. See API documentation
      * [here](https://react-day-picker-v7.netlify.app/api/DayPicker).
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
    var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
    
    /**
      * An additional element to show below the date picker.
      */
    var footerElement: js.UndefOr[Element] = js.undefined
    
    /**
      * Whether the current day should be highlighted in the calendar.
      *
      * @default false
      */
    var highlightCurrentDay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The initial month the calendar displays.
      */
    var initialMonth: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The locale name, which is passed to the functions in `localeUtils`
      * (and `formatDate` and `parseDate` if supported).
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /**
      * Collection of functions that provide internationalization support.
      */
    var localeUtils: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ Any
      ] = js.undefined
    
    /**
      * The latest date the user can select.
      *
      * @default 6 months from now.
      */
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The earliest date the user can select.
      *
      * @default Jan. 1st, 20 years in the past.
      */
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Collection of functions that determine which modifier classes get applied to which days.
      * Each function should accept a `Date` and return a boolean.
      * See the [**react-day-picker** documentation](https://react-day-picker-v7.netlify.app/api/ModifiersUtils)
      * to learn more.
      */
    var modifiers: js.UndefOr[DatePickerModifiers] = js.undefined
    
    /**
      * If `true`, the month menu will appear to the left of the year menu.
      * Otherwise, the month menu will apear to the right of the year menu.
      *
      * @default false
      */
    var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Further configure the `TimePicker` that appears beneath the calendar.
      * `onChange` and `value` are ignored in favor of the corresponding
      * top-level props on this component.
      *
      * Passing any non-empty object to this prop will cause the `TimePicker` to appear.
      */
    var timePickerProps: js.UndefOr[TimePickerProps] = js.undefined
    
    /**
      * The precision of time selection that accompanies the calendar. Passing a
      * `TimePrecision` value (or providing `timePickerProps`) shows a
      * `TimePicker` below the calendar. Time is preserved across date changes.
      *
      * This is shorthand for `timePickerProps.precision` and is a quick way to
      * enable time selection.
      */
    var timePrecision: js.UndefOr[TimePrecision] = js.undefined
  }
  object DatePickerBaseProps {
    
    inline def apply(): DatePickerBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerBaseProps]
    }
    
    extension [Self <: DatePickerBaseProps](x: Self) {
      
      inline def setDayPickerProps(value: DayPickerProps): Self = StObject.set(x, "dayPickerProps", value.asInstanceOf[js.Any])
      
      inline def setDayPickerPropsUndefined: Self = StObject.set(x, "dayPickerProps", js.undefined)
      
      inline def setFooterElement(value: Element): Self = StObject.set(x, "footerElement", value.asInstanceOf[js.Any])
      
      inline def setFooterElementUndefined: Self = StObject.set(x, "footerElement", js.undefined)
      
      inline def setHighlightCurrentDay(value: Boolean): Self = StObject.set(x, "highlightCurrentDay", value.asInstanceOf[js.Any])
      
      inline def setHighlightCurrentDayUndefined: Self = StObject.set(x, "highlightCurrentDay", js.undefined)
      
      inline def setInitialMonth(value: js.Date): Self = StObject.set(x, "initialMonth", value.asInstanceOf[js.Any])
      
      inline def setInitialMonthUndefined: Self = StObject.set(x, "initialMonth", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocaleUtils(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ Any): Self = StObject.set(x, "localeUtils", value.asInstanceOf[js.Any])
      
      inline def setLocaleUtilsUndefined: Self = StObject.set(x, "localeUtils", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setModifiers(value: DatePickerModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setReverseMonthAndYearMenus(value: Boolean): Self = StObject.set(x, "reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
      
      inline def setReverseMonthAndYearMenusUndefined: Self = StObject.set(x, "reverseMonthAndYearMenus", js.undefined)
      
      inline def setTimePickerProps(value: TimePickerProps): Self = StObject.set(x, "timePickerProps", value.asInstanceOf[js.Any])
      
      inline def setTimePickerPropsUndefined: Self = StObject.set(x, "timePickerProps", js.undefined)
      
      inline def setTimePrecision(value: TimePrecision): Self = StObject.set(x, "timePrecision", value.asInstanceOf[js.Any])
      
      inline def setTimePrecisionUndefined: Self = StObject.set(x, "timePrecision", js.undefined)
    }
  }
  
  type DatePickerModifiers = IDatePickerModifiers
  
  type IDatePickerModifiers = StringDictionary[js.Function1[/* date */ js.Date, Boolean]]
}
