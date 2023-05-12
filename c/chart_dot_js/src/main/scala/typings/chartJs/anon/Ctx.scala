package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ctx extends StObject {
  
  var chart: Any
  
  var ctx: Any
  
  var options: Any
}
object Ctx {
  
  inline def apply(chart: Any, ctx: Any, options: Any): Ctx = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ctx] (val x: Self) extends AnyVal {
    
    inline def setChart(value: Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
