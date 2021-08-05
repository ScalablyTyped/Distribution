package typings.cloudeventsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base64Parser extends StObject {
  
  var decorator: js.Any
  
  def parse(payload: js.Any): js.Any
}
object Base64Parser {
  
  inline def apply(decorator: js.Any, parse: js.Any => js.Any): Base64Parser = {
    val __obj = js.Dynamic.literal(decorator = decorator.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Base64Parser]
  }
  
  extension [Self <: Base64Parser](x: Self) {
    
    inline def setDecorator(value: js.Any): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    inline def setParse(value: js.Any => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
