package typings.chartJs.anon

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canvas extends StObject {
  
  var canvas: HTMLCanvasElement
}
object Canvas {
  
  inline def apply(canvas: HTMLCanvasElement): Canvas = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  
  extension [Self <: Canvas](x: Self) {
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
  }
}
