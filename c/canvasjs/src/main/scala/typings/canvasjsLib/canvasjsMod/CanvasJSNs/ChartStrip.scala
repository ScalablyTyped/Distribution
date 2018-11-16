package typings
package canvasjsLib.canvasjsMod.CanvasJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartStrip extends ChartStripLinesOptions {
  /**
           * Returns the specified property of stripLines.
           * @param propertyName Name of the property
           */
  def get(propertyName: java.lang.String): scala.Double | java.lang.String | scala.Boolean = js.native
  /**
           * Removes specified stripLine from stripLines Array.
           */
  def remove(): scala.Unit = js.native
  /**
           * Sets the specified property of stripLines.
           * @param propertyName Name of the property.
           * @param value value to be set on property.
           * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
           */
  def set(propertyName: java.lang.String, value: java.lang.String, updateChart: scala.Boolean): scala.Unit = js.native
  /**
           * Sets the specified property of stripLines.
           * @param propertyName Name of the property.
           * @param value value to be set on property.
           * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
           */
  def set(propertyName: java.lang.String, value: scala.Boolean, updateChart: scala.Boolean): scala.Unit = js.native
  /**
           * Sets the specified property of stripLines.
           * @param propertyName Name of the property.
           * @param value value to be set on property.
           * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
           */
  def set(propertyName: java.lang.String, value: scala.Double, updateChart: scala.Boolean): scala.Unit = js.native
}

