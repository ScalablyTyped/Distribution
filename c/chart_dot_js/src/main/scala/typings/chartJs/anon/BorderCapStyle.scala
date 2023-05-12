package typings.chartJs.anon

import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ScriptableLineSegmentContext
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderCapStyle extends StObject {
  
  var backgroundColor: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[typings.chartJs.distTypesColorMod.Color], ScriptableLineSegmentContext]
  
  var borderCapStyle: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[CanvasLineCap], ScriptableLineSegmentContext]
  
  var borderColor: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[typings.chartJs.distTypesColorMod.Color], ScriptableLineSegmentContext]
  
  var borderDash: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[js.Array[Double]], ScriptableLineSegmentContext]
  
  var borderDashOffset: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[Double], ScriptableLineSegmentContext]
  
  var borderJoinStyle: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[CanvasLineJoin], ScriptableLineSegmentContext]
  
  var borderWidth: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[Double], ScriptableLineSegmentContext]
}
object BorderCapStyle {
  
  inline def apply(): BorderCapStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderCapStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderCapStyle] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(
      value: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[typings.chartJs.distTypesColorMod.Color], ScriptableLineSegmentContext]
    ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorFunction2(
      value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[typings.chartJs.distTypesColorMod.Color]]
    ): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction2(value))
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderCapStyle(
      value: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[CanvasLineCap], ScriptableLineSegmentContext]
    ): Self = StObject.set(x, "borderCapStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderCapStyleFunction2(
      value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[CanvasLineCap]]
    ): Self = StObject.set(x, "borderCapStyle", js.Any.fromFunction2(value))
    
    inline def setBorderCapStyleUndefined: Self = StObject.set(x, "borderCapStyle", js.undefined)
    
    inline def setBorderColor(
      value: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[typings.chartJs.distTypesColorMod.Color], ScriptableLineSegmentContext]
    ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorFunction2(
      value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[typings.chartJs.distTypesColorMod.Color]]
    ): Self = StObject.set(x, "borderColor", js.Any.fromFunction2(value))
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderDash(
      value: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[js.Array[Double]], ScriptableLineSegmentContext]
    ): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    inline def setBorderDashFunction2(
      value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[js.Array[Double]]]
    ): Self = StObject.set(x, "borderDash", js.Any.fromFunction2(value))
    
    inline def setBorderDashOffset(
      value: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[Double], ScriptableLineSegmentContext]
    ): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffsetFunction2(value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[Double]]): Self = StObject.set(x, "borderDashOffset", js.Any.fromFunction2(value))
    
    inline def setBorderDashOffsetUndefined: Self = StObject.set(x, "borderDashOffset", js.undefined)
    
    inline def setBorderDashUndefined: Self = StObject.set(x, "borderDash", js.undefined)
    
    inline def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value*))
    
    inline def setBorderJoinStyle(
      value: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[CanvasLineJoin], ScriptableLineSegmentContext]
    ): Self = StObject.set(x, "borderJoinStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderJoinStyleFunction2(
      value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[CanvasLineJoin]]
    ): Self = StObject.set(x, "borderJoinStyle", js.Any.fromFunction2(value))
    
    inline def setBorderJoinStyleUndefined: Self = StObject.set(x, "borderJoinStyle", js.undefined)
    
    inline def setBorderWidth(
      value: typings.chartJs.distTypesIndexMod.Scriptable[js.UndefOr[Double], ScriptableLineSegmentContext]
    ): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthFunction2(value: (ScriptableLineSegmentContext, /* options */ AnyObject) => js.UndefOr[js.UndefOr[Double]]): Self = StObject.set(x, "borderWidth", js.Any.fromFunction2(value))
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
  }
}
