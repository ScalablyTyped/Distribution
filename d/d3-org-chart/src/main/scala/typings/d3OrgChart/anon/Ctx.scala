package typings.d3OrgChart.anon

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ctx extends StObject {
  
  var ctx: CanvasRenderingContext2D
  
  var defaultFont: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontWeight: js.UndefOr[Double] = js.undefined
}
object Ctx {
  
  inline def apply(ctx: CanvasRenderingContext2D): Ctx = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctx]
  }
  
  extension [Self <: Ctx](x: Self) {
    
    inline def setCtx(value: CanvasRenderingContext2D): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setDefaultFont(value: String): Self = StObject.set(x, "defaultFont", value.asInstanceOf[js.Any])
    
    inline def setDefaultFontUndefined: Self = StObject.set(x, "defaultFont", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
  }
}
