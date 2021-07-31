package typings.chartist.mod

import typings.chartist.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICandleChartAxis extends StObject {
  
  /**
    * Interpolation function that allows you to intercept the value from the axis label
    */
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Allows you to correct label positioning on this axis by positive or negative x and y offset.
    */
  var labelOffset: js.UndefOr[Y] = js.undefined
  
  /**
    * The offset of the chart drawing area to the border of the container
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Position where labels are placed. Can be set to `start` or `end` where `start` is equivalent to left or top on vertical axis and `end` is equivalent to right or bottom on horizontal axis.
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * If the axis grid should be drawn or not
    */
  var showGrid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If labels should be shown or not
    */
  var showLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the axis type to be used to project values on this axis. If not defined, Chartist.StepAxis will be used for the X-Axis, where the ticks option will be set to the labels in the data and the stretch option will be set to the global fullWidth option. This type can be changed to any axis constructor available (e.g. Chartist.FixedScaleAxis), where all axis options should be present here.
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
}
object ICandleChartAxis {
  
  @scala.inline
  def apply(): ICandleChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICandleChartAxis]
  }
  
  @scala.inline
  implicit class ICandleChartAxisMutableBuilder[Self <: ICandleChartAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelInterpolationFnc(value: js.Function): Self = StObject.set(x, "labelInterpolationFnc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelInterpolationFncUndefined: Self = StObject.set(x, "labelInterpolationFnc", js.undefined)
    
    @scala.inline
    def setLabelOffset(value: Y): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
    
    @scala.inline
    def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
