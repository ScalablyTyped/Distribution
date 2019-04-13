package typings
package canvasjsLib.canvasjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartLegend extends ChartLegendOptions {
  /**
    * Returns the specified property of legend.
    * @param propertyName Name of the property.
    */
  def get(propertyName: java.lang.String): scala.Double | java.lang.String | scala.Boolean = js.native
  def set(propertyName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def set(propertyName: java.lang.String, value: java.lang.String, updateChart: scala.Boolean): scala.Unit = js.native
  def set(propertyName: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def set(propertyName: java.lang.String, value: scala.Boolean, updateChart: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the specified property of legend.
    * @param propertyName Name of the property.
    * @param value Name of the property.
    * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
    */
  def set(propertyName: java.lang.String, value: scala.Double): scala.Unit = js.native
  def set(propertyName: java.lang.String, value: scala.Double, updateChart: scala.Boolean): scala.Unit = js.native
}

