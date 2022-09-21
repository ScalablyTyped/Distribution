package typings.chartist.coreTypesMod

import typings.chartist.anon.High
import typings.chartist.anon.X
import typings.chartist.chartistStrings.end
import typings.chartist.chartistStrings.start
import typings.chartist.typesMod.AxisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisOptions extends StObject {
  
  var divisor: js.UndefOr[Double] = js.undefined
  
  var high: js.UndefOr[Double] = js.undefined
  
  var highLow: js.UndefOr[High] = js.undefined
  
  var labelInterpolationFnc: js.UndefOr[js.Function2[/* value */ Label, /* index */ Double, js.UndefOr[Label | Null]]] = js.undefined
  
  var labelOffset: js.UndefOr[X] = js.undefined
  
  var low: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var onlyInteger: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[start | end] = js.undefined
  
  var referenceValue: js.UndefOr[Double] = js.undefined
  
  var scaleMinSpace: js.UndefOr[Double] = js.undefined
  
  var showGrid: js.UndefOr[Boolean] = js.undefined
  
  var showLabel: js.UndefOr[Boolean] = js.undefined
  
  var stretch: js.UndefOr[Boolean] = js.undefined
  
  var ticks: js.UndefOr[js.Array[Label]] = js.undefined
  
  var `type`: js.UndefOr[AxisType] = js.undefined
}
object AxisOptions {
  
  inline def apply(): AxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisOptions]
  }
  
  extension [Self <: AxisOptions](x: Self) {
    
    inline def setDivisor(value: Double): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
    
    inline def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
    
    inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighLow(value: High): Self = StObject.set(x, "highLow", value.asInstanceOf[js.Any])
    
    inline def setHighLowUndefined: Self = StObject.set(x, "highLow", js.undefined)
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLabelInterpolationFnc(value: (/* value */ Label, /* index */ Double) => js.UndefOr[Label | Null]): Self = StObject.set(x, "labelInterpolationFnc", js.Any.fromFunction2(value))
    
    inline def setLabelInterpolationFncUndefined: Self = StObject.set(x, "labelInterpolationFnc", js.undefined)
    
    inline def setLabelOffset(value: X): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
    
    inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
    
    inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnlyInteger(value: Boolean): Self = StObject.set(x, "onlyInteger", value.asInstanceOf[js.Any])
    
    inline def setOnlyIntegerUndefined: Self = StObject.set(x, "onlyInteger", js.undefined)
    
    inline def setPosition(value: start | end): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setReferenceValue(value: Double): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
    
    inline def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
    
    inline def setScaleMinSpace(value: Double): Self = StObject.set(x, "scaleMinSpace", value.asInstanceOf[js.Any])
    
    inline def setScaleMinSpaceUndefined: Self = StObject.set(x, "scaleMinSpace", js.undefined)
    
    inline def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
    
    inline def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
    
    inline def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
    
    inline def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
    
    inline def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    inline def setTicks(value: js.Array[Label]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setTicksVarargs(value: Label*): Self = StObject.set(x, "ticks", js.Array(value*))
    
    inline def setType(value: AxisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
