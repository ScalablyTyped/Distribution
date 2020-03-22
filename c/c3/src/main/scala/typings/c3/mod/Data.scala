package typings.c3.mod

import org.scalablytyped.runtime.StringDictionary
import typings.c3.Anon0
import typings.c3.AnonDraggable
import typings.c3.AnonFormat
import typings.c3.AnonLabelAnonText
import typings.c3.AnonValue
import typings.c3.c3Strings.asc
import typings.c3.c3Strings.desc
import typings.d3Color.mod.HSLColor
import typings.d3Color.mod.RGBColor
import typings.std.Record
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /**
    * Set y axis the data related to.
    */
  var axes: js.UndefOr[StringDictionary[AxisName]] = js.undefined
  /**
    * Set custom data classes for styling.
    * If this option is specified, the element g for the data has an additional class that has the prefix `c3-target-` (e.g. `c3-target-additional-data1-class`).
    */
  var classes: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Set color converter function.
    * The function is called for each data ID, for each data series, and for each individual point.
    */
  var color: js.UndefOr[
    js.Function2[
      /* color */ String, 
      /* d */ String | DataSeries | DataPoint, 
      String | RGBColor | HSLColor
    ]
  ] = js.undefined
  /**
    * Set color for each data.
    * If a function is specified, it is called once each with the data ID, the data series, and each point.
    */
  var colors: js.UndefOr[
    StringDictionary[
      String | RGBColor | HSLColor | (js.Function1[/* d */ String | DataSeries | DataPoint, String | RGBColor | HSLColor])
    ]
  ] = js.undefined
  /**
    * A list of columns, where the first element in each column is the ID and the remaining elements are data. If `url`, `json`, or `rows` are provided, this will be ignored.
    */
  var columns: js.UndefOr[js.Array[Array[String | Primitive]]] = js.undefined
  /**
    * Set text displayed when empty data.
    * Defaults to `""`.
    */
  var empty: js.UndefOr[AnonLabelAnonText] = js.undefined
  /**
    * For Stanford charts, specify the key of the epochs data, which maps values to their color.
    * Defaults to `"epochs"`.
    */
  var epochs: js.UndefOr[String] = js.undefined
  /**
    * Specify a filter function to selectively load data.
    * @param series The data series for which to decide whether to show or not.
    * @param index The index of the data series in the data.
    * @param allSeries Array of all data series, whether filtered or not.
    * @returns `true` if the series should be shown, `false` if it should be hidden.
    */
  var filter: js.UndefOr[
    js.Function3[
      /* series */ DataSeries, 
      /* index */ Double, 
      /* allSeries */ js.Array[DataSeries], 
      Boolean
    ]
  ] = js.undefined
  /**
    * Set groups for the data for stacking.
    */
  var groups: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  /**
    * Specify headers for the data request if `data.url` is provided.
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /**
    * Hide each data when the chart appears.
    * If true specified, all of data will be hidden. If multiple ids specified as an array, those will be hidden.
    */
  var hide: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * Convert data IDs with this function before creating chart.
    * @param id The original ID string.
    * @returns The converted ID string.
    */
  var idConverter: js.UndefOr[js.Function1[/* id */ String, String]] = js.undefined
  /**
    * Parse a JSON object for data. Can be in the column form `{key1: [val1, val2, ...]; ...}` or in the row form `[{key1: val1; key2: val2}, ...]`. If `url` is provided this will be ignored.
    */
  var json: js.UndefOr[(Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])] = js.undefined
  /**
    * If `data.json` is provided and is in row form, these keys are used to pull the data from each row.
    */
  var keys: js.UndefOr[AnonValue] = js.undefined
  /**
    * Show labels on each data points or set formatter function for data labels.
    * Control all labels with a boolean value or `format` function, or control behavior for individual data with a `format` object.
    */
  var labels: js.UndefOr[Boolean | AnonFormat | Anon0] = js.undefined
  /**
    * Used if loading JSON via `data.url`.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  /**
    * Set custom data display names.
    */
  var names: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Set a callback for click event on each data point.
    * @param d The data point that was clicked.
    * @param element The element for the data point that was clicked.
    */
  var onclick: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]
  ] = js.undefined
  /**
    * Set a callback for mouseout event on each data point.
    * @param d The data point that the mouse left.
    * @param element The element for that point. Not passed for some chart types, line 'line'.
    */
  var onmouseout: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit]
  ] = js.undefined
  /**
    * Set a callback for mouseover event on each data point.
    * @param d The data point that was moused over.
    * @param element The element for that point. Not passed for some chart types, line 'line'.
    */
  var onmouseover: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit]
  ] = js.undefined
  /**
    * Set a callback for data selection.
    * @param d The data point that was selected.
    * @param element The element for the data point that was selected.
    */
  var onselected: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]
  ] = js.undefined
  /**
    * Set a callback for data deselection.
    * @param d The data point that was unselected.
    * @param element The element for the data point that was unselected.
    */
  var onunselected: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]
  ] = js.undefined
  /**
    * Define the order of the data.
    * This option changes the order of stacking the data and pieces of pie/donut. If null specified, it will be the order the data loaded. If function specified, it will be used to sort the data
    * and it will recieve the data as argument.
    */
  var order: js.UndefOr[asc | desc | (js.Function1[/* repeated */ DataSeries, Double]) | Null] = js.undefined
  /**
    * Define regions for each data.
    * The values must be an array for each data and it should include an object that has start, end, style. If start is not set, the start will be the first data point. If end is not set, the
    * end will be the last data point.
    * Currently this option supports only line chart and dashed style. If this option specified, the line will be dashed only in the regions.
    */
  var regions: js.UndefOr[StringDictionary[js.Array[RegionOptions]]] = js.undefined
  /**
    * A list of rows, where the first row is the column names and the remaining rows are data.  If `url` or `json` are provided this will be ignored.
    */
  var rows: js.UndefOr[js.Array[PrimitiveArray]] = js.undefined
  var selection: js.UndefOr[AnonDraggable] = js.undefined
  /**
    * Set chart type at once.
    * If this option is specified, the type will be applied to every data. This setting can be overwritten for individual data by `data.types`.
    */
  var `type`: js.UndefOr[ChartType] = js.undefined
  /**
    * Set chart type for each data.
    * This setting overwrites the chart-wide `data.type` setting.
    */
  var types: js.UndefOr[StringDictionary[ChartType]] = js.undefined
  /**
    * Load a CSV or JSON file from a URL. Note that this will not work if loading via the `"file://"` protocol as most browsers with block `XMLHTTPRequests`.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Specify the key of x values in the data.
    * We can show the data with non-index x values by this option. This option is required when the type of x axis is timeseries. If this option is set on category axis, the values of the data
    * on the key will be used for category names.
    */
  var x: js.UndefOr[String] = js.undefined
  /**
    * Set a format to parse string specifed as x.
    * Default is `"%Y-%m-%d"`.
    * @see https://github.com/d3/d3-time-format#locale_format For a list of valid format specifiers.
    */
  var xFormat: js.UndefOr[String] = js.undefined
  /**
    * Set to `true` to parse dates and times as local time.
    * **Experimental.**
    */
  var xLocaltime: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to `true` to sort x values.
    * **Experimental.**
    */
  var xSort: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the keys of the x values for each data.
    * This option can be used if we want to show the data that has different x values.
    */
  var xs: js.UndefOr[StringDictionary[String]] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    axes: StringDictionary[AxisName] = null,
    classes: StringDictionary[String] = null,
    color: (/* color */ String, /* d */ String | DataSeries | DataPoint) => String | RGBColor | HSLColor = null,
    colors: StringDictionary[
      String | RGBColor | HSLColor | (js.Function1[/* d */ String | DataSeries | DataPoint, String | RGBColor | HSLColor])
    ] = null,
    columns: js.Array[Array[String | Primitive]] = null,
    empty: AnonLabelAnonText = null,
    epochs: String = null,
    filter: (/* series */ DataSeries, /* index */ Double, /* allSeries */ js.Array[DataSeries]) => Boolean = null,
    groups: js.Array[js.Array[String]] = null,
    headers: js.Any = null,
    hide: Boolean | js.Array[String] = null,
    idConverter: /* id */ String => String = null,
    json: (Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]]) = null,
    keys: AnonValue = null,
    labels: Boolean | AnonFormat | Anon0 = null,
    mimeType: String = null,
    names: StringDictionary[String] = null,
    onclick: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit] = null,
    onmouseout: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit] = null,
    onmouseover: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit] = null,
    onselected: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit] = null,
    onunselected: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit] = null,
    order: asc | desc | (js.Function1[/* repeated */ DataSeries, Double]) = null,
    regions: StringDictionary[js.Array[RegionOptions]] = null,
    rows: js.Array[PrimitiveArray] = null,
    selection: AnonDraggable = null,
    `type`: ChartType = null,
    types: StringDictionary[ChartType] = null,
    url: String = null,
    x: String = null,
    xFormat: String = null,
    xLocaltime: js.UndefOr[Boolean] = js.undefined,
    xSort: js.UndefOr[Boolean] = js.undefined,
    xs: StringDictionary[String] = null
  ): Data = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(js.Any.fromFunction2(color))
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (epochs != null) __obj.updateDynamic("epochs")(epochs.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3(filter))
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (idConverter != null) __obj.updateDynamic("idConverter")(js.Any.fromFunction1(idConverter))
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout.asInstanceOf[js.Any])
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover.asInstanceOf[js.Any])
    if (onselected != null) __obj.updateDynamic("onselected")(onselected.asInstanceOf[js.Any])
    if (onunselected != null) __obj.updateDynamic("onunselected")(onunselected.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(xLocaltime)) __obj.updateDynamic("xLocaltime")(xLocaltime.asInstanceOf[js.Any])
    if (!js.isUndefined(xSort)) __obj.updateDynamic("xSort")(xSort.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

