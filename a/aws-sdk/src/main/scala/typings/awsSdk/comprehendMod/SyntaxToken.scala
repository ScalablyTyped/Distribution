package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxToken extends js.Object {
  
  /**
    * The zero-based offset from the beginning of the source text to the first character in the word.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  
  /**
    * The zero-based offset from the beginning of the source text to the last character in the word.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  
  /**
    * Provides the part of speech label and the confidence level that Amazon Comprehend has that the part of speech was correctly identified. For more information, see how-syntax.
    */
  var PartOfSpeech: js.UndefOr[PartOfSpeechTag] = js.native
  
  /**
    * The word that was recognized in the source text.
    */
  var Text: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier for a token.
    */
  var TokenId: js.UndefOr[Integer] = js.native
}
object SyntaxToken {
  
  @scala.inline
  def apply(): SyntaxToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxToken]
  }
  
  @scala.inline
  implicit class SyntaxTokenOps[Self <: SyntaxToken] (val x: Self) extends AnyVal {
    
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
    def setBeginOffset(value: Integer): Self = this.set("BeginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginOffset: Self = this.set("BeginOffset", js.undefined)
    
    @scala.inline
    def setEndOffset(value: Integer): Self = this.set("EndOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOffset: Self = this.set("EndOffset", js.undefined)
    
    @scala.inline
    def setPartOfSpeech(value: PartOfSpeechTag): Self = this.set("PartOfSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartOfSpeech: Self = this.set("PartOfSpeech", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
    
    @scala.inline
    def setTokenId(value: Integer): Self = this.set("TokenId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenId: Self = this.set("TokenId", js.undefined)
  }
}
