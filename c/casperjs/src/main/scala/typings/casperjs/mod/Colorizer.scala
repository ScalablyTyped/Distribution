package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Colorizer extends StObject {
  
  def colorize(text: String, styleName: String): Unit = js.native
  
  def format(text: String, style: js.Any): Unit = js.native
}
object Colorizer {
  
  @scala.inline
  def apply(colorize: (String, String) => Unit, format: (String, js.Any) => Unit): Colorizer = {
    val __obj = js.Dynamic.literal(colorize = js.Any.fromFunction2(colorize), format = js.Any.fromFunction2(format))
    __obj.asInstanceOf[Colorizer]
  }
  
  @scala.inline
  implicit class ColorizerMutableBuilder[Self <: Colorizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorize(value: (String, String) => Unit): Self = StObject.set(x, "colorize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormat(value: (String, js.Any) => Unit): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
  }
}
