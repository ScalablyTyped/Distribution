package typings.chartJs.mod

import typings.chartJs.basicMod.AnyObject
import typings.chartJs.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLineOptions extends StObject {
  
  var borderColor: Color
  
  /**
    * @default []
    */
  var borderDash: Scriptable[js.Array[Double], ScriptableScaleContext]
  
  /**
    * @default 0
    */
  var borderDashOffset: Scriptable[Double, ScriptableScaleContext]
  
  var borderWidth: Double
  
  /**
    * @default false
    */
  var circular: Boolean
  
  /**
    * @default 'rgba(0, 0, 0, 0.1)'
    */
  var color: ScriptableAndArray[Color, ScriptableScaleContext]
  
  /**
    * @default true
    */
  var display: Boolean
  
  /**
    * @default true
    */
  var drawBorder: Boolean
  
  /**
    * @default true
    */
  var drawOnChartArea: Boolean
  
  /**
    * @default true
    */
  var drawTicks: Boolean
  
  /**
    * @default 1
    */
  var lineWidth: ScriptableAndArray[Double, ScriptableScaleContext]
  
  /**
    * @default false
    */
  var offset: Boolean
  
  /**
    * @default []
    */
  var tickBorderDash: js.Array[Double]
  
  /**
    * @default 0
    */
  var tickBorderDashOffset: Scriptable[Double, ScriptableScaleContext]
  
  /**
    * @default 'rgba(0, 0, 0, 0.1)'
    */
  var tickColor: ScriptableAndArray[Color, ScriptableScaleContext]
  
  /**
    * @default 10
    */
  var tickLength: Double
  
  /**
    * @default 1
    */
  var tickWidth: Double
  
  /**
    * @default 0
    */
  var z: Double
}
object GridLineOptions {
  
  inline def apply(
    borderColor: Color,
    borderDash: Scriptable[js.Array[Double], ScriptableScaleContext],
    borderDashOffset: Scriptable[Double, ScriptableScaleContext],
    borderWidth: Double,
    circular: Boolean,
    color: ScriptableAndArray[Color, ScriptableScaleContext],
    display: Boolean,
    drawBorder: Boolean,
    drawOnChartArea: Boolean,
    drawTicks: Boolean,
    lineWidth: ScriptableAndArray[Double, ScriptableScaleContext],
    offset: Boolean,
    tickBorderDash: js.Array[Double],
    tickBorderDashOffset: Scriptable[Double, ScriptableScaleContext],
    tickColor: ScriptableAndArray[Color, ScriptableScaleContext],
    tickLength: Double,
    tickWidth: Double,
    z: Double
  ): GridLineOptions = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderDash = borderDash.asInstanceOf[js.Any], borderDashOffset = borderDashOffset.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], drawBorder = drawBorder.asInstanceOf[js.Any], drawOnChartArea = drawOnChartArea.asInstanceOf[js.Any], drawTicks = drawTicks.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tickBorderDash = tickBorderDash.asInstanceOf[js.Any], tickBorderDashOffset = tickBorderDashOffset.asInstanceOf[js.Any], tickColor = tickColor.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any], tickWidth = tickWidth.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLineOptions]
  }
  
  extension [Self <: GridLineOptions](x: Self) {
    
    inline def setBorderColor(value: Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderDash(value: Scriptable[js.Array[Double], ScriptableScaleContext]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    inline def setBorderDashFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[js.Array[Double]]): Self = StObject.set(x, "borderDash", js.Any.fromFunction2(value))
    
    inline def setBorderDashOffset(value: Scriptable[Double, ScriptableScaleContext]): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffsetFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "borderDashOffset", js.Any.fromFunction2(value))
    
    inline def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value*))
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
    
    inline def setColor(value: ScriptableAndArray[Color, ScriptableScaleContext]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[Color]): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
    
    inline def setColorVarargs(value: Color*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDrawBorder(value: Boolean): Self = StObject.set(x, "drawBorder", value.asInstanceOf[js.Any])
    
    inline def setDrawOnChartArea(value: Boolean): Self = StObject.set(x, "drawOnChartArea", value.asInstanceOf[js.Any])
    
    inline def setDrawTicks(value: Boolean): Self = StObject.set(x, "drawTicks", value.asInstanceOf[js.Any])
    
    inline def setLineWidth(value: ScriptableAndArray[Double, ScriptableScaleContext]): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "lineWidth", js.Any.fromFunction2(value))
    
    inline def setLineWidthVarargs(value: Double*): Self = StObject.set(x, "lineWidth", js.Array(value*))
    
    inline def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setTickBorderDash(value: js.Array[Double]): Self = StObject.set(x, "tickBorderDash", value.asInstanceOf[js.Any])
    
    inline def setTickBorderDashOffset(value: Scriptable[Double, ScriptableScaleContext]): Self = StObject.set(x, "tickBorderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setTickBorderDashOffsetFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "tickBorderDashOffset", js.Any.fromFunction2(value))
    
    inline def setTickBorderDashVarargs(value: Double*): Self = StObject.set(x, "tickBorderDash", js.Array(value*))
    
    inline def setTickColor(value: ScriptableAndArray[Color, ScriptableScaleContext]): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
    
    inline def setTickColorFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[Color]): Self = StObject.set(x, "tickColor", js.Any.fromFunction2(value))
    
    inline def setTickColorVarargs(value: Color*): Self = StObject.set(x, "tickColor", js.Array(value*))
    
    inline def setTickLength(value: Double): Self = StObject.set(x, "tickLength", value.asInstanceOf[js.Any])
    
    inline def setTickWidth(value: Double): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
