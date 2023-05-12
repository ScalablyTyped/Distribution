package typings.chartJs.anon

import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ScriptableAndArray
import typings.chartJs.distTypesIndexMod.ScriptableScaleContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chart.js.chart.js/dist/types/index.GridLineOptions> */
trait PartialGridLineOptions extends StObject {
  
  var circular: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[
    ScriptableAndArray[typings.chartJs.distTypesColorMod.Color, ScriptableScaleContext]
  ] = js.undefined
  
  var display: js.UndefOr[Boolean] = js.undefined
  
  var drawOnChartArea: js.UndefOr[Boolean] = js.undefined
  
  var drawTicks: js.UndefOr[Boolean] = js.undefined
  
  var lineWidth: js.UndefOr[ScriptableAndArray[Double, ScriptableScaleContext]] = js.undefined
  
  var offset: js.UndefOr[Boolean] = js.undefined
  
  var tickBorderDash: js.UndefOr[js.Array[Double]] = js.undefined
  
  var tickBorderDashOffset: js.UndefOr[typings.chartJs.distTypesIndexMod.Scriptable[Double, ScriptableScaleContext]] = js.undefined
  
  var tickColor: js.UndefOr[
    ScriptableAndArray[typings.chartJs.distTypesColorMod.Color, ScriptableScaleContext]
  ] = js.undefined
  
  var tickLength: js.UndefOr[Double] = js.undefined
  
  var tickWidth: js.UndefOr[Double] = js.undefined
  
  var z: js.UndefOr[Double] = js.undefined
}
object PartialGridLineOptions {
  
  inline def apply(): PartialGridLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGridLineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialGridLineOptions] (val x: Self) extends AnyVal {
    
    inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
    
    inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
    
    inline def setColor(value: ScriptableAndArray[typings.chartJs.distTypesColorMod.Color, ScriptableScaleContext]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction2(
      value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[typings.chartJs.distTypesColorMod.Color]
    ): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: typings.chartJs.distTypesColorMod.Color*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setDrawOnChartArea(value: Boolean): Self = StObject.set(x, "drawOnChartArea", value.asInstanceOf[js.Any])
    
    inline def setDrawOnChartAreaUndefined: Self = StObject.set(x, "drawOnChartArea", js.undefined)
    
    inline def setDrawTicks(value: Boolean): Self = StObject.set(x, "drawTicks", value.asInstanceOf[js.Any])
    
    inline def setDrawTicksUndefined: Self = StObject.set(x, "drawTicks", js.undefined)
    
    inline def setLineWidth(value: ScriptableAndArray[Double, ScriptableScaleContext]): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "lineWidth", js.Any.fromFunction2(value))
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setLineWidthVarargs(value: Double*): Self = StObject.set(x, "lineWidth", js.Array(value*))
    
    inline def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setTickBorderDash(value: js.Array[Double]): Self = StObject.set(x, "tickBorderDash", value.asInstanceOf[js.Any])
    
    inline def setTickBorderDashOffset(value: typings.chartJs.distTypesIndexMod.Scriptable[Double, ScriptableScaleContext]): Self = StObject.set(x, "tickBorderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setTickBorderDashOffsetFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "tickBorderDashOffset", js.Any.fromFunction2(value))
    
    inline def setTickBorderDashOffsetUndefined: Self = StObject.set(x, "tickBorderDashOffset", js.undefined)
    
    inline def setTickBorderDashUndefined: Self = StObject.set(x, "tickBorderDash", js.undefined)
    
    inline def setTickBorderDashVarargs(value: Double*): Self = StObject.set(x, "tickBorderDash", js.Array(value*))
    
    inline def setTickColor(value: ScriptableAndArray[typings.chartJs.distTypesColorMod.Color, ScriptableScaleContext]): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
    
    inline def setTickColorFunction2(
      value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[typings.chartJs.distTypesColorMod.Color]
    ): Self = StObject.set(x, "tickColor", js.Any.fromFunction2(value))
    
    inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
    
    inline def setTickColorVarargs(value: typings.chartJs.distTypesColorMod.Color*): Self = StObject.set(x, "tickColor", js.Array(value*))
    
    inline def setTickLength(value: Double): Self = StObject.set(x, "tickLength", value.asInstanceOf[js.Any])
    
    inline def setTickLengthUndefined: Self = StObject.set(x, "tickLength", js.undefined)
    
    inline def setTickWidth(value: Double): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
    
    inline def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
