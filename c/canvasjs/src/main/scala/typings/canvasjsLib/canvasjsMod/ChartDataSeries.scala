package typings
package canvasjsLib.canvasjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartDataSeries extends ChartDataSeriesOptions {
  /**
    * Adds a new element of given type to the specified array. For example, it can be used to add new dataPoint to datPoints array.
    * @param propertyName Name of the property
    * @param options Option for the new element
    * @param index Index of the array where the new element is to be added. Defaults to the length (end) of array.
    * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
    */
  def addTo(propertyName: java.lang.String, options: ChartDataPoint): scala.Unit = js.native
  def addTo(propertyName: java.lang.String, options: ChartDataPoint, index: scala.Double): scala.Unit = js.native
  def addTo(
    propertyName: java.lang.String,
    options: ChartDataPoint,
    index: scala.Double,
    updateChart: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Returns the specified property of dataSeries
    * @param propertyName Name of the property.
    */
  def get(propertyName: java.lang.String): scala.Boolean | java.lang.String | scala.Double | ChartDataPoint = js.native
  /**
    * Removes specified dataSeries from data Array.
    */
  def remove(): scala.Unit = js.native
  def set(propertyName: java.lang.String, value: ChartDataPoint, updateChart: scala.Boolean): scala.Unit = js.native
  def set(propertyName: java.lang.String, value: java.lang.String, updateChart: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the specified property of dataSeries.
    * @param propertyName  Name of the property.
    * @param value value to be set on property.
    * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
    */
  def set(propertyName: java.lang.String, value: scala.Boolean, updateChart: scala.Boolean): scala.Unit = js.native
  def set(propertyName: java.lang.String, value: scala.Double, updateChart: scala.Boolean): scala.Unit = js.native
}

