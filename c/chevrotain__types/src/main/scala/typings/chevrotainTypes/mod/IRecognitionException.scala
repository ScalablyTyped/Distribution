package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRecognitionException extends StObject {
  
  var context: IRecognizerContext
  
  var message: String
  
  var name: String
  
  /**
    * Additional tokens which have been re-synced in error recovery due to the original error.
    * This information can be used the calculate the whole text area which has been skipped due to an error.
    * For example for displaying with a red underline in a text editor.
    */
  var resyncedTokens: js.Array[IToken]
  
  /**
    * The token which caused the parser error.
    */
  var token: IToken
}
object IRecognitionException {
  
  inline def apply(
    context: IRecognizerContext,
    message: String,
    name: String,
    resyncedTokens: js.Array[IToken],
    token: IToken
  ): IRecognitionException = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resyncedTokens = resyncedTokens.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRecognitionException]
  }
  
  extension [Self <: IRecognitionException](x: Self) {
    
    inline def setContext(value: IRecognizerContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResyncedTokens(value: js.Array[IToken]): Self = StObject.set(x, "resyncedTokens", value.asInstanceOf[js.Any])
    
    inline def setResyncedTokensVarargs(value: IToken*): Self = StObject.set(x, "resyncedTokens", js.Array(value*))
    
    inline def setToken(value: IToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
