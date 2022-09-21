package typings.c3.mod

import org.scalablytyped.runtime.StringDictionary
import typings.c3.anon.Draggable
import typings.c3.anon.Format
import typings.c3.anon.LabelText
import typings.c3.anon.Normalize
import typings.c3.anon.Value
import typings.c3.anon.`1`
import typings.c3.c3Strings.asc
import typings.c3.c3Strings.desc
import typings.d3Color.mod.HSLColor
import typings.d3Color.mod.RGBColor
import typings.std.Record
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
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
  var empty: js.UndefOr[LabelText] = js.undefined
  
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
  var headers: js.UndefOr[Any] = js.undefined
  
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
  var keys: js.UndefOr[Value] = js.undefined
  
  /**
    * Show labels on each data points or set formatter function for data labels.
    * Control all labels with a boolean value or `format` function, or control behavior for individual data with a `format` object.
    */
  var labels: js.UndefOr[Boolean | Format | `1`] = js.undefined
  
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
  
  var selection: js.UndefOr[Draggable] = js.undefined
  
  var stack: js.UndefOr[Normalize] = js.undefined
  
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
  
  inline def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setAxes(value: StringDictionary[AxisName]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setClasses(value: StringDictionary[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColor(
      value: (/* color */ String, /* d */ String | DataSeries | DataPoint) => String | RGBColor | HSLColor
    ): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColors(
      value: StringDictionary[
          String | RGBColor | HSLColor | (js.Function1[/* d */ String | DataSeries | DataPoint, String | RGBColor | HSLColor])
        ]
    ): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColumns(value: js.Array[Array[String | Primitive]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: (Array[String | Primitive])*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setEmpty(value: LabelText): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setEpochs(value: String): Self = StObject.set(x, "epochs", value.asInstanceOf[js.Any])
    
    inline def setEpochsUndefined: Self = StObject.set(x, "epochs", js.undefined)
    
    inline def setFilter(
      value: (/* series */ DataSeries, /* index */ Double, /* allSeries */ js.Array[DataSeries]) => Boolean
    ): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGroups(value: js.Array[js.Array[String]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: js.Array[String]*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHide(value: Boolean | js.Array[String]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setHideVarargs(value: String*): Self = StObject.set(x, "hide", js.Array(value*))
    
    inline def setIdConverter(value: /* id */ String => String): Self = StObject.set(x, "idConverter", js.Any.fromFunction1(value))
    
    inline def setIdConverterUndefined: Self = StObject.set(x, "idConverter", js.undefined)
    
    inline def setJson(value: (Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setJsonVarargs(value: (Record[String, Primitive])*): Self = StObject.set(x, "json", js.Array(value*))
    
    inline def setKeys(value: Value): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setLabels(value: Boolean | Format | `1`): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setNames(value: StringDictionary[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setOnclick(value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
    
    inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    inline def setOnmouseout(
      value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit]
    ): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
    
    inline def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
    
    inline def setOnmouseover(
      value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit]
    ): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
    
    inline def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
    
    inline def setOnselected(value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]): Self = StObject.set(x, "onselected", value.asInstanceOf[js.Any])
    
    inline def setOnselectedUndefined: Self = StObject.set(x, "onselected", js.undefined)
    
    inline def setOnunselected(value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]): Self = StObject.set(x, "onunselected", value.asInstanceOf[js.Any])
    
    inline def setOnunselectedUndefined: Self = StObject.set(x, "onunselected", js.undefined)
    
    inline def setOrder(value: asc | desc | (js.Function1[/* repeated */ DataSeries, Double])): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderFunction1(value: /* repeated */ DataSeries => Double): Self = StObject.set(x, "order", js.Any.fromFunction1(value))
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setRegions(value: StringDictionary[js.Array[RegionOptions]]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRows(value: js.Array[PrimitiveArray]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: PrimitiveArray*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setSelection(value: Draggable): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setStack(value: Normalize): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setType(value: ChartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypes(value: StringDictionary[ChartType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXFormat(value: String): Self = StObject.set(x, "xFormat", value.asInstanceOf[js.Any])
    
    inline def setXFormatUndefined: Self = StObject.set(x, "xFormat", js.undefined)
    
    inline def setXLocaltime(value: Boolean): Self = StObject.set(x, "xLocaltime", value.asInstanceOf[js.Any])
    
    inline def setXLocaltimeUndefined: Self = StObject.set(x, "xLocaltime", js.undefined)
    
    inline def setXSort(value: Boolean): Self = StObject.set(x, "xSort", value.asInstanceOf[js.Any])
    
    inline def setXSortUndefined: Self = StObject.set(x, "xSort", js.undefined)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXs(value: StringDictionary[String]): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    
    inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
  }
}
