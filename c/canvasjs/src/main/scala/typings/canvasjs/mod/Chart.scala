package typings.canvasjs.mod

import typings.canvasjs.anon.FileName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvasjs", "Chart")
@js.native
open class Chart protected () extends StObject {
  /**
    * Initializes a new instance of CanvasJS Chart.
    * @param containerId the DOM ID of the location where the chart is to be rendered
    * @param options the options used to render the chart
    */
  def this(containerId: String) = this()
  def this(containerId: String, options: ChartOptions) = this()
  
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
  def addTo(propertyName: String, options: ChartAxisXOptions): Unit = js.native
  def addTo(propertyName: String, options: ChartAxisXOptions, index: Double): Unit = js.native
  def addTo(propertyName: String, options: ChartAxisXOptions, index: Double, updateChart: Boolean): Unit = js.native
  def addTo(propertyName: String, options: ChartAxisXOptions, index: Unit, updateChart: Boolean): Unit = js.native
  def addTo(propertyName: String, options: ChartAxisYOptions): Unit = js.native
  def addTo(propertyName: String, options: ChartAxisYOptions, index: Double): Unit = js.native
  def addTo(propertyName: String, options: ChartAxisYOptions, index: Double, updateChart: Boolean): Unit = js.native
  def addTo(propertyName: String, options: ChartAxisYOptions, index: Unit, updateChart: Boolean): Unit = js.native
  def addTo(propertyName: String, options: ChartDataSeriesOptions): Unit = js.native
  def addTo(propertyName: String, options: ChartDataSeriesOptions, index: Double): Unit = js.native
  def addTo(propertyName: String, options: ChartDataSeriesOptions, index: Double, updateChart: Boolean): Unit = js.native
  def addTo(propertyName: String, options: ChartDataSeriesOptions, index: Unit, updateChart: Boolean): Unit = js.native
  
  val axisX: js.Array[ChartAxisX] = js.native
  
  val axisX2: js.Array[ChartAxisX] = js.native
  
  val axisY: js.Array[ChartAxisY] = js.native
  
  val axisY2: js.Array[ChartAxisY] = js.native
  
  val data: js.Array[ChartDataSeries] = js.native
  
  /**
    * Removes the chart references internally, thus making the chart eligible for garbage collection, in turn clearing up the memory.
    * Notes:
    * 1. On calling chart.destroy(), chart won’t be responsive unless new chart is created.
    * 2. chart.destroy() should be called before using the same variable to hold a newly allocated object/chart to prevent memory leaks.
    */
  def destroy(): Unit = js.native
  
  /**
    * Export the chart as image (jpg / png).
    * @param options Setting when export
    */
  def exportChart(options: FileName): Unit = js.native
  
  /**
    * Returns the specified property of Chart.
    * @param propertyName Name of the property.
    */
  def get(propertyName: String): Any = js.native
  
  /**
    * The current options of the chart.
    */
  var options: ChartOptions = js.native
  
  /**
    * Prints the Chart.
    * Chart should be rendered before you can use this method.
    */
  def print(): Unit = js.native
  
  /**
    * Renders the chart.
    */
  def render(): Unit = js.native
  
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
  def set(propertyName: String, value: ChartOptions): Unit = js.native
  def set(propertyName: String, value: ChartOptions, updateChart: Boolean): Unit = js.native
  
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
}
