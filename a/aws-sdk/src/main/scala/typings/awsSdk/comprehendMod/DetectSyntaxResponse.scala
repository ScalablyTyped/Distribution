package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectSyntaxResponse extends js.Object {
  
  /**
    * A collection of syntax tokens describing the text. For each token, the response provides the text, the token type, where the text begins and ends, and the level of confidence that Amazon Comprehend has that the token is correct. For a list of token types, see how-syntax.
    */
  var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.native
}
object DetectSyntaxResponse {
  
  @scala.inline
  def apply(): DetectSyntaxResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectSyntaxResponse]
  }
  
  @scala.inline
  implicit class DetectSyntaxResponseOps[Self <: DetectSyntaxResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSyntaxTokensVarargs(value: SyntaxToken*): Self = this.set("SyntaxTokens", js.Array(value :_*))
    
    @scala.inline
    def setSyntaxTokens(value: ListOfSyntaxTokens): Self = this.set("SyntaxTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntaxTokens: Self = this.set("SyntaxTokens", js.undefined)
  }
}
