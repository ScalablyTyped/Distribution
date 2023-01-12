package typings.chartJs.anon

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasHTMLCanvasElement extends StObject {
  
  var canvas: HTMLCanvasElement
}
object CanvasHTMLCanvasElement {
  
  inline def apply(canvas: HTMLCanvasElement): CanvasHTMLCanvasElement = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasHTMLCanvasElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasHTMLCanvasElement] (val x: Self) extends AnyVal {
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
  }
}
