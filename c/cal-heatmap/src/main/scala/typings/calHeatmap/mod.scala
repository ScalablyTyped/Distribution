package typings.calHeatmap

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object CalHeatMap extends Shortcut {
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("CalHeatMap")
      @js.native
      class ^ ()
        extends typings.calHeatmap.mod.global.CalHeatMap.CalHeatMap
      
      @JSGlobal("CalHeatMap")
      @js.native
      val ^ : CalHeatMapStatic = js.native
      @js.native
      trait CalHeatMap extends StObject {
        
        /**
          * Instead of replacing a date's value by a new one, increment it by the new value. All other dates are leaved untouched.
          * That's the one you want to use of you're populating the calendar in realtime!
          */
        var APPEND_ON_UPDATE: Double = js.native
        
        // Various update mode when using the update() API
        /** Reset the whole calendar data before inserting the new data. */
        var RESET_ALL_ON_UPDATE: Double = js.native
        
        /**
          * Update only the dates (subDomain) you pass in the data argument, replace their value by the new ones.
          * All other dates are leaved untouched.
          */
        var RESET_SINGLE_ON_UPDATE: Double = js.native
        
        /**
          * Remove the calendar from the DOM
          * Remember to self-assign the result of destroy() to your calendar instance, or it'll lead to a memory leak.
          * @param {Function} callback function that will be executed when the calendar is removed from the DOM, at the end of the animation.
          * @returns always returns null.
          */
        def destroy(): typings.calHeatmap.mod.global.CalHeatMap.CalHeatMap = js.native
        def destroy(callback: js.Function): typings.calHeatmap.mod.global.CalHeatMap.CalHeatMap = js.native
        
        /**
          * Return the SVG source code with the appropriate CSS
          * The returned string code is valid and ready to be placed in a .svg file.
          * @returns SVG source code with the appropriate CSS.
          */
        def getSVG(): String = js.native
        
        /**
          * Change the highlighted dates.
          * Takes an array of Date object. Can also accepts the now string, equivalent to Date.now().
          * @param {string|Date|Date[]} dates The date or dates to highlight.
          */
        def highlight(dates: String): Unit = js.native
        def highlight(dates: js.Array[Date]): Unit = js.native
        def highlight(dates: Date): Unit = js.native
        
        /**
          * Initialise the CalHeatMap with the specified options
          * @param {InitOptions} options The CalHeatMap options
          */
        def init(): Unit = js.native
        def init(options: InitOptions): Unit = js.native
        
        /**
          * Jump the calendar to the specified date
          * This method will shift the calendar backward or forward, until the domain containing the specified date is visible.
          * @param {Date} date The date to jump to.
          * @param {boolean} reset Whether to set the domain with the specified as the calendar's first domain.
          */
        def jumpTo(date: Date): Unit = js.native
        def jumpTo(date: Date, reset: Boolean): Unit = js.native
        
        /**
          * Shift the calendar n domains forward
          * @param {number} n The number of domains to shift forward. The default is 1.
          */
        def next(): Unit = js.native
        def next(n: Double): Unit = js.native
        
        var options: RuntimeOptions = js.native
        
        /**
          * Shift the calendar n domains back
          * @param {number} n The number of domains to shift back. The default is 1.
          */
        def previous(): Unit = js.native
        def previous(n: Double): Unit = js.native
        
        /**
          * Remove the legend from the calendar
          * Settings are kept and you can re-add the legend with the same settings using showLegend().
          */
        def removeLegend(): Unit = js.native
        
        /** Reset the calendar back to the start date */
        def rewind(): Unit = js.native
        
        /**
          * Change the legend settings and/or threshold
          * When called without arguments, setLegend() will just redraw the legend.
          * @param {} legend Same as legend : an array of thresholds
          * @param {} legendColor Same as legendColors : an object with the heatmap's colors, or an array of 2 colors
          */
        def setLegend(): Unit = js.native
        def setLegend(legend: js.UndefOr[scala.Nothing], legendColors: js.Array[String]): Unit = js.native
        def setLegend(legend: js.UndefOr[scala.Nothing], legendColors: LegendColor): Unit = js.native
        def setLegend(legend: js.Array[Double]): Unit = js.native
        def setLegend(legend: js.Array[Double], legendColors: js.Array[String]): Unit = js.native
        def setLegend(legend: js.Array[Double], legendColors: LegendColor): Unit = js.native
        
        /** Display the legend, if not already shown. */
        def showLegend(): Unit = js.native
        
        /**
          * Update the calendar with new data
          * Use update() when you want to refresh the calendar with a new set of data.
          * Particularly useful if you're filling the calendar in realtime, or if you want to display a subset of the current data.
          * @param {string|Object} data Accept the same format as the data option.
          * @param {} afterLoad Whether to execute the afterLoad() callback to convert your data into the json object, expected by cal-heatmap.
          *                     It can also directly takes a function, in case your data can not be converted with the afterLoad() function you defined.
          * @param {} updateMode Define how to insert the new data into the calendar.
          *                      Accepted values are:
          *                        Instance.RESET_ALL_ON_UPDATE  (default) Reset the whole calendar data before inserting the new data.
          *                        Instance.RESET_SINGLE_ON_UPDATE  Update only the dates (subDomain) you pass in the data argument,
          *                                                         replace their value by the new ones. All other dates are leaved untouched.
          *                        Instance.APPEND_ON_UPDATE  Instead of replacing a date's value by a new one, increment it by the new value.
          *                                                   All other dates are leaved untouched. That's the one you want to use of you're
          *                                                   populating the calendar in realtime!
          */
        def update(data: String): Unit = js.native
        def update(data: String, afterLoad: js.UndefOr[scala.Nothing], updateMode: Double): Unit = js.native
        def update(data: String, afterLoad: js.Function): Unit = js.native
        def update(data: String, afterLoad: js.Function, updateMode: Double): Unit = js.native
        def update(data: String, afterLoad: Boolean): Unit = js.native
        def update(data: String, afterLoad: Boolean, updateMode: Double): Unit = js.native
        def update(data: js.Object): Unit = js.native
        def update(data: js.Object, afterLoad: js.UndefOr[scala.Nothing], updateMode: Double): Unit = js.native
        def update(data: js.Object, afterLoad: js.Function): Unit = js.native
        def update(data: js.Object, afterLoad: js.Function, updateMode: Double): Unit = js.native
        def update(data: js.Object, afterLoad: Boolean): Unit = js.native
        def update(data: js.Object, afterLoad: Boolean, updateMode: Double): Unit = js.native
      }
      
      @js.native
      trait CalHeatMapStatic
        extends Instantiable0[typings.calHeatmap.mod.global.CalHeatMap.CalHeatMap]
      
      type DataFormat = /** timestamp are in seconds, value can be any number (integer or float) */
      StringDictionary[Double]
      
      @js.native
      trait InitOptions extends StObject {
        
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
        implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAfterLoad(value: () => Unit): Self = StObject.set(x, "afterLoad", js.Any.fromFunction0(value))
          
          @scala.inline
          def setAfterLoadData(value: /* data */ js.Any => DataFormat): Self = StObject.set(x, "afterLoadData", js.Any.fromFunction1(value))
          
          @scala.inline
          def setAfterLoadDataUndefined: Self = StObject.set(x, "afterLoadData", js.undefined)
          
          @scala.inline
          def setAfterLoadNextDomain(value: /* date */ Date => Unit): Self = StObject.set(x, "afterLoadNextDomain", js.Any.fromFunction1(value))
          
          @scala.inline
          def setAfterLoadNextDomainUndefined: Self = StObject.set(x, "afterLoadNextDomain", js.undefined)
          
          @scala.inline
          def setAfterLoadPreviousDomain(value: /* date */ Date => Unit): Self = StObject.set(x, "afterLoadPreviousDomain", js.Any.fromFunction1(value))
          
          @scala.inline
          def setAfterLoadPreviousDomainUndefined: Self = StObject.set(x, "afterLoadPreviousDomain", js.undefined)
          
          @scala.inline
          def setAfterLoadUndefined: Self = StObject.set(x, "afterLoad", js.undefined)
          
          @scala.inline
          def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
          
          @scala.inline
          def setCellPadding(value: Double): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
          
          @scala.inline
          def setCellRadius(value: Double): Self = StObject.set(x, "cellRadius", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCellRadiusUndefined: Self = StObject.set(x, "cellRadius", js.undefined)
          
          @scala.inline
          def setCellSize(value: Double): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCellSizeUndefined: Self = StObject.set(x, "cellSize", js.undefined)
          
          @scala.inline
          def setColLimit(value: Double): Self = StObject.set(x, "colLimit", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColLimitUndefined: Self = StObject.set(x, "colLimit", js.undefined)
          
          @scala.inline
          def setConsiderMissingDataAsZero(value: Boolean): Self = StObject.set(x, "considerMissingDataAsZero", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setConsiderMissingDataAsZeroUndefined: Self = StObject.set(x, "considerMissingDataAsZero", js.undefined)
          
          @scala.inline
          def setData(value: String | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
          
          @scala.inline
          def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
          
          @scala.inline
          def setDisplayLegend(value: Boolean): Self = StObject.set(x, "displayLegend", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisplayLegendUndefined: Self = StObject.set(x, "displayLegend", js.undefined)
          
          @scala.inline
          def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDomainDynamicDimension(value: Boolean): Self = StObject.set(x, "domainDynamicDimension", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDomainDynamicDimensionUndefined: Self = StObject.set(x, "domainDynamicDimension", js.undefined)
          
          @scala.inline
          def setDomainGutter(value: Double): Self = StObject.set(x, "domainGutter", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDomainGutterUndefined: Self = StObject.set(x, "domainGutter", js.undefined)
          
          @scala.inline
          def setDomainLabelFormat(value: String | js.Function): Self = StObject.set(x, "domainLabelFormat", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDomainLabelFormatUndefined: Self = StObject.set(x, "domainLabelFormat", js.undefined)
          
          @scala.inline
          def setDomainMargin(value: Double | js.Array[Double]): Self = StObject.set(x, "domainMargin", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDomainMarginUndefined: Self = StObject.set(x, "domainMargin", js.undefined)
          
          @scala.inline
          def setDomainMarginVarargs(value: Double*): Self = StObject.set(x, "domainMargin", js.Array(value :_*))
          
          @scala.inline
          def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
          
          @scala.inline
          def setHighlight(value: String | (js.Array[_ | Date | String])): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
          
          @scala.inline
          def setHighlightVarargs(value: (js.Any | Date | String)*): Self = StObject.set(x, "highlight", js.Array(value :_*))
          
          @scala.inline
          def setItemName(value: String | js.Array[String]): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setItemNameUndefined: Self = StObject.set(x, "itemName", js.undefined)
          
          @scala.inline
          def setItemNameVarargs(value: String*): Self = StObject.set(x, "itemName", js.Array(value :_*))
          
          @scala.inline
          def setItemNamespace(value: String): Self = StObject.set(x, "itemNamespace", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setItemNamespaceUndefined: Self = StObject.set(x, "itemNamespace", js.undefined)
          
          @scala.inline
          def setItemSelector(value: String | HTMLElement | Element | EventTarget): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
          
          @scala.inline
          def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
          
          @scala.inline
          def setLegend(value: js.Array[Double]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLegendCellPadding(value: Double): Self = StObject.set(x, "legendCellPadding", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLegendCellPaddingUndefined: Self = StObject.set(x, "legendCellPadding", js.undefined)
          
          @scala.inline
          def setLegendCellSize(value: Double): Self = StObject.set(x, "legendCellSize", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLegendCellSizeUndefined: Self = StObject.set(x, "legendCellSize", js.undefined)
          
          @scala.inline
          def setLegendColors(value: LegendColor | js.Array[String]): Self = StObject.set(x, "legendColors", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLegendColorsUndefined: Self = StObject.set(x, "legendColors", js.undefined)
          
          @scala.inline
          def setLegendColorsVarargs(value: String*): Self = StObject.set(x, "legendColors", js.Array(value :_*))
          
          @scala.inline
          def setLegendHorizontalPosition(value: String): Self = StObject.set(x, "legendHorizontalPosition", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLegendHorizontalPositionUndefined: Self = StObject.set(x, "legendHorizontalPosition", js.undefined)
          
          @scala.inline
          def setLegendMargin(value: Double | js.Array[Double]): Self = StObject.set(x, "legendMargin", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLegendMarginUndefined: Self = StObject.set(x, "legendMargin", js.undefined)
          
          @scala.inline
          def setLegendMarginVarargs(value: Double*): Self = StObject.set(x, "legendMargin", js.Array(value :_*))
          
          @scala.inline
          def setLegendOrientation(value: String): Self = StObject.set(x, "legendOrientation", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLegendOrientationUndefined: Self = StObject.set(x, "legendOrientation", js.undefined)
          
          @scala.inline
          def setLegendTitleFormat(value: LegendTitleTemplates): Self = StObject.set(x, "legendTitleFormat", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLegendTitleFormatUndefined: Self = StObject.set(x, "legendTitleFormat", js.undefined)
          
          @scala.inline
          def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
          
          @scala.inline
          def setLegendVarargs(value: Double*): Self = StObject.set(x, "legend", js.Array(value :_*))
          
          @scala.inline
          def setLegendVerticalPosition(value: String): Self = StObject.set(x, "legendVerticalPosition", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLegendVerticalPositionUndefined: Self = StObject.set(x, "legendVerticalPosition", js.undefined)
          
          @scala.inline
          def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
          
          @scala.inline
          def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
          
          @scala.inline
          def setNextSelector(value: String | HTMLElement): Self = StObject.set(x, "nextSelector", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextSelectorUndefined: Self = StObject.set(x, "nextSelector", js.undefined)
          
          @scala.inline
          def setOnClick(value: (/* date */ Date, /* value */ Double) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
          
          @scala.inline
          def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
          
          @scala.inline
          def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
          
          @scala.inline
          def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
          
          @scala.inline
          def setOnMaxDomainReached(value: /* reached */ Boolean => Unit): Self = StObject.set(x, "onMaxDomainReached", js.Any.fromFunction1(value))
          
          @scala.inline
          def setOnMaxDomainReachedUndefined: Self = StObject.set(x, "onMaxDomainReached", js.undefined)
          
          @scala.inline
          def setOnMinDomainReached(value: /* reached */ Boolean => Unit): Self = StObject.set(x, "onMinDomainReached", js.Any.fromFunction1(value))
          
          @scala.inline
          def setOnMinDomainReachedUndefined: Self = StObject.set(x, "onMinDomainReached", js.undefined)
          
          @scala.inline
          def setPreviousSelector(value: String | HTMLElement): Self = StObject.set(x, "previousSelector", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPreviousSelectorUndefined: Self = StObject.set(x, "previousSelector", js.undefined)
          
          @scala.inline
          def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
          
          @scala.inline
          def setRowLimit(value: Double): Self = StObject.set(x, "rowLimit", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRowLimitUndefined: Self = StObject.set(x, "rowLimit", js.undefined)
          
          @scala.inline
          def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
          
          @scala.inline
          def setSubDomain(value: String): Self = StObject.set(x, "subDomain", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSubDomainDateFormat(value: String | js.Function): Self = StObject.set(x, "subDomainDateFormat", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSubDomainDateFormatUndefined: Self = StObject.set(x, "subDomainDateFormat", js.undefined)
          
          @scala.inline
          def setSubDomainTextFormat(value: String | js.Function): Self = StObject.set(x, "subDomainTextFormat", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSubDomainTextFormatUndefined: Self = StObject.set(x, "subDomainTextFormat", js.undefined)
          
          @scala.inline
          def setSubDomainTitleFormat(value: SubDomainFormatTemplates): Self = StObject.set(x, "subDomainTitleFormat", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSubDomainTitleFormatUndefined: Self = StObject.set(x, "subDomainTitleFormat", js.undefined)
          
          @scala.inline
          def setSubDomainUndefined: Self = StObject.set(x, "subDomain", js.undefined)
          
          @scala.inline
          def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
          
          @scala.inline
          def setVerticalOrientation(value: Boolean): Self = StObject.set(x, "verticalOrientation", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVerticalOrientationUndefined: Self = StObject.set(x, "verticalOrientation", js.undefined)
          
          @scala.inline
          def setWeekStartOnMonday(value: Boolean): Self = StObject.set(x, "weekStartOnMonday", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWeekStartOnMondayUndefined: Self = StObject.set(x, "weekStartOnMonday", js.undefined)
        }
      }
      
      /** Position and alignment of the domain label. */
      @js.native
      trait Label extends StObject {
        
        /**
          * Horizontal align of the domain. Default: "center"
          * Valid values: {"left", "center", "right"}
          */
        var align: js.UndefOr[String] = js.native
        
        /**
          * Height of the domain label in pixels.
          * By leaving it to null, the label will be set to 2 times the height of the subDomain cell.
          * If you want to remove the label, set domainLabelFormat to "" (empty string), instead
          * of setting the label height to 0. Default: null
          * Valid values: any integer
          */
        var height: js.UndefOr[Double] = js.native
        
        /**
          * More control about label positioning, if the default value does not fit your need,
          * especially when label is rotated, or when using a big font-size. Default: {x:0, y:0}
          */
        var offset: js.UndefOr[LabelOffset] = js.native
        
        /**
          * Position of the label, relative to the domain. Default: "bottom"
          * Valid values: {"top", "right", "bottom", "left"}
          */
        var position: js.UndefOr[String] = js.native
        
        /**
          * Rotation for a vertical label. Default: null
          * Valid values: {null, "left", "right"}
          */
        var rotate: js.UndefOr[String] = js.native
        
        /**
          * Only used when label is rotated, defines the width of the label. Default: 100
          * Valid values: any intger
          */
        var width: js.UndefOr[Double] = js.native
      }
      object Label {
        
        @scala.inline
        def apply(): Label = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Label]
        }
        
        @scala.inline
        implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
          
          @scala.inline
          def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
          
          @scala.inline
          def setOffset(value: LabelOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
          
          @scala.inline
          def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
          
          @scala.inline
          def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
          
          @scala.inline
          def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        }
      }
      
      @js.native
      trait LabelOffset extends StObject {
        
        var x: Double = js.native
        
        var y: Double = js.native
      }
      object LabelOffset {
        
        @scala.inline
        def apply(x: Double, y: Double): LabelOffset = {
          val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
          __obj.asInstanceOf[LabelOffset]
        }
        
        @scala.inline
        implicit class LabelOffsetMutableBuilder[Self <: LabelOffset] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait LegendColor extends StObject {
        
        /** Base color of the date cells */
        var base: js.UndefOr[String] = js.native
        
        /** Color for the dates with value == 0 */
        var empty: js.UndefOr[String] = js.native
        
        /** Color of the highest value on the legend */
        var max: String = js.native
        
        /** Color of the smallest value on the legend */
        var min: String = js.native
        
        /** Color for the special value */
        var overflow: js.UndefOr[String] = js.native
      }
      object LegendColor {
        
        @scala.inline
        def apply(max: String, min: String): LegendColor = {
          val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
          __obj.asInstanceOf[LegendColor]
        }
        
        @scala.inline
        implicit class LegendColorMutableBuilder[Self <: LegendColor] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
          
          @scala.inline
          def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
          
          @scala.inline
          def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
        }
      }
      
      @js.native
      trait LegendTitleTemplates extends StObject {
        
        /** Formatting of all the value but the first and the last. Default value: "between {down} and {up} {name}" */
        var inner: js.UndefOr[String] = js.native
        
        /** Formatting of the smallest (leftmost) value of the legend. Default value: "less than {min} {name}" */
        var lower: js.UndefOr[String] = js.native
        
        /** Formatting of the biggest (rightmost) value of the legend. Default value: "more than {max} {name}" */
        var upper: js.UndefOr[String] = js.native
      }
      object LegendTitleTemplates {
        
        @scala.inline
        def apply(): LegendTitleTemplates = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[LegendTitleTemplates]
        }
        
        @scala.inline
        implicit class LegendTitleTemplatesMutableBuilder[Self <: LegendTitleTemplates] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setInner(value: String): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
          
          @scala.inline
          def setLower(value: String): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLowerUndefined: Self = StObject.set(x, "lower", js.undefined)
          
          @scala.inline
          def setUpper(value: String): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUpperUndefined: Self = StObject.set(x, "upper", js.undefined)
        }
      }
      
      @js.native
      trait RuntimeOptions extends InitOptions {
        
        /** Margin around each domain, in pixels. Ordered like in CSS (top, right, bottom, left) */
        @JSName("domainMargin")
        var domainMargin_RuntimeOptions: js.Array[Double] = js.native
        
        /** List of dates to highlight */
        @JSName("highlight")
        var highlight_RuntimeOptions: js.Array[Date] = js.native
        
        /**
          * Name of the items to represent in the calendar.
          * First index is singular form, and the second index, the plural form.
          */
        @JSName("itemName")
        var itemName_RuntimeOptions: js.Array[String] = js.native
        
        /** Margin around the legend, in pixels. Ordered like in CSS (top, right, bottom, left) */
        @JSName("legendMargin")
        var legendMargin_RuntimeOptions: js.Array[Double] = js.native
      }
      object RuntimeOptions {
        
        @scala.inline
        def apply(
          domainMargin: js.Array[Double],
          highlight: js.Array[Date],
          itemName: js.Array[String],
          legendMargin: js.Array[Double]
        ): RuntimeOptions = {
          val __obj = js.Dynamic.literal(domainMargin = domainMargin.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], legendMargin = legendMargin.asInstanceOf[js.Any])
          __obj.asInstanceOf[RuntimeOptions]
        }
        
        @scala.inline
        implicit class RuntimeOptionsMutableBuilder[Self <: RuntimeOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDomainMargin(value: js.Array[Double]): Self = StObject.set(x, "domainMargin", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDomainMarginVarargs(value: Double*): Self = StObject.set(x, "domainMargin", js.Array(value :_*))
          
          @scala.inline
          def setHighlight(value: js.Array[Date]): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHighlightVarargs(value: Date*): Self = StObject.set(x, "highlight", js.Array(value :_*))
          
          @scala.inline
          def setItemName(value: js.Array[String]): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setItemNameVarargs(value: String*): Self = StObject.set(x, "itemName", js.Array(value :_*))
          
          @scala.inline
          def setLegendMargin(value: js.Array[Double]): Self = StObject.set(x, "legendMargin", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLegendMarginVarargs(value: Double*): Self = StObject.set(x, "legendMargin", js.Array(value :_*))
        }
      }
      
      @js.native
      trait SubDomainFormatTemplates extends StObject {
        
        /** Format of the title when there is no value associated to the date. Default value: "{date}" */
        var empty: js.UndefOr[String] = js.native
        
        /** Format of the title when it's associated to a value. Default value: "{count} {name} {connector} {date}" */
        var filled: js.UndefOr[String] = js.native
      }
      object SubDomainFormatTemplates {
        
        @scala.inline
        def apply(): SubDomainFormatTemplates = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SubDomainFormatTemplates]
        }
        
        @scala.inline
        implicit class SubDomainFormatTemplatesMutableBuilder[Self <: SubDomainFormatTemplates] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
          
          @scala.inline
          def setFilled(value: String): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
        }
      }
      
      type _To = CalHeatMapStatic
      
      /* This means you don't have to write `^`, but can instead just say `CalHeatMap.foo` */
      override def _to: CalHeatMapStatic = ^
    }
  }
}
