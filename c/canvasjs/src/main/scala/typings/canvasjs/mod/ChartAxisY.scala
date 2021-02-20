package typings.canvasjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAxisY extends ChartAxisYOptions {
  
  /**
    * Adds a new element of given type to the specified array. For example, it can be used to add new stripLine to stripLines array.
    * @param propertyName  Name of the property.
    * @param options  Option for the new element.
    * @param index Index of the array where the new element is to be added. Defaults to the length (end) of array.
    * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
    */
  def addTo(propertyName: String, options: ChartStripLinesOptions): Unit = js.native
  def addTo(
    propertyName: String,
    options: ChartStripLinesOptions,
    index: js.UndefOr[scala.Nothing],
    updateChart: Boolean
  ): Unit = js.native
  def addTo(propertyName: String, options: ChartStripLinesOptions, index: Double): Unit = js.native
  def addTo(propertyName: String, options: ChartStripLinesOptions, index: Double, updateChart: Boolean): Unit = js.native
  
  /**
    * Return the value along Axis for given pixel coordinate.
    * @param pixel pixel value over Axis
    */
  def convertPixelToValue(pixel: Double): Double = js.native
  
  /**
    * Return the pixel coordinate of the given value over axis.
    * @param value Numeric value over Axis
    */
  def convertValueToPixel(value: Double): Double = js.native
  
  /**
    * Returns the specified property of Axis.
    * @param propertyName Name of the property.
    */
  def get(propertyName: String): String | Double | Boolean = js.native
  
  /**
    * Removes specified axis from axis Array.
    */
  def remove(): Unit = js.native
  
  /**
    * Sets the specified property of Axis.
    * @param propertyName Name of the property.
    * @param value value to be set on property.
    * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
    */
  def set(propertyName: String, value: String, updateChart: Boolean): Unit = js.native
  def set(propertyName: String, value: Boolean, updateChart: Boolean): Unit = js.native
  def set(propertyName: String, value: Double, updateChart: Boolean): Unit = js.native
}
