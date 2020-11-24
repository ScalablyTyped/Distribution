package typings.blueprintjsDatetime.datePickerCoreMod

import typings.blueprintjsDatetime.anon.FormatDate
import typings.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typings.blueprintjsDatetime.timePickerMod.TimePrecision
import typings.reactDayPicker.propsMod.DayPickerProps
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatePickerBaseProps extends js.Object {
  
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
  var localeUtils: js.UndefOr[FormatDate] = js.native
  
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
  implicit class IDatePickerBasePropsOps[Self <: IDatePickerBaseProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDayPickerProps(value: DayPickerProps): Self = this.set("dayPickerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayPickerProps: Self = this.set("dayPickerProps", js.undefined)
    
    @scala.inline
    def setHighlightCurrentDay(value: Boolean): Self = this.set("highlightCurrentDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightCurrentDay: Self = this.set("highlightCurrentDay", js.undefined)
    
    @scala.inline
    def setInitialMonth(value: Date): Self = this.set("initialMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialMonth: Self = this.set("initialMonth", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocaleUtils(value: FormatDate): Self = this.set("localeUtils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleUtils: Self = this.set("localeUtils", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setModifiers(value: IDatePickerModifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setReverseMonthAndYearMenus(value: Boolean): Self = this.set("reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseMonthAndYearMenus: Self = this.set("reverseMonthAndYearMenus", js.undefined)
    
    @scala.inline
    def setTimePickerProps(value: ITimePickerProps): Self = this.set("timePickerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePickerProps: Self = this.set("timePickerProps", js.undefined)
    
    @scala.inline
    def setTimePrecision(value: TimePrecision): Self = this.set("timePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePrecision: Self = this.set("timePrecision", js.undefined)
  }
}
