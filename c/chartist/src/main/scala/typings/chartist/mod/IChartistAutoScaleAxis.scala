package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartistAutoScaleAxis extends ILineChartAxis {
  
  var high: js.UndefOr[Double] = js.native
  
  var low: js.UndefOr[Double] = js.native
  
  var onlyInteger: js.UndefOr[Boolean] = js.native
  
  var referenceValue: js.UndefOr[Double] = js.native
  
  var scaleMinSpace: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[IAutoScaleAxisStatic] = js.native
}
object IChartistAutoScaleAxis {
  
  @scala.inline
  def apply(): IChartistAutoScaleAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistAutoScaleAxis]
  }
  
  @scala.inline
  implicit class IChartistAutoScaleAxisMutableBuilder[Self <: IChartistAutoScaleAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    @scala.inline
    def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    @scala.inline
    def setOnlyInteger(value: Boolean): Self = StObject.set(x, "onlyInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyIntegerUndefined: Self = StObject.set(x, "onlyInteger", js.undefined)
    
    @scala.inline
    def setReferenceValue(value: Double): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
    
    @scala.inline
    def setScaleMinSpace(value: Double): Self = StObject.set(x, "scaleMinSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleMinSpaceUndefined: Self = StObject.set(x, "scaleMinSpace", js.undefined)
    
    @scala.inline
    def setType(value: IAutoScaleAxisStatic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
