package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILexingResult extends StObject {
  
  var errors: js.Array[ILexingError]
  
  var groups: StringDictionary[js.Array[IToken]]
  
  var tokens: js.Array[IToken]
}
object ILexingResult {
  
  inline def apply(
    errors: js.Array[ILexingError],
    groups: StringDictionary[js.Array[IToken]],
    tokens: js.Array[IToken]
  ): ILexingResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILexingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILexingResult] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[ILexingError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: ILexingError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setGroups(value: StringDictionary[js.Array[IToken]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[IToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: IToken*): Self = StObject.set(x, "tokens", js.Array(value*))
  }
}
