package typings.cssTree.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntaxParseError
  extends StObject
     with Error {
  
  var input: String
  
  var offset: Double
  
  var rawMessage: String
}
object SyntaxParseError {
  
  inline def apply(input: String, message: String, name: String, offset: Double, rawMessage: String): SyntaxParseError = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], rawMessage = rawMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxParseError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyntaxParseError] (val x: Self) extends AnyVal {
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setRawMessage(value: String): Self = StObject.set(x, "rawMessage", value.asInstanceOf[js.Any])
  }
}
