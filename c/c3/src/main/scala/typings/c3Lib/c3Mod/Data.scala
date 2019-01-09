package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /**
    * Set y axis the data related to. y and y2 can be used.
    */
  var axes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Set custom data class.
    * If this option is specified, the element g for the data has an additional class that has the prefix c3-target- (e.g. c3-target-additional-data1-class).
    */
  var classes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Set color converter function.
    * This option should a function and the specified function receives color (e.g. '#ff0000') and d that has data parameters like id, value, index, etc. And it must return a string that
    * represents color (e.g. '#00ff00').
    */
  var color: js.UndefOr[
    js.Function2[
      /* color */ java.lang.String, 
      /* d */ js.Any, 
      java.lang.String | d3DashColorLib.d3DashColorMod.RGBColor
    ]
  ] = js.undefined
  /**
    * Set color for each data.
    */
  var colors: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      java.lang.String | d3DashColorLib.d3DashColorMod.RGBColor | (js.Function1[/* d */ js.Any, java.lang.String | d3DashColorLib.d3DashColorMod.RGBColor])
    ]
  ] = js.undefined
  /*
    * Load data from a multidimensional array, with each element containing an array consisting of a datum name and associated data values.
    */
  var columns: js.UndefOr[js.Array[PrimitiveArray]] = js.undefined
  /**
    * Set text displayed when empty data.
    */
  var empty: js.UndefOr[c3Lib.Anon_Label] = js.undefined
  /**
    * Set groups for the data for stacking.
    */
  var groups: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  /**
    * Hide each data when the chart appears.
    * If true specified, all of data will be hidden. If multiple ids specified as an array, those will be hidden.
    */
  var hide: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
    * Parse a JSON object for data.
    */
  var json: js.UndefOr[js.Object] = js.undefined
  /**
    * Choose which JSON object keys correspond to desired data.
    */
  var keys: js.UndefOr[c3Lib.Anon_Value] = js.undefined
  /**
    * Show labels on each data points or set formatter function for data labels.
    * The formatter function receives 4 arguments such as v, id, i, j and it must return a string that will be shown as the label. The arguments are:
    * - v is the value of the data point where the label is shown.
    * - id is the id of the data where the label is shown.
    * - i is the index of the data point where the label is shown.
    * - j is the sub index of the data point where the label is shown.
    * Formatter function can be defined for each data by specifying as an object and D3 formatter function can be set (e.g. d3.format('$'))
    */
  var labels: js.UndefOr[scala.Boolean | c3Lib.Anon_FormatI | c3Lib.Anon_FormatKey] = js.undefined
  /**
    * Used if loading JSON via data.url
    */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  // xLocaltime?: any;
  // xSort?: any;
  /**
    * Set custom data name.
    */
  var names: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Set a callback for click event on each data point.
    * This callback will be called when each data point clicked and will receive d and element as the arguments.
    * - d is the data clicked and element is the element clicked. In this callback, this will be the Chart object.
    */
  var onclick: js.UndefOr[js.Function2[/* d */ js.Any, /* element */ js.Any, scala.Unit]] = js.undefined
  /**
    * Set a callback for mouseout event on each data point.
    * This callback will be called when mouse cursor moves out each data point and will receive d as the argument.
    * - d is the data where mouse cursor moves out. In this callback, this will be the Chart object.
    */
  var onmouseout: js.UndefOr[js.Function2[/* d */ js.Any, /* element */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /**
    * Set a callback for mouseover event on each data point.
    * This callback will be called when mouse cursor moves onto each data point and will receive d as the argument.
    * - d is the data where mouse cursor moves onto. In this callback, this will be the Chart object.
    */
  var onmouseover: js.UndefOr[js.Function2[/* d */ js.Any, /* element */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var onselected: js.UndefOr[js.Function2[/* d */ js.Any, /* element */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var onunselected: js.UndefOr[js.Function2[/* d */ js.Any, /* element */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /**
    * Define the order of the data.
    * This option changes the order of stacking the data and pieces of pie/donut. If null specified, it will be the order the data loaded. If function specified, it will be used to sort the data
    * and it will recieve the data as argument.
    * Available Values: desc, asc, function (data1, data2) { ... }, null
    */
  var order: js.UndefOr[
    java.lang.String | (js.Function1[/* repeated */ java.lang.String, scala.Unit]) | scala.Null
  ] = js.undefined
  /**
    * Define regions for each data.
    * The values must be an array for each data and it should include an object that has start, end, style. If start is not set, the start will be the first data point. If end is not set, the
    * end will be the last data point.
    * Currently this option supports only line chart and dashed style. If this option specified, the line will be dashed only in the regions.
    */
  var regions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * Load data from a multidimensional array, with the first element containing the data names, the following containing related data in that order.
    */
  var rows: js.UndefOr[js.Array[PrimitiveArray]] = js.undefined
  var selection: js.UndefOr[c3Lib.Anon_D] = js.undefined
  /**
    * Set chart type at once.
    * If this option is specified, the type will be applied to every data. This setting can be overwritten by data.types.
    * Available Values: line, spline, step, area, area-spline, area-step, bar, scatter, pie, donut, gauge
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set chart type for each data.
    * This setting overwrites data.type setting.
    */
  var types: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Load a CSV or JSON file from a URL. Note that this will not work if loading via the "file://" protocol as most browsers with block XMLHTTPRequests.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the key of x values in the data.
    * We can show the data with non-index x values by this option. This option is required when the type of x axis is timeseries. If this option is set on category axis, the values of the data
    * on the key will be used for category names.
    */
  var x: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set a format to parse string specifed as x.
    * Default is %Y-%m-%d
    */
  var xFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the keys of the x values for each data.
    * This option can be used if we want to show the data that has different x values.
    */
  var xs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

