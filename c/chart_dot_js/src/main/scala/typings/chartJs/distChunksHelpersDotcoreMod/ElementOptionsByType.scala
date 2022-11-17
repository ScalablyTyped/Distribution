package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementOptionsByType[TType /* <: ChartType */] extends StObject {
  
  var arc: ScriptableAndArrayOptions[ArcOptions & ArcHoverOptions, ScriptableContext[TType]]
  
  var bar: ScriptableAndArrayOptions[BarOptions & BarHoverOptions, ScriptableContext[TType]]
  
  var line: ScriptableAndArrayOptions[LineOptions & LineHoverOptions, ScriptableContext[TType]]
  
  var point: ScriptableAndArrayOptions[PointOptions & PointHoverOptions, ScriptableContext[TType]]
}
object ElementOptionsByType {
  
  inline def apply[TType /* <: ChartType */](
    arc: ScriptableAndArrayOptions[ArcOptions & ArcHoverOptions, ScriptableContext[TType]],
    bar: ScriptableAndArrayOptions[BarOptions & BarHoverOptions, ScriptableContext[TType]],
    line: ScriptableAndArrayOptions[LineOptions & LineHoverOptions, ScriptableContext[TType]],
    point: ScriptableAndArrayOptions[PointOptions & PointHoverOptions, ScriptableContext[TType]]
  ): ElementOptionsByType[TType] = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any], bar = bar.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementOptionsByType[TType]]
  }
  
  extension [Self <: ElementOptionsByType[?], TType /* <: ChartType */](x: Self & ElementOptionsByType[TType]) {
    
    inline def setArc(value: ScriptableAndArrayOptions[ArcOptions & ArcHoverOptions, ScriptableContext[TType]]): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    inline def setBar(value: ScriptableAndArrayOptions[BarOptions & BarHoverOptions, ScriptableContext[TType]]): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setLine(value: ScriptableAndArrayOptions[LineOptions & LineHoverOptions, ScriptableContext[TType]]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: ScriptableAndArrayOptions[PointOptions & PointHoverOptions, ScriptableContext[TType]]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
