package typings.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLegend extends ChartLegendOptions {
  
  /**
    * Returns the specified property of legend.
    * @param propertyName Name of the property.
    */
  def get(propertyName: String): Double | String | Boolean = js.native
  
  def set(propertyName: String, value: String): Unit = js.native
  def set(propertyName: String, value: String, updateChart: Boolean): Unit = js.native
  def set(propertyName: String, value: Boolean): Unit = js.native
  def set(propertyName: String, value: Boolean, updateChart: Boolean): Unit = js.native
  /**
    * Sets the specified property of legend.
    * @param propertyName Name of the property.
    * @param value Name of the property.
    * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
    */
  def set(propertyName: String, value: Double): Unit = js.native
  def set(propertyName: String, value: Double, updateChart: Boolean): Unit = js.native
}
