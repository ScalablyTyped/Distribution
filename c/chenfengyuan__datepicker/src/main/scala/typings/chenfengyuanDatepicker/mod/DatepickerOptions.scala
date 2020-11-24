package typings.chenfengyuanDatepicker.mod

import typings.chenfengyuanDatepicker.chenfengyuanDatepickerNumbers.`0`
import typings.chenfengyuanDatepicker.chenfengyuanDatepickerNumbers.`1`
import typings.chenfengyuanDatepicker.chenfengyuanDatepickerNumbers.`2`
import typings.chenfengyuanDatepicker.chenfengyuanDatepickerNumbers.`3`
import typings.chenfengyuanDatepicker.chenfengyuanDatepickerNumbers.`4`
import typings.chenfengyuanDatepicker.chenfengyuanDatepickerNumbers.`5`
import typings.chenfengyuanDatepicker.chenfengyuanDatepickerNumbers.`6`
import typings.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.day
import typings.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.month
import typings.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.year
import typings.chenfengyuanDatepicker.mod.global.JQuery
import typings.std.Date
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatepickerOptions extends js.Object {
  
  /**
    * Hide the datepicker automatically when picked.
    *
    * Default: `false`
    */
  var autoHide: js.UndefOr[Boolean] = js.native
  
  /**
    * Pick the initial date automatically when initialized.
    *
    * Default: `false`
    */
  var autoPick: js.UndefOr[Boolean] = js.native
  
  /**
    * Show the datepicker automatically when initialized.
    *
    * Default: `false`
    */
  var autoShow: js.UndefOr[Boolean] = js.native
  
  /**
    * A element for putting the datepicker. If not set, the datepicker will be appended to
    * `document.body` by default.
    *
    * > Only works when the `inline` option set to `true`.
    */
  var container: js.UndefOr[Element | JQuery[HTMLElement] | String | Null] = js.native
  
  /**
    * The initial date. If not set, will use the current date by default.
    */
  var date: js.UndefOr[Date | String] = js.native
  
  /**
    * Days' name of the week.
    *
    * Default: `['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']`
    */
  var days: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Shortest days' name.
    *
    * Default: `['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa']`
    */
  var daysMin: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Shorter days' name.
    *
    * Default: `['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']`
    */
  var daysShort: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * CSS class for a disabled item.
    *
    * Default: `disabled`
    */
  var disabledClass: js.UndefOr[String] = js.native
  
  /**
    * The end view date. All the dates after this date will be disabled.
    */
  var endDate: js.UndefOr[Date | String] = js.native
  
  /**
    * Filter each date item. If it returns `false`, the related date will be disabled.
    */
  var filter: js.UndefOr[
    js.Function2[/* date */ Date, /* view */ day | month | year, js.UndefOr[Boolean]]
  ] = js.native
  
  /**
    * The date string format.
    *
    * Default: `mm/dd/yyyy`
    *
    * Available date placeholders:
    * * Year: `yyyy`, `yy`
    * * Month: `mm`, `m`
    * * Day: `dd`, `d`
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * A shortcut of the "hide.datepicker" event.
    */
  var hide: js.UndefOr[js.Function1[/* event */ DatePickerEvent, Unit]] = js.native
  
  /**
    * CSS class for highlight date item.
    *
    * Default: `highlighted`
    */
  var highlightedClass: js.UndefOr[String] = js.native
  
  /**
    * Enable inline mode.
    *
    * If the element is not an input element, will append the datepicker to the element.
    * If the `container` option is set, will append the datepicker to the container.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  
  /**
    * A element tag for each item of years, months and days.
    *
    * Default: `li`
    */
  var itemTag: js.UndefOr[String] = js.native
  
  /**
    * The ISO language code. If not set, will use the built-in language (`en-US`) by default.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Months' name.
    *
    * Default: `['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']`
    */
  var months: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Shorter months' name.
    *
    * Default: `['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']`
    */
  var monthsShort: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The offset top or bottom of the datepicker from the element.
    *
    * Default: `10`
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * A shortcut of the "pick.datepicker" event.
    */
  var pick: js.UndefOr[js.Function1[/* event */ DatePickerEvent, Unit]] = js.native
  
  /**
    * CSS class for a muted item.
    *
    * Default: `picked`
    */
  var pickedClass: js.UndefOr[String] = js.native
  
  /**
    * A shortcut of the "show.datepicker" event.
    */
  var show: js.UndefOr[js.Function1[/* event */ DatePickerEvent, Unit]] = js.native
  
  /**
    * The start view date. All the dates before this date will be disabled.
    */
  var startDate: js.UndefOr[Date | String] = js.native
  
  /**
    * The start view when initialized.
    *
    * Default: `0`
    *
    * Options:
    * * `0`: days
    * * `1`: months
    * * `2`: years
    */
  var startView: js.UndefOr[`0` | `1` | `2`] = js.native
  
  /**
    * The template of the datepicker.
    *
    * Default:
    * ```
    * <div class="datepicker-container">
    *   <div class="datepicker-panel" data-view="years picker">
    *     <ul>
    *     <li data-view="years prev">&lsaquo;</li>
    *     <li data-view="years current"></li>
    *     <li data-view="years next">&rsaquo;</li>
    *     </ul>
    *     <ul data-view="years"></ul>
    *   </div>
    *   <div class="datepicker-panel" data-view="months picker">
    *     <ul>
    *     <li data-view="year prev">&lsaquo;</li>
    *     <li data-view="year current"></li>
    *     <li data-view="year next">&rsaquo;</li>
    *     </ul>
    *     <ul data-view="months"></ul>
    *   </div>
    *   <div class="datepicker-panel" data-view="days picker">
    *     <ul>
    *     <li data-view="month prev">&lsaquo;</li>
    *     <li data-view="month current"></li>
    *     <li data-view="month next">&rsaquo;</li>
    *     </ul>
    *     <ul data-view="week"></ul>
    *     <ul data-view="days"></ul>
    *   </div>
    *  </div>
    * ```
    *
    * **Note**: All the data-view attributes must be set when you customize it.
    */
  var template: js.UndefOr[String] = js.native
  
  /**
    * A element for triggering the datepicker.
    */
  var trigger: js.UndefOr[Element | JQuery[HTMLElement] | String | Null] = js.native
  
  /**
    * The start day of the week.
    *
    * Default: `0`
    * Options:
    * * `0`: Sunday
    * * `1`: Monday
    * * `2`: Tuesday
    * * `3`: Wednesday
    * * `4`: Thursday
    * * `5`: Friday
    * * `6`: Saturday
    */
  var weekStart: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  
  /**
    * Show year before month on the datepicker header.
    *
    * Default: `false`
    */
  var yearFirst: js.UndefOr[Boolean] = js.native
  
  /**
    * A string suffix to the year number.
    */
  var yearSuffix: js.UndefOr[String] = js.native
  
  /**
    * The CSS `z-index` style for the datepicker.
    *
    * Default: `1`
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object DatepickerOptions {
  
  @scala.inline
  def apply(): DatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerOptions]
  }
  
  @scala.inline
  implicit class DatepickerOptionsOps[Self <: DatepickerOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    
    @scala.inline
    def setAutoPick(value: Boolean): Self = this.set("autoPick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPick: Self = this.set("autoPick", js.undefined)
    
    @scala.inline
    def setAutoShow(value: Boolean): Self = this.set("autoShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoShow: Self = this.set("autoShow", js.undefined)
    
    @scala.inline
    def setContainer(value: Element | JQuery[HTMLElement] | String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
    @scala.inline
    def setDate(value: Date | String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDaysVarargs(value: String*): Self = this.set("days", js.Array(value :_*))
    
    @scala.inline
    def setDays(value: js.Array[String]): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    
    @scala.inline
    def setDaysMinVarargs(value: String*): Self = this.set("daysMin", js.Array(value :_*))
    
    @scala.inline
    def setDaysMin(value: js.Array[String]): Self = this.set("daysMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysMin: Self = this.set("daysMin", js.undefined)
    
    @scala.inline
    def setDaysShortVarargs(value: String*): Self = this.set("daysShort", js.Array(value :_*))
    
    @scala.inline
    def setDaysShort(value: js.Array[String]): Self = this.set("daysShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysShort: Self = this.set("daysShort", js.undefined)
    
    @scala.inline
    def setDisabledClass(value: String): Self = this.set("disabledClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledClass: Self = this.set("disabledClass", js.undefined)
    
    @scala.inline
    def setEndDate(value: Date | String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* date */ Date, /* view */ day | month | year) => js.UndefOr[Boolean]): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHide(value: /* event */ DatePickerEvent => Unit): Self = this.set("hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setHighlightedClass(value: String): Self = this.set("highlightedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightedClass: Self = this.set("highlightedClass", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setItemTag(value: String): Self = this.set("itemTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTag: Self = this.set("itemTag", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setMonthsShortVarargs(value: String*): Self = this.set("monthsShort", js.Array(value :_*))
    
    @scala.inline
    def setMonthsShort(value: js.Array[String]): Self = this.set("monthsShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthsShort: Self = this.set("monthsShort", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPick(value: /* event */ DatePickerEvent => Unit): Self = this.set("pick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePick: Self = this.set("pick", js.undefined)
    
    @scala.inline
    def setPickedClass(value: String): Self = this.set("pickedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickedClass: Self = this.set("pickedClass", js.undefined)
    
    @scala.inline
    def setShow(value: /* event */ DatePickerEvent => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date | String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setStartView(value: `0` | `1` | `2`): Self = this.set("startView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartView: Self = this.set("startView", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTrigger(value: Element | JQuery[HTMLElement] | String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setTriggerNull: Self = this.set("trigger", null)
    
    @scala.inline
    def setWeekStart(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("weekStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekStart: Self = this.set("weekStart", js.undefined)
    
    @scala.inline
    def setYearFirst(value: Boolean): Self = this.set("yearFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearFirst: Self = this.set("yearFirst", js.undefined)
    
    @scala.inline
    def setYearSuffix(value: String): Self = this.set("yearSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearSuffix: Self = this.set("yearSuffix", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
