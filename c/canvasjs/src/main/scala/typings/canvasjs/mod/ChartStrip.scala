package typings.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartStrip extends ChartStripLinesOptions {
  /**
    * Returns the specified property of stripLines.
    * @param propertyName Name of the property
    */
  def get(propertyName: String): Double | String | Boolean = js.native
  /**
    * Removes specified stripLine from stripLines Array.
    */
  def remove(): Unit = js.native
  def set(propertyName: String, value: String, updateChart: Boolean): Unit = js.native
  def set(propertyName: String, value: Boolean, updateChart: Boolean): Unit = js.native
  /**
    * Sets the specified property of stripLines.
    * @param propertyName Name of the property.
    * @param value value to be set on property.
    * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
    */
  def set(propertyName: String, value: Double, updateChart: Boolean): Unit = js.native
}

