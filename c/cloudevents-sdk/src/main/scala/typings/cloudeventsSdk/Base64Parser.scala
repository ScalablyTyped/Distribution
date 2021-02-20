package typings.cloudeventsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base64Parser extends StObject {
  
  var decorator: js.Any = js.native
  
  def parse(payload: js.Any): js.Any = js.native
}
object Base64Parser {
  
  @scala.inline
  def apply(decorator: js.Any, parse: js.Any => js.Any): Base64Parser = {
    val __obj = js.Dynamic.literal(decorator = decorator.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Base64Parser]
  }
  
  @scala.inline
  implicit class Base64ParserMutableBuilder[Self <: Base64Parser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecorator(value: js.Any): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: js.Any => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
