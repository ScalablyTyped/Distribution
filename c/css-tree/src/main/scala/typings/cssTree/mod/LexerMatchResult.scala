package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexerMatchResult extends StObject {
  
  var error: js.Error | SyntaxMatchError | SyntaxReferenceError | Null
}
object LexerMatchResult {
  
  inline def apply(): LexerMatchResult = {
    val __obj = js.Dynamic.literal(error = null)
    __obj.asInstanceOf[LexerMatchResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LexerMatchResult] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error | SyntaxMatchError | SyntaxReferenceError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
  }
}
