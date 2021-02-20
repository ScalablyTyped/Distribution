package typings.canvasjs.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartDataPoint extends ChartDataCommon {
  
  /**
    * Sets the exploded value of dataPoint. It is applicable only in case of Pie and Doughnut Charts. This property causes the Pie/Doughnut slice to separate out.
    * Default: true
    * Example: true, false
    */
  var exploded: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets label value of a dataPoint. The value appears next to the dataPoint on axisX Line. If not provided, it takes x value for label.
    * Default: x value
    * Example: "label1", "label2"..
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Sets the x value. It determines the position of the dataPoint on X Axis. It can be numeric or a dateTime value. Values can be positive or Negative.
    * If no x value is provided, they are automatically set sequentially starting from zero
    * Default: null
    * Example: 10, 20, 30 ..
    * new Date(2011, 08, 01)
    */
  var x: js.UndefOr[Double | Date] = js.native
  
  /**
    * Sets the y value of dataPoint. It determines the position of dataPoint on Y Axis. Values can be positive or Negative
    * Default: null
    * Example: 5, 20, -30 ..
    */
  var y: js.UndefOr[Double | Null] = js.native
  
  /**
    * Sets the z value of dataPoint. It is only applicable in case of Bubble chart. This value determines the size of the bubble.
    * Default: 1
    * Example: 10, 20, 35..
    */
  var z: js.UndefOr[Double] = js.native
}
object ChartDataPoint {
  
  @scala.inline
  def apply(): ChartDataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataPoint]
  }
  
  @scala.inline
  implicit class ChartDataPointMutableBuilder[Self <: ChartDataPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExploded(value: Boolean): Self = StObject.set(x, "exploded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplodedUndefined: Self = StObject.set(x, "exploded", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setX(value: Double | Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYNull: Self = StObject.set(x, "y", null)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
