package typings
package canvasjsLib.canvasjsMod.CanvasJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAxisX extends ChartAxisXOptions {
  /**
           * Adds a new element of given type to the specified array. For example, it can be used to add new stripLine to stripLines array.
           * @param propertyName  Name of the property.
           * @param options  Option for the new element.
           * @param index Index of the array where the new element is to be added. Defaults to the length (end) of array.
           * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
           */
  def addTo(propertyName: java.lang.String, options: ChartStripLinesOptions): scala.Unit = js.native
  /**
           * Adds a new element of given type to the specified array. For example, it can be used to add new stripLine to stripLines array.
           * @param propertyName  Name of the property.
           * @param options  Option for the new element.
           * @param index Index of the array where the new element is to be added. Defaults to the length (end) of array.
           * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
           */
  def addTo(propertyName: java.lang.String, options: ChartStripLinesOptions, index: scala.Double): scala.Unit = js.native
  /**
           * Adds a new element of given type to the specified array. For example, it can be used to add new stripLine to stripLines array.
           * @param propertyName  Name of the property.
           * @param options  Option for the new element.
           * @param index Index of the array where the new element is to be added. Defaults to the length (end) of array.
           * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
           */
  def addTo(
    propertyName: java.lang.String,
    options: ChartStripLinesOptions,
    index: scala.Double,
    updateChart: scala.Boolean
  ): scala.Unit = js.native
  /**
           * Return the value along Axis for given pixel coordinate.
           * @param pixel pixel value over Axis
           */
  def convertPixelToValue(pixel: scala.Double): scala.Double = js.native
  /**
           * Return the pixel coordinate of the given value over axis.
           * @param value Numeric value over Axis
           */
  def convertValueToPixel(value: scala.Double): scala.Double = js.native
  /**
           * Returns the specified property of Axis.
           * @param propertyName Name of the property.
           */
  def get(propertyName: java.lang.String): java.lang.String | scala.Double | scala.Boolean = js.native
  /**
           * Removes specified axis from axis Array.
           */
  def remove(): scala.Unit = js.native
  /**
           * Sets the specified property of Axis.
           * @param propertyName Name of the property.
           * @param value value to be set on property.
           * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
           */
  def set(propertyName: java.lang.String, value: java.lang.String, updateChart: scala.Boolean): scala.Unit = js.native
  /**
           * Sets the specified property of Axis.
           * @param propertyName Name of the property.
           * @param value value to be set on property.
           * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
           */
  def set(propertyName: java.lang.String, value: scala.Boolean, updateChart: scala.Boolean): scala.Unit = js.native
  /**
           * Sets the specified property of Axis.
           * @param propertyName Name of the property.
           * @param value value to be set on property.
           * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
           */
  def set(propertyName: java.lang.String, value: scala.Double, updateChart: scala.Boolean): scala.Unit = js.native
}

