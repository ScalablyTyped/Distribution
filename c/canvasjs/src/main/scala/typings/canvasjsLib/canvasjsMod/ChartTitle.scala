package typings
package canvasjsLib.canvasjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTitle extends ChartTitleOptions {
  /**
    * Can be accessed via get method or dot notation.
    */
  val bounds: canvasjsLib.Anon_X1 = js.native
  /**
    * Returns the specified property of title.
    * @param propertyName Name of the property.
    */
  def get(propertyName: java.lang.String): java.lang.String | scala.Double | scala.Boolean = js.native
  /**
    * Removes title of the chart.
    */
  def remove(): scala.Unit = js.native
  /**
    * Sets the specified property of Title.
    * @param propertyName Name of the property.
    * @param value value to be set on property.
    * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
    */
  def set(propertyName: java.lang.String, value: java.lang.String, updateChart: scala.Boolean): scala.Unit = js.native
  def set(propertyName: java.lang.String, value: scala.Boolean, updateChart: scala.Boolean): scala.Unit = js.native
  def set(propertyName: java.lang.String, value: scala.Double, updateChart: scala.Boolean): scala.Unit = js.native
}

