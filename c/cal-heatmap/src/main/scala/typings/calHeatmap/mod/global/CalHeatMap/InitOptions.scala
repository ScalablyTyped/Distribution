package typings.calHeatmap.mod.global.CalHeatMap

import typings.std.Date
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOptions extends js.Object {
  /** Called after drawing the empty calendar, and before filling it with data. */
  var afterLoad: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called after getting the data from source, but before filling the calendar.
    * This callback must return a json object formatted in the expected data format.
    * afterLoadData() is used to do some works on the data, especially when the data source is not returning data in the expected format.
    */
  var afterLoadData: js.UndefOr[js.Function1[/* data */ js.Any, DataFormat]] = js.native
  /**
    * Called after shifting the calendar one domain forward.
    * The date argument is the start date of the domain that was added.
    */
  var afterLoadNextDomain: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
  /**
    * Called after shifting the calendar one domain back.
    * The date argument is the start date of the domain that was added.
    */
  var afterLoadPreviousDomain: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
  // ================================================
  // Other
  // ================================================
  /** Animation duration, in milliseconds. Default value: 500 */
  var animationDuration: js.UndefOr[Double] = js.native
  /** Space between each subDomain cell, in pixel. Default: 2 */
  var cellPadding: js.UndefOr[Double] = js.native
  /** subDomain cell's border radius, for rounder corner, in pixel. Default: 0 */
  var cellRadius: js.UndefOr[Double] = js.native
  /** Size of each subDomain cell, in pixels. Default: 10 */
  var cellSize: js.UndefOr[Double] = js.native
  /**
    * Control the number of columns to split the domain dates into. Default: null
    * Each domain is split into an arbitrary number of columns (or rows depending on the
    * reading direction). You can overwrite that number with colLimit, and force all dates on the
    * same line, or split them into more columns.
    * That setting limit the maximum number of columns, and doesn't necessary means that each rows will
    * contains that number of columns.
    */
  var colLimit: js.UndefOr[Double] = js.native
  /**
    * Whether to consider missing date:value couple in the data source as equal to 0.  Default: false
    * By default, when the a date is not associated to a value, it's considered as null, and rendered as a no value cell.
    * You should ask yourself, if the API is not returning result for a date, is it because there is really no value
    * associated to this date, or because it's supposed to be equal to 0, and it's skipped in order to save bandwidth ?
    */
  var considerMissingDataAsZero: js.UndefOr[Boolean] = js.native
  /**
    * Data used to fill the calendar. Default: ""
    * String is interpreted as a URL to an API, which should be returning the data used to fill the calendar.
    */
  var data: js.UndefOr[String | js.Object] = js.native
  /**
    * Engine used to parse the data. Default: json
    * Valid values:
    *  "json" - Interpret the data as json.
    *  "csv"  - Interpret the data as csv.
    *  "tsv"  - Interpret the data exactly like csv, but are delimited with a tab character, instead of comma.
    *  "txt"  - Just return the data as a string.
    */
  var dataType: js.UndefOr[String] = js.native
  /** Whether to display the legend. Default: true */
  var displayLegend: js.UndefOr[Boolean] = js.native
  /**
    * Type of domain. Default: "hour"
    * Valid domains: {"hour", "day", "week", "month", "year"}
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Whether to enable domain dynamic width and height. Default: true
    * Some domain>subdomain couple, like month>days, doesn't always have the same number of
    * subDomain cells. Some months have 6 weeks, some only 4.
    * With dynamic dimension enabled, the domain width and height will be adjusted to fit the
    * domain content, whereas when it's disabled, all domains will have the same dimension : the biggest.
    */
  var domainDynamicDimension: js.UndefOr[Boolean] = js.native
  /** Space between each domain, in pixel. Default: 2 */
  var domainGutter: js.UndefOr[Double] = js.native
  /**
    * Format of the domain label.
    * Works exactly like subDomainDateFormat, and will format the domain label with any string accepted by d3.time.format(), or a function.
    * To not display the domain label, set domainLabelFormat to "" (empty string).
    */
  var domainLabelFormat: js.UndefOr[String | js.Function] = js.native
  /**
    * Margin around each domain, in pixel. Default: [0,0,0,0]
    * Ordered like in CSS (top, right, bottom, left), it also accepts CSS like values
    */
  var domainMargin: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Highlight selected subDomain cells. Default: false
    * Takes an array of Date object. Can also accepts the now string, equivalent to Date.now().
    */
  var highlight: js.UndefOr[String | (js.Array[_ | Date | String])] = js.native
  // ================================================
  // i18n
  // ================================================
  /**
    * Name of the entity you're representing on the calendar.
    * Takes an array of string, with the first index as the singular form, and the second index the plural form.
    * For the lazy, you can also pass a simple string, ar a single element array, and it'll automatically guess
    * the plural form, as long as it's the singular form plus the "s" suffix.
    */
  var itemName: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The calendar instance namespace.
    * If you have more than one instance of Cal-Heatmap, you should assign each instance its own namespace, in order to isolate each instance event handler.
    */
  var itemNamespace: js.UndefOr[String] = js.native
  // ================================================
  // Presentation
  // ================================================
  /** DOM node to insert the calendar in. Default: "#cal-heatmap" */
  var itemSelector: js.UndefOr[String | HTMLElement | Element | EventTarget] = js.native
  /** Position and alignment of the domain label. */
  var label: js.UndefOr[Label] = js.native
  // ================================================
  // Legend
  // ================================================
  /** Assign each range of values to a color. Default: [10, 20, 30, 40] */
  var legend: js.UndefOr[js.Array[Double]] = js.native
  /** Padding between each legend cell, in pixels. Default: 2 */
  var legendCellPadding: js.UndefOr[Double] = js.native
  /** Size of the legend cells, in pixels. Default: 10 */
  var legendCellSize: js.UndefOr[Double] = js.native
  /**
    * Set of colors to automagically compute the heatmap colors.
    * Instead of relying on the CSS for your heatmap's colors, you can also set the heatmap's colors directly with
    * cal-heatmap on initialization, or even dynamically change them after.
    * All legend settings can be changed dynamically after calendar initialisation, with setLegend().
    */
  var legendColors: js.UndefOr[LegendColor | js.Array[String]] = js.native
  /**
    * Horizontal position of the legend. Default: "left"
    * Valid values:
    *  "left"   - Align the legend to the left
    *  "center" - Center the legend
    *  "right"  - Align the legend to the right
    */
  var legendHorizontalPosition: js.UndefOr[String] = js.native
  /** Margin around the legend, in pixels. Default: [10, 0, 0, 0] */
  var legendMargin: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Orientation of the legend. Default: "horizontal"
    * legendOrientation is best used together with legendHorizontalPosition when the legend is positioned on the side.
    * Valid values:
    *  "horizontal" - Legend is displayed horizontally, from left to right
    *  "vertical"   - Legend is displayed vertically, from top to bottom
    */
  var legendOrientation: js.UndefOr[String] = js.native
  /**
    * Formatting of the legend title, displayed when hovering a legend cell.
    * Some template strings are available, and enclosed in braces.
    *  {name}  Name of the entity represented in the calendar (see itemName)
    *  {min}   The first value of the legend array.
    *  {max}   The last value of the legend array.
    *  {down}  The lower bound of a color
    *  {up}    The upper bound of a color
    */
  var legendTitleFormat: js.UndefOr[LegendTitleTemplates] = js.native
  /**
    * Vertical position of the legend. Default: "bottom"
    * Valid values:
    *  "top"    - Place the legend above the calendar
    *  "center" - Place the legend on the calendar's side
    *             Use with legendHorizontalPosition, to position the legend on the left (default) or on the right.
    *  "bottom" - Place the legend on below the calendar
    */
  var legendVerticalPosition: js.UndefOr[String] = js.native
  /** Upper limit of the domain navigation, preventing navigating beyond a certain date. Default: null */
  var maxDate: js.UndefOr[Date] = js.native
  /**
    * Lower limit of the domain navigation, preventing navigating beyond a certain date. Default: null
    * When set, calling previous() will only work only until the leftmost domain containing minDate.
    * Like with start, minDate does not have to be precise, and just have to be a date inside the domain.
    * previous() will always return true, unless the domain containing minDate is reached, in which case, it'll return false.
    */
  var minDate: js.UndefOr[Date] = js.native
  /**
    * Will attach the next() event to the specified element, on a mouse click, shifting the calendar one domain forward. Default value: false
    * If you want to shift by more than one domain, see the next() method.
    */
  var nextSelector: js.UndefOr[String | HTMLElement] = js.native
  // ================================================
  // Events
  // ================================================
  /** Called after a mouse click event on a subDomain cell. */
  var onClick: js.UndefOr[js.Function2[/* date */ Date, /* value */ Double, Unit]] = js.native
  /**
    * Called after drawing and filling the calendar.
    * Useful in case you're loading data via ajax, as it's loading data asynchronously. This event will wait for the ajax
    * request to complete before triggering.
    * This event will only trigger once, on the initial setup. See afterLoadPreviousDomain and afterLoadNextDomain for
    * callback events after a domain navigation.
    */
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Triggered after next(), when the incoming domain is containing maxDate.
    * See onMinDomainReached().
    */
  var onMaxDomainReached: js.UndefOr[js.Function1[/* reached */ Boolean, Unit]] = js.native
  /**
    * Triggered after previous(), when the incoming domain is containing minDate.
    * When the leftmost domain set by minDate is loaded into the calendar, onMinDomainReached() will be triggered with true as argument.
    * This event is useful if you want to disable your previous button, since there is no more previous domains to load.
    * In order to reverse the action, onMinDomainReached() will be called with false as argument afer next(), only once, and only if the
    * leftmost domain is not the lower limit domain anymore.
    */
  var onMinDomainReached: js.UndefOr[js.Function1[/* reached */ Boolean, Unit]] = js.native
  /**
    * Will attach the previous() event to the specified element, on a mouse click, shifting the calendar one domain back. Default value: false
    * If you want to shift by more than one domain, see the previous() method.
    */
  var previousSelector: js.UndefOr[String | HTMLElement] = js.native
  /** Number of domain to display. Default: 12 */
  var range: js.UndefOr[Double] = js.native
  /** Control the number of rows to split the domain dates into. Default: null
    * If rowLimit and colLimit are both used, rowLimit will be ignored. */
  var rowLimit: js.UndefOr[Double] = js.native
  // ================================================
  // Data
  // ================================================
  /**
    * Starting date of the calendar. Default: new Date()
    * It doesn't have to be precise, the calendar will not start at that date, but at the first domain containing that date.
    */
  var start: js.UndefOr[Date] = js.native
  /**
    * Type of subDomain. Default: "min"
    * Valid subDomains: {"min", "x_min", "hour", "x_hour", "day", "x_day", "week", "x_week", "month", "x_month"}
    */
  var subDomain: js.UndefOr[String] = js.native
  /**
    * Format of the {date} template string inside subDomainTitleFormat.
    * {date} is by default formatted according to the subDomain type.
    * subDomainFormat can accept any string with directive accepted by d3.time.format(), like "%Y-%m-%d".
    * As d3.time.format() will only output English dates, subDomainDateFormat can also accept a function,
    * with the subDomain date as the argument.
    */
  var subDomainDateFormat: js.UndefOr[String | js.Function] = js.native
  /**
    * Format of the text inside a subDomain cell.
    * Disabled by default, you can display a text inside each subDomain cell.
    * Works exactly like subDomainDateFormat, except that the function takes the cell value as second argument.
    */
  var subDomainTextFormat: js.UndefOr[String | js.Function] = js.native
  /**
    * Format of the title displayed when hovering a subDomain.
    * Some template strings are available, and enclosed in braces.
    *  {name}       Name of the entity represented in the calendar (see itemName)
    *  {count}      The value associated to the date.
    *  {date}       The date of the cell. It's automatically formatted according to the type of subDomain.
    *               See subDomainDateFormat to further customize that date formatting.
    *  {connector}  An English preposition placed before a datetime (on Monday, at 15:00, etc.). Each subDomain
    *               have their own default connector, corresponding to the default date format.
    */
  var subDomainTitleFormat: js.UndefOr[SubDomainFormatTemplates] = js.native
  /** Whether to display a tooltip when hovering over a date. Default: false */
  var tooltip: js.UndefOr[Boolean] = js.native
  /** To display the calendar vertically, with each domain one under the other. Default: false */
  var verticalOrientation: js.UndefOr[Boolean] = js.native
  /** Whether to start the week on Monday, instead of Sunday. Default: true */
  var weekStartOnMonday: js.UndefOr[Boolean] = js.native
}

object InitOptions {
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
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
    def setAfterLoad(value: () => Unit): Self = this.set("afterLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterLoad: Self = this.set("afterLoad", js.undefined)
    @scala.inline
    def setAfterLoadData(value: /* data */ js.Any => DataFormat): Self = this.set("afterLoadData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterLoadData: Self = this.set("afterLoadData", js.undefined)
    @scala.inline
    def setAfterLoadNextDomain(value: /* date */ Date => Unit): Self = this.set("afterLoadNextDomain", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterLoadNextDomain: Self = this.set("afterLoadNextDomain", js.undefined)
    @scala.inline
    def setAfterLoadPreviousDomain(value: /* date */ Date => Unit): Self = this.set("afterLoadPreviousDomain", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterLoadPreviousDomain: Self = this.set("afterLoadPreviousDomain", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setCellPadding(value: Double): Self = this.set("cellPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellPadding: Self = this.set("cellPadding", js.undefined)
    @scala.inline
    def setCellRadius(value: Double): Self = this.set("cellRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellRadius: Self = this.set("cellRadius", js.undefined)
    @scala.inline
    def setCellSize(value: Double): Self = this.set("cellSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellSize: Self = this.set("cellSize", js.undefined)
    @scala.inline
    def setColLimit(value: Double): Self = this.set("colLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColLimit: Self = this.set("colLimit", js.undefined)
    @scala.inline
    def setConsiderMissingDataAsZero(value: Boolean): Self = this.set("considerMissingDataAsZero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsiderMissingDataAsZero: Self = this.set("considerMissingDataAsZero", js.undefined)
    @scala.inline
    def setData(value: String | js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setDisplayLegend(value: Boolean): Self = this.set("displayLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayLegend: Self = this.set("displayLegend", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setDomainDynamicDimension(value: Boolean): Self = this.set("domainDynamicDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainDynamicDimension: Self = this.set("domainDynamicDimension", js.undefined)
    @scala.inline
    def setDomainGutter(value: Double): Self = this.set("domainGutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainGutter: Self = this.set("domainGutter", js.undefined)
    @scala.inline
    def setDomainLabelFormat(value: String | js.Function): Self = this.set("domainLabelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainLabelFormat: Self = this.set("domainLabelFormat", js.undefined)
    @scala.inline
    def setDomainMarginVarargs(value: Double*): Self = this.set("domainMargin", js.Array(value :_*))
    @scala.inline
    def setDomainMargin(value: Double | js.Array[Double]): Self = this.set("domainMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainMargin: Self = this.set("domainMargin", js.undefined)
    @scala.inline
    def setHighlightVarargs(value: (js.Any | Date | String)*): Self = this.set("highlight", js.Array(value :_*))
    @scala.inline
    def setHighlight(value: String | (js.Array[_ | Date | String])): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setItemNameVarargs(value: String*): Self = this.set("itemName", js.Array(value :_*))
    @scala.inline
    def setItemName(value: String | js.Array[String]): Self = this.set("itemName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemName: Self = this.set("itemName", js.undefined)
    @scala.inline
    def setItemNamespace(value: String): Self = this.set("itemNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemNamespace: Self = this.set("itemNamespace", js.undefined)
    @scala.inline
    def setItemSelector(value: String | HTMLElement | Element | EventTarget): Self = this.set("itemSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemSelector: Self = this.set("itemSelector", js.undefined)
    @scala.inline
    def setLabel(value: Label): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLegendVarargs(value: Double*): Self = this.set("legend", js.Array(value :_*))
    @scala.inline
    def setLegend(value: js.Array[Double]): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLegendCellPadding(value: Double): Self = this.set("legendCellPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendCellPadding: Self = this.set("legendCellPadding", js.undefined)
    @scala.inline
    def setLegendCellSize(value: Double): Self = this.set("legendCellSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendCellSize: Self = this.set("legendCellSize", js.undefined)
    @scala.inline
    def setLegendColorsVarargs(value: String*): Self = this.set("legendColors", js.Array(value :_*))
    @scala.inline
    def setLegendColors(value: LegendColor | js.Array[String]): Self = this.set("legendColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendColors: Self = this.set("legendColors", js.undefined)
    @scala.inline
    def setLegendHorizontalPosition(value: String): Self = this.set("legendHorizontalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendHorizontalPosition: Self = this.set("legendHorizontalPosition", js.undefined)
    @scala.inline
    def setLegendMarginVarargs(value: Double*): Self = this.set("legendMargin", js.Array(value :_*))
    @scala.inline
    def setLegendMargin(value: Double | js.Array[Double]): Self = this.set("legendMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendMargin: Self = this.set("legendMargin", js.undefined)
    @scala.inline
    def setLegendOrientation(value: String): Self = this.set("legendOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendOrientation: Self = this.set("legendOrientation", js.undefined)
    @scala.inline
    def setLegendTitleFormat(value: LegendTitleTemplates): Self = this.set("legendTitleFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendTitleFormat: Self = this.set("legendTitleFormat", js.undefined)
    @scala.inline
    def setLegendVerticalPosition(value: String): Self = this.set("legendVerticalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendVerticalPosition: Self = this.set("legendVerticalPosition", js.undefined)
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setNextSelector(value: String | HTMLElement): Self = this.set("nextSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextSelector: Self = this.set("nextSelector", js.undefined)
    @scala.inline
    def setOnClick(value: (/* date */ Date, /* value */ Double) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnComplete(value: () => Unit): Self = this.set("onComplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnMaxDomainReached(value: /* reached */ Boolean => Unit): Self = this.set("onMaxDomainReached", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMaxDomainReached: Self = this.set("onMaxDomainReached", js.undefined)
    @scala.inline
    def setOnMinDomainReached(value: /* reached */ Boolean => Unit): Self = this.set("onMinDomainReached", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMinDomainReached: Self = this.set("onMinDomainReached", js.undefined)
    @scala.inline
    def setPreviousSelector(value: String | HTMLElement): Self = this.set("previousSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousSelector: Self = this.set("previousSelector", js.undefined)
    @scala.inline
    def setRange(value: Double): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRowLimit(value: Double): Self = this.set("rowLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowLimit: Self = this.set("rowLimit", js.undefined)
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setSubDomain(value: String): Self = this.set("subDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubDomain: Self = this.set("subDomain", js.undefined)
    @scala.inline
    def setSubDomainDateFormat(value: String | js.Function): Self = this.set("subDomainDateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubDomainDateFormat: Self = this.set("subDomainDateFormat", js.undefined)
    @scala.inline
    def setSubDomainTextFormat(value: String | js.Function): Self = this.set("subDomainTextFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubDomainTextFormat: Self = this.set("subDomainTextFormat", js.undefined)
    @scala.inline
    def setSubDomainTitleFormat(value: SubDomainFormatTemplates): Self = this.set("subDomainTitleFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubDomainTitleFormat: Self = this.set("subDomainTitleFormat", js.undefined)
    @scala.inline
    def setTooltip(value: Boolean): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setVerticalOrientation(value: Boolean): Self = this.set("verticalOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalOrientation: Self = this.set("verticalOrientation", js.undefined)
    @scala.inline
    def setWeekStartOnMonday(value: Boolean): Self = this.set("weekStartOnMonday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekStartOnMonday: Self = this.set("weekStartOnMonday", js.undefined)
  }
  
}

