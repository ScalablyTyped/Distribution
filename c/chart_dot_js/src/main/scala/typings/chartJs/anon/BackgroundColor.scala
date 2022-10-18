package typings.chartJs.anon

import typings.chartJs.mod.Scriptable
import typings.chartJs.mod.ScriptableLineSegmentContext
import typings.chartJs.typesBasicMod.AnyObject
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  var backgroundColor: Scriptable[js.UndefOr[typings.chartJs.typesColorMod.Color], ScriptableLineSegmentContext]
  
  var borderCapStyle: Scriptable[js.UndefOr[CanvasLineCap], ScriptableLineSegmentContext]
  
  var borderColor: Scriptable[js.UndefOr[typings.chartJs.typesColorMod.Color], ScriptableLineSegmentContext]
  
  var borderDash: Scriptable[js.UndefOr[js.Array[Double]], ScriptableLineSegmentContext]
  
  var borderDashOffset: Scriptable[js.UndefOr[Double], ScriptableLineSegmentContext]
  
  var borderJoinStyle: Scriptable[js.UndefOr[CanvasLineJoin], ScriptableLineSegmentContext]
  
  var borderWidth: Scriptable[js.UndefOr[Double], ScriptableLineSegmentContext]
}
object BackgroundColor {
  
  inline def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  
  extension [Self <: BackgroundColor](x: Self) {
    
    inline def setBackgroundColor(value: Scriptable[js.UndefOr[typings.chartJs.typesColorMod.Color], ScriptableLineSegmentContext]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorFunction2(
      value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[typings.chartJs.typesColorMod.Color]]
    ): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction2(value))
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderCapStyle(value: Scriptable[js.UndefOr[CanvasLineCap], ScriptableLineSegmentContext]): Self = StObject.set(x, "borderCapStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderCapStyleFunction2(
      value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[CanvasLineCap]]
    ): Self = StObject.set(x, "borderCapStyle", js.Any.fromFunction2(value))
    
    inline def setBorderCapStyleUndefined: Self = StObject.set(x, "borderCapStyle", js.undefined)
    
    inline def setBorderColor(value: Scriptable[js.UndefOr[typings.chartJs.typesColorMod.Color], ScriptableLineSegmentContext]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorFunction2(
      value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[typings.chartJs.typesColorMod.Color]]
    ): Self = StObject.set(x, "borderColor", js.Any.fromFunction2(value))
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderDash(value: Scriptable[js.UndefOr[js.Array[Double]], ScriptableLineSegmentContext]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    inline def setBorderDashFunction2(
      value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[js.Array[Double]]]
    ): Self = StObject.set(x, "borderDash", js.Any.fromFunction2(value))
    
    inline def setBorderDashOffset(value: Scriptable[js.UndefOr[Double], ScriptableLineSegmentContext]): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffsetFunction2(value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[Double]]): Self = StObject.set(x, "borderDashOffset", js.Any.fromFunction2(value))
    
    inline def setBorderDashOffsetUndefined: Self = StObject.set(x, "borderDashOffset", js.undefined)
    
    inline def setBorderDashUndefined: Self = StObject.set(x, "borderDash", js.undefined)
    
    inline def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value*))
    
    inline def setBorderJoinStyle(value: Scriptable[js.UndefOr[CanvasLineJoin], ScriptableLineSegmentContext]): Self = StObject.set(x, "borderJoinStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderJoinStyleFunction2(
      value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[CanvasLineJoin]]
    ): Self = StObject.set(x, "borderJoinStyle", js.Any.fromFunction2(value))
    
    inline def setBorderJoinStyleUndefined: Self = StObject.set(x, "borderJoinStyle", js.undefined)
    
    inline def setBorderWidth(value: Scriptable[js.UndefOr[Double], ScriptableLineSegmentContext]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthFunction2(value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[Double]]): Self = StObject.set(x, "borderWidth", js.Any.fromFunction2(value))
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
  }
}
