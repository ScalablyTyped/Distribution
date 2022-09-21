package typings.chartJs.anon

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ctx extends StObject {
  
  val canvas: HTMLCanvasElement
  
  val ctx: CanvasRenderingContext2D
  
  var currentDevicePixelRatio: Double
  
  val height: Double
  
  val width: Double
}
object Ctx {
  
  inline def apply(
    canvas: HTMLCanvasElement,
    ctx: CanvasRenderingContext2D,
    currentDevicePixelRatio: Double,
    height: Double,
    width: Double
  ): Ctx = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], currentDevicePixelRatio = currentDevicePixelRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctx]
  }
  
  extension [Self <: Ctx](x: Self) {
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: CanvasRenderingContext2D): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setCurrentDevicePixelRatio(value: Double): Self = StObject.set(x, "currentDevicePixelRatio", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
