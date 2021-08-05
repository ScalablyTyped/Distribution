package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartTooltipModelBody extends StObject {
  
  var after: js.Array[String]
  
  var before: js.Array[String]
  
  var lines: js.Array[String]
}
object ChartTooltipModelBody {
  
  inline def apply(after: js.Array[String], before: js.Array[String], lines: js.Array[String]): ChartTooltipModelBody = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltipModelBody]
  }
  
  extension [Self <: ChartTooltipModelBody](x: Self) {
    
    inline def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value :_*))
    
    inline def setBefore(value: js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value :_*))
    
    inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value :_*))
  }
}
