package typings.chartJs.anon

import typings.chartJs.mod.Scriptable
import typings.chartJs.mod.ScriptableScaleContext
import typings.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderDash extends StObject {
  
  /**
    * Length and spacing of dashes on angled lines. See MDN.
    * @default []
    */
  var borderDash: Scriptable[js.Array[Double], ScriptableScaleContext]
  
  /**
    * Offset for line dashes. See MDN.
    * @default 0
    */
  var borderDashOffset: Scriptable[Double, ScriptableScaleContext]
  
  /**
    * Color of angled lines.
    * @default 'rgba(0, 0, 0, 0.1)'
    */
  var color: Scriptable[typings.chartJs.typesColorMod.Color, ScriptableScaleContext]
  
  /**
    * if true, angle lines are shown.
    * @default true
    */
  var display: Boolean
  
  /**
    * Width of angled lines.
    * @default 1
    */
  var lineWidth: Scriptable[Double, ScriptableScaleContext]
}
object BorderDash {
  
  inline def apply(
    borderDash: Scriptable[js.Array[Double], ScriptableScaleContext],
    borderDashOffset: Scriptable[Double, ScriptableScaleContext],
    color: Scriptable[typings.chartJs.typesColorMod.Color, ScriptableScaleContext],
    display: Boolean,
    lineWidth: Scriptable[Double, ScriptableScaleContext]
  ): BorderDash = {
    val __obj = js.Dynamic.literal(borderDash = borderDash.asInstanceOf[js.Any], borderDashOffset = borderDashOffset.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderDash]
  }
  
  extension [Self <: BorderDash](x: Self) {
    
    inline def setBorderDash(value: Scriptable[js.Array[Double], ScriptableScaleContext]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    inline def setBorderDashFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[js.Array[Double]]): Self = StObject.set(x, "borderDash", js.Any.fromFunction2(value))
    
    inline def setBorderDashOffset(value: Scriptable[Double, ScriptableScaleContext]): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffsetFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "borderDashOffset", js.Any.fromFunction2(value))
    
    inline def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value*))
    
    inline def setColor(value: Scriptable[typings.chartJs.typesColorMod.Color, ScriptableScaleContext]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction2(
      value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setLineWidth(value: Scriptable[Double, ScriptableScaleContext]): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "lineWidth", js.Any.fromFunction2(value))
  }
}
