package typings.cloudeventsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base64Parser extends StObject {
  
  var decorator: Any
  
  def parse(payload: Any): Any
}
object Base64Parser {
  
  inline def apply(decorator: Any, parse: Any => Any): Base64Parser = {
    val __obj = js.Dynamic.literal(decorator = decorator.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Base64Parser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Base64Parser] (val x: Self) extends AnyVal {
    
    inline def setDecorator(value: Any): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    inline def setParse(value: Any => Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
