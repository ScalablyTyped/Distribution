package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICanvasGradient extends StObject {
  
  /**
    * adds a new color stop, defined by an offset and a color, to a given canvas gradient.
    * @param offset A number between 0 and 1, inclusive, representing the position of the color stop. 0 represents the start of the gradient and 1 represents the end.
    * @param color value representing the color of the stop.
    */
  def addColorStop(offset: Double, color: String): Unit
}
object ICanvasGradient {
  
  inline def apply(addColorStop: (Double, String) => Unit): ICanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
    __obj.asInstanceOf[ICanvasGradient]
  }
  
  extension [Self <: ICanvasGradient](x: Self) {
    
    inline def setAddColorStop(value: (Double, String) => Unit): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2(value))
  }
}
