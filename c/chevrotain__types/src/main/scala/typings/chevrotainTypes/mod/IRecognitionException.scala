package typings.chevrotainTypes.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRecognitionException
  extends StObject
     with Error {
  
  var context: IRecognizerContext
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRecognitionException] (val x: Self) extends AnyVal {
    
    inline def setContext(value: IRecognizerContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setResyncedTokens(value: js.Array[IToken]): Self = StObject.set(x, "resyncedTokens", value.asInstanceOf[js.Any])
    
    inline def setResyncedTokensVarargs(value: IToken*): Self = StObject.set(x, "resyncedTokens", js.Array(value*))
    
    inline def setToken(value: IToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
