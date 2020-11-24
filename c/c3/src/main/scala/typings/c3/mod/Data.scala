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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends js.Object {
  
  /**
    * Set y axis the data related to.
    */
  var axes: js.UndefOr[StringDictionary[AxisName]] = js.native
  
  /**
    * Set custom data classes for styling.
    * If this option is specified, the element g for the data has an additional class that has the prefix `c3-target-` (e.g. `c3-target-additional-data1-class`).
    */
  var classes: js.UndefOr[StringDictionary[String]] = js.native
  
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
  ] = js.native
  
  /**
    * Set color for each data.
    * If a function is specified, it is called once each with the data ID, the data series, and each point.
    */
  var colors: js.UndefOr[
    StringDictionary[
      String | RGBColor | HSLColor | (js.Function1[/* d */ String | DataSeries | DataPoint, String | RGBColor | HSLColor])
    ]
  ] = js.native
  
  /**
    * A list of columns, where the first element in each column is the ID and the remaining elements are data. If `url`, `json`, or `rows` are provided, this will be ignored.
    */
  var columns: js.UndefOr[js.Array[Array[String | Primitive]]] = js.native
  
  /**
    * Set text displayed when empty data.
    * Defaults to `""`.
    */
  var empty: js.UndefOr[LabelText] = js.native
  
  /**
    * For Stanford charts, specify the key of the epochs data, which maps values to their color.
    * Defaults to `"epochs"`.
    */
  var epochs: js.UndefOr[String] = js.native
  
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
  ] = js.native
  
  /**
    * Set groups for the data for stacking.
    */
  var groups: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  /**
    * Specify headers for the data request if `data.url` is provided.
    */
  var headers: js.UndefOr[js.Any] = js.native
  
  /**
    * Hide each data when the chart appears.
    * If true specified, all of data will be hidden. If multiple ids specified as an array, those will be hidden.
    */
  var hide: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  /**
    * Convert data IDs with this function before creating chart.
    * @param id The original ID string.
    * @returns The converted ID string.
    */
  var idConverter: js.UndefOr[js.Function1[/* id */ String, String]] = js.native
  
  /**
    * Parse a JSON object for data. Can be in the column form `{key1: [val1, val2, ...]; ...}` or in the row form `[{key1: val1; key2: val2}, ...]`. If `url` is provided this will be ignored.
    */
  var json: js.UndefOr[(Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])] = js.native
  
  /**
    * If `data.json` is provided and is in row form, these keys are used to pull the data from each row.
    */
  var keys: js.UndefOr[Value] = js.native
  
  /**
    * Show labels on each data points or set formatter function for data labels.
    * Control all labels with a boolean value or `format` function, or control behavior for individual data with a `format` object.
    */
  var labels: js.UndefOr[Boolean | Format | `1`] = js.native
  
  /**
    * Used if loading JSON via `data.url`.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Set custom data display names.
    */
  var names: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Set a callback for click event on each data point.
    * @param d The data point that was clicked.
    * @param element The element for the data point that was clicked.
    */
  var onclick: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]
  ] = js.native
  
  /**
    * Set a callback for mouseout event on each data point.
    * @param d The data point that the mouse left.
    * @param element The element for that point. Not passed for some chart types, line 'line'.
    */
  var onmouseout: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit]
  ] = js.native
  
  /**
    * Set a callback for mouseover event on each data point.
    * @param d The data point that was moused over.
    * @param element The element for that point. Not passed for some chart types, line 'line'.
    */
  var onmouseover: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit]
  ] = js.native
  
  /**
    * Set a callback for data selection.
    * @param d The data point that was selected.
    * @param element The element for the data point that was selected.
    */
  var onselected: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]
  ] = js.native
  
  /**
    * Set a callback for data deselection.
    * @param d The data point that was unselected.
    * @param element The element for the data point that was unselected.
    */
  var onunselected: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]
  ] = js.native
  
  /**
    * Define the order of the data.
    * This option changes the order of stacking the data and pieces of pie/donut. If null specified, it will be the order the data loaded. If function specified, it will be used to sort the data
    * and it will recieve the data as argument.
    */
  var order: js.UndefOr[asc | desc | (js.Function1[/* repeated */ DataSeries, Double]) | Null] = js.native
  
  /**
    * Define regions for each data.
    * The values must be an array for each data and it should include an object that has start, end, style. If start is not set, the start will be the first data point. If end is not set, the
    * end will be the last data point.
    * Currently this option supports only line chart and dashed style. If this option specified, the line will be dashed only in the regions.
    */
  var regions: js.UndefOr[StringDictionary[js.Array[RegionOptions]]] = js.native
  
  /**
    * A list of rows, where the first row is the column names and the remaining rows are data.  If `url` or `json` are provided this will be ignored.
    */
  var rows: js.UndefOr[js.Array[PrimitiveArray]] = js.native
  
  var selection: js.UndefOr[Draggable] = js.native
  
  var stack: js.UndefOr[Normalize] = js.native
  
  /**
    * Set chart type at once.
    * If this option is specified, the type will be applied to every data. This setting can be overwritten for individual data by `data.types`.
    */
  var `type`: js.UndefOr[ChartType] = js.native
  
  /**
    * Set chart type for each data.
    * This setting overwrites the chart-wide `data.type` setting.
    */
  var types: js.UndefOr[StringDictionary[ChartType]] = js.native
  
  /**
    * Load a CSV or JSON file from a URL. Note that this will not work if loading via the `"file://"` protocol as most browsers with block `XMLHTTPRequests`.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Specify the key of x values in the data.
    * We can show the data with non-index x values by this option. This option is required when the type of x axis is timeseries. If this option is set on category axis, the values of the data
    * on the key will be used for category names.
    */
  var x: js.UndefOr[String] = js.native
  
  /**
    * Set a format to parse string specifed as x.
    * Default is `"%Y-%m-%d"`.
    * @see https://github.com/d3/d3-time-format#locale_format For a list of valid format specifiers.
    */
  var xFormat: js.UndefOr[String] = js.native
  
  /**
    * Set to `true` to parse dates and times as local time.
    * **Experimental.**
    */
  var xLocaltime: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to `true` to sort x values.
    * **Experimental.**
    */
  var xSort: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the keys of the x values for each data.
    * This option can be used if we want to show the data that has different x values.
    */
  var xs: js.UndefOr[StringDictionary[String]] = js.native
}
object Data {
  
  @scala.inline
  def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    
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
    def setAxes(value: StringDictionary[AxisName]): Self = this.set("axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    
    @scala.inline
    def setClasses(value: StringDictionary[String]): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setColor(
      value: (/* color */ String, /* d */ String | DataSeries | DataPoint) => String | RGBColor | HSLColor
    ): Self = this.set("color", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColors(
      value: StringDictionary[
          String | RGBColor | HSLColor | (js.Function1[/* d */ String | DataSeries | DataPoint, String | RGBColor | HSLColor])
        ]
    ): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (Array[String | Primitive])*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[Array[String | Primitive]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setEmpty(value: LabelText): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setEpochs(value: String): Self = this.set("epochs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpochs: Self = this.set("epochs", js.undefined)
    
    @scala.inline
    def setFilter(
      value: (/* series */ DataSeries, /* index */ Double, /* allSeries */ js.Array[DataSeries]) => Boolean
    ): Self = this.set("filter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: js.Array[String]*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[js.Array[String]]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHideVarargs(value: String*): Self = this.set("hide", js.Array(value :_*))
    
    @scala.inline
    def setHide(value: Boolean | js.Array[String]): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setIdConverter(value: /* id */ String => String): Self = this.set("idConverter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIdConverter: Self = this.set("idConverter", js.undefined)
    
    @scala.inline
    def setJsonVarargs(value: (Record[String, Primitive])*): Self = this.set("json", js.Array(value :_*))
    
    @scala.inline
    def setJson(value: (Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setKeys(value: Value): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setLabels(value: Boolean | Format | `1`): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setNames(value: StringDictionary[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    
    @scala.inline
    def setOnclick(value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]): Self = this.set("onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    
    @scala.inline
    def setOnmouseout(
      value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit]
    ): Self = this.set("onmouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    
    @scala.inline
    def setOnmouseover(
      value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit]
    ): Self = this.set("onmouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmouseover: Self = this.set("onmouseover", js.undefined)
    
    @scala.inline
    def setOnselected(value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]): Self = this.set("onselected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnselected: Self = this.set("onselected", js.undefined)
    
    @scala.inline
    def setOnunselected(value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]): Self = this.set("onunselected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnunselected: Self = this.set("onunselected", js.undefined)
    
    @scala.inline
    def setOrderFunction1(value: /* repeated */ DataSeries => Double): Self = this.set("order", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrder(value: asc | desc | (js.Function1[/* repeated */ DataSeries, Double])): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOrderNull: Self = this.set("order", null)
    
    @scala.inline
    def setRegions(value: StringDictionary[js.Array[RegionOptions]]): Self = this.set("regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: PrimitiveArray*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[PrimitiveArray]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSelection(value: Draggable): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setStack(value: Normalize): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setType(value: ChartType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypes(value: StringDictionary[ChartType]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setX(value: String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXFormat(value: String): Self = this.set("xFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXFormat: Self = this.set("xFormat", js.undefined)
    
    @scala.inline
    def setXLocaltime(value: Boolean): Self = this.set("xLocaltime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXLocaltime: Self = this.set("xLocaltime", js.undefined)
    
    @scala.inline
    def setXSort(value: Boolean): Self = this.set("xSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXSort: Self = this.set("xSort", js.undefined)
    
    @scala.inline
    def setXs(value: StringDictionary[String]): Self = this.set("xs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXs: Self = this.set("xs", js.undefined)
  }
}
