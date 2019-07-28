package typings.calDashHeatmap.calDashHeatmapMod.Global.CalHeatMapNs

import typings.std.Date
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  /** Called after drawing the empty calendar, and before filling it with data. */
  var afterLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  			 * Called after getting the data from source, but before filling the calendar.
  			 * This callback must return a json object formatted in the expected data format.
  			 * afterLoadData() is used to do some works on the data, especially when the data source is not returning data in the expected format.
  			 */
  var afterLoadData: js.UndefOr[js.Function1[/* data */ js.Any, DataFormat]] = js.undefined
  /**
  			 * Called after shifting the calendar one domain forward.
  			 * The date argument is the start date of the domain that was added.
  			 */
  var afterLoadNextDomain: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.undefined
  /**
  			 * Called after shifting the calendar one domain back.
  			 * The date argument is the start date of the domain that was added.
  			 */
  var afterLoadPreviousDomain: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.undefined
  // ================================================
  // Other
  // ================================================
  /** Animation duration, in milliseconds. Default value: 500 */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /** Space between each subDomain cell, in pixel. Default: 2 */
  var cellPadding: js.UndefOr[Double] = js.undefined
  /** subDomain cell's border radius, for rounder corner, in pixel. Default: 0 */
  var cellRadius: js.UndefOr[Double] = js.undefined
  /** Size of each subDomain cell, in pixels. Default: 10 */
  var cellSize: js.UndefOr[Double] = js.undefined
  /**
  			 * Control the number of columns to split the domain dates into. Default: null
  			 * Each domain is split into an arbitrary number of columns (or rows depending on the
  			 * reading direction). You can overwrite that number with colLimit, and force all dates on the
  			 * same line, or split them into more columns.
  			 * That setting limit the maximum number of columns, and doesn't necessary means that each rows will
  			 * contains that number of columns.
  			 */
  var colLimit: js.UndefOr[Double] = js.undefined
  /**
  			 * Whether to consider missing date:value couple in the data source as equal to 0.  Default: false
  			 * By default, when the a date is not associated to a value, it's considered as null, and rendered as a no value cell.
  			 * You should ask yourself, if the API is not returning result for a date, is it because there is really no value
  			 * associated to this date, or because it's supposed to be equal to 0, and it's skipped in order to save bandwidth ?
  			 */
  var considerMissingDataAsZero: js.UndefOr[Boolean] = js.undefined
  /**
  			 * Data used to fill the calendar. Default: ""
  			 * String is interpreted as a URL to an API, which should be returning the data used to fill the calendar.
  			 */
  var data: js.UndefOr[String | js.Object] = js.undefined
  /**
  			 * Engine used to parse the data. Default: json
  			 * Valid values:
  			 *  "json" - Interpret the data as json.
  			 *  "csv"  - Interpret the data as csv.
  			 *  "tsv"  - Interpret the data exactly like csv, but are delimited with a tab character, instead of comma.
  			 *  "txt"  - Just return the data as a string.
  			 */
  var dataType: js.UndefOr[String] = js.undefined
  /** Whether to display the legend. Default: true */
  var displayLegend: js.UndefOr[Boolean] = js.undefined
  /**
  			 * Type of domain. Default: "hour"
  			 * Valid domains: {"hour", "day", "week", "month", "year"}
  			 */
  var domain: js.UndefOr[String] = js.undefined
  /**
  			 * Whether to enable domain dynamic width and height. Default: true
  			 * Some domain>subdomain couple, like month>days, doesn't always have the same number of
  			 * subDomain cells. Some months have 6 weeks, some only 4.
  			 * With dynamic dimension enabled, the domain width and height will be adjusted to fit the
  			 * domain content, whereas when it's disabled, all domains will have the same dimension : the biggest.
  			 */
  var domainDynamicDimension: js.UndefOr[Boolean] = js.undefined
  /** Space between each domain, in pixel. Default: 2 */
  var domainGutter: js.UndefOr[Double] = js.undefined
  /**
  			 * Format of the domain label.
  			 * Works exactly like subDomainDateFormat, and will format the domain label with any string accepted by d3.time.format(), or a function.
  			 * To not display the domain label, set domainLabelFormat to "" (empty string).
  			 */
  var domainLabelFormat: js.UndefOr[String | js.Function] = js.undefined
  /**
  			 * Margin around each domain, in pixel. Default: [0,0,0,0]
  			 * Ordered like in CSS (top, right, bottom, left), it also accepts CSS like values
  			 */
  var domainMargin: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
  			 * Highlight selected subDomain cells. Default: false
  			 * Takes an array of Date object. Can also accepts the now string, equivalent to Date.now().
  			 */
  var highlight: js.UndefOr[String | (js.Array[_ | Date | String])] = js.undefined
  // ================================================
  // i18n
  // ================================================
  /**
  			 * Name of the entity you're representing on the calendar.
  			 * Takes an array of string, with the first index as the singular form, and the second index the plural form.
  			 * For the lazy, you can also pass a simple string, ar a single element array, and it'll automatically guess
  			 * the plural form, as long as it's the singular form plus the "s" suffix.
  			 */
  var itemName: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
  			 * The calendar instance namespace.
  			 * If you have more than one instance of Cal-Heatmap, you should assign each instance its own namespace, in order to isolate each instance event handler.
  			 */
  var itemNamespace: js.UndefOr[String] = js.undefined
  // ================================================
  // Presentation
  // ================================================
  /** DOM node to insert the calendar in. Default: "#cal-heatmap" */
  var itemSelector: js.UndefOr[String | HTMLElement | Element | EventTarget] = js.undefined
  /** Position and alignment of the domain label. */
  var label: js.UndefOr[Label] = js.undefined
  // ================================================
  // Legend
  // ================================================
  /** Assign each range of values to a color. Default: [10, 20, 30, 40] */
  var legend: js.UndefOr[js.Array[Double]] = js.undefined
  /** Padding between each legend cell, in pixels. Default: 2 */
  var legendCellPadding: js.UndefOr[Double] = js.undefined
  /** Size of the legend cells, in pixels. Default: 10 */
  var legendCellSize: js.UndefOr[Double] = js.undefined
  /**
  			 * Set of colors to automagically compute the heatmap colors.
  			 * Instead of relying on the CSS for your heatmap's colors, you can also set the heatmap's colors directly with
  			 * cal-heatmap on initialization, or even dynamically change them after.
  			 * All legend settings can be changed dynamically after calendar initialisation, with setLegend().
  			 */
  var legendColors: js.UndefOr[LegendColor | js.Array[String]] = js.undefined
  /**
  			 * Horizontal position of the legend. Default: "left"
  			 * Valid values:
  			 *  "left"   - Align the legend to the left
  			 *  "center" - Center the legend
  			 *  "right"  - Align the legend to the right
  			 */
  var legendHorizontalPosition: js.UndefOr[String] = js.undefined
  /** Margin around the legend, in pixels. Default: [10, 0, 0, 0] */
  var legendMargin: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
  			 * Orientation of the legend. Default: "horizontal"
  			 * legendOrientation is best used together with legendHorizontalPosition when the legend is positioned on the side.
  			 * Valid values:
  			 *  "horizontal" - Legend is displayed horizontally, from left to right
  			 *  "vertical"   - Legend is displayed vertically, from top to bottom
  			 */
  var legendOrientation: js.UndefOr[String] = js.undefined
  /**
  			 * Formatting of the legend title, displayed when hovering a legend cell.
  			 * Some template strings are available, and enclosed in braces.
  			 *  {name}  Name of the entity represented in the calendar (see itemName)
  			 *  {min}   The first value of the legend array.
  			 *  {max}   The last value of the legend array.
  			 *  {down}  The lower bound of a color
  			 *  {up}    The upper bound of a color
  			 */
  var legendTitleFormat: js.UndefOr[LegendTitleTemplates] = js.undefined
  /**
  			 * Vertical position of the legend. Default: "bottom"
  			 * Valid values:
  			 *  "top"    - Place the legend above the calendar
  			 *  "center" - Place the legend on the calendar's side
  			 *             Use with legendHorizontalPosition, to position the legend on the left (default) or on the right.
  			 *  "bottom" - Place the legend on below the calendar
  			 */
  var legendVerticalPosition: js.UndefOr[String] = js.undefined
  /** Upper limit of the domain navigation, preventing navigating beyond a certain date. Default: null */
  var maxDate: js.UndefOr[Date] = js.undefined
  /**
  			 * Lower limit of the domain navigation, preventing navigating beyond a certain date. Default: null
  			 * When set, calling previous() will only work only until the leftmost domain containing minDate.
  			 * Like with start, minDate does not have to be precise, and just have to be a date inside the domain.
  			 * previous() will always return true, unless the domain containing minDate is reached, in which case, it'll return false.
  			 */
  var minDate: js.UndefOr[Date] = js.undefined
  /**
  			 * Will attach the next() event to the specified element, on a mouse click, shifting the calendar one domain forward. Default value: false
  			 * If you want to shift by more than one domain, see the next() method.
  			 */
  var nextSelector: js.UndefOr[String | HTMLElement] = js.undefined
  // ================================================
  // Events
  // ================================================
  /** Called after a mouse click event on a subDomain cell. */
  var onClick: js.UndefOr[js.Function2[/* date */ Date, /* value */ Double, Unit]] = js.undefined
  /**
  			 * Called after drawing and filling the calendar.
  			 * Useful in case you're loading data via ajax, as it's loading data asynchronously. This event will wait for the ajax
  			 * request to complete before triggering.
  			 * This event will only trigger once, on the initial setup. See afterLoadPreviousDomain and afterLoadNextDomain for
  			 * callback events after a domain navigation.
  			 */
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  			 * Triggered after next(), when the incoming domain is containing maxDate.
  			 * See onMinDomainReached().
  			 */
  var onMaxDomainReached: js.UndefOr[js.Function1[/* reached */ Boolean, Unit]] = js.undefined
  /**
  			 * Triggered after previous(), when the incoming domain is containing minDate.
  			 * When the leftmost domain set by minDate is loaded into the calendar, onMinDomainReached() will be triggered with true as argument.
  			 * This event is useful if you want to disable your previous button, since there is no more previous domains to load.
  			 * In order to reverse the action, onMinDomainReached() will be called with false as argument afer next(), only once, and only if the
  			 * leftmost domain is not the lower limit domain anymore.
  			 */
  var onMinDomainReached: js.UndefOr[js.Function1[/* reached */ Boolean, Unit]] = js.undefined
  /**
  			 * Will attach the previous() event to the specified element, on a mouse click, shifting the calendar one domain back. Default value: false
  			 * If you want to shift by more than one domain, see the previous() method.
  			 */
  var previousSelector: js.UndefOr[String | HTMLElement] = js.undefined
  /** Number of domain to display. Default: 12 */
  var range: js.UndefOr[Double] = js.undefined
  /** Control the number of rows to split the domain dates into. Default: null
  			 * If rowLimit and colLimit are both used, rowLimit will be ignored. */
  var rowLimit: js.UndefOr[Double] = js.undefined
  // ================================================
  // Data
  // ================================================
  /**
  			 * Starting date of the calendar. Default: new Date()
  			 * It doesn't have to be precise, the calendar will not start at that date, but at the first domain containing that date.
  			 */
  var start: js.UndefOr[Date] = js.undefined
  /**
  			 * Type of subDomain. Default: "min"
  			 * Valid subDomains: {"min", "x_min", "hour", "x_hour", "day", "x_day", "week", "x_week", "month", "x_month"}
  			 */
  var subDomain: js.UndefOr[String] = js.undefined
  /**
  			 * Format of the {date} template string inside subDomainTitleFormat.
  			 * {date} is by default formatted according to the subDomain type.
  			 * subDomainFormat can accept any string with directive accepted by d3.time.format(), like "%Y-%m-%d".
  			 * As d3.time.format() will only output English dates, subDomainDateFormat can also accept a function,
  			 * with the subDomain date as the argument.
  			 */
  var subDomainDateFormat: js.UndefOr[String | js.Function] = js.undefined
  /**
  			 * Format of the text inside a subDomain cell.
  			 * Disabled by default, you can display a text inside each subDomain cell.
  			 * Works exactly like subDomainDateFormat, except that the function takes the cell value as second argument.
  			 */
  var subDomainTextFormat: js.UndefOr[String | js.Function] = js.undefined
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
  var subDomainTitleFormat: js.UndefOr[SubDomainFormatTemplates] = js.undefined
  /** Whether to display a tooltip when hovering over a date. Default: false */
  var tooltip: js.UndefOr[Boolean] = js.undefined
  /** To display the calendar vertically, with each domain one under the other. Default: false */
  var verticalOrientation: js.UndefOr[Boolean] = js.undefined
  /** Whether to start the week on Monday, instead of Sunday. Default: true */
  var weekStartOnMonday: js.UndefOr[Boolean] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    afterLoad: () => Unit = null,
    afterLoadData: /* data */ js.Any => DataFormat = null,
    afterLoadNextDomain: /* date */ Date => Unit = null,
    afterLoadPreviousDomain: /* date */ Date => Unit = null,
    animationDuration: Int | Double = null,
    cellPadding: Int | Double = null,
    cellRadius: Int | Double = null,
    cellSize: Int | Double = null,
    colLimit: Int | Double = null,
    considerMissingDataAsZero: js.UndefOr[Boolean] = js.undefined,
    data: String | js.Object = null,
    dataType: String = null,
    displayLegend: js.UndefOr[Boolean] = js.undefined,
    domain: String = null,
    domainDynamicDimension: js.UndefOr[Boolean] = js.undefined,
    domainGutter: Int | Double = null,
    domainLabelFormat: String | js.Function = null,
    domainMargin: Double | js.Array[Double] = null,
    highlight: String | (js.Array[_ | Date | String]) = null,
    itemName: String | js.Array[String] = null,
    itemNamespace: String = null,
    itemSelector: String | HTMLElement | Element | EventTarget = null,
    label: Label = null,
    legend: js.Array[Double] = null,
    legendCellPadding: Int | Double = null,
    legendCellSize: Int | Double = null,
    legendColors: LegendColor | js.Array[String] = null,
    legendHorizontalPosition: String = null,
    legendMargin: Double | js.Array[Double] = null,
    legendOrientation: String = null,
    legendTitleFormat: LegendTitleTemplates = null,
    legendVerticalPosition: String = null,
    maxDate: Date = null,
    minDate: Date = null,
    nextSelector: String | HTMLElement = null,
    onClick: (/* date */ Date, /* value */ Double) => Unit = null,
    onComplete: () => Unit = null,
    onMaxDomainReached: /* reached */ Boolean => Unit = null,
    onMinDomainReached: /* reached */ Boolean => Unit = null,
    previousSelector: String | HTMLElement = null,
    range: Int | Double = null,
    rowLimit: Int | Double = null,
    start: Date = null,
    subDomain: String = null,
    subDomainDateFormat: String | js.Function = null,
    subDomainTextFormat: String | js.Function = null,
    subDomainTitleFormat: SubDomainFormatTemplates = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    verticalOrientation: js.UndefOr[Boolean] = js.undefined,
    weekStartOnMonday: js.UndefOr[Boolean] = js.undefined
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(js.Any.fromFunction0(afterLoad))
    if (afterLoadData != null) __obj.updateDynamic("afterLoadData")(js.Any.fromFunction1(afterLoadData))
    if (afterLoadNextDomain != null) __obj.updateDynamic("afterLoadNextDomain")(js.Any.fromFunction1(afterLoadNextDomain))
    if (afterLoadPreviousDomain != null) __obj.updateDynamic("afterLoadPreviousDomain")(js.Any.fromFunction1(afterLoadPreviousDomain))
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellRadius != null) __obj.updateDynamic("cellRadius")(cellRadius.asInstanceOf[js.Any])
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (colLimit != null) __obj.updateDynamic("colLimit")(colLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(considerMissingDataAsZero)) __obj.updateDynamic("considerMissingDataAsZero")(considerMissingDataAsZero)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (!js.isUndefined(displayLegend)) __obj.updateDynamic("displayLegend")(displayLegend)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(domainDynamicDimension)) __obj.updateDynamic("domainDynamicDimension")(domainDynamicDimension)
    if (domainGutter != null) __obj.updateDynamic("domainGutter")(domainGutter.asInstanceOf[js.Any])
    if (domainLabelFormat != null) __obj.updateDynamic("domainLabelFormat")(domainLabelFormat.asInstanceOf[js.Any])
    if (domainMargin != null) __obj.updateDynamic("domainMargin")(domainMargin.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (itemName != null) __obj.updateDynamic("itemName")(itemName.asInstanceOf[js.Any])
    if (itemNamespace != null) __obj.updateDynamic("itemNamespace")(itemNamespace)
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (legendCellPadding != null) __obj.updateDynamic("legendCellPadding")(legendCellPadding.asInstanceOf[js.Any])
    if (legendCellSize != null) __obj.updateDynamic("legendCellSize")(legendCellSize.asInstanceOf[js.Any])
    if (legendColors != null) __obj.updateDynamic("legendColors")(legendColors.asInstanceOf[js.Any])
    if (legendHorizontalPosition != null) __obj.updateDynamic("legendHorizontalPosition")(legendHorizontalPosition)
    if (legendMargin != null) __obj.updateDynamic("legendMargin")(legendMargin.asInstanceOf[js.Any])
    if (legendOrientation != null) __obj.updateDynamic("legendOrientation")(legendOrientation)
    if (legendTitleFormat != null) __obj.updateDynamic("legendTitleFormat")(legendTitleFormat)
    if (legendVerticalPosition != null) __obj.updateDynamic("legendVerticalPosition")(legendVerticalPosition)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (nextSelector != null) __obj.updateDynamic("nextSelector")(nextSelector.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction0(onComplete))
    if (onMaxDomainReached != null) __obj.updateDynamic("onMaxDomainReached")(js.Any.fromFunction1(onMaxDomainReached))
    if (onMinDomainReached != null) __obj.updateDynamic("onMinDomainReached")(js.Any.fromFunction1(onMinDomainReached))
    if (previousSelector != null) __obj.updateDynamic("previousSelector")(previousSelector.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rowLimit != null) __obj.updateDynamic("rowLimit")(rowLimit.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start)
    if (subDomain != null) __obj.updateDynamic("subDomain")(subDomain)
    if (subDomainDateFormat != null) __obj.updateDynamic("subDomainDateFormat")(subDomainDateFormat.asInstanceOf[js.Any])
    if (subDomainTextFormat != null) __obj.updateDynamic("subDomainTextFormat")(subDomainTextFormat.asInstanceOf[js.Any])
    if (subDomainTitleFormat != null) __obj.updateDynamic("subDomainTitleFormat")(subDomainTitleFormat)
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(verticalOrientation)) __obj.updateDynamic("verticalOrientation")(verticalOrientation)
    if (!js.isUndefined(weekStartOnMonday)) __obj.updateDynamic("weekStartOnMonday")(weekStartOnMonday)
    __obj.asInstanceOf[InitOptions]
  }
}

