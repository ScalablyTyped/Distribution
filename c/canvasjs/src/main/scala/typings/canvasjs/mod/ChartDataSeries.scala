package typings.canvasjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartDataSeries
  extends StObject
     with ChartDataSeriesOptions {
  
  /**
    * Adds a new element of given type to the specified array. For example, it can be used to add new dataPoint to datPoints array.
    * @param propertyName Name of the property
    * @param options Option for the new element
    * @param index Index of the array where the new element is to be added. Defaults to the length (end) of array.
    * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
    */
  def addTo(propertyName: String, options: ChartDataPoint): Unit = js.native
  def addTo(propertyName: String, options: ChartDataPoint, index: Double): Unit = js.native
  def addTo(propertyName: String, options: ChartDataPoint, index: Double, updateChart: Boolean): Unit = js.native
  def addTo(propertyName: String, options: ChartDataPoint, index: Unit, updateChart: Boolean): Unit = js.native
  
  /**
    * Returns the specified property of dataSeries
    * @param propertyName Name of the property.
    */
  def get(propertyName: String): Boolean | String | Double | ChartDataPoint = js.native
  
  /**
    * Removes specified dataSeries from data Array.
    */
  def remove(): Unit = js.native
  
  def set(propertyName: String, value: String, updateChart: Boolean): Unit = js.native
  /**
    * Sets the specified property of dataSeries.
    * @param propertyName  Name of the property.
    * @param value value to be set on property.
    * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
    */
  def set(propertyName: String, value: Boolean, updateChart: Boolean): Unit = js.native
  def set(propertyName: String, value: Double, updateChart: Boolean): Unit = js.native
  def set(propertyName: String, value: ChartDataPoint, updateChart: Boolean): Unit = js.native
}
