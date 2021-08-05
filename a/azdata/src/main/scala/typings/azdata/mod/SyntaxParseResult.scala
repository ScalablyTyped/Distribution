package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntaxParseResult extends StObject {
  
  var errors: js.Array[String]
  
  var parseable: Boolean
}
object SyntaxParseResult {
  
  inline def apply(errors: js.Array[String], parseable: Boolean): SyntaxParseResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], parseable = parseable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxParseResult]
  }
  
  extension [Self <: SyntaxParseResult](x: Self) {
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setParseable(value: Boolean): Self = StObject.set(x, "parseable", value.asInstanceOf[js.Any])
  }
}
