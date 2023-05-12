package typings.chartJs.anon

import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ScriptableScaleContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderDash extends StObject {
  
  /**
    * Length and spacing of dashes on angled lines. See MDN.
    * @default []
    */
  var borderDash: typings.chartJs.distTypesIndexMod.Scriptable[js.Array[Double], ScriptableScaleContext]
  
  /**
    * Offset for line dashes. See MDN.
    * @default 0
    */
  var borderDashOffset: typings.chartJs.distTypesIndexMod.Scriptable[Double, ScriptableScaleContext]
  
  /**
    * Color of angled lines.
    * @default 'rgba(0, 0, 0, 0.1)'
    */
  var color: typings.chartJs.distTypesIndexMod.Scriptable[typings.chartJs.distTypesColorMod.Color, ScriptableScaleContext]
  
  /**
    * if true, angle lines are shown.
    * @default true
    */
  var display: Boolean
  
  /**
    * Width of angled lines.
    * @default 1
    */
  var lineWidth: typings.chartJs.distTypesIndexMod.Scriptable[Double, ScriptableScaleContext]
}
object BorderDash {
  
  inline def apply(
    borderDash: typings.chartJs.distTypesIndexMod.Scriptable[js.Array[Double], ScriptableScaleContext],
    borderDashOffset: typings.chartJs.distTypesIndexMod.Scriptable[Double, ScriptableScaleContext],
    color: typings.chartJs.distTypesIndexMod.Scriptable[typings.chartJs.distTypesColorMod.Color, ScriptableScaleContext],
    display: Boolean,
    lineWidth: typings.chartJs.distTypesIndexMod.Scriptable[Double, ScriptableScaleContext]
  ): BorderDash = {
    val __obj = js.Dynamic.literal(borderDash = borderDash.asInstanceOf[js.Any], borderDashOffset = borderDashOffset.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderDash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderDash] (val x: Self) extends AnyVal {
    
    inline def setBorderDash(value: typings.chartJs.distTypesIndexMod.Scriptable[js.Array[Double], ScriptableScaleContext]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    inline def setBorderDashFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[js.Array[Double]]): Self = StObject.set(x, "borderDash", js.Any.fromFunction2(value))
    
    inline def setBorderDashOffset(value: typings.chartJs.distTypesIndexMod.Scriptable[Double, ScriptableScaleContext]): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffsetFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "borderDashOffset", js.Any.fromFunction2(value))
    
    inline def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value*))
    
    inline def setColor(
      value: typings.chartJs.distTypesIndexMod.Scriptable[typings.chartJs.distTypesColorMod.Color, ScriptableScaleContext]
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction2(
      value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[typings.chartJs.distTypesColorMod.Color]
    ): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setLineWidth(value: typings.chartJs.distTypesIndexMod.Scriptable[Double, ScriptableScaleContext]): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthFunction2(value: (ScriptableScaleContext, /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "lineWidth", js.Any.fromFunction2(value))
  }
}
