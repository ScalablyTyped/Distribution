package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxToken extends StObject {
  
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
  implicit class SyntaxTokenMutableBuilder[Self <: SyntaxToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    @scala.inline
    def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    @scala.inline
    def setPartOfSpeech(value: PartOfSpeechTag): Self = StObject.set(x, "PartOfSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfSpeechUndefined: Self = StObject.set(x, "PartOfSpeech", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    @scala.inline
    def setTokenId(value: Integer): Self = StObject.set(x, "TokenId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenIdUndefined: Self = StObject.set(x, "TokenId", js.undefined)
  }
}
