package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectSyntaxResponse extends StObject {
  
  /**
    * A collection of syntax tokens describing the text. For each token, the response provides the text, the token type, where the text begins and ends, and the level of confidence that Amazon Comprehend has that the token is correct. For a list of token types, see how-syntax.
    */
  var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.undefined
}
object DetectSyntaxResponse {
  
  @scala.inline
  def apply(): DetectSyntaxResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectSyntaxResponse]
  }
  
  @scala.inline
  implicit class DetectSyntaxResponseMutableBuilder[Self <: DetectSyntaxResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSyntaxTokens(value: ListOfSyntaxTokens): Self = StObject.set(x, "SyntaxTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxTokensUndefined: Self = StObject.set(x, "SyntaxTokens", js.undefined)
    
    @scala.inline
    def setSyntaxTokensVarargs(value: SyntaxToken*): Self = StObject.set(x, "SyntaxTokens", js.Array(value :_*))
  }
}
