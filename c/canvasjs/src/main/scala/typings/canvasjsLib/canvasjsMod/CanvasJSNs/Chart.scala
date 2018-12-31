package typings
package canvasjsLib.canvasjsMod.CanvasJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart extends js.Object {
  val axisX: js.Array[ChartAxisX] = js.native
  val axisX2: js.Array[ChartAxisX] = js.native
  val axisY: js.Array[ChartAxisY] = js.native
  val axisY2: js.Array[ChartAxisY] = js.native
  val data: js.Array[ChartDataSeries] = js.native
  /**
    * The current options of the chart.
    */
  var options: ChartOptions = js.native
  val stripLines: js.Array[ChartStrip] = js.native
  /**
    * The subtitles of the chart.
    * You can access them either via get method or dot notation. But you can change / set those values only via set method.
    */
  val subtitles: js.Array[ChartTitle] = js.native
  /**
    * All Title options become available as properties after Chart Render. You can access them either via get method or dot notation. But you can change / set those values only via set method.
    */
  val title: ChartTitle = js.native
  /**
    * The toolTip of the chart.
    */
  val toolTip: ChartToolTip = js.native
  /**
    * Adds a new element of given type to the specified array. For example, it can be used to add new Axis to axisY array.
    * Notes:
    * 1. Chart should be rendered before you can use this method.
    * 2. Chart renders automatically after addTo() operation.
    * @param propertyName Name of the property
    * @param options Option for the new element
    * @param index Index of the array where the new element is to be added. Defaults to the length (end) of array.
    * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
    */
  def addTo(propertyName: java.lang.String, options: ChartAxisXOptions): scala.Unit = js.native
  def addTo(propertyName: java.lang.String, options: ChartAxisXOptions, index: scala.Double): scala.Unit = js.native
  def addTo(
    propertyName: java.lang.String,
    options: ChartAxisXOptions,
    index: scala.Double,
    updateChart: scala.Boolean
  ): scala.Unit = js.native
  def addTo(propertyName: java.lang.String, options: ChartAxisYOptions): scala.Unit = js.native
  def addTo(propertyName: java.lang.String, options: ChartAxisYOptions, index: scala.Double): scala.Unit = js.native
  def addTo(
    propertyName: java.lang.String,
    options: ChartAxisYOptions,
    index: scala.Double,
    updateChart: scala.Boolean
  ): scala.Unit = js.native
  def addTo(propertyName: java.lang.String, options: ChartDataSeriesOptions): scala.Unit = js.native
  def addTo(propertyName: java.lang.String, options: ChartDataSeriesOptions, index: scala.Double): scala.Unit = js.native
  def addTo(
    propertyName: java.lang.String,
    options: ChartDataSeriesOptions,
    index: scala.Double,
    updateChart: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Removes the chart references internally, thus making the chart eligible for garbage collection, in turn clearing up the memory.
    * Notes:
    * 1. On calling chart.destroy(), chart won’t be responsive unless new chart is created.
    * 2. chart.destroy() should be called before using the same variable to hold a newly allocated object/chart to prevent memory leaks.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Export the chart as image (jpg / png).
    * @param options Setting when export
    */
  def exportChart(options: canvasjsLib.Anon_ToDataURL): scala.Unit = js.native
  /**
    * Returns the specified property of Chart.
    * @param propertyName Name of the property.
    */
  def get(propertyName: java.lang.String): js.Any = js.native
  /**
    * Prints the Chart.
    * Chart should be rendered before you can use this method.
    */
  def print(): scala.Unit = js.native
  /**
    * Renders the chart.
    */
  def render(): scala.Unit = js.native
  /**
    * Sets the specified property of Chart.
    * Notes:
    * 1. Chart should be rendered before you can use this method.
    * 2. Because the chart updates each time set is called by default,
    * it is recommended to disable auto update (set updateChart to false) till the last step if you have to set multiple properties.
    *  Otherwise it can affect performance because of repeated chart rendering. You can see an example below.
    * @param propertyName Name of the property.
    * @param value value to be set on property.
    * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
    */
  def set(propertyName: java.lang.String, value: ChartOptions): scala.Unit = js.native
  def set(propertyName: java.lang.String, value: ChartOptions, updateChart: scala.Boolean): scala.Unit = js.native
}

