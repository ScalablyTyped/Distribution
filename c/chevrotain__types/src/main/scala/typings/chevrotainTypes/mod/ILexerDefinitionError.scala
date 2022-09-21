package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILexerDefinitionError extends StObject {
  
  var message: String
  
  var tokenTypes: js.UndefOr[js.Array[TokenType]] = js.undefined
  
  var `type`: LexerDefinitionErrorType
}
object ILexerDefinitionError {
  
  inline def apply(message: String, `type`: LexerDefinitionErrorType): ILexerDefinitionError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILexerDefinitionError]
  }
  
  extension [Self <: ILexerDefinitionError](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTokenTypes(value: js.Array[TokenType]): Self = StObject.set(x, "tokenTypes", value.asInstanceOf[js.Any])
    
    inline def setTokenTypesUndefined: Self = StObject.set(x, "tokenTypes", js.undefined)
    
    inline def setTokenTypesVarargs(value: TokenType*): Self = StObject.set(x, "tokenTypes", js.Array(value*))
    
    inline def setType(value: LexerDefinitionErrorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
