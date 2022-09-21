package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colorizer extends StObject {
  
  def colorize(text: String, styleName: String): Unit
  
  def format(text: String, style: Any): Unit
}
object Colorizer {
  
  inline def apply(colorize: (String, String) => Unit, format: (String, Any) => Unit): Colorizer = {
    val __obj = js.Dynamic.literal(colorize = js.Any.fromFunction2(colorize), format = js.Any.fromFunction2(format))
    __obj.asInstanceOf[Colorizer]
  }
  
  extension [Self <: Colorizer](x: Self) {
    
    inline def setColorize(value: (String, String) => Unit): Self = StObject.set(x, "colorize", js.Any.fromFunction2(value))
    
    inline def setFormat(value: (String, Any) => Unit): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
  }
}
