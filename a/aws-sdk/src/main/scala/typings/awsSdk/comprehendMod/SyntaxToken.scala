package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntaxToken extends StObject {
  
  /**
    * The zero-based offset from the beginning of the source text to the first character in the word.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The zero-based offset from the beginning of the source text to the last character in the word.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * Provides the part of speech label and the confidence level that Amazon Comprehend has that the part of speech was correctly identified. For more information, see how-syntax.
    */
  var PartOfSpeech: js.UndefOr[PartOfSpeechTag] = js.undefined
  
  /**
    * The word that was recognized in the source text.
    */
  var Text: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for a token.
    */
  var TokenId: js.UndefOr[Integer] = js.undefined
}
object SyntaxToken {
  
  inline def apply(): SyntaxToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxToken]
  }
  
  extension [Self <: SyntaxToken](x: Self) {
    
    inline def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    inline def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    inline def setPartOfSpeech(value: PartOfSpeechTag): Self = StObject.set(x, "PartOfSpeech", value.asInstanceOf[js.Any])
    
    inline def setPartOfSpeechUndefined: Self = StObject.set(x, "PartOfSpeech", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    inline def setTokenId(value: Integer): Self = StObject.set(x, "TokenId", value.asInstanceOf[js.Any])
    
    inline def setTokenIdUndefined: Self = StObject.set(x, "TokenId", js.undefined)
  }
}
